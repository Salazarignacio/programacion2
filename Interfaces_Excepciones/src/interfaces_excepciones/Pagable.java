package interfaces_excepciones;
// 1. Crear una interfaz Pagable con el método calcularTotal().

public interface Pagable {

    public default double calcularTotal() {
        System.out.println("########################");
        return 1.0;
    }
}
