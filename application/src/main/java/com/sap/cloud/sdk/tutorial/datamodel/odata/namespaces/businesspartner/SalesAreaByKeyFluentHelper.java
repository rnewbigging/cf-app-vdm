
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.SalesAreaSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.SalesArea SalesArea} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesAreaByKeyFluentHelper
    extends FluentHelperByKey<SalesAreaByKeyFluentHelper, SalesArea, SalesAreaSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.SalesArea SalesArea} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param division
     *     Division<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code SalesArea}
     * @param servicePath
     *     Service path to be used to fetch a single {@code SalesArea}
     * @param distributionChannel
     *     Distribution Channel<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrganization
     *     Sales Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SalesAreaByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String customer, final String salesOrganization, final String distributionChannel, final String division) {
        super(servicePath, entityCollection);
        this.key.put("Customer", customer);
        this.key.put("SalesOrganization", salesOrganization);
        this.key.put("DistributionChannel", distributionChannel);
        this.key.put("Division", division);
    }

    @Override
    @Nonnull
    protected Class<SalesArea> getEntityClass() {
        return SalesArea.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
