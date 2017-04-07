package com.lcpoletto.spio.sdk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by lpoletto on 4/7/17.
 */
@XmlRootElement
public class Highlight implements Serializable {

    @XmlElement(name = "name")
    private List<String> names;

    @XmlElement(name = "incident_updates.body")
    private List<String> bodies;

    public List<String> getNames() {
        return names;
    }

    public void setNames(final List<String> names) {
        this.names = names;
    }

    public List<String> getBodies() {
        return bodies;
    }

    public void setBodies(final List<String> bodies) {
        this.bodies = bodies;
    }
}
