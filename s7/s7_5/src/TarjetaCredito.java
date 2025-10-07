
public class TarjetaCredito extends Interfaz {

    public TarjetaCredito(double pago) {
        super(pago);
    }

    public void pagar() {
        super.pagar();
        System.out.println("Pagado con Tarjeta de crédito");
    }

}
