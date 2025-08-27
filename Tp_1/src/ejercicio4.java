
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
    }

}
