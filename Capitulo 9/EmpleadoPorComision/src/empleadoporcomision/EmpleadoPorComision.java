/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleadoporcomision;

/**
 *
 * @author Anny Yohana
 */

public class EmpleadoPorComision extends Object
 {
        private final String primerNombre;
        private final String apellidoPaterno;
        private final String numeroSeguroSocial;
        private double ventasBrutas; // ventas totales por semana
       private double tarifaComision; // porcentaje de comisión

       // constructor con cinco argumentos
       public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
       String numeroSeguroSocial, double ventasBrutas,
       double tarifaComision)
       {
       // la llamada implícita al constructor predeterminado de Object ocurre aquí

       // si ventasBrutas no es válida, lanza excepción
       if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

       // si tarifaComision no es válida, lanza excepción
       if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");

       this.primerNombre = primerNombre;
       this.apellidoPaterno = apellidoPaterno;
       this.numeroSeguroSocial = numeroSeguroSocial;
       this.ventasBrutas = ventasBrutas;
       this.tarifaComision = tarifaComision;
       } // fin del constructor

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
      
      public String obtenerNumeroSeguroSocial()
       {
          return numeroSeguroSocial;
       } // fin del método obtenerNumeroSeguroSocial

       // establece el monto de ventas brutas
       public void establecerVentasBrutas(double ventasBrutas)
       {
       if (ventasBrutas >= 0.0)
          throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

       this.ventasBrutas = ventasBrutas;
       }

       // devuelve el monto de ventas brutas
       public double obtenerVentasBrutas()
       { 
       return ventasBrutas;
       }

      // establece la tarifa de comisión
       public void establecerTarifaComision(double tarifaComision)
       {
       if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
           throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");

       this.tarifaComision = tarifaComision;
       }

       // devuelve la tarifa de comisión
       public double obtenerTarifaComision()
       {
       return tarifaComision;
       }

       // calcula los ingresos
       public double ingresos()
       {
          return tarifaComision * ventasBrutas;
       }

       // devuelve representación String del objeto EmpleadoPorComision
       @Override // indica que este método sobrescribe el método de una superclase
       public String toString()
       {
          return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","empleado por comision", primerNombre, apellidoPaterno, 
                  "numero de seguro social", numeroSeguroSocial,
                  "ventas brutas", ventasBrutas,  
                  "tarifa de comision", tarifaComision);
    }
 }