/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diametroradio;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class DiametroRadio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del círculo: ");
        int radio = input.nextInt();
        
        // Cálculos
        double diametro = 2 * radio;
        double circunferencia = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        
        // Impresión de resultados
        System.out.printf("Diámetro: %.2f%n", diametro);
        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Área: %.2f%n", area);
        
        input.close();
    }
}
