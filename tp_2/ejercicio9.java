
import java.util.Scanner;

/*9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg

b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0 */
public class ejercicio9 {

    public static void main(String[] args) {
        double precio_producto, peso_producto;
        String zona;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio_producto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el peso del paquete en kg: ");
        peso_producto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();

        double costoEnvio = calcularCostoEnvio(peso_producto, zona);
        double costoTotal = calcularTotalCompra(precio_producto, costoEnvio);

        System.out.println("El costo del envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + costoTotal);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        int precio_kg = 0;
        double costo_total;
        if (zona.equals("Nacional")) {
            precio_kg = 5;
        } else if (zona.equals("Internacional")) {
            precio_kg = 10;
        }
        costo_total = peso * precio_kg;
        return costo_total;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double total_compra = costoEnvio + precioProducto;
        return total_compra;
    }
}
