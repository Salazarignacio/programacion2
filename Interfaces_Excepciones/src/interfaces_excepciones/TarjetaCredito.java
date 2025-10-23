package interfaces_excepciones;

//// 4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal),
///con métodos procesarPago(double) y aplicarDescuento(double).

public class TarjetaCredito implements PagoConDescuento {

    private int numero;
    private Cliente cliente;
    private double totalConDescuento;

    public TarjetaCredito(int num) {
        this.numero = num;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (this.cliente != null && this.cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    
    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Descuento con Tarjeta de credito");
        totalConDescuento = monto * 0.85;
        System.out.println("Total a pagar: $" + totalConDescuento);
        return totalConDescuento;
    }

    public double getTotalConDescuento() {
        return totalConDescuento;
    }

}
