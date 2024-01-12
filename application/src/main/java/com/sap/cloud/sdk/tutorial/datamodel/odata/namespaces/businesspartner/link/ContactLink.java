
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.1.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.Contact;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.ContactSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.Contact Contact} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class ContactLink<ObjectT extends VdmObject<?> >
    extends EntityLink<ContactLink<ObjectT> , Contact, ObjectT>
    implements ContactSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public ContactLink(final String fieldName) {
        super(fieldName);
    }

    private ContactLink(final EntityLink<ContactLink<ObjectT> , Contact, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected ContactLink<ObjectT> translateLinkType(final EntityLink<ContactLink<ObjectT> , Contact, ObjectT> link) {
        return new ContactLink<ObjectT>(link);
    }

}