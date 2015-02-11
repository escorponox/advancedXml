
package soapService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="solicitud" type="{http://webServices/}solicitudVacaciones" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitar", propOrder = {
    "solicitud"
})
public class Solicitar {

    protected SolicitudVacaciones solicitud;

    /**
     * Gets the value of the solicitud property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudVacaciones }
     *     
     */
    public SolicitudVacaciones getSolicitud() {
        return solicitud;
    }

    /**
     * Sets the value of the solicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudVacaciones }
     *     
     */
    public void setSolicitud(SolicitudVacaciones value) {
        this.solicitud = value;
    }

}
