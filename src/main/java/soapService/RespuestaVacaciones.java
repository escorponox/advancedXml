
package soapService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for respuestaVacaciones complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="respuestaVacaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diasAprobados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaVacaciones", propOrder = {
		"diasAprobados"
})
public class RespuestaVacaciones {

	protected RespuestaVacaciones.DiasAprobados diasAprobados;

	/**
	 * Gets the value of the diasAprobados property.
	 *
	 * @return possible object is
	 * {@link RespuestaVacaciones.DiasAprobados }
	 */
	public RespuestaVacaciones.DiasAprobados getDiasAprobados() {
		return diasAprobados;
	}

	/**
	 * Sets the value of the diasAprobados property.
	 *
	 * @param value allowed object is
	 *              {@link RespuestaVacaciones.DiasAprobados }
	 */
	public void setDiasAprobados(RespuestaVacaciones.DiasAprobados value) {
		this.diasAprobados = value;
	}

	/**
	 * <p>Java class for anonymous complex type.
	 * <p/>
	 * <p>The following schema fragment specifies the expected content contained within this class.
	 * <p/>
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"dia"
	})
	public static class DiasAprobados {

		protected List<String> dia;

		/**
		 * Gets the value of the dia property.
		 * <p/>
		 * <p/>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the dia property.
		 * <p/>
		 * <p/>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getDia().add(newItem);
		 * </pre>
		 * <p/>
		 * <p/>
		 * <p/>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 */
		public List<String> getDia() {
			if (dia == null) {
				dia = new ArrayList<String>();
			}
			return this.dia;
		}

	}

}
