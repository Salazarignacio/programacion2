
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        boolean bandera = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero positivo del 0 al 10");
            int entrada = Integer.parseInt(input.nextLine());
            if (entrada < 0 || entrada > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            } else {
                bandera = false;
            }
        } while (bandera);
    }
}
