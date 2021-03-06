
package soapService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for solicitarResponse complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="solicitarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webServices/}respuestaVacaciones" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitarResponse", propOrder = {
		"_return"
})
public class SolicitarResponse {

	@XmlElement(name = "return")
	protected RespuestaVacaciones _return;

	/**
	 * Gets the value of the return property.
	 *
	 * @return possible object is
	 * {@link RespuestaVacaciones }
	 */
	public RespuestaVacaciones getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 *
	 * @param value allowed object is
	 *              {@link RespuestaVacaciones }
	 */
	public void setReturn(RespuestaVacaciones value) {
		this._return = value;
	}

}
