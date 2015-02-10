package jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "person", namespace = "http://www.carlos.coves.com/jaxb")
@XmlType(propOrder = { "nif", "nombre", "apellido1", "apellido2", "fechaNacimiento", "numHijos", "hijos", "salario" })
public class Person {

	private String       nif;
	private String       nombre;
	private String       apellido1;
	private String       apellido2;
	private Date         fechaNacimiento;
	private Integer      numHijos;
	private BigDecimal   salario;
	private List<String> hijos;

	public Person() {
	}

	public Person(String nif, String nombre, String apellido1, String apellido2, Date fechaNacimiento, Integer numHijos,
			BigDecimal salario, List<String> hijos) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.numHijos = numHijos;
		this.salario = salario;
		this.hijos = hijos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(Integer numHijos) {
		this.numHijos = numHijos;
	}

	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@XmlElementWrapper(name = "hijos")
	@XmlElement(name = "hijo")
	public List<String> getHijos() {
		return hijos;
	}

	public void setHijos(List<String> hijos) {
		this.hijos = hijos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Person))
			return false;

		Person person = (Person) o;

		if (apellido1 != null ? !apellido1.equals(person.apellido1) : person.apellido1 != null)
			return false;
		if (apellido2 != null ? !apellido2.equals(person.apellido2) : person.apellido2 != null)
			return false;
		if (fechaNacimiento != null ? !fechaNacimiento.equals(person.fechaNacimiento) : person.fechaNacimiento != null)
			return false;
		if (hijos != null ? !hijos.equals(person.hijos) : person.hijos != null)
			return false;
		if (nif != null ? !nif.equals(person.nif) : person.nif != null)
			return false;
		if (nombre != null ? !nombre.equals(person.nombre) : person.nombre != null)
			return false;
		if (numHijos != null ? !numHijos.equals(person.numHijos) : person.numHijos != null)
			return false;
		if (salario != null ? !salario.equals(person.salario) : person.salario != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = nif != null ? nif.hashCode() : 0;
		result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
		result = 31 * result + (apellido1 != null ? apellido1.hashCode() : 0);
		result = 31 * result + (apellido2 != null ? apellido2.hashCode() : 0);
		result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
		result = 31 * result + (numHijos != null ? numHijos.hashCode() : 0);
		result = 31 * result + (salario != null ? salario.hashCode() : 0);
		result = 31 * result + (hijos != null ? hijos.hashCode() : 0);
		return result;
	}

	@Override public String toString() {
		return "Person{" +
				"nif='" + nif + '\'' +
				", nombre='" + nombre + '\'' +
				", apellido1='" + apellido1 + '\'' +
				", apellido2='" + apellido2 + '\'' +
				", fechaNacimiento=" + fechaNacimiento +
				", numHijos=" + numHijos +
				", salario=" + salario +
				", hijos=" + hijos +
				'}';
	}
}
