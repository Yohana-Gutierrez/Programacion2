/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacionenteros;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */

public class ComparacionEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mas grande.");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mas grande.");
        } else {
            System.out.println("Estos numeros son iguales.");
        }
    }
}
