package com.lcpoletto.spio.sdk.model;

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
    private boolean allowWebhookSubscribers;

    @XmlElement(name = "allow_email_subscribers")
    private boolean allowEmailSubscribers;

    @XmlElement(name = "allow_incident_subscribers")
    private boolean allowIncidentSubscribers;

    @XmlElement(name = "allow_page_subscribers")
    private boolean allowPageSubscribers;

    @XmlElement(name = "allow_sms_subscribers")
    private boolean allowSmsSubscribers;

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
    private int activityScore;

    @XmlElement(name = "hidden_from_search")
    private boolean hiddenFromSearch;

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
    private boolean membersOnly;

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

    public boolean isAllowEmailSubscribers() {
        return allowEmailSubscribers;
    }

    public void setAllowEmailSubscribers(boolean allowEmailSubscribers) {
        this.allowEmailSubscribers = allowEmailSubscribers;
    }

    public boolean isAllowIncidentSubscribers() {
        return allowIncidentSubscribers;
    }

    public void setAllowIncidentSubscribers(boolean allowIncidentSubscribers) {
        this.allowIncidentSubscribers = allowIncidentSubscribers;
    }

    public boolean isAllowPageSubscribers() {
        return allowPageSubscribers;
    }

    public void setAllowPageSubscribers(boolean allowPageSubscribers) {
        this.allowPageSubscribers = allowPageSubscribers;
    }

    public boolean isAllowSmsSubscribers() {
        return allowSmsSubscribers;
    }

    public void setAllowSmsSubscribers(boolean allowSmsSubscribers) {
        this.allowSmsSubscribers = allowSmsSubscribers;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCssBodyBackgroundColor() {
        return cssBodyBackgroundColor;
    }

    public void setCssBodyBackgroundColor(String cssBodyBackgroundColor) {
        this.cssBodyBackgroundColor = cssBodyBackgroundColor;
    }

    public String getCssFontColor() {
        return cssFontColor;
    }

    public void setCssFontColor(String cssFontColor) {
        this.cssFontColor = cssFontColor;
    }

    public String getCssGreens() {
        return cssGreens;
    }

    public void setCssGreens(String cssGreens) {
        this.cssGreens = cssGreens;
    }

    public String getCssLightFontColor() {
        return cssLightFontColor;
    }

    public void setCssLightFontColor(String cssLightFontColor) {
        this.cssLightFontColor = cssLightFontColor;
    }

    public String getCssOranges() {
        return cssOranges;
    }

    public void setCssOranges(String cssOranges) {
        this.cssOranges = cssOranges;
    }

    public String getCssReds() {
        return cssReds;
    }

    public void setCssReds(String cssReds) {
        this.cssReds = cssReds;
    }

    public String getCssYellows() {
        return cssYellows;
    }

    public void setCssYellows(String cssYellows) {
        this.cssYellows = cssYellows;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public boolean isHiddenFromSearch() {
        return hiddenFromSearch;
    }

    public void setHiddenFromSearch(boolean hiddenFromSearch) {
        this.hiddenFromSearch = hiddenFromSearch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotificationsFromEmail() {
        return notificationsFromEmail;
    }

    public void setNotificationsFromEmail(String notificationsFromEmail) {
        this.notificationsFromEmail = notificationsFromEmail;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Logo getHeroCover() {
        return heroCover;
    }

    public void setHeroCover(Logo heroCover) {
        this.heroCover = heroCover;
    }

    public Logo getTransactional() {
        return transactional;
    }

    public void setTransactional(Logo transactional) {
        this.transactional = transactional;
    }

    public String getBranding() {
        return branding;
    }

    public void setBranding(String branding) {
        this.branding = branding;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public boolean isAllowWebhookSubscribers() {
        return allowWebhookSubscribers;
    }

    public void setAllowWebhookSubscribers(boolean allowWebhookSubscribers) {
        this.allowWebhookSubscribers = allowWebhookSubscribers;
    }

    public String getCssBorderColor() {
        return cssBorderColor;
    }

    public void setCssBorderColor(String cssBorderColor) {
        this.cssBorderColor = cssBorderColor;
    }

    public String getCssGraphColor() {
        return cssGraphColor;
    }

    public void setCssGraphColor(String cssGraphColor) {
        this.cssGraphColor = cssGraphColor;
    }

    public String getCssLinkColor() {
        return cssLinkColor;
    }

    public void setCssLinkColor(String cssLinkColor) {
        this.cssLinkColor = cssLinkColor;
    }

    public String getCssBlues() {
        return cssBlues;
    }

    public void setCssBlues(String cssBlues) {
        this.cssBlues = cssBlues;
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

    public int getActivityScore() {
        return activityScore;
    }

    public void setActivityScore(int activityScore) {
        this.activityScore = activityScore;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public boolean isMembersOnly() {
        return membersOnly;
    }

    public void setMembersOnly(boolean membersOnly) {
        this.membersOnly = membersOnly;
    }

    public Logo getFavicon() {
        return favicon;
    }

    public void setFavicon(Logo favicon) {
        this.favicon = favicon;
    }

    public List<String> getIpRestrictions() {
        return ipRestrictions;
    }

    public void setIpRestrictions(List<String> ipRestrictions) {
        this.ipRestrictions = ipRestrictions;
    }
}
