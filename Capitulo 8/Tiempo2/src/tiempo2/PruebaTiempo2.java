/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiempo2;

/**
 *
 * @author Anny Yohana
 */
public class PruebaTiempo2 {
    public static void main(String[] args) {
        Tiempo2 t = new Tiempo2(23, 59, 59);
        System.out.println("Tiempo inicial: " + t.toString());

        t.tictac();
        System.out.println("Después de tictac: " + t.toString());

        t.incrementarMinuto();
        System.out.println("Después de incrementarMinuto: " + t.toString());

        t.incrementarHora();
        System.out.println("Después de incrementarHora: " + t.toString());
    }
}
