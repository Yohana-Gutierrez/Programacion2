/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unmetodo;

/**
 *
 * @author Anny Yohana
 */
public class UnMetodo {

    // Definición del método unMetodo2 que lanza una excepción
    public static void unMetodo2() throws MiExcepcion {
        throw new MiExcepcion("Excepción lanzada desde unMetodo2");
    }

    // Definición del método unMetodo que llama a unMetodo2 y vuelve a lanzar la excepción
    public static void unMetodo() throws MiExcepcion {
        try {
            unMetodo2(); // Llamada al método que lanza una excepción
        } catch (MiExcepcion e) {
            System.out.println("Dentro de unMetodo - Capturando la excepción");
            throw e; // Volviendo a lanzar la excepción
        }
    }

    // Método main donde se llama a unMetodo y se captura la excepción
    public static void main(String[] args) {
        try {
            unMetodo(); // Llamada al método unMetodo
        } catch (MiExcepcion e) {
            System.out.println("Excepción capturada en el método main:");
            e.printStackTrace(); // Imprimir el rastreo de la pila de excepción
        }
    }
}

// Clase de excepción personalizada
class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}
