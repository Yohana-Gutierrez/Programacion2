/*(Programa para imprimir gráficos de barra) Una aplicación interesante de las computadoras es la visualización de
gráficos convencionales y de barra. Escriba una aplicación que lea cinco números, cada uno entre 1 y 30.
Por cada número leído, su programa debe mostrar el mismo número de asteriscos adyacentes.
Por ejemplo,si su programa lee el número 7, debe mostrar *******. Muestre las barras de asteriscos después de leer los cinco
números.
 */
package graficosdebarra;

import java.util.Scanner;

public class GraficosDeBarra {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        // Leer cinco numeros
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero entre 1 y 30: ");
            int numero = scanner.nextInt();
            
            // Validar el rango del numero ingresado
            while (numero < 1 || numero > 30) {
                System.out.print("Numero fuera de rango. Ingrese un número entre 1 y 30: ");
                numero = scanner.nextInt();
            }
            
            numeros[i] = numero;
        }
        
        // Imprimir las barras 
        for (int numero : numeros) {
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
