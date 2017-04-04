package com.lcpoletto.spio.sdk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by poletto on 3/31/2017.
 */
@XmlRootElement
public class Logo implements Serializable {

    @XmlElement(name = "normal_url")
    private String normalUrl;

    @XmlElement(name = "original_url")
    private String originalUrl;

    @XmlElement(name = "retina_url")
    private String retinaUrl;

    @XmlElement(name = "size")
    private String size;

    @XmlElement(name = "updated_at")
    private Date updated;

    private String url;

    /*
     * GETTERS AND SETTERS
     */

    public String getNormalUrl() {
        return normalUrl;
    }

    public void setNormalUrl(final String normalUrl) {
        this.normalUrl = normalUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(final String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getRetinaUrl() {
        return retinaUrl;
    }

    public void setRetinaUrl(final String retinaUrl) {
        this.retinaUrl = retinaUrl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(final String size) {
        this.size = size;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(final Date updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
