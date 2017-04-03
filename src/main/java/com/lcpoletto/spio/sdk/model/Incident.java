package com.lcpoletto.spio.sdk.model;

import com.lcpoletto.spio.sdk.model.enums.Impact;
import com.lcpoletto.spio.sdk.model.enums.IncidentStatus;

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
public class Incident implements Serializable {

    private boolean backfilled;
    private String id;
    private Impact impact;
    private String name;
    private String shortlink;
    private IncidentStatus status;
    private List<Component> components;

    @XmlElement(name = "created_at")
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
    private boolean postmortemIgnored;

    @XmlElement(name = "postmortem_notified_subscribers")
    private boolean postmortemNotifiedSubscribers;

    @XmlElement(name = "postmortem_notified_twitter")
    private boolean postmortemNotifiedTwitter;

    @XmlElement(name = "postmortem_published_at")
    private Date postmortemPublished;

    @XmlElement(name = "resolved_at")
    private Date resolved;

    @XmlElement(name = "scheduled_auto_in_progress")
    private boolean scheduledInProgress;

    @XmlElement(name = "scheduled_auto_completed")
    private boolean scheduledComplete;

    @XmlElement(name = "scheduled_for")
    private Date scheduledFor;

    @XmlElement(name = "scheduled_remind_prior")
    private boolean scheduledRemindPrior;

    @XmlElement(name = "scheduled_reminded_at")
    private Date scheduledReminded;

    @XmlElement(name = "scheduled_until")
    private Date scheduledUntil;

    @XmlElement(name = "updated_at")
    private Date updated;

    public boolean isBackfilled() {
        return backfilled;
    }

    public void setBackfilled(boolean backfilled) {
        this.backfilled = backfilled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Impact getImpact() {
        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortlink() {
        return shortlink;
    }

    public void setShortlink(String shortlink) {
        this.shortlink = shortlink;
    }

    public IncidentStatus getStatus() {
        return status;
    }

    public void setStatus(IncidentStatus status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Impact getImpactOverride() {
        return impactOverride;
    }

    public void setImpactOverride(Impact impactOverride) {
        this.impactOverride = impactOverride;
    }

    public List<Update> getIncidentUpdates() {
        return incidentUpdates;
    }

    public void setIncidentUpdates(List<Update> incidentUpdates) {
        this.incidentUpdates = incidentUpdates;
    }

    public Date getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(Date monitoring) {
        this.monitoring = monitoring;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPostmortemBody() {
        return postmortemBody;
    }

    public void setPostmortemBody(String postmortemBody) {
        this.postmortemBody = postmortemBody;
    }

    public String getPostmortemLastUpdated() {
        return postmortemLastUpdated;
    }

    public void setPostmortemLastUpdated(String postmortemLastUpdated) {
        this.postmortemLastUpdated = postmortemLastUpdated;
    }

    public boolean isPostmortemIgnored() {
        return postmortemIgnored;
    }

    public void setPostmortemIgnored(boolean postmortemIgnored) {
        this.postmortemIgnored = postmortemIgnored;
    }

    public boolean isPostmortemNotifiedSubscribers() {
        return postmortemNotifiedSubscribers;
    }

    public void setPostmortemNotifiedSubscribers(boolean postmortemNotifiedSubscribers) {
        this.postmortemNotifiedSubscribers = postmortemNotifiedSubscribers;
    }

    public boolean isPostmortemNotifiedTwitter() {
        return postmortemNotifiedTwitter;
    }

    public void setPostmortemNotifiedTwitter(boolean postmortemNotifiedTwitter) {
        this.postmortemNotifiedTwitter = postmortemNotifiedTwitter;
    }

    public Date getPostmortemPublished() {
        return postmortemPublished;
    }

    public void setPostmortemPublished(Date postmortemPublished) {
        this.postmortemPublished = postmortemPublished;
    }

    public Date getResolved() {
        return resolved;
    }

    public void setResolved(Date resolved) {
        this.resolved = resolved;
    }

    public boolean isScheduledInProgress() {
        return scheduledInProgress;
    }

    public void setScheduledInProgress(boolean scheduledInProgress) {
        this.scheduledInProgress = scheduledInProgress;
    }

    public boolean isScheduledComplete() {
        return scheduledComplete;
    }

    public void setScheduledComplete(boolean scheduledComplete) {
        this.scheduledComplete = scheduledComplete;
    }

    public Date getScheduledFor() {
        return scheduledFor;
    }

    public void setScheduledFor(Date scheduledFor) {
        this.scheduledFor = scheduledFor;
    }

    public boolean isScheduledRemindPrior() {
        return scheduledRemindPrior;
    }

    public void setScheduledRemindPrior(boolean scheduledRemindPrior) {
        this.scheduledRemindPrior = scheduledRemindPrior;
    }

    public Date getScheduledReminded() {
        return scheduledReminded;
    }

    public void setScheduledReminded(Date scheduledReminded) {
        this.scheduledReminded = scheduledReminded;
    }

    public Date getScheduledUntil() {
        return scheduledUntil;
    }

    public void setScheduledUntil(Date scheduledUntil) {
        this.scheduledUntil = scheduledUntil;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
