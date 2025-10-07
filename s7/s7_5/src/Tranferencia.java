
public class Tranferencia extends Interfaz {

    public Tranferencia(double pago) {
        super(pago);
    }

    public void pagar() {
        super.pagar();
        System.out.println("Pagado con tranferencia");
    }
}
