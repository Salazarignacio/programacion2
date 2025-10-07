
public abstract class Interfaz {

    private double pago;

    Interfaz(double pago) {
        this.pago = pago;
    }

    public void pagar() {
        System.out.println("Porcesando pago de $" + pago);
    }
}
