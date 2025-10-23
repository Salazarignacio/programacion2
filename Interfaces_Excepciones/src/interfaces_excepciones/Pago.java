package interfaces_excepciones;

// 4. Ampliar con interfaces Pago y PagoConDescuento para distintos 
//medios de pago (TarjetaCredito, PayPal), 
// con métodos procesarPago(double) y aplicarDescuento(double).
public interface Pago extends Pagable {

    @Override
    public default double calcularTotal() {
        Pagable.super.calcularTotal();
        return 2.0;
    }

}
