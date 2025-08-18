
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        int positivos = 0, negativos = 0, cero = 0, contador = 0, entrada = 0;
        Scanner input = new Scanner(System.in);

        while (contador < 10) {

            System.out.println("Ingrese 10 numeros enteros positivos");
            entrada = Integer.parseInt(input.nextLine());
            contador += 1;
            if (entrada == 0) {
                cero += 1;
            } else if (entrada > 0) {
                positivos += 1;
            } else {
                negativos += 1;
            }
        }
        System.out.println("Positivos: " + positivos + " Negativos: " + negativos + " Ceros: " + cero);
    }
}
