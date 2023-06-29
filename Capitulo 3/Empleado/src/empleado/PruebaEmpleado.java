/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author Anny Yohana
 */

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("John", "Doe", 3000);
        Empleado empleado2 = new Empleado("Jane", "Smith", 4000);

        System.out.println("Salario anual de empleado 1: " + empleado1.obtenerSalarioAnual());
        System.out.println("Salario anual de empleado 2: " + empleado2.obtenerSalarioAnual());

        empleado1.aplicarAumentoSalario();
        empleado2.aplicarAumentoSalario();

        System.out.println("Salario anual después del aumento de empleado 1: " + empleado1.obtenerSalarioAnual());
        System.out.println("Salario anual después del aumento de empleado 2: " + empleado2.obtenerSalarioAnual());
    }
}

