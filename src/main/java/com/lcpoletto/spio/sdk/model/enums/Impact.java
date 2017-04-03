package com.lcpoletto.spio.sdk.model.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import java.io.Serializable;

/**
 * Created by poletto on 4/1/2017.
 */
@XmlEnum
public enum Impact implements Serializable {
    @XmlEnumValue("none")
    NONE,

    @XmlEnumValue("minor")
    MINOR,

    @XmlEnumValue("major")
    MAJOR,

    @XmlEnumValue("critical")
    CRITICAL;
}
