/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmetica;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class Aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la suma, producto, diferencia y cociente de los números
        double suma = numero1 + numero2;
        double producto = numero1 * numero2;
        double diferencia = numero1 - numero2;
        double cociente = numero1 / numero2;

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Diferencia: " + diferencia);
        System.out.println("Cociente: " + cociente);

        scanner.close();
    }
}
