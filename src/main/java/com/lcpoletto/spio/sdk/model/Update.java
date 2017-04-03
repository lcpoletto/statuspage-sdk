package com.lcpoletto.spio.sdk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by poletto on 4/1/2017.
 */
@XmlRootElement
public class Update implements Serializable {

    private String body;
    // TODO: verify if IncidentStatus enum is suitable here
    private String status;
    private String id;

    @XmlElement(name = "created_at")
    private Date created;

    @XmlElement(name = "display_at")
    private Date display;

    @XmlElement(name = "incident_id")
    private String incidentId;

    @XmlElement(name = "twitter_updated_at")
    private Date twitterUpdated;

    @XmlElement(name = "updated_at")
    private Date updated;

    @XmlElement(name = "wants_twitter_update")
    private boolean updateTwitter;

    // TODO: Verify if it's possible to have the actual component here
    @XmlElement(name = "affected_components")
    private List<Map<String, String>> affectedComponents;

    @XmlElement(name = "custom_tweet")
    private String customTweet;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDisplay() {
        return display;
    }

    public void setDisplay(Date display) {
        this.display = display;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public Date getTwitterUpdated() {
        return twitterUpdated;
    }

    public void setTwitterUpdated(Date twitterUpdated) {
        this.twitterUpdated = twitterUpdated;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public boolean isUpdateTwitter() {
        return updateTwitter;
    }

    public void setUpdateTwitter(boolean updateTwitter) {
        this.updateTwitter = updateTwitter;
    }

    public List<Map<String, String>> getAffectedComponents() {
        return affectedComponents;
    }

    public void setAffectedComponents(List<Map<String, String>> affectedComponents) {
        this.affectedComponents = affectedComponents;
    }

    public String getCustomTweet() {
        return customTweet;
    }

    public void setCustomTweet(String customTweet) {
        this.customTweet = customTweet;
    }
}
