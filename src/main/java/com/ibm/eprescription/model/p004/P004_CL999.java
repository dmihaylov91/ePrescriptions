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
 * <p>Java class for CL999.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CL999"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E001"/&gt;
 *     &lt;enumeration value="E002"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CL999")
@XmlEnum
public enum P004_CL999 {

    @XmlEnumValue("E001")
    E_001("E001"),
    @XmlEnumValue("E002")
    E_002("E002");
    private final String value;

    P004_CL999(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static P004_CL999 fromValue(String v) {
        for (P004_CL999 c: P004_CL999 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
