package com.lcpoletto.spio.sdk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Model class to represent a Status Page page profile. http://doers.statuspage.io/api/v1/page_profile/
 * Created by poletto on 3/31/2017.
 */
@XmlRootElement(name = "page")
public class Page implements Serializable {

    @XmlElement(name = "allow_webhook_subscribers")
    private Boolean allowWebhookSubscribers;

    @XmlElement(name = "allow_email_subscribers")
    private Boolean allowEmailSubscribers;

    @XmlElement(name = "allow_incident_subscribers")
    private Boolean allowIncidentSubscribers;

    @XmlElement(name = "allow_page_subscribers")
    private Boolean allowPageSubscribers;

    @XmlElement(name = "allow_sms_subscribers")
    private Boolean allowSmsSubscribers;

    @XmlElement(name = "created_at")
    private Date created;

    @XmlElement(name = "css_body_background_color")
    private String cssBodyBackgroundColor;

    @XmlElement(name = "css_font_color")
    private String cssFontColor;

    @XmlElement(name = "css_greens")
    private String cssGreens;

    @XmlElement(name = "css_light_font_color")
    private String cssLightFontColor;

    @XmlElement(name = "css_oranges")
    private String cssOranges;

    @XmlElement(name = "css_reds")
    private String cssReds;

    @XmlElement(name = "css_yellows")
    private String cssYellows;

    @XmlElement(name = "css_border_color")
    private String cssBorderColor;

    @XmlElement(name = "css_graph_color")
    private String cssGraphColor;

    @XmlElement(name = "css_link_color")
    private String cssLinkColor;

    @XmlElement(name = "css_blues")
    private String cssBlues;

    @XmlElement(name = "page_description")
    private String pageDescription;

    @XmlElement(name = "activity_score")
    private Integer activityScore;

    @XmlElement(name = "hidden_from_search")
    private Boolean hiddenFromSearch;

    @XmlElement(name = "notifications_from_email")
    private String notificationsFromEmail;

    @XmlElement(name = "time_zone")
    private String timeZone;

    @XmlElement(name = "twitter_username")
    private String twitterUsername;

    @XmlElement(name = "updated_at")
    private Date updated;

    @XmlElement(name = "hero_cover")
    private Logo heroCover;

    @XmlElement(name = "transactional_logo")
    private Logo transactional;

    @XmlElement(name = "support_url")
    private String supportUrl;

    @XmlElement(name = "viewers_must_be_team_members")
    private Boolean membersOnly;

    @XmlElement(name = "favicon_logo")
    private Logo favicon;

    @XmlElement(name = "ip_restrictions")
    private List<String> ipRestrictions;

    private String branding;
    private String city;
    private String country;
    private String domain;
    private String id;
    private String layout;
    private String name;
    private String url;
    private String state;
    private String subdomain;
    private String headline;

    /*
     * GETTERS AND SETTERS
     */

    public Boolean getAllowWebhookSubscribers() {
        return allowWebhookSubscribers;
    }

    public void setAllowWebhookSubscribers(final Boolean allowWebhookSubscribers) {
        this.allowWebhookSubscribers = allowWebhookSubscribers;
    }

    public Boolean getAllowEmailSubscribers() {
        return allowEmailSubscribers;
    }

    public void setAllowEmailSubscribers(final Boolean allowEmailSubscribers) {
        this.allowEmailSubscribers = allowEmailSubscribers;
    }

    public Boolean getAllowIncidentSubscribers() {
        return allowIncidentSubscribers;
    }

    public void setAllowIncidentSubscribers(final Boolean allowIncidentSubscribers) {
        this.allowIncidentSubscribers = allowIncidentSubscribers;
    }

    public Boolean getAllowPageSubscribers() {
        return allowPageSubscribers;
    }

    public void setAllowPageSubscribers(final Boolean allowPageSubscribers) {
        this.allowPageSubscribers = allowPageSubscribers;
    }

    public Boolean getAllowSmsSubscribers() {
        return allowSmsSubscribers;
    }

