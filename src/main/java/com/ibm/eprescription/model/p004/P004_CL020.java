//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.24 at 06:36:48 PM EET 
//


package com.ibm.eprescription.model.p004;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CL020.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CL020"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="h"/&gt;
 *     &lt;enumeration value="d"/&gt;
 *     &lt;enumeration value="wk"/&gt;
 *     &lt;enumeration value="mo"/&gt;
 *     &lt;enumeration value="a"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CL020")
@XmlEnum
public enum P004_CL020 {

    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("wk")
    WK("wk"),
    @XmlEnumValue("mo")
    MO("mo"),
    @XmlEnumValue("a")
    A("a");
    private final String value;

    P004_CL020(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static P004_CL020 fromValue(String v) {
        for (P004_CL020 c: P004_CL020 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
