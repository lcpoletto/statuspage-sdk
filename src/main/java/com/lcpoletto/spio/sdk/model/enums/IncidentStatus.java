package com.lcpoletto.spio.sdk.model.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import java.io.Serializable;

/**
 * Created by poletto on 4/1/2017.
 */
@XmlEnum
public enum IncidentStatus implements Serializable {

    @XmlEnumValue("scheduled")
    SCHEDULED,

    @XmlEnumValue("in_progress")
    IN_PROGRESS,

    @XmlEnumValue("verifying")
    VERIFYING,

    @XmlEnumValue("completed")
    COMPLETED,

    @XmlEnumValue("resolved")
    RESOLVED,

    @XmlEnumValue("investigating")
    INVESTIGATING;
}
