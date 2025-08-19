
import java.util.Scanner;

/* Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio base del producto: ");
        double precio_base = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el impuesto en porcentaje: ");
        double impuesto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el descuento en porcentaje: ");
        double descuento = Double.parseDouble(input.nextLine());

        calcularPrecioFinal(impuesto, descuento, precio_base);

    }

    public static void calcularPrecioFinal(double impuesto, double descuento, double precio) {
        impuesto = precio * impuesto / 100;
        descuento = precio * descuento / 100;
        double precio_final = precio - descuento + impuesto;
        System.out.println("El precio final es de: $" + precio_final);
    }
}
