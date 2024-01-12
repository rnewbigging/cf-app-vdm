
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.HomePageURLSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.HomePageURL HomePageURL} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class HomePageURLByKeyFluentHelper
    extends FluentHelperByKey<HomePageURLByKeyFluentHelper, HomePageURL, HomePageURLSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.HomePageURL HomePageURL} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code HomePageURL}
     * @param sequenceNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code HomePageURL}
     * @param addressNumber
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param from
     *     Valid-from date - in current Release only 00010101 possible<p>Constraints: Not nullable, Precision: 0</p>
     * @param standardAddr
     *     Flag: this address is the default address<p>Constraints: Not nullable</p>
     * @param personNumber
     *     Person Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public HomePageURLByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String addressNumber, final String personNumber, final String sequenceNumber, final LocalDateTime from, final Boolean standardAddr) {
        super(servicePath, entityCollection);
        this.key.put("AddressID", addressNumber);
        this.key.put("Person", personNumber);
        this.key.put("OrdinalNumber", sequenceNumber);
        this.key.put("ValidityStartDate", from);
        this.key.put("IsDefaultURLAddress", standardAddr);
    }

    @Override
    @Nonnull
    protected Class<HomePageURL> getEntityClass() {
        return HomePageURL.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
