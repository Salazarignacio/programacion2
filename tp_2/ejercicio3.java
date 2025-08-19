
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        String clasificacion;
        do {
            System.out.println("Ingrese su edad: ");
            edad = Integer.parseInt(input.nextLine());
        } while (edad < 0);

        if (edad < 12) {
            clasificacion = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto mayor";
        }
        System.out.println("Usted es un " + clasificacion);
    }
}
