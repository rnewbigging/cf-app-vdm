package com.sap.cloud.sdk.tutorial.controllers;
import com.google.gson.Gson;

import com.sap.cloud.sdk.cloudplatform.connectivity.CsrfToken;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultCsrfTokenRetriever;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultHttpDestination;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpClientAccessor;
import com.sap.cloud.sdk.tutorial.GetBusinessPartnersCommand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;

import com.sap.cloud.sdk.tutorial.StoreBusinessPartnerCommand;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.Address;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.EmailAddress;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.Role;
import com.sap.cloud.sdk.tutorial.datamodel.odata.services.DefaultBusinessPartnerService;

@RestController
public class BusinessPartnerController
{
    private static final Logger logger = LoggerFactory.getLogger(BusinessPartnerController.class);
    private static final String DESTINATION_NAME = "MyErpSystem";

    @RequestMapping( path = "/businesspartners", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBusinessPartner()
    {
        try {
            final Destination destination = DestinationAccessor.getDestination(DESTINATION_NAME);

            final List<BusinessPartner> businessPartners =
                    new GetBusinessPartnersCommand(destination).execute();

            return ResponseEntity.ok( new Gson().toJson(businessPartners));
        } catch (final Exception e) {
            return ResponseEntity.internalServerError().body("Failed to fetch business partners.";
        }
    }

    @PostMapping( path = "/businesspartners", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postBusinessPartner(@RequestBody BusinessPartner partner) {
        try {
            // TODO test when null
            final String firstname = partner.getFirstName();
            final String lastname = partner.getLastName();
            final Address address = partner.getBusinessPartnerAddressIfPresent().map(addressList -> addressList.stream()
                    .findFirst().get())
                    .getOrElse(new Address());
            final String country = address.getCountryRegionKey();
            final String city = address.getCity();
            final String email = address.getEmailAddressIfPresent().map(emailList -> emailList.stream()
                    .findFirst().get().getEmailAddress())
                    .getOrElse((String) null);

            // Do consistency checks here...
            final EmailAddress emailAddress = EmailAddress.builder()
                    .emailAddress(email)
                    .build();

            final Address businessPartnerAddress = Address.builder()
                    .countryRegionKey(country)
                    .city(city)
                    .emailAddress(emailAddress)
                    .build();

            final Role businessPartnerRole = Role.builder()
                    .bPRole("FLCU01")
                    .build();

            final BusinessPartner businessPartner = BusinessPartner.builder()
                    .firstName(firstname)
                    .lastName(lastname)
                    .bPCategory("1")
                    .correspondenceLang("EN")
                    .businessPartnerAddress(businessPartnerAddress)
                    .businessPartnerRole(businessPartnerRole)
                    .build();

            // Debug Note: Issue is currently non-GET requests seem to require token auth, but the token is not being retrieved/ cannot be found

            final Destination destination = DestinationAccessor.getDestination(DESTINATION_NAME);

            // Tried to figure out the CsrfToken issue, but uncommenting still results in "CsrfTokenRetrievalException: CSRF token retrieval failed: The server did not respond with the x-csrf-token header"
//            final HttpClient client = HttpClientAccessor.getHttpClient(destination);
//            final CsrfToken csrfToken = new DefaultCsrfTokenRetriever().retrieveCsrfToken(client, "/businesspartners");

            // Otherwise we get a ResilienceRuntimeException, with a suppressed CsrfTokenRetrievalException, caused by a NoSuchElementException
            final BusinessPartner storedBusinessPartner = new StoreBusinessPartnerCommand(destination, new DefaultBusinessPartnerService(), businessPartner).execute();

            return ResponseEntity.ok( new Gson().toJson(storedBusinessPartner));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // For debugging, to remove
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            return ResponseEntity.internalServerError().body("Failed to post business partner. " + sw.toString());
        }
    }

}

