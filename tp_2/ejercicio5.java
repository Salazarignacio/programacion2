
import java.util.Scanner;

/* 5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. 
El ciclo debe continuar hasta que el usuario ingrese el número 0, 
momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acumulador = 0;
        int entrada;
        do {
            System.out.println("Ingrese un numero");
            entrada = Integer.parseInt(input.nextLine());
            if (entrada % 2 == 0) {
                acumulador += entrada;
            };
        } while (entrada != 0);

        System.out.println("Total acumulado de numeros pares: " + acumulador);

    }

}
