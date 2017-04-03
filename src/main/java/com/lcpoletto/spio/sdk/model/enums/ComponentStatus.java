package com.lcpoletto.spio.sdk.model.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import java.io.Serializable;

/**
 * Created by poletto on 4/1/2017.
 */
@XmlEnum
public enum ComponentStatus implements Serializable {

    @XmlEnumValue("operational")
    OPERATIONAL,

    @XmlEnumValue("degraded_performance")
    DEGRADED_PERFORMANCE,

    @XmlEnumValue("partial_outage")
    PARTIAL_OUTAGE,

    @XmlEnumValue("major_outage")
    MAJOR_OUTAGE;
}
