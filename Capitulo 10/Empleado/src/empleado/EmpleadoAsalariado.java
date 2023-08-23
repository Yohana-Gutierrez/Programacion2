/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author Anny Yohana
 */
public class EmpleadoAsalariado extends Empleado
  {
    private double salarioSemanal;

    // constructor
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
   String numeroSeguroSocial, double salarioSemanal)
   {
   super(primerNombre, apellidoPaterno, numeroSeguroSocial);

   if (salarioSemanal < 0.0)
   throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");

   this.salarioSemanal = salarioSemanal;
   }

  // establece el salario
   public void establecerSalarioSemanal(double salarioSemanal)
   {
   if (salarioSemanal < 0.0)
   throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");

   this.salarioSemanal = salarioSemanal;
   }

   // devuelve el salario
   public double obtenerSalarioSemanal()
   {
   return salarioSemanal;
   }

   // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
   return obtenerSalarioSemanal();
   }

   // devuelve representación String de un objeto EmpleadoAsalariado
   @Override
   public String toString()
   {
   return String.format("empleado asalariado: %s%n%s: $%,.2f",
   super.toString(), "salario semanal", obtenerSalarioSemanal());
   }
   }

/**
 *
 * @author Anny Yohana
 */

