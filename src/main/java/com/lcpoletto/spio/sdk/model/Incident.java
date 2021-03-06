package com.lcpoletto.spio.sdk.model;

import com.lcpoletto.spio.sdk.model.enums.Impact;
import com.lcpoletto.spio.sdk.model.enums.IncidentStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * POJO representing a statupage.io incident, fields annotated with {@link XmlElement} will be both serialized and
 * de-serialized, properties that have {@link XmlElement} only on setters will be only de-serialized. This hybrid
 * annotation approach was done to overcome statuspage.io sensitivity when receiving data to be updated.
 * </p>
 * <p>
 * For more information: http://doers.statuspage.io/api/v1/incidents/
 * </p>
 *
 * @author Luis Carlos Poletto
 */
@XmlRootElement(name = "incident")
@XmlAccessorType(XmlAccessType.NONE)
public class Incident implements Serializable {

    private Boolean backfilled;
    private String id;
    private Impact impact;

    @XmlElement
    private String name;
    private String shortlink;

    @XmlElement
    private IncidentStatus status;
    private Highlight highlight;
    private List<Component> components;

    private Date created;

    @XmlElement(name = "impact_override")
    private Impact impactOverride;

    @XmlElement(name = "incident_updates")
    private List<Update> incidentUpdates;

    @XmlElement(name = "monitoring_at")
    private Date monitoring;

    @XmlElement(name = "page_id")
    private String pageId;

    @XmlElement(name = "postmortem_body")
    private String postmortemBody;

    @XmlElement(name = "postmortem_body_last_updated_at")
    private String postmortemLastUpdated;

    @XmlElement(name = "postmortem_ignored")
    private Boolean postmortemIgnored;

    @XmlElement(name = "postmortem_notified_subscribers")
    private Boolean postmortemNotifiedSubscribers;

    @XmlElement(name = "postmortem_notified_twitter")
    private Boolean postmortemNotifiedTwitter;

    @XmlElement(name = "postmortem_published_at")
    private Date postmortemPublished;

    @XmlElement(name = "resolved_at")
    private Date resolved;

    @XmlElement(name = "scheduled_auto_in_progress")
    private Boolean scheduledInProgress;

    @XmlElement(name = "scheduled_auto_completed")
    private Boolean scheduledComplete;

    @XmlElement(name = "scheduled_for")
    private Date scheduledFor;

    @XmlElement(name = "scheduled_remind_prior")
    private Boolean scheduledRemindPrior;

    @XmlElement(name = "scheduled_reminded_at")
    private Date scheduledReminded;

    @XmlElement(name = "scheduled_until")
    private Date scheduledUntil;

    @XmlElement(name = "updated_at")
    private Date updated;

    private List<String> componentIds;
    private Boolean updateTwitter;

    private String message;

    /*
     * GETTERS AND SETTERS
     */

    public Boolean getBackfilled() {
        return backfilled;
    }

    public void setBackfilled(final Boolean backfilled) {
        this.backfilled = backfilled;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Impact getImpact() {
        return impact;
    }

    public void setImpact(final Impact impact) {
        this.impact = impact;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getShortlink() {
        return shortlink;
    }

    public void setShortlink(final String shortlink) {
        this.shortlink = shortlink;
    }

    public IncidentStatus getStatus() {
        return status;
    }

    public void setStatus(final IncidentStatus status) {
        this.status = status;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(final List<Component> components) {
        this.components = components;
    }

    public Date getCreated() {
        return created;
    }

    @XmlElement(name = "created_at")
    public void setCreated(final Date created) {
        this.created = created;
    }

    public Impact getImpactOverride() {
        return impactOverride;
    }

    public void setImpactOverride(final Impact impactOverride) {
        this.impactOverride = impactOverride;
    }

    public List<Update> getIncidentUpdates() {
        return incidentUpdates;
    }

    public void setIncidentUpdates(final List<Update> incidentUpdates) {
        this.incidentUpdates = incidentUpdates;
    }

    public Date getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(final Date monitoring) {
        this.monitoring = monitoring;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(final String pageId) {
        this.pageId = pageId;
    }

    public String getPostmortemBody() {
        return postmortemBody;
    }

    public void setPostmortemBody(final String postmortemBody) {
        this.postmortemBody = postmortemBody;
    }

    public String getPostmortemLastUpdated() {
        return postmortemLastUpdated;
    }

    public void setPostmortemLastUpdated(final String postmortemLastUpdated) {
        this.postmortemLastUpdated = postmortemLastUpdated;
    }

    public Boolean getPostmortemIgnored() {
        return postmortemIgnored;
    }

    public void setPostmortemIgnored(final Boolean postmortemIgnored) {
        this.postmortemIgnored = postmortemIgnored;
    }

    public Boolean getPostmortemNotifiedSubscribers() {
        return postmortemNotifiedSubscribers;
    }

    public void setPostmortemNotifiedSubscribers(final Boolean postmortemNotifiedSubscribers) {
        this.postmortemNotifiedSubscribers = postmortemNotifiedSubscribers;
    }

    public Boolean getPostmortemNotifiedTwitter() {
        return postmortemNotifiedTwitter;
    }

    public void setPostmortemNotifiedTwitter(final Boolean postmortemNotifiedTwitter) {
        this.postmortemNotifiedTwitter = postmortemNotifiedTwitter;
    }

    public Date getPostmortemPublished() {
        return postmortemPublished;
    }

    public void setPostmortemPublished(final Date postmortemPublished) {
        this.postmortemPublished = postmortemPublished;
    }

    public Date getResolved() {
        return resolved;
    }

    public void setResolved(final Date resolved) {
        this.resolved = resolved;
    }

    public Boolean getScheduledInProgress() {
        return scheduledInProgress;
    }

    public void setScheduledInProgress(final Boolean scheduledInProgress) {
        this.scheduledInProgress = scheduledInProgress;
    }

    public Boolean getScheduledComplete() {
        return scheduledComplete;
    }

    public void setScheduledComplete(final Boolean scheduledComplete) {
        this.scheduledComplete = scheduledComplete;
    }

    public Date getScheduledFor() {
        return scheduledFor;
    }

    public void setScheduledFor(final Date scheduledFor) {
        this.scheduledFor = scheduledFor;
    }

    public Boolean getScheduledRemindPrior() {
        return scheduledRemindPrior;
    }

    public void setScheduledRemindPrior(final Boolean scheduledRemindPrior) {
        this.scheduledRemindPrior = scheduledRemindPrior;
    }

    public Date getScheduledReminded() {
        return scheduledReminded;
    }

    public void setScheduledReminded(final Date scheduledReminded) {
        this.scheduledReminded = scheduledReminded;
    }

    public Date getScheduledUntil() {
        return scheduledUntil;
    }

    public void setScheduledUntil(final Date scheduledUntil) {
        this.scheduledUntil = scheduledUntil;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(final Date updated) {
        this.updated = updated;
    }

    public Highlight getHighlight() {
        return highlight;
    }

    public void setHighlight(final Highlight highlight) {
        this.highlight = highlight;
    }

    @XmlElement(name = "wants_twitter_update")
    public Boolean getUpdateTwitter() {
        return updateTwitter;
    }

    public void setUpdateTwitter(final Boolean updateTwitter) {
        this.updateTwitter = updateTwitter;
    }

    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @XmlElement(name = "component_ids")
    public List<String> getComponentIds() {
        return componentIds;
    }

    public void setComponentIds(final List<String> componentIds) {
        this.componentIds = componentIds;
    }
}
