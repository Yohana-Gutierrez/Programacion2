/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicadoeliminacion1;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class DuplicadoEliminacion1 {

    public static void main(String[] args) {
        final int TAMANO_ARREGLO = 5;
        int[] numeros = new int[TAMANO_ARREGLO];
        int contador = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese cinco números entre 10 y 100:");
        
        while (contador < TAMANO_ARREGLO) {
            int numero = scanner.nextInt();
            
            if (numero < 10 || numero > 100) {
                System.out.println("El número debe estar entre 10 y 100. Ingrese otro número:");
                continue;
            }
            if (numero<10 ) {
                System.out.println("El número debe estar entre 10 y 100. Ingrese otro número:");
                continue;
             }
            
            boolean duplicado = false;
            
            for (int i = 0; i < contador; i++) {
                if (numeros[i] == numero) {
                    duplicado = true;
                    break;
                }
            }
            
            if (!duplicado) {
                numeros[contador] = numero;
                contador++;
                
                System.out.println("Valores únicos introducidos:");
                for (int i = 0; i < contador; i++) {
                    System.out.print(numeros[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("El número ya ha sido ingresado. Ingrese otro número:");
            }
        }
        
        scanner.close();
    }
}
