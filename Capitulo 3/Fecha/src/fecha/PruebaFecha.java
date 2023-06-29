/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fecha;

/**
 *
 * @author Anny Yohana
 */
public class PruebaFecha {
    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("Bienvenido Nuestra fecha de hoy es: ");
        System.out.println("************************************");
        
        Fecha fecha = new Fecha(6, 7, 2023);
        fecha.mostrarFecha();
        
        fecha.setMes(12);
        fecha.setDia(25);
        fecha.setYear(2024); 
        fecha.mostrarFecha();
        
        System.out.println("************************************");
        System.out.println("Que tengas un lindo dia");
        System.out.println("************************************");
    }
}
    

