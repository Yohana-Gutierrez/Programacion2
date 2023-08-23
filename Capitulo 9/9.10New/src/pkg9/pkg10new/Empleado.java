/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg10new;

/**
 *
 * @author Anny Yohana
 */
public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    public String getPrimerNombre() {
        return primerNombre;
    }
    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    
    public String toString() {
        return "Nombre: " + primerNombre + " " + apellidoPaterno +
               ", Seguro Social: " + numeroSeguroSocial;
    }
}
