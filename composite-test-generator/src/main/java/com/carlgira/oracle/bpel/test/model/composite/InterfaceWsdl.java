//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 12:41:40 PM CET 
//


package com.carlgira.oracle.bpel.test.model.composite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="callbackInterface" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="interface" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "interface.wsdl")
public class InterfaceWsdl {

    @XmlAttribute(name = "callbackInterface")
    @XmlSchemaType(name = "anyURI")
    protected String callbackInterface;
    @XmlAttribute(name = "interface", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String _interface;

    /**
     * Gets the value of the callbackInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackInterface() {
        return callbackInterface;
    }

    /**
     * Sets the value of the callbackInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackInterface(String value) {
        this.callbackInterface = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
    }

}