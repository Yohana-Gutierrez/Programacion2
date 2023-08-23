/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg10;

/**
 *
 * @author Anny Yohana
 */
class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    @Override
    public String toString() {
        // Sobrescribe el método toString de la clase Object en la clase Empleado
        return "Nombre: " + primerNombre + " " + apellidoPaterno + ", Seguro Social: " + numeroSeguroSocial;
    }
}

class TrabajadorPiezas extends Empleado {
    public TrabajadorPiezas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        // Llama al constructor de la superclase Empleado
        super(primerNombre, apellidoPaterno, numeroSeguroSocial); 
    }

    @Override
    public String toString() {
        // Llama al método toString de la superclase Empleado
        return super.toString(); 
    }
}

public class Main {
    public static void main(String[] args) {
        TrabajadorPiezas trabajador = new TrabajadorPiezas("Anny", "Gutierrez", "123-456-789");
        System.out.println(trabajador.toString());
    }
}
