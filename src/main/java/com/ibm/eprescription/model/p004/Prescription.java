//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.24 at 06:36:48 PM EET 
//


package com.ibm.eprescription.model.p004;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{https://www.his.bg}nrnPrescription"/&gt;
 *         &lt;element ref="{https://www.his.bg}lrn"/&gt;
 *         &lt;element ref="{https://www.his.bg}status"/&gt;
 *         &lt;element ref="{https://www.his.bg}authoredOn"/&gt;
 *         &lt;element ref="{https://www.his.bg}category"/&gt;
 *         &lt;element ref="{https://www.his.bg}isProtocolBased" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}protocolNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}protocolDate" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}rhifNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}basedOn"/&gt;
 *         &lt;element ref="{https://www.his.bg}dispensationType" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}allowedRepeatsNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}isFulfilled" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.his.bg}group" maxOccurs="3"/&gt;
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
    "nrnPrescription",
    "lrn",
    "status",
    "authoredOn",
    "category",
    "isProtocolBased",
    "protocolNumber",
    "protocolDate",
    "rhifNumber",
    "basedOn",
    "dispensationType",
    "allowedRepeatsNumber",
    "isFulfilled",
    "group"
})
@XmlRootElement(name = "prescription")
public class Prescription {

    @XmlElement(required = true)
    protected P004_NrnBase nrnPrescription;
    @XmlElement(required = true)
    protected P004_LrnBase lrn;
    @XmlElement(required = true)
    protected P004_PrescriptionStatusBase status;
    @XmlElement(required = true)
    protected P004_AuthoredOnBase authoredOn;
    @XmlElement(required = true)
    protected P004_PrescriptionTypeBase category;
    protected P004_IsProtocolBasedBase isProtocolBased;
    protected P004_ProtocolNumberBase protocolNumber;
    protected P004_ProtocolDateBase protocolDate;
    protected P004_RhifNumberBase rhifNumber;
    @XmlElement(required = true)
    protected P004_OutpatientSheetNumberBase basedOn;
    protected P004_DispensationTypeBase dispensationType;
    protected P004_AllowedRepeatsNumberBase allowedRepeatsNumber;
    protected P004_IsFulfilledBase isFulfilled;
    @XmlElement(required = true)
    protected List<Group> group;

    /**
     * Gets the value of the nrnPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link P004_NrnBase }
     *     
     */
    public P004_NrnBase getNrnPrescription() {
        return nrnPrescription;
    }

    /**
     * Sets the value of the nrnPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_NrnBase }
     *     
     */
    public void setNrnPrescription(P004_NrnBase value) {
        this.nrnPrescription = value;
    }

    /**
     * Gets the value of the lrn property.
     * 
     * @return
     *     possible object is
     *     {@link P004_LrnBase }
     *     
     */
    public P004_LrnBase getLrn() {
        return lrn;
    }

    /**
     * Sets the value of the lrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_LrnBase }
     *     
     */
    public void setLrn(P004_LrnBase value) {
        this.lrn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link P004_PrescriptionStatusBase }
     *     
     */
    public P004_PrescriptionStatusBase getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_PrescriptionStatusBase }
     *     
     */
    public void setStatus(P004_PrescriptionStatusBase value) {
        this.status = value;
    }

    /**
     * Gets the value of the authoredOn property.
     * 
     * @return
     *     possible object is
     *     {@link P004_AuthoredOnBase }
     *     
     */
    public P004_AuthoredOnBase getAuthoredOn() {
        return authoredOn;
    }

    /**
     * Sets the value of the authoredOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_AuthoredOnBase }
     *     
     */
    public void setAuthoredOn(P004_AuthoredOnBase value) {
        this.authoredOn = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link P004_PrescriptionTypeBase }
     *     
     */
    public P004_PrescriptionTypeBase getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_PrescriptionTypeBase }
     *     
     */
    public void setCategory(P004_PrescriptionTypeBase value) {
        this.category = value;
    }

    /**
     * Gets the value of the isProtocolBased property.
     * 
     * @return
     *     possible object is
     *     {@link P004_IsProtocolBasedBase }
     *     
     */
    public P004_IsProtocolBasedBase getIsProtocolBased() {
        return isProtocolBased;
    }

    /**
     * Sets the value of the isProtocolBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_IsProtocolBasedBase }
     *     
     */
    public void setIsProtocolBased(P004_IsProtocolBasedBase value) {
        this.isProtocolBased = value;
    }

    /**
     * Gets the value of the protocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link P004_ProtocolNumberBase }
     *     
     */
    public P004_ProtocolNumberBase getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Sets the value of the protocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_ProtocolNumberBase }
     *     
     */
    public void setProtocolNumber(P004_ProtocolNumberBase value) {
        this.protocolNumber = value;
    }

    /**
     * Gets the value of the protocolDate property.
     * 
     * @return
     *     possible object is
     *     {@link P004_ProtocolDateBase }
     *     
     */
    public P004_ProtocolDateBase getProtocolDate() {
        return protocolDate;
    }

    /**
     * Sets the value of the protocolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_ProtocolDateBase }
     *     
     */
    public void setProtocolDate(P004_ProtocolDateBase value) {
        this.protocolDate = value;
    }

    /**
     * Gets the value of the rhifNumber property.
     * 
     * @return
     *     possible object is
     *     {@link P004_RhifNumberBase }
     *     
     */
    public P004_RhifNumberBase getRhifNumber() {
        return rhifNumber;
    }

    /**
     * Sets the value of the rhifNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_RhifNumberBase }
     *     
     */
    public void setRhifNumber(P004_RhifNumberBase value) {
        this.rhifNumber = value;
    }

    /**
     * Gets the value of the basedOn property.
     * 
     * @return
     *     possible object is
     *     {@link P004_OutpatientSheetNumberBase }
     *     
     */
    public P004_OutpatientSheetNumberBase getBasedOn() {
        return basedOn;
    }

    /**
     * Sets the value of the basedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_OutpatientSheetNumberBase }
     *     
     */
    public void setBasedOn(P004_OutpatientSheetNumberBase value) {
        this.basedOn = value;
    }

    /**
     * Gets the value of the dispensationType property.
     * 
     * @return
     *     possible object is
     *     {@link P004_DispensationTypeBase }
     *     
     */
    public P004_DispensationTypeBase getDispensationType() {
        return dispensationType;
    }

    /**
     * Sets the value of the dispensationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_DispensationTypeBase }
     *     
     */
    public void setDispensationType(P004_DispensationTypeBase value) {
        this.dispensationType = value;
    }

    /**
     * Gets the value of the allowedRepeatsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link P004_AllowedRepeatsNumberBase }
     *     
     */
    public P004_AllowedRepeatsNumberBase getAllowedRepeatsNumber() {
        return allowedRepeatsNumber;
    }

    /**
     * Sets the value of the allowedRepeatsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_AllowedRepeatsNumberBase }
     *     
     */
    public void setAllowedRepeatsNumber(P004_AllowedRepeatsNumberBase value) {
        this.allowedRepeatsNumber = value;
    }

    /**
     * Gets the value of the isFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link P004_IsFulfilledBase }
     *     
     */
    public P004_IsFulfilledBase getIsFulfilled() {
        return isFulfilled;
    }

    /**
     * Sets the value of the isFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link P004_IsFulfilledBase }
     *     
     */
    public void setIsFulfilled(P004_IsFulfilledBase value) {
        this.isFulfilled = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

}