
import java.util.Scanner;

/*10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
q 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60*/
public class ejercicio10 {

    public static void main(String[] args) {
        int stock, vendido, recibido;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto:");
        stock = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad vendida:");
        vendido = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad recibida:");
        recibido = Integer.parseInt(input.nextLine());
        actualizarStock(stock, vendido, recibido);
    }

    public static void actualizarStock(int stockActual, int cantidadVendida,
            int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

}
