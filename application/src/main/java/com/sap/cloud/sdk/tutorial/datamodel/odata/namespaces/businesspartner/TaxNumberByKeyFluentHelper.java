
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.TaxNumberSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.TaxNumber TaxNumber} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class TaxNumberByKeyFluentHelper
    extends FluentHelperByKey<TaxNumberByKeyFluentHelper, TaxNumber, TaxNumberSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.TaxNumber TaxNumber} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code TaxNumber}
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code TaxNumber}
     * @param taxNumberCategory
     *     Tax Number Category<p>Constraints: Not nullable, Maximum length: 4</p>
     */
    public TaxNumberByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String businessPartner, final String taxNumberCategory) {
        super(servicePath, entityCollection);
        this.key.put("BusinessPartner", businessPartner);
        this.key.put("BPTaxType", taxNumberCategory);
    }

    @Override
    @Nonnull
    protected Class<TaxNumber> getEntityClass() {
        return TaxNumber.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}