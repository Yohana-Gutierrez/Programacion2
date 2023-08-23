/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unaclase;

/**
 *
 * @author Anny Yohana
 */
    public class Main {
    public static void main(String[] args) {
        try {
            // Intentamos crear una instancia de UnaClase
            UnaClase objeto = new UnaClase();
        } catch (Exception e) {
            // Capturamos la excepción que se lanzó desde el constructor
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}
