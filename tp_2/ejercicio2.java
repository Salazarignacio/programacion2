
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mayor;
        System.out.println("Ingrese el primer numero");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el tercer numero");
        int num3 = Integer.parseInt(input.nextLine());

        if (num1 < num2) {
            mayor = num2;
        } else {
            mayor = num1;
        } 
        
        if (mayor < num3){
            mayor = num3;
        }

        System.out.println("El mayor es " + mayor);
    }
}
