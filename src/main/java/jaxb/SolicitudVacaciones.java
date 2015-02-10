package jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement(name = "solicitud", namespace = "http://www.carlos.coves.com/jaxb")
@XmlType(propOrder = {"nif", "dias"})
public class SolicitudVacaciones {

    private String nif;
    private List<Date> dias;

    public SolicitudVacaciones() {
        dias = new LinkedList<Date>();
    }

    public SolicitudVacaciones(List<Date> dias, String nif) {
        this.dias = dias;
        this.nif = nif;
    }

    public List<Date> getDias() {
        return dias;
    }

    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElementWrapper(name = "dias")
    @XmlElement(name = "dia")
    public void setDias(List<Date> dias) {
        this.dias = dias;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "SolicitudVacaciones{" +
                "dias=" + dias +
                ", nif='" + nif + '\'' +
                '}';
    }
}
