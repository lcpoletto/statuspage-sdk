package com.lcpoletto.spio.sdk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * POJO representing a statupage.io subscriber, fields annotated with {@link XmlElement} will be both serialized and
 * de-serialized, properties that have {@link XmlElement} only on setters will be only de-serialized. This hybrid
 * annotation approach was done to overcome statuspage.io sensitivity when receiving data to be updated.
 * </p>
 * <p>
 * For more information: http://doers.statuspage.io/api/v1/subscribers/
 * </p>
 *
 * @author Luis Carlos Poletto
 */
@XmlRootElement(name = "subscriber")
@XmlAccessorType(XmlAccessType.NONE)
public class Subscriber implements Serializable {

    private Date created;
    private String id;

    @XmlElement(name = "phone_country")
    private String phoneCountry;
    @XmlElement(name = "phone_number")
    private String phoneNumber;
    @XmlElement
    private String email;
    @XmlElement
    private String endpoint;
    @XmlElement(name = "skip_confirmation_notification")
    private Boolean skipConfirmationNotification;
    @XmlElement(name = "component_ids")
    private List<String> componentIds;
    @XmlElement(name = "page_access_user")
    private String pageAccessUser;

    public Date getCreated() {
        return created;
    }

    @XmlElement(name = "created_at")
    public void setCreated(final Date created) {
        this.created = created;
    }

    public String getId() {
        return id;
    }

    @XmlElement
    public void setId(final String id) {
        this.id = id;
    }

    public String getPhoneCountry() {
        return phoneCountry;
    }

    public void setPhoneCountry(final String phoneCountry) {
        this.phoneCountry = phoneCountry;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(final String endpoint) {
        this.endpoint = endpoint;
    }

    public Boolean getSkipConfirmationNotification() {
        return skipConfirmationNotification;
    }

    public void setSkipConfirmationNotification(final Boolean skipConfirmationNotification) {
        this.skipConfirmationNotification = skipConfirmationNotification;
    }

    public List<String> getComponentIds() {
        return componentIds;
    }

    public void setComponentIds(final List<String> componentIds) {
        this.componentIds = componentIds;
    }

    public String getPageAccessUser() {
        return pageAccessUser;
    }

    public void setPageAccessUser(final String pageAccessUser) {
        this.pageAccessUser = pageAccessUser;
    }
}
