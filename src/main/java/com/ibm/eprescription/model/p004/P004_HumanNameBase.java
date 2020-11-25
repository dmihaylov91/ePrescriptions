//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.24 at 06:36:48 PM EET 
//


package com.ibm.eprescription.model.p004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for humanNameBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="humanNameBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="given" type="{https://www.his.bg}givenNameBase"/&gt;
 *         &lt;element name="middle" type="{https://www.his.bg}middleNameBase" minOccurs="0"/&gt;
 *         &lt;element name="family" type="{https://www.his.bg}familyNameBase"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "humanNameBase", propOrder = {
    "given",
    "middle",
    "family"
})
public class P004_HumanNameBase {

    @XmlElement(required = true)
    protected P004_GivenNameBase given;
    protected P004_MiddleNameBase middle;
    @XmlElement(required = true)
    protected P004_FamilyNameBase family;

    /**
     * Gets the value of the given property.
     * 
     * @return
     *     possible object is
     *     {@link P004_GivenNameBase }
     *     
     */
    public P004_GivenNameBase getGiven() {
        return given;
    }

    /**
     * Sets the value of the given property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_GivenNameBase }
     *     
     */
    public void setGiven(P004_GivenNameBase value) {
        this.given = value;
    }

    /**
     * Gets the value of the middle property.
     * 
     * @return
     *     possible object is
     *     {@link P004_MiddleNameBase }
     *     
     */
    public P004_MiddleNameBase getMiddle() {
        return middle;
    }

    /**
     * Sets the value of the middle property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_MiddleNameBase }
     *     
     */
    public void setMiddle(P004_MiddleNameBase value) {
        this.middle = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link P004_FamilyNameBase }
     *     
     */
    public P004_FamilyNameBase getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_FamilyNameBase }
     *     
     */
    public void setFamily(P004_FamilyNameBase value) {
        this.family = value;
    }

}