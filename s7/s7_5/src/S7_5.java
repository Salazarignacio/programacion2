
import java.util.ArrayList;

public class S7_5 {

    public static void main(String[] args) {
//        5. Sistema de pagos con polimorfismo y genéricos
//● Interfaz: Pagable con método pagar()
//● Clases: TarjetaCredito, Transferencia, Efectivo implementan Pagable
//● Método: procesarPago(Pagable medio) genérico para todos los tipos
//● Tarea: Crear distintas formas de pago y procesarlas con una sola función
        ArrayList<Interfaz> iPago = new ArrayList();
        TarjetaCredito t1 = new TarjetaCredito(198.20);
        Efectivo e1 = new Efectivo(198.20);
        Tranferencia tr1 = new Tranferencia(198.20);
        iPago.add(t1);
        iPago.add(e1);
        iPago.add(tr1);
        funcionPago(iPago);
    }

    public static void funcionPago(ArrayList<Interfaz> arr) {
        for (Interfaz fp : arr) {
            fp.pagar();
        }
    }

}
