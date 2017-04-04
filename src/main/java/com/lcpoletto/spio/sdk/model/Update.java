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
    private Boolean updateTwitter;

    // TODO: Verify if it's possible to have the actual component here
    @XmlElement(name = "affected_components")
    private List<Map<String, String>> affectedComponents;

    @XmlElement(name = "custom_tweet")
    private String customTweet;

    /*
     * GETTERS AND SETTERS
     */

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(final Date created) {
        this.created = created;
    }

    public Date getDisplay() {
        return display;
    }

    public void setDisplay(final Date display) {
        this.display = display;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(final String incidentId) {
        this.incidentId = incidentId;
    }

    public Date getTwitterUpdated() {
        return twitterUpdated;
    }

    public void setTwitterUpdated(final Date twitterUpdated) {
        this.twitterUpdated = twitterUpdated;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(final Date updated) {
        this.updated = updated;
    }

    public Boolean getUpdateTwitter() {
        return updateTwitter;
    }

    public void setUpdateTwitter(final Boolean updateTwitter) {
        this.updateTwitter = updateTwitter;
    }

    public List<Map<String, String>> getAffectedComponents() {
        return affectedComponents;
    }

    public void setAffectedComponents(final List<Map<String, String>> affectedComponents) {
        this.affectedComponents = affectedComponents;
    }

    public String getCustomTweet() {
        return customTweet;
    }

    public void setCustomTweet(final String customTweet) {
        this.customTweet = customTweet;
    }
}
