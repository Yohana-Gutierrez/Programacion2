/*
 7.10 (Comisión por ventas) Utilice un arreglo unidimensional para resolver el siguiente problema: una compañía
paga a sus vendedores por comisión. Los vendedores reciben $200 por semana más el 9% de sus ventas totales de esa
semana. Por ejemplo, un vendedor que acumule $5,000 en ventas en una semana, recibirá $200 más el 9% de $5,000,
o un total de $650. Escriba una aplicación (utilizando un arreglo de contadores) que determine cuántos vendedores
recibieron salarios en cada uno de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una cantidad entera):
a) $200-299
b) $300-399
c) $400-499
d) $500-599
e) $600-699
f) $700-799
g) $800-899
h) $900-999
i) $1,000 en adelante
Sintetice los resultados en formato tabular.

 */
package comisionventas;
import java.util.Arrays;

/**
 *
 * @author Anny Yohana
 */
public class ComisionVentas {
    public static void main(String[] args) {
        int[] ventas = {5000, 2500, 800, 1200, 3000}; // Ejemplo de ventas de los vendedores

        int[] rangosSalarios = new int[9]; // Arreglo de contadores para los rangos de salarios

        for (int i = 0; i < ventas.length; i++) {
            double salario = 200 + 0.09 * ventas[i]; // Cálculo del salario del vendedor

            // Determinar en qué rango de salarios se encuentra el salario del vendedor
            if (salario >= 200 && salario < 300) {
                rangosSalarios[0]++;
            } else if (salario >= 300 && salario < 400) {
                rangosSalarios[1]++;
            } else if (salario >= 400 && salario < 500) {
                rangosSalarios[2]++;
            } else if (salario >= 500 && salario < 600) {
                rangosSalarios[3]++;
            } else if (salario >= 600 && salario < 700) {
                rangosSalarios[4]++;
            } else if (salario >= 700 && salario < 800) {
                rangosSalarios[5]++;
            } else if (salario >= 800 && salario < 900) {
                rangosSalarios[6]++;
            } else if (salario >= 900 && salario < 1000) {
                rangosSalarios[7]++;
            } else if (salario >= 1000) {
                rangosSalarios[8]++;
            }
        }

        // Imprimir los resultados en formato tabular
        System.out.println("Rango de Salario\tCantidad de Vendedores");
        System.out.println("--------------------------------------");
        System.out.println("$200-299\t\t" + rangosSalarios[0]);
        System.out.println("$300-399\t\t" + rangosSalarios[1]);
        System.out.println("$400-499\t\t" + rangosSalarios[2]);
        System.out.println("$500-599\t\t" + rangosSalarios[3]);
        System.out.println("$600-699\t\t" + rangosSalarios[4]);
        System.out.println("$700-799\t\t" + rangosSalarios[5]);
        System.out.println("$800-899\t\t" + rangosSalarios[6]);
        System.out.println("$900-999\t\t" + rangosSalarios[7]);
        System.out.println("$1,000 en adelante\t" + rangosSalarios[8]);
    }
}

