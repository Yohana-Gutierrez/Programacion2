/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleadoporcomision;

/**
 *
 * @author Anny Yohana
 */
public class PruebaEmpleadoPorComision {
    public static void main(String[] args)
  {
  // crea instancia de objeto EmpleadoPorComision
  EmpleadoPorComision empleado = new EmpleadoPorComision(
          "Sue", "Jones", "222-22-2222", 10000, .06);

 // obtiene datos del empleado por comisión
 System.out.println( "Informacion del empleado obtenida por los metodos establecer:");
 System.out.printf("%n%s %s%n", "El primer nombre es", 
         empleado.obtenerPrimerNombre());
 System.out.printf("%s %s%n", "El apellido paterno es",
         empleado.obtenerApellidoPaterno());
 System.out.printf("%s %s%n", "El numero de seguro social es",
         empleado.obtenerNumeroSeguroSocial());
 System.out.printf("%s %.2f%n", "Las ventas brutas son",
             empleado.obtenerVentasBrutas());
 System.out.printf("%s %.2f%n", "La tarifa de comision es", 
         empleado.obtenerTarifaComision()); 
             empleado.establecerVentasBrutas(500);
             empleado.establecerTarifaComision(.1);
 System.out.printf("%n%s:%n%n%s%n", "Informacion actualizada del empleado, obtenida mediante toString",
         empleado);
 } // fin de main
 }  