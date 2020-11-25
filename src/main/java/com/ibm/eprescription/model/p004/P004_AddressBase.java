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
 * <p>Java class for addressBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{https://www.his.bg}countryCodeBase"/&gt;
 *         &lt;element name="city" type="{https://www.his.bg}cityBase"/&gt;
 *         &lt;element name="line" type="{https://www.his.bg}addressDetailsBase" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{https://www.his.bg}postCodeBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressBase", propOrder = {
    "country",
    "city",
    "line",
    "postalCode"
})
public class P004_AddressBase {

    @XmlElement(required = true)
    protected P004_CountryCodeBase country;
    @XmlElement(required = true)
    protected P004_CityBase city;
    protected P004_AddressDetailsBase line;
    protected P004_PostCodeBase postalCode;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link P004_CountryCodeBase }
     *     
     */
    public P004_CountryCodeBase getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_CountryCodeBase }
     *     
     */
    public void setCountry(P004_CountryCodeBase value) {
        this.country = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link P004_CityBase }
     *     
     */
    public P004_CityBase getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_CityBase }
     *     
     */
    public void setCity(P004_CityBase value) {
        this.city = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link P004_AddressDetailsBase }
     *     
     */
    public P004_AddressDetailsBase getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_AddressDetailsBase }
     *     
     */
    public void setLine(P004_AddressDetailsBase value) {
        this.line = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link P004_PostCodeBase }
     *     
     */
    public P004_PostCodeBase getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_PostCodeBase }
     *     
     */
    public void setPostalCode(P004_PostCodeBase value) {
        this.postalCode = value;
    }

}