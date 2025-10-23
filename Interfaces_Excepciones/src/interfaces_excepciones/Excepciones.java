package interfaces_excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Excepciones {

// Excepciones
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //1. División segura
// Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero dividendo");
        double dividendo = sc.nextDouble();
        System.out.println("Ingrese el numero divisor");
        double divisor = sc.nextDouble();
        double resultado = dividendo / divisor;
        System.out.println(resultado);
        if (divisor == 0) {
            throw new ArithmeticException("No es posible dividir por 0");
        }
        //2. Conversión de cadena a número
// Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.

        Scanner sc2 = new Scanner(System.in);
        try {
            System.out.println("Ingrese el texto que desea convertir a numero");
            String texto = sc2.nextLine();
            int numero = Integer.parseInt(texto);
        } catch (NumberFormatException err) {
            throw new NumberFormatException("No se puede convertir a numero");
        }
        // 3. Lectura de archivo
// Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Ingrese la ruta del archivo");
        String ruta1 = sc5.nextLine();
        File archivo1 = new File(ruta1);
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(archivo1));
        System.out.println(br.readLine());
        br.close();
//4. Excepción personalizada
// Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc3.nextInt();
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe ser mayor o igual a 0 y menor que 120");
        }
        System.out.println(edad);

        // 5. Uso de try-with-resources
// Leer un archivo con BufferedReader usando try-with-resources. Manejar IOException correctamente.
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Ingrese la ruta del archivo");
        String ruta2 = sc4.nextLine();
        File archivo2 = new File(ruta2);
        try (BufferedReader br2 = new BufferedReader(new FileReader(archivo2))) {
            System.out.println(br2.readLine());
        } catch (IOException e) {
            System.out.println("Error de E/S" + e.getMessage());
            throw new RuntimeException("No se pudo localizar archivo");
        }
    }
}
