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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tlink","predicateAnchor"
})
@XmlRootElement(name = "temporalRelations")
public class TemporalRelations {

 
    @XmlElement(name = "tlink", type = Tlink.class)
    protected List<Tlink> tlink;
    @XmlElement(name = "predicateAnchor", type = PredicateAnchor.class)
    protected List<PredicateAnchor> predicateAnchor;
	public List<Tlink> getTlink() {
		return tlink;
	}
	public void setTlink(List<Tlink> tlink) {
		this.tlink = tlink;
	}
	public List<PredicateAnchor> getPredicateAnchor() {
		if(predicateAnchor==null)
			predicateAnchor= new ArrayList<PredicateAnchor>();
		return predicateAnchor;
	}
	public void setPredicateAnchor(List<PredicateAnchor> predicateAnchor) {
		this.predicateAnchor = predicateAnchor;
	}

   
}
