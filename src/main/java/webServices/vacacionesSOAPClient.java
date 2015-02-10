package webServices;

import mypackage.ObjectFactory;
import mypackage.SolicitudVacaciones;

public class vacacionesSOAPClient {

    public static void main(String[] argv) {

        mypackage.VacacionesSOAP service = new mypackage.VacacionesSOAP_Service().getVacacionesSOAPPort();
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


        service.solicitar(solicitudVacaciones);
    }
}
