/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class CuadradoAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                   Bienvenido");

        System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
        int lado = scanner.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("El tamaño supera el rango. El tamaño del lado debe estar entre 1 y 20.");
        } else {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    if (i == 1 || i == lado || j == 1 || j == lado) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
