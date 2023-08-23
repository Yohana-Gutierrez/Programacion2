/*
 8.6 (Clase cuenta de ahorros) Cree una clase llamada CuentaDeAhorros. Use una variable static llamada
tasaInteresAnual para almacenar la tasa de interés anual para todos los cuentahabientes. Cada objeto de la clase debe 
contener una variable de instancia private llamada saldoAhorros, que indique la cantidad que el ahorrador tiene 
actualmente en depósito. Proporcione el método calcularInteresMensual para calcular el interés mensual,
multiplicando el saldoAhorros por la tasaInteresAnual dividida entre 12; este interés debe sumarse al saldoAhorros. 
Proporcione un método static llamado modificarTasaInteres para establecer la tasaInteresAnual en un nuevo valor.
Escriba un programa para probar la clase CuentaDeAhorros. Cree dos instancias de objetos CuentaDeAhorros, ahorrador1
y ahorrador2, con saldos de $2000.00 y $3000.00 respectivamente. Establezca la tasaInteresAnual en 4%, después
calcule el interés mensual para cada uno de los 12 meses e imprima los nuevos saldos para ambos ahorradores. Luego
establezca la tasaInteresAnual en 5%, calcule el interés del siguiente mes e imprima los nuevos saldos para ambos 
ahorradores
 */
package cuentadeahorros;

/**
 *
 * @author Anny Yohana
 */
public class CuentaDeAhorros {

    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoInicial) {
        saldoAhorros = saldoInicial;
    }

    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public static double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
}

