/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fecha;

/**
 *
 * @author Anny Yohana
 */
public class FechaPrueba {
    public static void main(String[] args) {
       Fecha fecha1 = new Fecha(14, 6, 1992);
        fecha1.imprimirFormato1(); // Salida: 14/06/1992
        fecha1.imprimirFormato2(); // Salida: Junio 14, 1992
        fecha1.imprimirFormato3(); // Salida: 166 1992

        Fecha fecha2 = new Fecha("Junio", 2, 1992);
        fecha2.imprimirFormato1(); // Salida: 06/02/1992
        fecha2.imprimirFormato2(); // Salida: Junio 02, 1992
        fecha2.imprimirFormato3(); // Salida: 154 1992

        Fecha fecha3 = new Fecha(166, 1992);
        fecha3.imprimirFormato1(); // Salida: 06/14/1992
        fecha3.imprimirFormato2(); // Salida: Junio 14, 1992
        fecha3.imprimirFormato3(); // Salida: 166 1992
    }
}