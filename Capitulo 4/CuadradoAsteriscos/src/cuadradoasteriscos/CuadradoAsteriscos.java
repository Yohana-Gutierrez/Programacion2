/*
(Cuadrado de asteriscos) Escriba una aplicación que pida al usuario que introduzca el tamaño del lado de
un cuadrado y que muestre un cuadrado hueco de ese tamaño, compuesto de asteriscos. Su programa debe funcionar
con cuadrados que tengan lados de todas las longitudes entre 1 y 20.
 */
package cuadradoasteriscos;

import java.util.Scanner;

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
