package webServices;

public class ProductosXMLRPCClient {

    public static void main(String[] argv) {

        xmlRpcService.ProductosXMLRPC service = new xmlRpcService.ProductosXMLRPC_Service().getProductosXMLRPCPort();

        System.out.println("Product list:");
        for (String s : service.listProducts().getItem()) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        System.out.println(service.orderProduct("Producto1", 2));
        System.out.println(service.orderProduct("Productoaaaa", 2));
    }
}