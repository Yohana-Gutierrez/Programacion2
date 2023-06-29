/*
7.15 (Argumentos de línea de comandos) Modifique la figura 7.2, de manera que el tamaño del arreglo se
especifique mediante el primer argumento de línea de comandos. Si no se suministra un argumento de línea de comandos, 
use 10 como el valor predeterminado del arreglo
 */
package argumentocomandos;

/**
 *
 * @author Anny Yohana
 */
public class ArgumentoComandos {

    public static void main(String[] args) {
        int tamañoArreglo = 10; // Valor predeterminado
        if (args.length > 0) {
            tamañoArreglo = Integer.parseInt(args[0]);
        }

        int[] arreglo = new int[tamañoArreglo];

        System.out.printf("%s%8s%n", "Indice", "Valor");

        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%5d%8d%n", contador, arreglo[contador]);
        }
    }
}