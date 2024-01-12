
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.SupplierDunningField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.SupplierDunningSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Supplier Dunning<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierDunningType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SupplierDunning
    extends VdmEntity<SupplierDunning>
{

    /**
     * Selector for all available fields of SupplierDunning.
     * 
     */
    public final static SupplierDunningSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @return
     *     Account Number of Supplier
     */
    @Key
    @SerializedName("Supplier")
    @JsonProperty("Supplier")
    @Nullable
    @ODataField(odataName = "Supplier")
    private String supplier;
    /**
     * Use with available fluent helpers to apply the <b>Supplier</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> SUPPLIER = new SupplierDunningField<String>("Supplier");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @return
     *     Company Code
     */
    @Key
    @SerializedName("CompanyCode")
    @JsonProperty("CompanyCode")
    @Nullable
    @ODataField(odataName = "CompanyCode")
    private String companyCode;
    /**
     * Use with available fluent helpers to apply the <b>CompanyCode</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> COMPANY_CODE = new SupplierDunningField<String>("CompanyCode");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningArea</b></p>
     * 
     * @return
     *     Dunning Area
     */
    @Key
    @SerializedName("DunningArea")
    @JsonProperty("DunningArea")
    @Nullable
    @ODataField(odataName = "DunningArea")
    private String dunningArea;
    /**
     * Use with available fluent helpers to apply the <b>DunningArea</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> DUNNING_AREA = new SupplierDunningField<String>("DunningArea");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningBlock</b></p>
     * 
     * @return
     *     Dunning Block
     */
    @SerializedName("DunningBlock")
    @JsonProperty("DunningBlock")
    @Nullable
    @ODataField(odataName = "DunningBlock")
    private String dunningBlock;
    /**
     * Use with available fluent helpers to apply the <b>DunningBlock</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> DUNNING_BLOCK = new SupplierDunningField<String>("DunningBlock");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningLevel</b></p>
     * 
     * @return
     *     Dunning Level
     */
    @SerializedName("DunningLevel")
    @JsonProperty("DunningLevel")
    @Nullable
    @ODataField(odataName = "DunningLevel")
    private String dunningLevel;
    /**
     * Use with available fluent helpers to apply the <b>DunningLevel</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> DUNNING_LEVEL = new SupplierDunningField<String>("DunningLevel");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>DunningProcedure</b></p>
     * 
     * @return
     *     Dunning Procedure
     */
    @SerializedName("DunningProcedure")
    @JsonProperty("DunningProcedure")
    @Nullable
    @ODataField(odataName = "DunningProcedure")
    private String dunningProcedure;
    /**
     * Use with available fluent helpers to apply the <b>DunningProcedure</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> DUNNING_PROCEDURE = new SupplierDunningField<String>("DunningProcedure");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DunningRecipient</b></p>
     * 
     * @return
     *     Account number of the dunning recipient
     */
    @SerializedName("DunningRecipient")
    @JsonProperty("DunningRecipient")
    @Nullable
    @ODataField(odataName = "DunningRecipient")
    private String dunnrecipient;
    /**
     * Use with available fluent helpers to apply the <b>DunningRecipient</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> DUNNRECIPIENT = new SupplierDunningField<String>("DunningRecipient");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastDunnedOn</b></p>
     * 
     * @return
     *     Date of Last Dunning Notice
     */
    @SerializedName("LastDunnedOn")
    @JsonProperty("LastDunnedOn")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "LastDunnedOn", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime lastDunned;
    /**
     * Use with available fluent helpers to apply the <b>LastDunnedOn</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<LocalDateTime> LAST_DUNNED = new SupplierDunningField<LocalDateTime>("LastDunnedOn");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LegDunningProcedureOn</b></p>
     * 
     * @return
     *     Date of the Legal Dunning Proceedings
     */
    @SerializedName("LegDunningProcedureOn")
    @JsonProperty("LegDunningProcedureOn")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "LegDunningProcedureOn", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime legalDunnProcFrom;
    /**
     * Use with available fluent helpers to apply the <b>LegDunningProcedureOn</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<LocalDateTime> LEGAL_DUNN_PROC_FROM = new SupplierDunningField<LocalDateTime>("LegDunningProcedureOn");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningClerk</b></p>
     * 
     * @return
     *     Dunning Clerk
     */
    @SerializedName("DunningClerk")
    @JsonProperty("DunningClerk")
    @Nullable
    @ODataField(odataName = "DunningClerk")
    private String dunningClerk;
    /**
     * Use with available fluent helpers to apply the <b>DunningClerk</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> DUNNING_CLERK = new SupplierDunningField<String>("DunningClerk");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AuthorizationGroup</b></p>
     * 
     * @return
     *     Authorization Group
     */
    @SerializedName("AuthorizationGroup")
    @JsonProperty("AuthorizationGroup")
    @Nullable
    @ODataField(odataName = "AuthorizationGroup")
    private String authorization;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationGroup</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> AUTHORIZATION = new SupplierDunningField<String>("AuthorizationGroup");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplierAccountGroup</b></p>
     * 
     * @return
     *     Supplier Account Group
     */
    @SerializedName("SupplierAccountGroup")
    @JsonProperty("SupplierAccountGroup")
    @Nullable
    @ODataField(odataName = "SupplierAccountGroup")
    private String accountGroup;
    /**
     * Use with available fluent helpers to apply the <b>SupplierAccountGroup</b> field to query operations.
     * 
     */
    public final static SupplierDunningField<String> ACCOUNT_GROUP = new SupplierDunningField<String>("SupplierAccountGroup");

    @Nonnull
    @Override
    public Class<SupplierDunning> getType() {
        return SupplierDunning.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     Account Number of Supplier
     */
    public void setSupplier(
        @Nullable
        final String supplier) {
        rememberChangedField("Supplier", this.supplier);
        this.supplier = supplier;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @param companyCode
     *     Company Code
     */
    public void setCompanyCode(
        @Nullable
        final String companyCode) {
        rememberChangedField("CompanyCode", this.companyCode);
        this.companyCode = companyCode;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningArea</b></p>
     * 
     * @param dunningArea
     *     Dunning Area
     */
    public void setDunningArea(
        @Nullable
        final String dunningArea) {
        rememberChangedField("DunningArea", this.dunningArea);
        this.dunningArea = dunningArea;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningBlock</b></p>
     * 
     * @param dunningBlock
     *     Dunning Block
     */
    public void setDunningBlock(
        @Nullable
        final String dunningBlock) {
        rememberChangedField("DunningBlock", this.dunningBlock);
        this.dunningBlock = dunningBlock;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningLevel</b></p>
     * 
     * @param dunningLevel
     *     Dunning Level
     */
    public void setDunningLevel(
        @Nullable
        final String dunningLevel) {
        rememberChangedField("DunningLevel", this.dunningLevel);
        this.dunningLevel = dunningLevel;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>DunningProcedure</b></p>
     * 
     * @param dunningProcedure
     *     Dunning Procedure
     */
    public void setDunningProcedure(
        @Nullable
        final String dunningProcedure) {
        rememberChangedField("DunningProcedure", this.dunningProcedure);
        this.dunningProcedure = dunningProcedure;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DunningRecipient</b></p>
     * 
     * @param dunnrecipient
     *     Account number of the dunning recipient
     */
    public void setDunnrecipient(
        @Nullable
        final String dunnrecipient) {
        rememberChangedField("DunningRecipient", this.dunnrecipient);
        this.dunnrecipient = dunnrecipient;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastDunnedOn</b></p>
     * 
     * @param lastDunned
     *     Date of Last Dunning Notice
     */
    public void setLastDunned(
        @Nullable
        final LocalDateTime lastDunned) {
        rememberChangedField("LastDunnedOn", this.lastDunned);
        this.lastDunned = lastDunned;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LegDunningProcedureOn</b></p>
     * 
     * @param legalDunnProcFrom
     *     Date of the Legal Dunning Proceedings
     */
    public void setLegalDunnProcFrom(
        @Nullable
        final LocalDateTime legalDunnProcFrom) {
        rememberChangedField("LegDunningProcedureOn", this.legalDunnProcFrom);
        this.legalDunnProcFrom = legalDunnProcFrom;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningClerk</b></p>
     * 
     * @param dunningClerk
     *     Dunning Clerk
     */
    public void setDunningClerk(
        @Nullable
        final String dunningClerk) {
        rememberChangedField("DunningClerk", this.dunningClerk);
        this.dunningClerk = dunningClerk;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AuthorizationGroup</b></p>
     * 
     * @param authorization
     *     Authorization Group
     */
    public void setAuthorization(
        @Nullable
        final String authorization) {
        rememberChangedField("AuthorizationGroup", this.authorization);
        this.authorization = authorization;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplierAccountGroup</b></p>
     * 
     * @param accountGroup
     *     Supplier Account Group
     */
    public void setAccountGroup(
        @Nullable
        final String accountGroup) {
        rememberChangedField("SupplierAccountGroup", this.accountGroup);
        this.accountGroup = accountGroup;
    }

    @Override
    protected String getEntityCollection() {
        return "A_SupplierDunning";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        result.put("CompanyCode", getCompanyCode());
        result.put("DunningArea", getDunningArea());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("CompanyCode", getCompanyCode());
        values.put("DunningArea", getDunningArea());
        values.put("DunningBlock", getDunningBlock());
        values.put("DunningLevel", getDunningLevel());
        values.put("DunningProcedure", getDunningProcedure());
        values.put("DunningRecipient", getDunnrecipient());
        values.put("LastDunnedOn", getLastDunned());
        values.put("LegDunningProcedureOn", getLegalDunnProcFrom());
        values.put("DunningClerk", getDunningClerk());
        values.put("AuthorizationGroup", getAuthorization());
        values.put("SupplierAccountGroup", getAccountGroup());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Supplier")) {
                final Object value = values.remove("Supplier");
                if ((value == null)||(!value.equals(getSupplier()))) {
                    setSupplier(((String) value));
                }
            }
            if (values.containsKey("CompanyCode")) {
                final Object value = values.remove("CompanyCode");
                if ((value == null)||(!value.equals(getCompanyCode()))) {
                    setCompanyCode(((String) value));
                }
            }
            if (values.containsKey("DunningArea")) {
                final Object value = values.remove("DunningArea");
                if ((value == null)||(!value.equals(getDunningArea()))) {
                    setDunningArea(((String) value));
                }
            }
            if (values.containsKey("DunningBlock")) {
                final Object value = values.remove("DunningBlock");
                if ((value == null)||(!value.equals(getDunningBlock()))) {
                    setDunningBlock(((String) value));
                }
            }
            if (values.containsKey("DunningLevel")) {
                final Object value = values.remove("DunningLevel");
                if ((value == null)||(!value.equals(getDunningLevel()))) {
                    setDunningLevel(((String) value));
                }
            }
            if (values.containsKey("DunningProcedure")) {
                final Object value = values.remove("DunningProcedure");
                if ((value == null)||(!value.equals(getDunningProcedure()))) {
                    setDunningProcedure(((String) value));
                }
            }
            if (values.containsKey("DunningRecipient")) {
                final Object value = values.remove("DunningRecipient");
                if ((value == null)||(!value.equals(getDunnrecipient()))) {
                    setDunnrecipient(((String) value));
                }
            }
            if (values.containsKey("LastDunnedOn")) {
                final Object value = values.remove("LastDunnedOn");
                if ((value == null)||(!value.equals(getLastDunned()))) {
                    setLastDunned(((LocalDateTime) value));
                }
            }
            if (values.containsKey("LegDunningProcedureOn")) {
                final Object value = values.remove("LegDunningProcedureOn");
                if ((value == null)||(!value.equals(getLegalDunnProcFrom()))) {
                    setLegalDunnProcFrom(((LocalDateTime) value));
                }
            }
            if (values.containsKey("DunningClerk")) {
                final Object value = values.remove("DunningClerk");
                if ((value == null)||(!value.equals(getDunningClerk()))) {
                    setDunningClerk(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorization()))) {
                    setAuthorization(((String) value));
                }
            }
            if (values.containsKey("SupplierAccountGroup")) {
                final Object value = values.remove("SupplierAccountGroup");
                if ((value == null)||(!value.equals(getAccountGroup()))) {
                    setAccountGroup(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >SupplierDunningField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SupplierDunningField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >SupplierDunningField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SupplierDunningField<T>(fieldName, typeConverter);
    }

    @Override
    @Nullable
    public Destination getDestinationForFetch() {
        return super.getDestinationForFetch();
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Override
    public void attachToService(
        @Nullable
        final String servicePath,
        @Nonnull
        final Destination destination) {
        super.attachToService(servicePath, destination);
    }

    @Override
    protected String getDefaultServicePath() {
        return (com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService.DEFAULT_SERVICE_PATH);
    }

}