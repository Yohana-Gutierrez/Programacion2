/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciona;

/**
 *
 * @author Anny Yohana
 */

// Definición de la superclase ExcepcionA
// Definición de la superclase ExcepcionA
class ExcepcionA extends Exception {
    public ExcepcionA(String mensaje) {
        super(mensaje);
    }
}

// Definición de la subclase ExcepcionB que hereda de ExcepcionA
class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String mensaje) {
        super(mensaje);
    }
}

// Definición de la subclase ExcepcionC que hereda de ExcepcionB
class ExcepcionC extends ExcepcionB {
    public ExcepcionC(String mensaje) {
        super(mensaje);
    }
}



