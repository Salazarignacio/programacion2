
public class Efectivo extends Interfaz {

    public Efectivo(double pago) {
        super(pago);
    }

    public void pagar() {
        super.pagar();
        System.out.println("Pagado con efectivo");
    }
}
