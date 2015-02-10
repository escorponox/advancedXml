package webServices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

@WebService(serviceName = "ProductosXMLRPC")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ProductosXMLRPC {


    private static final String[] PRODUCTOS =
            {
                    "Producto0",
                    "Producto1",
                    "Producto2",
                    "Producto3",
                    "Producto4",
                    "Producto5",
                    "Producto6",
                    "Producto7",
                    "Producto8",
                    "Producto9"
            };


    @WebMethod(operationName = "listProducts")
    public String[] listProducts() {
        return PRODUCTOS;
    }

    @WebMethod(operationName = "orderProduct")
    public String orderProduct(@WebParam(name = "code") String product, @WebParam(name = "quantity") Integer quantity) {

        if (Arrays.asList(PRODUCTOS).contains(product)) {
            return "You ordered " + quantity + " of " + product;
        } else {
            return "We don't have this product: " + product;
        }
    }

}
