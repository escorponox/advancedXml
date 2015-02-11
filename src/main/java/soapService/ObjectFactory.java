
package soapService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the soapService package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Solicitud_QNAME         = new QName("http://www.carlos.coves.com/jaxb", "solicitud");
	private final static QName _Solicitar_QNAME         = new QName("http://webServices/", "solicitar");
	private final static QName _SolicitarResponse_QNAME = new QName("http://webServices/", "solicitarResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapService
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SolicitudVacaciones }
	 */
	public SolicitudVacaciones createSolicitudVacaciones() {
		return new SolicitudVacaciones();
	}

	/**
	 * Create an instance of {@link RespuestaVacaciones }
	 */
	public RespuestaVacaciones createRespuestaVacaciones() {
		return new RespuestaVacaciones();
	}

	/**
	 * Create an instance of {@link SolicitarResponse }
	 */
	public SolicitarResponse createSolicitarResponse() {
		return new SolicitarResponse();
	}

	/**
	 * Create an instance of {@link Solicitar }
	 */
	public Solicitar createSolicitar() {
		return new Solicitar();
	}

	/**
	 * Create an instance of {@link SolicitudVacaciones.Dias }
	 */
	public SolicitudVacaciones.Dias createSolicitudVacacionesDias() {
		return new SolicitudVacaciones.Dias();
	}

	/**
	 * Create an instance of {@link RespuestaVacaciones.DiasAprobados }
	 */
	public RespuestaVacaciones.DiasAprobados createRespuestaVacacionesDiasAprobados() {
		return new RespuestaVacaciones.DiasAprobados();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
	 */
	@XmlElementDecl(namespace = "http://www.carlos.coves.com/jaxb", name = "solicitud")
	public JAXBElement<Object> createSolicitud(Object value) {
		return new JAXBElement<Object>(_Solicitud_QNAME, Object.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Solicitar }{@code >}}
	 */
	@XmlElementDecl(namespace = "http://webServices/", name = "solicitar")
	public JAXBElement<Solicitar> createSolicitar(Solicitar value) {
		return new JAXBElement<Solicitar>(_Solicitar_QNAME, Solicitar.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarResponse }{@code >}}
	 */
	@XmlElementDecl(namespace = "http://webServices/", name = "solicitarResponse")
	public JAXBElement<SolicitarResponse> createSolicitarResponse(SolicitarResponse value) {
		return new JAXBElement<SolicitarResponse>(_SolicitarResponse_QNAME, SolicitarResponse.class, null, value);
	}

}
