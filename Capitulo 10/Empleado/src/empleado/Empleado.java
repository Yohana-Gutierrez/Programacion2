/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author Anny Yohana
 */
public abstract class Empleado 
    {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
  
 // constructor
    public Empleado(String primerNombre, String apellidoPaterno,  String numeroSeguroSocial)
        {
            this.primerNombre = primerNombre;
            this.apellidoPaterno = apellidoPaterno;
            this.numeroSeguroSocial = numeroSeguroSocial;
        } 
    // devuelve el primer nombre
     public String obtenerPrimerNombre()
     {
     return primerNombre;
     }


 // devuelve el apellido paterno
     public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
     } 

 // devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
   }

 // devuelve representación String de un objeto Empleado
 @Override
        public String toString()
        {
        return String.format("%s %s%nnumero de seguro social: %s",  obtenerPrimerNombre(), obtenerApellidoPaterno(),obtenerNumeroSeguroSocial());
        }

 // método abstracto sobrescrito por las subclases concretas
    public abstract double ingresos(); // aquí no hay implementación
 } 


/**
 *
 * @author Anny Yohana
 */


