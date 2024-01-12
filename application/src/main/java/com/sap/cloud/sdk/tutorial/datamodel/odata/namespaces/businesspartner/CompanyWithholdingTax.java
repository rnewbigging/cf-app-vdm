
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.math.BigDecimal;
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.CompanyWithholdingTaxField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.CompanyWithholdingTaxSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Company Withholding Tax<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierWithHoldingTaxType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CompanyWithholdingTax
    extends VdmEntity<CompanyWithholdingTax>
{

    /**
     * Selector for all available fields of CompanyWithholdingTax.
     * 
     */
    public final static CompanyWithholdingTaxSelectable ALL_FIELDS = () -> "*";
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
    public final static CompanyWithholdingTaxField<String> SUPPLIER = new CompanyWithholdingTaxField<String>("Supplier");
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
    public final static CompanyWithholdingTaxField<String> COMPANY_CODE = new CompanyWithholdingTaxField<String>("CompanyCode");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxType</b></p>
     * 
     * @return
     *     Indicator for Withholding Tax Type
     */
    @Key
    @SerializedName("WithholdingTaxType")
    @JsonProperty("WithholdingTaxType")
    @Nullable
    @ODataField(odataName = "WithholdingTaxType")
    private String withholdingTaxType;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxType</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<String> WITHHOLDING_TAX_TYPE = new CompanyWithholdingTaxField<String>("WithholdingTaxType");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateBegin</b></p>
     * 
     * @return
     *     Date on Which Exemption Begins
     */
    @SerializedName("ExemptionDateBegin")
    @JsonProperty("ExemptionDateBegin")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ExemptionDateBegin", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptionStartDate;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionDateBegin</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<LocalDateTime> EXEMPTION_START_DATE = new CompanyWithholdingTaxField<LocalDateTime>("ExemptionDateBegin");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateEnd</b></p>
     * 
     * @return
     *     Date on Which Exemption Ends
     */
    @SerializedName("ExemptionDateEnd")
    @JsonProperty("ExemptionDateEnd")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ExemptionDateEnd", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptionEndDate;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionDateEnd</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<LocalDateTime> EXEMPTION_END_DATE = new CompanyWithholdingTaxField<LocalDateTime>("ExemptionDateEnd");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ExemptionReason</b></p>
     * 
     * @return
     *     Reason for Exemption
     */
    @SerializedName("ExemptionReason")
    @JsonProperty("ExemptionReason")
    @Nullable
    @ODataField(odataName = "ExemptionReason")
    private String exemptionReason;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionReason</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<String> EXEMPTION_REASON = new CompanyWithholdingTaxField<String>("ExemptionReason");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsWithholdingTaxSubject</b></p>
     * 
     * @return
     *     Indicator: Subject to Withholding Tax?
     */
    @SerializedName("IsWithholdingTaxSubject")
    @JsonProperty("IsWithholdingTaxSubject")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsWithholdingTaxSubject")
    private Boolean subjectToWTx;
    /**
     * Use with available fluent helpers to apply the <b>IsWithholdingTaxSubject</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<Boolean> SUBJECT_TO_W_TX = new CompanyWithholdingTaxField<Boolean>("IsWithholdingTaxSubject");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>RecipientType</b></p>
     * 
     * @return
     *     Type of Recipient
     */
    @SerializedName("RecipientType")
    @JsonProperty("RecipientType")
    @Nullable
    @ODataField(odataName = "RecipientType")
    private String recipientType;
    /**
     * Use with available fluent helpers to apply the <b>RecipientType</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<String> RECIPIENT_TYPE = new CompanyWithholdingTaxField<String>("RecipientType");
    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>WithholdingTaxCertificate</b></p>
     * 
     * @return
     *     Exemption Certificate Number
     */
    @SerializedName("WithholdingTaxCertificate")
    @JsonProperty("WithholdingTaxCertificate")
    @Nullable
    @ODataField(odataName = "WithholdingTaxCertificate")
    private String exemptionNumber;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCertificate</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<String> EXEMPTION_NUMBER = new CompanyWithholdingTaxField<String>("WithholdingTaxCertificate");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxCode</b></p>
     * 
     * @return
     *     Withholding Tax Code
     */
    @SerializedName("WithholdingTaxCode")
    @JsonProperty("WithholdingTaxCode")
    @Nullable
    @ODataField(odataName = "WithholdingTaxCode")
    private String wTaxCode;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCode</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<String> W_TAX_CODE = new CompanyWithholdingTaxField<String>("WithholdingTaxCode");
    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxExmptPercent</b></p>
     * 
     * @return
     *     Exemption Rate
     */
    @SerializedName("WithholdingTaxExmptPercent")
    @JsonProperty("WithholdingTaxExmptPercent")
    @Nullable
    @ODataField(odataName = "WithholdingTaxExmptPercent")
    private BigDecimal exemptionRate;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxExmptPercent</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<BigDecimal> EXEMPTION_RATE = new CompanyWithholdingTaxField<BigDecimal>("WithholdingTaxExmptPercent");
    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>WithholdingTaxNumber</b></p>
     * 
     * @return
     *     Withholding tax identification number
     */
    @SerializedName("WithholdingTaxNumber")
    @JsonProperty("WithholdingTaxNumber")
    @Nullable
    @ODataField(odataName = "WithholdingTaxNumber")
    private String wtaxNumber;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxNumber</b> field to query operations.
     * 
     */
    public final static CompanyWithholdingTaxField<String> WTAX_NUMBER = new CompanyWithholdingTaxField<String>("WithholdingTaxNumber");
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
    public final static CompanyWithholdingTaxField<String> AUTHORIZATION = new CompanyWithholdingTaxField<String>("AuthorizationGroup");

    @Nonnull
    @Override
    public Class<CompanyWithholdingTax> getType() {
        return CompanyWithholdingTax.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxType</b></p>
     * 
     * @param withholdingTaxType
     *     Indicator for Withholding Tax Type
     */
    public void setWithholdingTaxType(
        @Nullable
        final String withholdingTaxType) {
        rememberChangedField("WithholdingTaxType", this.withholdingTaxType);
        this.withholdingTaxType = withholdingTaxType;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateBegin</b></p>
     * 
     * @param exemptionStartDate
     *     Date on Which Exemption Begins
     */
    public void setExemptionStartDate(
        @Nullable
        final LocalDateTime exemptionStartDate) {
        rememberChangedField("ExemptionDateBegin", this.exemptionStartDate);
        this.exemptionStartDate = exemptionStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateEnd</b></p>
     * 
     * @param exemptionEndDate
     *     Date on Which Exemption Ends
     */
    public void setExemptionEndDate(
        @Nullable
        final LocalDateTime exemptionEndDate) {
        rememberChangedField("ExemptionDateEnd", this.exemptionEndDate);
        this.exemptionEndDate = exemptionEndDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ExemptionReason</b></p>
     * 
     * @param exemptionReason
     *     Reason for Exemption
     */
    public void setExemptionReason(
        @Nullable
        final String exemptionReason) {
        rememberChangedField("ExemptionReason", this.exemptionReason);
        this.exemptionReason = exemptionReason;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsWithholdingTaxSubject</b></p>
     * 
     * @param subjectToWTx
     *     Indicator: Subject to Withholding Tax?
     */
    public void setSubjectToWTx(
        @Nullable
        final Boolean subjectToWTx) {
        rememberChangedField("IsWithholdingTaxSubject", this.subjectToWTx);
        this.subjectToWTx = subjectToWTx;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>RecipientType</b></p>
     * 
     * @param recipientType
     *     Type of Recipient
     */
    public void setRecipientType(
        @Nullable
        final String recipientType) {
        rememberChangedField("RecipientType", this.recipientType);
        this.recipientType = recipientType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>WithholdingTaxCertificate</b></p>
     * 
     * @param exemptionNumber
     *     Exemption Certificate Number
     */
    public void setExemptionNumber(
        @Nullable
        final String exemptionNumber) {
        rememberChangedField("WithholdingTaxCertificate", this.exemptionNumber);
        this.exemptionNumber = exemptionNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxCode</b></p>
     * 
     * @param wTaxCode
     *     Withholding Tax Code
     */
    public void setWTaxCode(
        @Nullable
        final String wTaxCode) {
        rememberChangedField("WithholdingTaxCode", this.wTaxCode);
        this.wTaxCode = wTaxCode;
    }

    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxExmptPercent</b></p>
     * 
     * @param exemptionRate
     *     Exemption Rate
     */
    public void setExemptionRate(
        @Nullable
        final BigDecimal exemptionRate) {
        rememberChangedField("WithholdingTaxExmptPercent", this.exemptionRate);
        this.exemptionRate = exemptionRate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>WithholdingTaxNumber</b></p>
     * 
     * @param wtaxNumber
     *     Withholding tax identification number
     */
    public void setWtaxNumber(
        @Nullable
        final String wtaxNumber) {
        rememberChangedField("WithholdingTaxNumber", this.wtaxNumber);
        this.wtaxNumber = wtaxNumber;
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

    @Override
    protected String getEntityCollection() {
        return "A_SupplierWithHoldingTax";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        result.put("CompanyCode", getCompanyCode());
        result.put("WithholdingTaxType", getWithholdingTaxType());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("CompanyCode", getCompanyCode());
        values.put("WithholdingTaxType", getWithholdingTaxType());
        values.put("ExemptionDateBegin", getExemptionStartDate());
        values.put("ExemptionDateEnd", getExemptionEndDate());
        values.put("ExemptionReason", getExemptionReason());
        values.put("IsWithholdingTaxSubject", getSubjectToWTx());
        values.put("RecipientType", getRecipientType());
        values.put("WithholdingTaxCertificate", getExemptionNumber());
        values.put("WithholdingTaxCode", getWTaxCode());
        values.put("WithholdingTaxExmptPercent", getExemptionRate());
        values.put("WithholdingTaxNumber", getWtaxNumber());
        values.put("AuthorizationGroup", getAuthorization());
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
            if (values.containsKey("WithholdingTaxType")) {
                final Object value = values.remove("WithholdingTaxType");
                if ((value == null)||(!value.equals(getWithholdingTaxType()))) {
                    setWithholdingTaxType(((String) value));
                }
            }
            if (values.containsKey("ExemptionDateBegin")) {
                final Object value = values.remove("ExemptionDateBegin");
                if ((value == null)||(!value.equals(getExemptionStartDate()))) {
                    setExemptionStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ExemptionDateEnd")) {
                final Object value = values.remove("ExemptionDateEnd");
                if ((value == null)||(!value.equals(getExemptionEndDate()))) {
                    setExemptionEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ExemptionReason")) {
                final Object value = values.remove("ExemptionReason");
                if ((value == null)||(!value.equals(getExemptionReason()))) {
                    setExemptionReason(((String) value));
                }
            }
            if (values.containsKey("IsWithholdingTaxSubject")) {
                final Object value = values.remove("IsWithholdingTaxSubject");
                if ((value == null)||(!value.equals(getSubjectToWTx()))) {
                    setSubjectToWTx(((Boolean) value));
                }
            }
            if (values.containsKey("RecipientType")) {
                final Object value = values.remove("RecipientType");
                if ((value == null)||(!value.equals(getRecipientType()))) {
                    setRecipientType(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCertificate")) {
                final Object value = values.remove("WithholdingTaxCertificate");
                if ((value == null)||(!value.equals(getExemptionNumber()))) {
                    setExemptionNumber(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCode")) {
                final Object value = values.remove("WithholdingTaxCode");
                if ((value == null)||(!value.equals(getWTaxCode()))) {
                    setWTaxCode(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxExmptPercent")) {
                final Object value = values.remove("WithholdingTaxExmptPercent");
                if ((value == null)||(!value.equals(getExemptionRate()))) {
                    setExemptionRate(((BigDecimal) value));
                }
            }
            if (values.containsKey("WithholdingTaxNumber")) {
                final Object value = values.remove("WithholdingTaxNumber");
                if ((value == null)||(!value.equals(getWtaxNumber()))) {
                    setWtaxNumber(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorization()))) {
                    setAuthorization(((String) value));
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
    public static<T >CompanyWithholdingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CompanyWithholdingTaxField<T>(fieldName);
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
    public static<T,DomainT >CompanyWithholdingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CompanyWithholdingTaxField<T>(fieldName, typeConverter);
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