    public void setAllowSmsSubscribers(final Boolean allowSmsSubscribers) {
        this.allowSmsSubscribers = allowSmsSubscribers;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(final Date created) {
        this.created = created;
    }

    public String getCssBodyBackgroundColor() {
        return cssBodyBackgroundColor;
    }

    public void setCssBodyBackgroundColor(final String cssBodyBackgroundColor) {
        this.cssBodyBackgroundColor = cssBodyBackgroundColor;
    }

    public String getCssFontColor() {
        return cssFontColor;
    }

    public void setCssFontColor(final String cssFontColor) {
        this.cssFontColor = cssFontColor;
    }

    public String getCssGreens() {
        return cssGreens;
    }

    public void setCssGreens(final String cssGreens) {
        this.cssGreens = cssGreens;
    }

    public String getCssLightFontColor() {
        return cssLightFontColor;
    }

    public void setCssLightFontColor(final String cssLightFontColor) {
        this.cssLightFontColor = cssLightFontColor;
    }

    public String getCssOranges() {
        return cssOranges;
    }

    public void setCssOranges(final String cssOranges) {
        this.cssOranges = cssOranges;
    }

    public String getCssReds() {
        return cssReds;
    }

    public void setCssReds(final String cssReds) {
        this.cssReds = cssReds;
    }

    public String getCssYellows() {
        return cssYellows;
    }

    public void setCssYellows(final String cssYellows) {
        this.cssYellows = cssYellows;
    }

    public String getCssBorderColor() {
        return cssBorderColor;
    }

    public void setCssBorderColor(final String cssBorderColor) {
        this.cssBorderColor = cssBorderColor;
    }

    public String getCssGraphColor() {
        return cssGraphColor;
    }

    public void setCssGraphColor(final String cssGraphColor) {
        this.cssGraphColor = cssGraphColor;
    }

    public String getCssLinkColor() {
        return cssLinkColor;
    }

    public void setCssLinkColor(final String cssLinkColor) {
        this.cssLinkColor = cssLinkColor;
    }

    public String getCssBlues() {
        return cssBlues;
    }

    public void setCssBlues(final String cssBlues) {
        this.cssBlues = cssBlues;
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(final String pageDescription) {
        this.pageDescription = pageDescription;
    }

    public Integer getActivityScore() {
        return activityScore;
    }

    public void setActivityScore(final Integer activityScore) {
        this.activityScore = activityScore;
    }

    public Boolean getHiddenFromSearch() {
        return hiddenFromSearch;
    }

    public void setHiddenFromSearch(final Boolean hiddenFromSearch) {
        this.hiddenFromSearch = hiddenFromSearch;
    }

    public String getNotificationsFromEmail() {
        return notificationsFromEmail;
    }

    public void setNotificationsFromEmail(final String notificationsFromEmail) {
        this.notificationsFromEmail = notificationsFromEmail;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(final String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(final String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(final Date updated) {
        this.updated = updated;
    }

    public Logo getHeroCover() {
        return heroCover;
    }

    public void setHeroCover(final Logo heroCover) {
        this.heroCover = heroCover;
    }

    public Logo getTransactional() {
        return transactional;
    }

    public void setTransactional(final Logo transactional) {
        this.transactional = transactional;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(final String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public Boolean getMembersOnly() {
        return membersOnly;
    }

    public void setMembersOnly(final Boolean membersOnly) {
        this.membersOnly = membersOnly;
    }

    public Logo getFavicon() {
        return favicon;
    }

    public void setFavicon(final Logo favicon) {
        this.favicon = favicon;
    }

    public List<String> getIpRestrictions() {
        return ipRestrictions;
    }

    public void setIpRestrictions(final List<String> ipRestrictions) {
        this.ipRestrictions = ipRestrictions;
    }

    public String getBranding() {
        return branding;
    }

    public void setBranding(final String branding) {
        this.branding = branding;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(final String domain) {
        this.domain = domain;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(final String layout) {
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(final String subdomain) {
        this.subdomain = subdomain;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(final String headline) {
        this.headline = headline;
    }
}
