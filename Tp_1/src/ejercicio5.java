
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo número");
        int num2 = Integer.parseInt(input.nextLine());
        
        System.out.println(num1 + num2 + " Sumados");
        System.out.println(num1 - num2 + " Restados");
        System.out.println(num1 * num2 + " Multiplicados");
        System.out.println(num1 / num2 + " Divididos");
    }
}
