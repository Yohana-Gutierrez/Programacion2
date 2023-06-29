/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenorenteros;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class MayorMenorEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros = 5;
        int numero;
        int mayor = Integer.MIN_VALUE; // Inicializamos con el valor minimo posible
        int menor = Integer.MAX_VALUE; // Inicializamos con el valor maximo posible

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el numero entero " + i + ": ");
            numero = scanner.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
