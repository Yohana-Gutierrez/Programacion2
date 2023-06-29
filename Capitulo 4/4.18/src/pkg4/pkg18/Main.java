/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg18;
     import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cuenta;
        int saldoInicio;
        int totalArticulos;
        int totalCreditos;
        int limiteCredito;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de cuenta: ");
        cuenta=entrada.nextInt();
        
        System.out.print("Ingrese el saldo al inicio del mes: ");
        saldoInicio=entrada.nextInt();

        System.out.print("Ingrese el total de todos los articulos: ");
        totalArticulos=entrada.nextInt();

        System.out.print("Ingrese el total de creditos: ");
        totalCreditos=entrada.nextInt();

        System.out.print("Ingrese el límite de crédito: ");
        limiteCredito=entrada.nextInt();

        calcularSaldo(saldoInicio,totalArticulos,totalCreditos,limiteCredito);
    }

    public static void calcularSaldo(int saldoInicio,int totalArticulos,
    int totalCreditos,int limiteCredito) {
        int saldoFinal = saldoInicio + totalArticulos - totalCreditos;
        System.out.println("Su nuevo saldo es: " + saldoFinal);
        if (saldoFinal > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito");
        }
    }
}