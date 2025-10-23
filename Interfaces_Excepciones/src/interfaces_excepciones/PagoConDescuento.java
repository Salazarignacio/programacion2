package interfaces_excepciones;

//// 4. Ampliar con interfaces Pago y PagoConDescuento para distintos
///medios de pago (TarjetaCredito, PayPal),
///con métodos procesarPago(double) y aplicarDescuento(double).
public interface PagoConDescuento extends Pagable {
    default double aplicarDescuento(double monto){
        System.out.println("Aplicando descuento...");
        return 0;
    }
    default double procesarPago(double monto){
        return 3.0;
    };
    
}
