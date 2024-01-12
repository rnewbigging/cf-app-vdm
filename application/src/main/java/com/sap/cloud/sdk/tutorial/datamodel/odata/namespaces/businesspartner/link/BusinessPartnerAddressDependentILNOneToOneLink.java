
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.ExpressionFluentHelper;
import com.sap.cloud.sdk.datamodel.odata.helper.OneToOneLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartnerAddressDependentILN;


/**
 * Template class to represent entity navigation links of {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartnerAddressDependentILN BusinessPartnerAddressDependentILN} to other entities, where the cardinality of the related entity is at most 1. This class extends {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.link.BusinessPartnerAddressDependentILNLink BusinessPartnerAddressDependentILNLink} and provides an additional filter function.
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class BusinessPartnerAddressDependentILNOneToOneLink<ObjectT extends VdmObject<?> >
    extends BusinessPartnerAddressDependentILNLink<ObjectT>
    implements OneToOneLink<BusinessPartnerAddressDependentILN, ObjectT>
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public BusinessPartnerAddressDependentILNOneToOneLink(final String fieldName) {
        super(fieldName);
    }

    /**
     * Query modifier to restrict the result set to entities for which this expression (formulated over a property of a <b>related</b> entity) evaluates to true. Note that filtering on a related entity does not expand the selection of the respective query to that entity.
     * 
     * @param filterExpression
     *     A filter expression on the related entity.
     * @return
     *     A filter expression over a related entity, scoped to the parent entity.
     */
    @Nonnull
    @Override
    public ExpressionFluentHelper<BusinessPartnerAddressDependentILN> filter(
        @Nonnull
        final ExpressionFluentHelper<ObjectT> filterExpression) {
        return super.filterOnOneToOneLink(filterExpression);
    }

}