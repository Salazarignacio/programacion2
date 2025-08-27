
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        double division;
        int divisionInt;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo número");
        int num2 = Integer.parseInt(input.nextLine());
        division = (double) num1 / num2;
        divisionInt = num1 / num2;
        System.out.println("El resultado double es: "+ division);
        System.out.println("El resultado int es: "+ divisionInt);
    }
}
