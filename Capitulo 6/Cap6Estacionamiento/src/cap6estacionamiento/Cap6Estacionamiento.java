/*
 6.8 (Cargos por estacionamiento) Un estacionamiento cobra una cuota mínima de $2.00 por estacionarse hasta tres horas.
El estacionamiento cobra $0.50 adicionales por cada hora o fracción que se pase de tres horas.
El cargo máximo para cualquier periodo dado de 24 horas es de $10.00. Suponga que ningún auto se estaciona durante más
de 24 horas seguidas. Escriba una aplicación que calcule y muestre los cargos por estacionamiento para cada cliente
que se haya estacionado ayer. Debe introducir las horas de estacionamiento para cada cliente.
El programa debe mostrar el cargo para el cliente actual así como calcular y mostrar el total corriente de los recibos de ayer. 
El programa debe utilizar el método calcularCargos para determinar el cargo para cada cliente.
 */
package cap6estacionamiento;

import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class Cap6Estacionamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRecibos = 0.0;
        
        //Presentacion 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println("*           Estacionamiento Gutierrez                    * ");
        System.out.println("*                                                        * ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        
        
        //Ingreso Datos
        System.out.print("Ingrese el número de clientes estacionados ayer: ");
        int numClientes = scanner.nextInt();
        
        for (int i = 1; i <= numClientes; i++) {
            System.out.print("Ingrese las horas de estacionamiento para el cliente " + i + ": ");
            int horasEstacionamiento = scanner.nextInt();
            
            double cargo = calcularCargos(horasEstacionamiento);
            totalRecibos += cargo;
            
            System.out.println("Cargo para el cliente " + i + ": $" + cargo);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println("Total de recibos de ayer: $" + totalRecibos);
    }
    
    public static double calcularCargos(int horasEstacionamiento) {
        double cargoMinimo = 2.00;
        double cargoExtraPorHora = 0.50;
        double cargoMaximo = 10.00;
        
        if (horasEstacionamiento <= 3) {
            return cargoMinimo;
        } else if (horasEstacionamiento <= 24) {
            double horasExtra = horasEstacionamiento - 3;
            double cargoExtra = horasExtra * cargoExtraPorHora;
            
            return Math.min(cargoMinimo + cargoExtra, cargoMaximo);
        } else {
            return cargoMaximo;
        }
    }
}
