/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alcanceexterior;

/**
 *
 * @author Anny Yohana
 */
public class AlcanceExterior {


    public static void main(String[] args) {
        try {
            metodoExterno();
        } catch (RuntimeException e) {
            System.out.println("Excepción capturada en el método main: " + e.getMessage());
        }
    }

    public static void metodoExterno() {
        try {
            metodoInterno();
        } catch (Exception e) {
            // No se captura la excepción aquí, se propagará hacia el método que llamó a metodoExterno()
            throw new RuntimeException("Excepción exterior en metodoExterno()");
        }
    }

    public static void metodoInterno() throws Exception {
        int num = 10 / 0; // División por cero, esto generará una ArithmeticException
    }
}
