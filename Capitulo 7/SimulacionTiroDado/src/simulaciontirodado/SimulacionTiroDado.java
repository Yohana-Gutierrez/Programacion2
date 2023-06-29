/*
7.17 (Tiro de dados) Escriba una aplicación para simular el tiro de dos dados. La aplicación debe utilizar un objeto de
la clase Random una vez para tirar el primer dado, y de nuevo para tirar el segundo. Después debe calcularse la
suma de los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, por lo que la suma de los valores variará
del 2 al 12, siendo 7 la suma más frecuente, mientras que 2 y 12 serán las sumas menos frecuentes. En la figura 7.28
se muestran las 36 posibles combinaciones de los dos dados. Su aplicación debe tirar los dados 36,000,000 de veces.

Ejercicios 301
Utilice un arreglo unidimensional para registrar el número de veces que aparezca cada una de las posibles sumas.
Muestre los resultados en formato tabular.
 */
package simulaciontirodado;
import java.util.Random;
/**
 *
 * @author Anny Yohana
 */
public class SimulacionTiroDado {

    public static void main(String[] args) {
        int[] frecuenciaSumas = new int[13]; // Índices 2-12 para almacenar las frecuencias de las sumas

        Random random = new Random();

        int tiradas = 36000000; // Número de tiradas de los dados

        for (int i = 0; i < tiradas; i++) {
            int dado1 = random.nextInt(6) + 1; // Valor del primer dado (1-6)
            int dado2 = random.nextInt(6) + 1; // Valor del segundo dado (1-6)
            int suma = dado1 + dado2; // Suma de los valores de los dados

            frecuenciaSumas[suma]++; // Incrementar la frecuencia de la suma obtenida
        }

        System.out.println("Suma\tFrecuencia");
        System.out.println("---------------");
        
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + frecuenciaSumas[i]);
        }
    }
    }
