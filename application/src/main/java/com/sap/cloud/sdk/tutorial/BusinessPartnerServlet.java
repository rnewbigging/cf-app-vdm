package com.sap.cloud.sdk.tutorial;

import com.google.gson.Gson;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.Address;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.EmailAddress;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.Role;
import com.sap.cloud.sdk.tutorial.datamodel.odata.services.DefaultBusinessPartnerService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

@WebServlet("/businessPartners")
public class BusinessPartnerServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(BusinessPartnerServlet.class);
    private static final String DESTINATION_NAME = "MyErpSystem";

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        try {
            final Destination destination = DestinationAccessor.getDestination(DESTINATION_NAME);
            final List<BusinessPartner> businessPartners = new GetBusinessPartnersCommand(destination).execute();

            response.setContentType("application/json");
            response.getWriter().write(new Gson().toJson(businessPartners));

        } catch (final Exception e) {
            logger.error(e.getMessage(), e);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write(e.getMessage());
            e.printStackTrace(response.getWriter());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String firstname = request.getParameter("firstname");
        final String lastname = request.getParameter("lastname");
        final String country = request.getParameter("country");
        final String city = request.getParameter("city");
        final String email = request.getParameter("email");

        //do consistency checks here...

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

        String responseBody;

        try {
            final HttpDestination httpDestination = DestinationAccessor.getDestination(DESTINATION_NAME).asHttp();
            final BusinessPartner storedBusinessPartner = new StoreBusinessPartnerCommand(httpDestination, new DefaultBusinessPartnerService(), businessPartner).execute();

            responseBody = new Gson().toJson(storedBusinessPartner);
            response.setStatus(HttpServletResponse.SC_CREATED);

        } catch (final Exception e) {
            logger.error(e.getMessage(), e);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseBody = e.getMessage();
        }

        response.setContentType("application/json");
        response.getOutputStream().print(responseBody);
    }
}
