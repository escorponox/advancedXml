package webServices;

import jaxb.RespuestaVacaciones;
import jaxb.SolicitudVacaciones;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@WebService(serviceName = "vacacionesSOAP")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class VacacionesSOAP {

    @WebMethod(operationName = "solicitar")
    public RespuestaVacaciones solicitar(@WebParam(name = "solicitud") SolicitudVacaciones solicitudVacaciones) {

        List<Date> diasAprobados = new LinkedList<Date>();

        for (Date date : solicitudVacaciones.getDias()) {

			//Your tyrant boss only gives you alternate days so you can't travel.
			//You can troll him by requesting the same day several times :))))
			if (solicitudVacaciones.getDias().indexOf(date) % 2 == 0) {
				diasAprobados.add(date);
			}
		}

        return new RespuestaVacaciones(diasAprobados);
    }
}
