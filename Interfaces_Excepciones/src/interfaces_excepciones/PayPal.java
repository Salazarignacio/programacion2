package interfaces_excepciones;

//// 4. Ampliar con interfaces Pago y PagoConDescuento para distintos
/// medios de pago (TarjetaCredito, PayPal),
///con métodos procesarPago(double) y aplicarDescuento(double).

public class PayPal implements PagoConDescuento {
    private int numero;
    private Cliente cliente;
    private double totalConDescuento;

    public PayPal(int num) {
        this.numero = num;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (this.cliente != null && this.cliente.getPayPal() != this) {
            cliente.setPayPal(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Descuento con PayPal");
        totalConDescuento = monto * 0.9;
        System.out.println("Total a pagar: $" + totalConDescuento);
        return totalConDescuento;
    }

    @Override
    public double procesarPago(double monto) {
        return aplicarDescuento(monto);
    }

    public double getTotalConDescuento() {
        return totalConDescuento;
    }

}
