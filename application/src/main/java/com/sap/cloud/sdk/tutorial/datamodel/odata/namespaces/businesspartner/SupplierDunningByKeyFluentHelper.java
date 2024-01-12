
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.SupplierDunningSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.SupplierDunning SupplierDunning} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SupplierDunningByKeyFluentHelper
    extends FluentHelperByKey<SupplierDunningByKeyFluentHelper, SupplierDunning, SupplierDunningSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.SupplierDunning SupplierDunning} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code SupplierDunning}
     * @param dunningArea
     *     Dunning Area<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code SupplierDunning}
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SupplierDunningByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String supplier, final String companyCode, final String dunningArea) {
        super(servicePath, entityCollection);
        this.key.put("Supplier", supplier);
        this.key.put("CompanyCode", companyCode);
        this.key.put("DunningArea", dunningArea);
    }

    @Override
    @Nonnull
    protected Class<SupplierDunning> getEntityClass() {
        return SupplierDunning.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}