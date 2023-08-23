/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabigdecimal;
   import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Anny Yohana
 */
public class CuentaBigDecimalPrueba {
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario ingresar el nombre de la cuenta
    System.out.print("Ingrese el nombre de la cuenta: ");
    String nombreCuenta = scanner.nextLine();

    // Crear una instancia de CuentaBigDecimal
    CuentaBigDecimal cuenta = new CuentaBigDecimal(nombreCuenta);

    // Obtener el nombre de la cuenta
    System.out.println("Nombre de la cuenta: " + cuenta.obtenerNombre());

    // Obtener el saldo inicial
    System.out.println("Saldo inicial: " + cuenta.obtenerSaldo());

    // Solicitar al usuario ingresar el monto del depósito
    System.out.print("Ingrese el monto del depósito: ");
    BigDecimal montoDeposito = scanner.nextBigDecimal();
    cuenta.depositar(montoDeposito);

    // Solicitar al usuario ingresar el monto del retiro
    System.out.print("Ingrese el monto del retiro: ");
    BigDecimal montoRetiro = scanner.nextBigDecimal();
    cuenta.retirar(montoRetiro);

    // Obtener el saldo después de las transacciones
    System.out.println("Saldo actual: " + cuenta.obtenerSaldo());

    scanner.close();
  }
}
}


