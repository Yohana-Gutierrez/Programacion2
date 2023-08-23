/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg10new;

/**
 *
 * @author Anny Yohana
 */
 public class TrabajadorPiezas extends Empleado {
    
    public TrabajadorPiezas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        // llamada explícita al constructor de la superclase Empleado 
         //seguida de un conjunto de paréntesis que contienen los argumentos 
         //del constructor de la superclase, que se utilizan para inicializar a las respectivas variables de instancia 
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
    }
    
    public String toString() {
        return super.toString();
    }
}


