package jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) throws ParseException, JAXBException, IOException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		List<String> hijos = new ArrayList<String>();
		hijos.add("Victoria");
		hijos.add("Julia");

		Person person = new Person("12345678Z", "Carlos", "Coves", "Prieto",
				simpleDateFormat.parse("12-11-1979"), 2, BigDecimal.valueOf(1000L), hijos);

		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		m.marshal(person, System.out);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		m.marshal(person, baos);

		Unmarshaller unmarshaller = context.createUnmarshaller();
		Person person2 = (Person) unmarshaller.unmarshal(new ByteArrayInputStream(baos.toByteArray()));

		//		Genera los esquemas XSD
		//		context.generateSchema(new SchemaOutputResolver() {
		//			@Override public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
		//				return new StreamResult(suggestedFileName);
		//			}
		//		});

		System.out.println(person.toString());
		System.out.println(person2.toString());
	}
}
