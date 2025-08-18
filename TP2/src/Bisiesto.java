
import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un año");
        int anio = input.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
