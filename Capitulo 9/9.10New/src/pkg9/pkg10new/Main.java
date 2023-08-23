/*
 (Escriba una línea de código) Escriba una línea de código que realice cada una de las siguientes tareas:
a) Especifique que la clase TrabajadorPiezas herede de la clase Empleado.
b) Llame al método toString de la superclase Empleado desde el método toString de la subclase TrabajadorPiezas.
c) Llame al constructor de la superclase Empleado desde el constructor de la subclase TrabajadorPiezas;
suponga que el constructor de la superclase recibe tres objetos String que representan el primer nombre, 
el apellido paterno y el número de seguro social
 */
package pkg9.pkg10new;

/**
 *
 * @author Anny Yohana
 */
public class Main {
    public static void main(String[] args) {
        TrabajadorPiezas trabajador1 = new TrabajadorPiezas("Juan", "Pérez", "123456789");
        TrabajadorPiezas trabajador2 = new TrabajadorPiezas("María", "González", "987654321");
        
        
        
        
        System.out.println("Información del Trabajador 1:");
        System.out.println(trabajador1.toString());
        
        System.out.println("\nInformación del Trabajador 2:");
        System.out.println(trabajador2.toString());
    }
}
