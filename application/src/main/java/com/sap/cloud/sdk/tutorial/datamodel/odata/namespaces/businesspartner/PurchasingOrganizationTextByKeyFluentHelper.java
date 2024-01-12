
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.PurchasingOrganizationTextSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.PurchasingOrganizationText PurchasingOrganizationText} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class PurchasingOrganizationTextByKeyFluentHelper
    extends FluentHelperByKey<PurchasingOrganizationTextByKeyFluentHelper, PurchasingOrganizationText, PurchasingOrganizationTextSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.PurchasingOrganizationText PurchasingOrganizationText} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code PurchasingOrganizationText}
     * @param textID
     *     Text ID<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param purchOrganization
     *     Purchasing Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code PurchasingOrganizationText}
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param language
     *     Language key<p>Constraints: Not nullable, Maximum length: 2</p>
     */
    public PurchasingOrganizationTextByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String supplier, final String purchOrganization, final String language, final String textID) {
        super(servicePath, entityCollection);
        this.key.put("Supplier", supplier);
        this.key.put("PurchasingOrganization", purchOrganization);
        this.key.put("Language", language);
        this.key.put("LongTextID", textID);
    }

    @Override
    @Nonnull
    protected Class<PurchasingOrganizationText> getEntityClass() {
        return PurchasingOrganizationText.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
