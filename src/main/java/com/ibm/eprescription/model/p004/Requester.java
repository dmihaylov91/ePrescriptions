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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.his.bg}pmi"/&gt;
 *         &lt;element ref="{https://www.his.bg}name"/&gt;
 *         &lt;element ref="{https://www.his.bg}qualification" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}practiceNumber"/&gt;
 *         &lt;element ref="{https://www.his.bg}nhifNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}phone" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}email" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pmi",
    "name",
    "qualification",
    "practiceNumber",
    "nhifNumber",
    "phone",
    "email"
})
@XmlRootElement(name = "requester")
public class Requester {

    @XmlElement(required = true)
    protected P004_PmiBase pmi;
    @XmlElement(required = true)
    protected P004_HumanNameBase name;
    protected P004_QualificationBase qualification;
    @XmlElement(required = true)
    protected P004_PracticeNumberBase practiceNumber;
    protected P004_NhifNumberBase nhifNumber;
    protected P004_PhoneBase phone;
    protected P004_EmailBase email;

    /**
     * Gets the value of the pmi property.
     * 
     * @return
     *     possible object is
     *     {@link P004_PmiBase }
     *     
     */
    public P004_PmiBase getPmi() {
        return pmi;
    }

    /**
     * Sets the value of the pmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_PmiBase }
     *     
     */
    public void setPmi(P004_PmiBase value) {
        this.pmi = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link P004_HumanNameBase }
     *     
     */
    public P004_HumanNameBase getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_HumanNameBase }
     *     
     */
    public void setName(P004_HumanNameBase value) {
        this.name = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link P004_QualificationBase }
     *     
     */
    public P004_QualificationBase getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_QualificationBase }
     *     
     */
    public void setQualification(P004_QualificationBase value) {
        this.qualification = value;
    }

    /**
     * Gets the value of the practiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link P004_PracticeNumberBase }
     *     
     */
    public P004_PracticeNumberBase getPracticeNumber() {
        return practiceNumber;
    }

    /**
     * Sets the value of the practiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_PracticeNumberBase }
     *     
     */
    public void setPracticeNumber(P004_PracticeNumberBase value) {
        this.practiceNumber = value;
    }

    /**
     * Gets the value of the nhifNumber property.
     * 
     * @return
     *     possible object is
     *     {@link P004_NhifNumberBase }
     *     
     */
    public P004_NhifNumberBase getNhifNumber() {
        return nhifNumber;
    }

    /**
     * Sets the value of the nhifNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_NhifNumberBase }
     *     
     */
    public void setNhifNumber(P004_NhifNumberBase value) {
        this.nhifNumber = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link P004_PhoneBase }
     *     
     */
    public P004_PhoneBase getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_PhoneBase }
     *     
     */
    public void setPhone(P004_PhoneBase value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link P004_EmailBase }
     *     
     */
    public P004_EmailBase getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_EmailBase }
     *     
     */
    public void setEmail(P004_EmailBase value) {
        this.email = value;
    }

}
