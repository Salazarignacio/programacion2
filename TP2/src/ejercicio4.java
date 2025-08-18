
import java.util.Scanner;

/*Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15% 
Precio final: 850.0*/
public class ejercicio4 {

    public static void main(String[] args) {

        double precioEntrada, precioFinal;
        double dtoA = 10.0 / 100;
        double dtoB = 15.0 / 100;
        double dtoC = 20.0 / 100;
        int descuento;
        String categoria;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precioEntrada = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoria del producto (A, B, o C: ");
        categoria = input.nextLine();
        precioFinal = precioEntrada;
        descuento = 20;

        switch (categoria) {
            case "A" -> {
                precioFinal -= precioEntrada * dtoA;
                descuento = 10;
            }
            case "B" -> {
                precioFinal -= precioEntrada * dtoB;
                descuento = 15;
            }
            case "C" -> {
                precioFinal -= precioEntrada * dtoC;
            }
        }

        System.out.println("El precio orignal es: $" + precioEntrada);
        System.out.println("El descuneto es de un: " + descuento + "%");
        System.out.println("El precio final es: $" + precioFinal);
    }
}
