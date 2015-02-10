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
@XmlType(propOrder = {"diasAprobados"})
public class RespuestaVacaciones {

    private List<Date> diasAprobados;

    public RespuestaVacaciones() {
        diasAprobados = new LinkedList<Date>();
    }

    public RespuestaVacaciones(List<Date> dias) {
        this.diasAprobados = dias;
    }

    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElementWrapper(name = "diasAprobados")
    @XmlElement(name = "dia")
    public List<Date> getDiasAprobados() {
        return diasAprobados;
    }

    public void setDiasAprobados(List<Date> diasAprobados) {
        this.diasAprobados = diasAprobados;
    }

    @Override
    public String toString() {
        return "RespuestaVacaciones{" +
                "diasAprobados=" + diasAprobados +
                '}';
    }
}
