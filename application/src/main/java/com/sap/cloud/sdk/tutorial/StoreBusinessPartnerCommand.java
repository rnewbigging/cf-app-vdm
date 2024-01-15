package com.sap.cloud.sdk.tutorial;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceConfiguration;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceDecorator;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceRuntimeException;
import com.sap.cloud.sdk.datamodel.odata.client.exception.ODataException;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService;

public class StoreBusinessPartnerCommand{

    private final BusinessPartnerService businessPartnerService;
    private final BusinessPartner businessPartner;
    private final Destination destination;

    public StoreBusinessPartnerCommand(Destination destination, BusinessPartnerService businessPartnerService, BusinessPartner businessPartner) {
        this.businessPartnerService = businessPartnerService;;
        this.businessPartner = businessPartner;
        this.destination = destination;
    }

    public BusinessPartner execute() {
        return ResilienceDecorator.executeSupplier(this::run, ResilienceConfiguration.of(GetBusinessPartnersCommand.class));
    }

    private BusinessPartner run() {
        try {
            return businessPartnerService
                    .createBusinessPartner(businessPartner)
                    .executeRequest(destination)
                    .getResponseEntity().get();
        } catch (final ODataException e) {
            throw new ResilienceRuntimeException(e);
        }
    }
}

