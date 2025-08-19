
import java.util.Scanner;

/*Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99*/
public class ejercicio12 {

    /* Creo que por error los precios modificados son iguales a los originales. Puse otros valores para que se diferencien*/
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
        precios[0] = 200.2;
        precios[1] = 300.7;
        precios[2] = 189.89;
        precios[3] = 450.26;
        precios[4] = 98.5;
        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }

}
