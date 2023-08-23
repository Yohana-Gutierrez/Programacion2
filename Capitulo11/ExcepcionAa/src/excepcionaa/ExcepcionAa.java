/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionaa;

/**
 *
 * @author Anny Yohana
 */
import java.io.IOException;

// Definimos la clase ExcepcionA2 que hereda de Exception
class ExcepcionAa extends Exception {
    public ExcepcionAa(String message) {
        super(message);
    }
}

// Definimos la clase ExcepcionB que hereda de ExcepcionA2
class ExcepcionB extends ExcepcionAa {
    public ExcepcionB(String message) {
        super(message);
    }
}

