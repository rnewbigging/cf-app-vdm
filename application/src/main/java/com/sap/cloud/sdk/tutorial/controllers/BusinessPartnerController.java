package com.sap.cloud.sdk.tutorial.controllers;
import com.google.gson.Gson;
import com.sap.cloud.sdk.tutorial.GetBusinessPartnersCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;

import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartner;

@RestController
@RequestMapping( "/businesspartners" )
public class BusinessPartnerController
{
    private static final Logger logger = LoggerFactory.getLogger(BusinessPartnerController.class);
    private static final String DESTINATION_NAME = "MyErpSystem";

    @RequestMapping( method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBusinessPartner()
    {
        try {
            final Destination destination = DestinationAccessor.getDestination(DESTINATION_NAME);

            final List<BusinessPartner> businessPartners =
                    new GetBusinessPartnersCommand(destination).execute();

            return ResponseEntity.ok( new Gson().toJson(businessPartners));
        } catch (final Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseEntity.internalServerError().body("Failed to fetch business partners.");
        }
    }

}

