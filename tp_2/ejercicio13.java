/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Salacrack
 */
public class ejercicio13 {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        recursiva(precios.length, precios);

    }

    public static void recursiva(int num, double[] arr) {
        if (num == 0) {
            System.out.println(arr[num]);
        } else {
            recursiva(num - 1, arr);
            System.out.println(arr[num - 1]);
        }

    }
;

}
