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
 * <p>Java class for CL007.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CL007"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Т1"/&gt;
 *     &lt;enumeration value="Т2"/&gt;
 *     &lt;enumeration value="Т3"/&gt;
 *     &lt;enumeration value="Т4"/&gt;
 *     &lt;enumeration value="Т5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CL007")
@XmlEnum
public enum P004_CL007 {

    @XmlEnumValue("\u04221")
    Т_1("\u04221"),
    @XmlEnumValue("\u04222")
    Т_2("\u04222"),
    @XmlEnumValue("\u04223")
    Т_3("\u04223"),
    @XmlEnumValue("\u04224")
    Т_4("\u04224"),
    @XmlEnumValue("\u04225")
    Т_5("\u04225");
    private final String value;

    P004_CL007(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static P004_CL007 fromValue(String v) {
        for (P004_CL007 c: P004_CL007 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}