
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartnerAddressDependentTaxNumbers;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BusinessPartnerAddressDependentTaxNumbersSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartnerAddressDependentTaxNumbers BusinessPartnerAddressDependentTaxNumbers} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class BusinessPartnerAddressDependentTaxNumbersLink<ObjectT extends VdmObject<?> >
    extends EntityLink<BusinessPartnerAddressDependentTaxNumbersLink<ObjectT> , BusinessPartnerAddressDependentTaxNumbers, ObjectT>
    implements BusinessPartnerAddressDependentTaxNumbersSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public BusinessPartnerAddressDependentTaxNumbersLink(final String fieldName) {
        super(fieldName);
    }

    private BusinessPartnerAddressDependentTaxNumbersLink(final EntityLink<BusinessPartnerAddressDependentTaxNumbersLink<ObjectT> , BusinessPartnerAddressDependentTaxNumbers, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected BusinessPartnerAddressDependentTaxNumbersLink<ObjectT> translateLinkType(final EntityLink<BusinessPartnerAddressDependentTaxNumbersLink<ObjectT> , BusinessPartnerAddressDependentTaxNumbers, ObjectT> link) {
        return new BusinessPartnerAddressDependentTaxNumbersLink<ObjectT>(link);
    }

}