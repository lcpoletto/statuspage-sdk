package com.lcpoletto.spio.sdk.model;

import com.lcpoletto.spio.sdk.model.enums.ComponentStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * POJO representing a statupage.io component, fields annotated with {@link XmlElement} will be both serialized and
 * de-serialized, properties that have {@link XmlElement} only on setters will be only de-serialized. This hybrid
 * annotation approach was done to overcome statuspage.io sensitivity when receiving data to be updated.
 * </p>
 * <p>
 * For more information: http://doers.statuspage.io/api/v1/components/
 * </p>
 *
 * @author Luis Carlos Poletto
 */
@XmlRootElement(name = "component")
@XmlAccessorType(XmlAccessType.NONE)
public class Component implements Serializable {

    @XmlElement
    private String name;

    @XmlElement
    private String description;

    @XmlElement
    private ComponentStatus status;

    @XmlElement(name = "group_id")
    private String groupId;

    private String id;
    private Integer position;
    private Boolean showcase;
    private Date created;
    private Date updated;
    private String pageId;

    /*
     * GETTERS AND SETTERS
     */

    public String getId() {
        return id;
    }

    @XmlElement
    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    @XmlElement
    public void setPosition(final Integer position) {
        this.position = position;
    }

    public ComponentStatus getStatus() {
        return status;
    }

    public void setStatus(final ComponentStatus status) {
        this.status = status;
    }

    public Boolean getShowcase() {
        return showcase;
    }

    @XmlElement
    public void setShowcase(final Boolean showcase) {
        this.showcase = showcase;
    }

    public Date getCreated() {
        return created;
    }

    @XmlElement(name = "created_at")
    public void setCreated(final Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    @XmlElement(name = "updated_at")
    public void setUpdated(final Date updated) {
        this.updated = updated;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(final String groupId) {
        this.groupId = groupId;
    }

    public String getPageId() {
        return pageId;
    }

    @XmlElement(name = "page_id")
    public void setPageId(final String pageId) {
        this.pageId = pageId;
    }
}
