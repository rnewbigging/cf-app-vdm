
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.CustomerTaxGroupingField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.CustomerTaxGroupingSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Customer Tax Grouping<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerTaxGroupingType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerTaxGrouping
    extends VdmEntity<CustomerTaxGrouping>
{

    /**
     * Selector for all available fields of CustomerTaxGrouping.
     * 
     */
    public final static CustomerTaxGroupingSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @return
     *     Customer Number
     */
    @Key
    @SerializedName("Customer")
    @JsonProperty("Customer")
    @Nullable
    @ODataField(odataName = "Customer")
    private String customer;
    /**
     * Use with available fluent helpers to apply the <b>Customer</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<String> CUSTOMER = new CustomerTaxGroupingField<String>("Customer");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CustomerTaxGroupingCode</b></p>
     * 
     * @return
     *     Category Indicator for Tax Codes
     */
    @Key
    @SerializedName("CustomerTaxGroupingCode")
    @JsonProperty("CustomerTaxGroupingCode")
    @Nullable
    @ODataField(odataName = "CustomerTaxGroupingCode")
    private String taxCategory;
    /**
     * Use with available fluent helpers to apply the <b>CustomerTaxGroupingCode</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<String> TAX_CATEGORY = new CustomerTaxGroupingField<String>("CustomerTaxGroupingCode");
    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>CustTaxGrpExemptionCertificate</b></p>
     * 
     * @return
     *     Number of exemption certificate
     */
    @SerializedName("CustTaxGrpExemptionCertificate")
    @JsonProperty("CustTaxGrpExemptionCertificate")
    @Nullable
    @ODataField(odataName = "CustTaxGrpExemptionCertificate")
    private String exemptNumber;
    /**
     * Use with available fluent helpers to apply the <b>CustTaxGrpExemptionCertificate</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<String> EXEMPT_NUMBER = new CustomerTaxGroupingField<String>("CustTaxGrpExemptionCertificate");
    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>CustTaxGroupExemptionRate</b></p>
     * 
     * @return
     *     Exemption rate
     */
    @SerializedName("CustTaxGroupExemptionRate")
    @JsonProperty("CustTaxGroupExemptionRate")
    @Nullable
    @ODataField(odataName = "CustTaxGroupExemptionRate")
    private BigDecimal exemptionRate;
    /**
     * Use with available fluent helpers to apply the <b>CustTaxGroupExemptionRate</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<BigDecimal> EXEMPTION_RATE = new CustomerTaxGroupingField<BigDecimal>("CustTaxGroupExemptionRate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupExemptionStartDate</b></p>
     * 
     * @return
     *     Start date of exemption
     */
    @SerializedName("CustTaxGroupExemptionStartDate")
    @JsonProperty("CustTaxGroupExemptionStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CustTaxGroupExemptionStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptedFrom;
    /**
     * Use with available fluent helpers to apply the <b>CustTaxGroupExemptionStartDate</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<LocalDateTime> EXEMPTED_FROM = new CustomerTaxGroupingField<LocalDateTime>("CustTaxGroupExemptionStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupExemptionEndDate</b></p>
     * 
     * @return
     *     End date of exemption
     */
    @SerializedName("CustTaxGroupExemptionEndDate")
    @JsonProperty("CustTaxGroupExemptionEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CustTaxGroupExemptionEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptedUntil;
    /**
     * Use with available fluent helpers to apply the <b>CustTaxGroupExemptionEndDate</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<LocalDateTime> EXEMPTED_UNTIL = new CustomerTaxGroupingField<LocalDateTime>("CustTaxGroupExemptionEndDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupSubjectedStartDate</b></p>
     * 
     * @return
     *     Subjected from
     */
    @SerializedName("CustTaxGroupSubjectedStartDate")
    @JsonProperty("CustTaxGroupSubjectedStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CustTaxGroupSubjectedStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime subjectedFrom;
    /**
     * Use with available fluent helpers to apply the <b>CustTaxGroupSubjectedStartDate</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<LocalDateTime> SUBJECTED_FROM = new CustomerTaxGroupingField<LocalDateTime>("CustTaxGroupSubjectedStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupSubjectedEndDate</b></p>
     * 
     * @return
     *     Subjected until
     */
    @SerializedName("CustTaxGroupSubjectedEndDate")
    @JsonProperty("CustTaxGroupSubjectedEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CustTaxGroupSubjectedEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime subjectedUntil;
    /**
     * Use with available fluent helpers to apply the <b>CustTaxGroupSubjectedEndDate</b> field to query operations.
     * 
     */
    public final static CustomerTaxGroupingField<LocalDateTime> SUBJECTED_UNTIL = new CustomerTaxGroupingField<LocalDateTime>("CustTaxGroupSubjectedEndDate");

    @Nonnull
    @Override
    public Class<CustomerTaxGrouping> getType() {
        return CustomerTaxGrouping.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @param customer
     *     Customer Number
     */
    public void setCustomer(
        @Nullable
        final String customer) {
        rememberChangedField("Customer", this.customer);
        this.customer = customer;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CustomerTaxGroupingCode</b></p>
     * 
     * @param taxCategory
     *     Category Indicator for Tax Codes
     */
    public void setTaxCategory(
        @Nullable
        final String taxCategory) {
        rememberChangedField("CustomerTaxGroupingCode", this.taxCategory);
        this.taxCategory = taxCategory;
    }

    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>CustTaxGrpExemptionCertificate</b></p>
     * 
     * @param exemptNumber
     *     Number of exemption certificate
     */
    public void setExemptNumber(
        @Nullable
        final String exemptNumber) {
        rememberChangedField("CustTaxGrpExemptionCertificate", this.exemptNumber);
        this.exemptNumber = exemptNumber;
    }

    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>CustTaxGroupExemptionRate</b></p>
     * 
     * @param exemptionRate
     *     Exemption rate
     */
    public void setExemptionRate(
        @Nullable
        final BigDecimal exemptionRate) {
        rememberChangedField("CustTaxGroupExemptionRate", this.exemptionRate);
        this.exemptionRate = exemptionRate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupExemptionStartDate</b></p>
     * 
     * @param exemptedFrom
     *     Start date of exemption
     */
    public void setExemptedFrom(
        @Nullable
        final LocalDateTime exemptedFrom) {
        rememberChangedField("CustTaxGroupExemptionStartDate", this.exemptedFrom);
        this.exemptedFrom = exemptedFrom;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupExemptionEndDate</b></p>
     * 
     * @param exemptedUntil
     *     End date of exemption
     */
    public void setExemptedUntil(
        @Nullable
        final LocalDateTime exemptedUntil) {
        rememberChangedField("CustTaxGroupExemptionEndDate", this.exemptedUntil);
        this.exemptedUntil = exemptedUntil;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupSubjectedStartDate</b></p>
     * 
     * @param subjectedFrom
     *     Subjected from
     */
    public void setSubjectedFrom(
        @Nullable
        final LocalDateTime subjectedFrom) {
        rememberChangedField("CustTaxGroupSubjectedStartDate", this.subjectedFrom);
        this.subjectedFrom = subjectedFrom;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CustTaxGroupSubjectedEndDate</b></p>
     * 
     * @param subjectedUntil
     *     Subjected until
     */
    public void setSubjectedUntil(
        @Nullable
        final LocalDateTime subjectedUntil) {
        rememberChangedField("CustTaxGroupSubjectedEndDate", this.subjectedUntil);
        this.subjectedUntil = subjectedUntil;
    }

    @Override
    protected String getEntityCollection() {
        return "A_CustomerTaxGrouping";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("CustomerTaxGroupingCode", getTaxCategory());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("CustomerTaxGroupingCode", getTaxCategory());
        values.put("CustTaxGrpExemptionCertificate", getExemptNumber());
        values.put("CustTaxGroupExemptionRate", getExemptionRate());
        values.put("CustTaxGroupExemptionStartDate", getExemptedFrom());
        values.put("CustTaxGroupExemptionEndDate", getExemptedUntil());
        values.put("CustTaxGroupSubjectedStartDate", getSubjectedFrom());
        values.put("CustTaxGroupSubjectedEndDate", getSubjectedUntil());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Customer")) {
                final Object value = values.remove("Customer");
                if ((value == null)||(!value.equals(getCustomer()))) {
                    setCustomer(((String) value));
                }
            }
            if (values.containsKey("CustomerTaxGroupingCode")) {
                final Object value = values.remove("CustomerTaxGroupingCode");
                if ((value == null)||(!value.equals(getTaxCategory()))) {
                    setTaxCategory(((String) value));
                }
            }
            if (values.containsKey("CustTaxGrpExemptionCertificate")) {
                final Object value = values.remove("CustTaxGrpExemptionCertificate");
                if ((value == null)||(!value.equals(getExemptNumber()))) {
                    setExemptNumber(((String) value));
                }
            }
            if (values.containsKey("CustTaxGroupExemptionRate")) {
                final Object value = values.remove("CustTaxGroupExemptionRate");
                if ((value == null)||(!value.equals(getExemptionRate()))) {
                    setExemptionRate(((BigDecimal) value));
                }
            }
            if (values.containsKey("CustTaxGroupExemptionStartDate")) {
                final Object value = values.remove("CustTaxGroupExemptionStartDate");
                if ((value == null)||(!value.equals(getExemptedFrom()))) {
                    setExemptedFrom(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CustTaxGroupExemptionEndDate")) {
                final Object value = values.remove("CustTaxGroupExemptionEndDate");
                if ((value == null)||(!value.equals(getExemptedUntil()))) {
                    setExemptedUntil(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CustTaxGroupSubjectedStartDate")) {
                final Object value = values.remove("CustTaxGroupSubjectedStartDate");
                if ((value == null)||(!value.equals(getSubjectedFrom()))) {
                    setSubjectedFrom(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CustTaxGroupSubjectedEndDate")) {
                final Object value = values.remove("CustTaxGroupSubjectedEndDate");
                if ((value == null)||(!value.equals(getSubjectedUntil()))) {
                    setSubjectedUntil(((LocalDateTime) value));
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
    public static<T >CustomerTaxGroupingField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerTaxGroupingField<T>(fieldName);
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
    public static<T,DomainT >CustomerTaxGroupingField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerTaxGroupingField<T>(fieldName, typeConverter);
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
