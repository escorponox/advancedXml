package webServices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "ServicioXMLRPC")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ServicioXMLRPC {

	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") String txt) {
		return "Hello " + txt + "!!!!";
	}

}
