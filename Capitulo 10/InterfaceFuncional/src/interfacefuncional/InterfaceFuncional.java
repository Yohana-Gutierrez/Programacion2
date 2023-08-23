/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacefuncional;
/**
 *
 * @author Anny Yohana
 */



// Definimos una interfaz funcional con un único método abstracto
@FunctionalInterface
interface OperacionMatematica {
    int realizarOperacion(int a, int b);
}


public class InterfaceFuncional {

    public static void main(String[] args) {
         // Creamos instancias de la interfaz usando expresiones lambda

        // Resto del código es el mismo...
        OperacionMatematica suma = (a, b) -> a + b;
        OperacionMatematica resta = (a, b) -> a - b;
        OperacionMatematica multiplicacion = (a, b) -> a * b;
        OperacionMatematica division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("¡Error! No se puede dividir entre cero.");
            }
        };

        int num1 = 10;
        int num2 = 5;

        int resultadoSuma = suma.realizarOperacion(num1, num2);
        int resultadoResta = resta.realizarOperacion(num1, num2);
        int resultadoMultiplicacion = multiplicacion.realizarOperacion(num1, num2);
        int resultadoDivision = division.realizarOperacion(num1, num2);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
    }
}
