/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionaa;
import java.io.IOException;
/**
 *
 * @author Anny Yohana
 */
public class ProgramaExcepciones {
    public static void main(String[] args) {
        try {
            metodoExcepcionA2();
        } catch (Exception excepcion) {
            System.out.println("Excepcion atrapada: " + excepcion.getMessage());
        }

        try {
            metodoExcepcionB();
        } catch (Exception excepcion) {
            System.out.println("Excepcion atrapada: " + excepcion.getMessage());
        }

        try {
            metodoNullPointerException();
        } catch (Exception excepcion) {
            System.out.println("Excepcion atrapada: " + excepcion.getMessage());
        }

        try {
            metodoIOException();
        } catch (Exception excepcion) {
            System.out.println("Excepcion atrapada: " + excepcion.getMessage());
        }
    }

    public static void metodoExcepcionA2() throws ExcepcionAa {
        // Lanzamos una ExcepcionA2
        throw new ExcepcionAa("ExcepcionA2 lanzada");
    }

    public static void metodoExcepcionB() throws ExcepcionB {
        // Lanzamos una ExcepcionB
        throw new ExcepcionB("ExcepcionB lanzada");
    }

    public static void metodoNullPointerException() {
        // Lanzamos un NullPointerException
        String texto = null;
        texto.length();
    }

    public static void metodoIOException() throws IOException {
        // Lanzamos una IOException
        throw new IOException("IOException lanzada");
    }
}
