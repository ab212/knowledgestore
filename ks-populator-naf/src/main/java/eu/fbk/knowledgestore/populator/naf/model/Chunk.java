//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 06:08:32 PM CEST 
//


package eu.fbk.knowledgestore.populator.naf.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "span"
})
@XmlRootElement(name = "chunk")
public class Chunk {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "head", required = true)
    @XmlIDREF
    protected Object head;
    @XmlAttribute(name = "phrase", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String phrase;
    @XmlAttribute(name = "case")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String _case;
    @XmlElement(required = true)
    protected List<Span> span;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHead(Object value) {
        this.head = value;
    }

    /**
     * Gets the value of the phrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * Sets the value of the phrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhrase(String value) {
        this.phrase = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCase(String value) {
        this._case = value;
    }

    /**
     * Gets the value of the span property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the span property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Span }
     * 
     * 
     */
    public List<Span> getSpan() {
        if (span == null) {
            span = new ArrayList<Span>();
        }
        return this.span;
    }

}
