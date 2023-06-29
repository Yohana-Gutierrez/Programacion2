/*
7.20 (Ventas totales) Use un arreglo bidimensional para resolver el siguiente problema: una compañía tiene cuatro 
vendedores (1 a 4) que venden cinco productos distintos (1 a 5). Una vez al día, cada vendedor pasa una nota por cada 
tipo de producto vendido. Cada nota contiene lo siguiente:
a) El número del vendedor
b) El número del producto
c) El valor total en dólares de ese producto vendido en ese día
 Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que está disponible la información sobre 
todas las notas del mes pasado. Escriba una aplicación que lea toda esta información para las ventas del último mes y
que resuma las ventas totales por vendedor, y por producto. Todos los totales deben guardarse en el arreglo bidimensional ventas. 
Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular, en 
donde cada columna represente a un vendedor específico y cada fila simbolice un producto. Saque el total de cada fila
para obtener las ventas totales de cada producto durante el último mes. Calcule el total de cada columna para sacar las 
ventas totales de cada vendedor durante el último mes. Su impresión tabular debe incluir estos totales cruzados a la
derecha de las filas totalizadas, y en la parte inferior de las columnas totalizadas
 */
package ventastotales;
import java.util.Scanner;

/**
 *
 * @author Anny Yohana
 */
public class VentasTotales {

    public static void main(String[] args) {
        int[][] ventas = new int[5][4]; // Arreglo bidimensional para almacenar las ventas

        Scanner scanner = new Scanner(System.in);

        // Leer las notas de venta del mes pasado
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el número del vendedor (1-4):");
            int vendedor = scanner.nextInt();

            System.out.println("Ingrese el número del producto (1-5):");
            int producto = scanner.nextInt();

            System.out.println("Ingrese el valor total en dólares del producto vendido:");
            int valor = scanner.nextInt();

            ventas[producto - 1][vendedor - 1] += valor; // Sumar el valor de venta al vendedor y producto correspondiente
        }

        scanner.close();

        // Imprimir resultados en formato tabular
        System.out.print("\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal\n");

        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Producto " + (i + 1) + ":\t");

            int totalProducto = 0;

            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(ventas[i][j] + "\t\t");

                totalProducto += ventas[i][j];
            }

            System.out.println(totalProducto);
        }

        System.out.print("Total:\t\t");

        int[] totalVendedor = new int[4];

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                totalVendedor[j] += ventas[i][j];
            }
        }

        for (int i = 0; i < totalVendedor.length; i++) {
            System.out.print(totalVendedor[i] + "\t\t");
        }

        int ventasTotales = 0;

        for (int i = 0; i < totalVendedor.length; i++) {
            ventasTotales += totalVendedor[i];
        }

        System.out.println(ventasTotales);
    }
}
