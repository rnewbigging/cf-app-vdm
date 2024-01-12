
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperRead;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.CreditWorthinessSelectable;


/**
 * Fluent helper to fetch multiple {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CreditWorthiness CreditWorthiness} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CreditWorthinessFluentHelper
    extends FluentHelperRead<CreditWorthinessFluentHelper, CreditWorthiness, CreditWorthinessSelectable>
{


    /**
     * Creates a fluent helper using the specified service path and entity collection to send the read requests.
     * 
     * @param entityCollection
     *     The entity collection to direct the requests to.
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public CreditWorthinessFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
    }

    @Override
    @Nonnull
    protected Class<CreditWorthiness> getEntityClass() {
        return CreditWorthiness.class;
    }

}
