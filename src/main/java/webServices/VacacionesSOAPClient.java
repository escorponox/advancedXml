package webServices;

import soapService.ObjectFactory;
import soapService.RespuestaVacaciones;
import soapService.SolicitudVacaciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class VacacionesSOAPClient {

	public static void main(String[] argv) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		soapService.VacacionesSOAP service = new soapService.VacacionesSOAP_Service().getVacacionesSOAPPort();

		List<Date> dates = new LinkedList<Date>();
		dates.add(simpleDateFormat.parse("12-11-1979"));
		dates.add(simpleDateFormat.parse("13-11-1979"));
		dates.add(simpleDateFormat.parse("14-11-1979"));
		dates.add(simpleDateFormat.parse("15-11-1979"));
		dates.add(simpleDateFormat.parse("16-11-1979"));

		ObjectFactory objectFactory = new ObjectFactory();
		SolicitudVacaciones solicitudVacaciones = objectFactory.createSolicitudVacaciones();
		solicitudVacaciones.setNif("12345678A");

		SolicitudVacaciones.Dias dias = objectFactory.createSolicitudVacacionesDias();
		dias.getDia().add("01-02-2015");
		dias.getDia().add("01-03-2015");
		dias.getDia().add("01-04-2015");
		dias.getDia().add("01-05-2015");
		dias.getDia().add("01-06-2015");

		solicitudVacaciones.setDias(dias);

		System.out.println("Dias solicitados:");
		for (String s : solicitudVacaciones.getDias().getDia()) {
			System.out.println(s);
		}
		System.out.println("------------------");

		RespuestaVacaciones respuestaVacaciones = service.solicitar(solicitudVacaciones);

		System.out.println("Dias aprobados:");
		for (String s : respuestaVacaciones.getDiasAprobados().getDia()) {
			System.out.println(s);
		}

	}
}
