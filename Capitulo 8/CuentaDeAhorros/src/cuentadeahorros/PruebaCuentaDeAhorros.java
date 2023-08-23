/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentadeahorros;

/**
 *
 * @author Anny Yohana
 */
    public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(0.04); // Establecer la tasa de interés al 4%

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        System.out.println("Saldo inicial de ahorrador1: $" + ahorrador1.getSaldoAhorros());
        System.out.println("Saldo inicial de ahorrador2: $" + ahorrador2.getSaldoAhorros());

        for (int mes = 1; mes <= 12; mes++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();

            System.out.println("Saldo después del mes " + mes + " para ahorrador1: $" + ahorrador1.getSaldoAhorros());
            System.out.println("Saldo después del mes " + mes + " para ahorrador2: $" + ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(0.05); // Establecer la tasa de interés al 5%

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Saldo después del mes 13 para ahorrador1: $" + ahorrador1.getSaldoAhorros());
        System.out.println("Saldo después del mes 13 para ahorrador2: $" + ahorrador2.getSaldoAhorros());
    }
}


