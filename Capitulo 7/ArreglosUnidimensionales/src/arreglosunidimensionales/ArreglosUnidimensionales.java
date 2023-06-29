/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosunidimensionales;

/**
 *
 * @author Anny Yohana
 */
public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        int[] cuentas = new int[10];
        int[] bono = new int[15];
        int[] mejoresPuntuaciones = {10, 20, 30, 40, 50};

        // Asignar cero a los 10 elementos del arreglo "cuentas"
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 0;
        }

        // Sumar uno a cada uno de los 15 elementos del arreglo "bono"
        for (int i = 0; i < bono.length; i++) {
            bono[i] += 1;
        }

        // Imprimir los cinco valores del arreglo "mejoresPuntuaciones" en formato de columnas
        System.out.println("Valores de mejoresPuntuaciones:");
        for (int i = 0; i < mejoresPuntuaciones.length; i++) {
            System.out.println(mejoresPuntuaciones[i]);
        }
    }
}

