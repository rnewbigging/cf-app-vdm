
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.FaxNumberField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.FaxNumberSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Fax Number<p></p><p>Original entity name from the Odata EDM: <b>A_AddressFaxNumberType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class FaxNumber
    extends VdmEntity<FaxNumber>
{

    /**
     * Selector for all available fields of FaxNumber.
     * 
     */
    public final static FaxNumberSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @return
     *     Address Number
     */
    @Key
    @SerializedName("AddressID")
    @JsonProperty("AddressID")
    @Nullable
    @ODataField(odataName = "AddressID")
    private String addressNumber;
    /**
     * Use with available fluent helpers to apply the <b>AddressID</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> ADDRESS_NUMBER = new FaxNumberField<String>("AddressID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @return
     *     Person Number
     */
    @Key
    @SerializedName("Person")
    @JsonProperty("Person")
    @Nullable
    @ODataField(odataName = "Person")
    private String personNumber;
    /**
     * Use with available fluent helpers to apply the <b>Person</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> PERSON_NUMBER = new FaxNumberField<String>("Person");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @return
     *     Sequence Number
     */
    @Key
    @SerializedName("OrdinalNumber")
    @JsonProperty("OrdinalNumber")
    @Nullable
    @ODataField(odataName = "OrdinalNumber")
    private String sequenceNumber;
    /**
     * Use with available fluent helpers to apply the <b>OrdinalNumber</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> SEQUENCE_NUMBER = new FaxNumberField<String>("OrdinalNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultFaxNumber</b></p>
     * 
     * @return
     *     Standard Sender Address in this Communication Type
     */
    @SerializedName("IsDefaultFaxNumber")
    @JsonProperty("IsDefaultFaxNumber")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultFaxNumber")
    private Boolean standardNo;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultFaxNumber</b> field to query operations.
     * 
     */
    public final static FaxNumberField<Boolean> STANDARD_NO = new FaxNumberField<Boolean>("IsDefaultFaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>FaxCountry</b></p>
     * 
     * @return
     *     Country/Region for Telephone/Fax Number
     */
    @SerializedName("FaxCountry")
    @JsonProperty("FaxCountry")
    @Nullable
    @ODataField(odataName = "FaxCountry")
    private String countryRegion;
    /**
     * Use with available fluent helpers to apply the <b>FaxCountry</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> COUNTRY_REGION = new FaxNumberField<String>("FaxCountry");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>FaxNumber</b></p>
     * 
     * @return
     *     Fax Number: Dialing Code and Number
     */
    @SerializedName("FaxNumber")
    @JsonProperty("FaxNumber")
    @Nullable
    @ODataField(odataName = "FaxNumber")
    private String fax;
    /**
     * Use with available fluent helpers to apply the <b>FaxNumber</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> FAX = new FaxNumberField<String>("FaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FaxNumberExtension</b></p>
     * 
     * @return
     *     Fax no.: Extension
     */
    @SerializedName("FaxNumberExtension")
    @JsonProperty("FaxNumberExtension")
    @Nullable
    @ODataField(odataName = "FaxNumberExtension")
    private String extension;
    /**
     * Use with available fluent helpers to apply the <b>FaxNumberExtension</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> EXTENSION = new FaxNumberField<String>("FaxNumberExtension");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalFaxNumber</b></p>
     * 
     * @return
     *     Complete Number: Dialing Code+Number+Extension
     */
    @SerializedName("InternationalFaxNumber")
    @JsonProperty("InternationalFaxNumber")
    @Nullable
    @ODataField(odataName = "InternationalFaxNumber")
    private String faxNumber;
    /**
     * Use with available fluent helpers to apply the <b>InternationalFaxNumber</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> FAX_NUMBER = new FaxNumberField<String>("InternationalFaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>AddressCommunicationRemarkText</b></p>
     * 
     * @return
     *     Communication link notes
     */
    @SerializedName("AddressCommunicationRemarkText")
    @JsonProperty("AddressCommunicationRemarkText")
    @Nullable
    @ODataField(odataName = "AddressCommunicationRemarkText")
    private String notes;
    /**
     * Use with available fluent helpers to apply the <b>AddressCommunicationRemarkText</b> field to query operations.
     * 
     */
    public final static FaxNumberField<String> NOTES = new FaxNumberField<String>("AddressCommunicationRemarkText");

    @Nonnull
    @Override
    public Class<FaxNumber> getType() {
        return FaxNumber.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @param addressNumber
     *     Address Number
     */
    public void setAddressNumber(
        @Nullable
        final String addressNumber) {
        rememberChangedField("AddressID", this.addressNumber);
        this.addressNumber = addressNumber;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @param personNumber
     *     Person Number
     */
    public void setPersonNumber(
        @Nullable
        final String personNumber) {
        rememberChangedField("Person", this.personNumber);
        this.personNumber = personNumber;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @param sequenceNumber
     *     Sequence Number
     */
    public void setSequenceNumber(
        @Nullable
        final String sequenceNumber) {
        rememberChangedField("OrdinalNumber", this.sequenceNumber);
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultFaxNumber</b></p>
     * 
     * @param standardNo
     *     Standard Sender Address in this Communication Type
     */
    public void setStandardNo(
        @Nullable
        final Boolean standardNo) {
        rememberChangedField("IsDefaultFaxNumber", this.standardNo);
        this.standardNo = standardNo;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>FaxCountry</b></p>
     * 
     * @param countryRegion
     *     Country/Region for Telephone/Fax Number
     */
    public void setCountryRegion(
        @Nullable
        final String countryRegion) {
        rememberChangedField("FaxCountry", this.countryRegion);
        this.countryRegion = countryRegion;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>FaxNumber</b></p>
     * 
     * @param fax
     *     Fax Number: Dialing Code and Number
     */
    public void setFax(
        @Nullable
        final String fax) {
        rememberChangedField("FaxNumber", this.fax);
        this.fax = fax;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FaxNumberExtension</b></p>
     * 
     * @param extension
     *     Fax no.: Extension
     */
    public void setExtension(
        @Nullable
        final String extension) {
        rememberChangedField("FaxNumberExtension", this.extension);
        this.extension = extension;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalFaxNumber</b></p>
     * 
     * @param faxNumber
     *     Complete Number: Dialing Code+Number+Extension
     */
    public void setFaxNumber(
        @Nullable
        final String faxNumber) {
        rememberChangedField("InternationalFaxNumber", this.faxNumber);
        this.faxNumber = faxNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>AddressCommunicationRemarkText</b></p>
     * 
     * @param notes
     *     Communication link notes
     */
    public void setNotes(
        @Nullable
        final String notes) {
        rememberChangedField("AddressCommunicationRemarkText", this.notes);
        this.notes = notes;
    }

    @Override
    protected String getEntityCollection() {
        return "A_AddressFaxNumber";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("AddressID", getAddressNumber());
        result.put("Person", getPersonNumber());
        result.put("OrdinalNumber", getSequenceNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("AddressID", getAddressNumber());
        values.put("Person", getPersonNumber());
        values.put("OrdinalNumber", getSequenceNumber());
        values.put("IsDefaultFaxNumber", getStandardNo());
        values.put("FaxCountry", getCountryRegion());
        values.put("FaxNumber", getFax());
        values.put("FaxNumberExtension", getExtension());
        values.put("InternationalFaxNumber", getFaxNumber());
        values.put("AddressCommunicationRemarkText", getNotes());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressNumber()))) {
                    setAddressNumber(((String) value));
                }
            }
            if (values.containsKey("Person")) {
                final Object value = values.remove("Person");
                if ((value == null)||(!value.equals(getPersonNumber()))) {
                    setPersonNumber(((String) value));
                }
            }
            if (values.containsKey("OrdinalNumber")) {
                final Object value = values.remove("OrdinalNumber");
                if ((value == null)||(!value.equals(getSequenceNumber()))) {
                    setSequenceNumber(((String) value));
                }
            }
            if (values.containsKey("IsDefaultFaxNumber")) {
                final Object value = values.remove("IsDefaultFaxNumber");
                if ((value == null)||(!value.equals(getStandardNo()))) {
                    setStandardNo(((Boolean) value));
                }
            }
            if (values.containsKey("FaxCountry")) {
                final Object value = values.remove("FaxCountry");
                if ((value == null)||(!value.equals(getCountryRegion()))) {
                    setCountryRegion(((String) value));
                }
            }
            if (values.containsKey("FaxNumber")) {
                final Object value = values.remove("FaxNumber");
                if ((value == null)||(!value.equals(getFax()))) {
                    setFax(((String) value));
                }
            }
            if (values.containsKey("FaxNumberExtension")) {
                final Object value = values.remove("FaxNumberExtension");
                if ((value == null)||(!value.equals(getExtension()))) {
                    setExtension(((String) value));
                }
            }
            if (values.containsKey("InternationalFaxNumber")) {
                final Object value = values.remove("InternationalFaxNumber");
                if ((value == null)||(!value.equals(getFaxNumber()))) {
                    setFaxNumber(((String) value));
                }
            }
            if (values.containsKey("AddressCommunicationRemarkText")) {
                final Object value = values.remove("AddressCommunicationRemarkText");
                if ((value == null)||(!value.equals(getNotes()))) {
                    setNotes(((String) value));
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
    public static<T >FaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new FaxNumberField<T>(fieldName);
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
    public static<T,DomainT >FaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new FaxNumberField<T>(fieldName, typeConverter);
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