/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author Anny Yohana
 */
public class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aplicarAumentoSalario() {
        salarioMensual *= 1.1;
    }
}

