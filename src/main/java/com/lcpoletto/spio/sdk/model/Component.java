package com.lcpoletto.spio.sdk.model;

import com.lcpoletto.spio.sdk.model.enums.ComponentStatus;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by poletto on 4/1/2017.
 */
@XmlRootElement
public class Component implements Serializable {

    private String id;
    private String name;
    private String description;
    private int position;
    private ComponentStatus status;
    private boolean showcase;

    @XmlElement(name = "created_at")
    private Date created;

    @XmlElement(name = "updated_at")
    private Date updated;

    @XmlElement(name = "group_id")
    private String groupId;

    @XmlElement(name = "page_id")
    private String pageId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public boolean isShowcase() {
        return showcase;
    }

    public void setShowcase(boolean showcase) {
        this.showcase = showcase;
    }

    public ComponentStatus getStatus() {
        return status;
    }

    public void setStatus(ComponentStatus status) {
        this.status = status;
    }
}
