package interfaces_excepciones;

public class Interfaces_Excepciones {

// 1. Crear una interfaz Pagable con el método calcularTotal().
// 2  Clase Producto: tiene nombre y precio, implementa Pagable.
// 3. Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido.
// 4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal), 
//con métodos procesarPago(double) y aplicarDescuento(double).
// 5. Crear una interfaz Notificable para notificar cambios de estado. La clase Cliente implementa dicha interfaz 
//y Pedido debe notificarlo al cambiar de estado.
    public static void main(String[] args) {
// Se crea pedido con productos
        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(new Producto("Coca", 20.0));
        pedido1.agregarProducto(new Producto("Fanta", 20.0));
        pedido1.agregarProducto(new Producto("Sprite", 20.0));
        // Cliente
        Cliente cliente1 = new Cliente("Ignacio");
        cliente1.setPedido(pedido1);
        TarjetaCredito tarj1 = new TarjetaCredito(199822);
        PayPal pp1 = new PayPal(2234887);
        cliente1.setTarjeta(tarj1);
        cliente1.setPayPal(pp1);
        tarj1.setCliente(cliente1);
        pp1.setCliente(cliente1);
        // quiero que se pueda pagar el pedido
        // asociado al cliente con un metodo de pago
        double monto = pedido1.calcularTotal();
        pp1.procesarPago(monto);
        // Cambios de estado del pedido
       // pedido1.notificar();
        
        // Pagando con medios de pago
        
    }
}
