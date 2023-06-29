/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg33;

/**
 *
 * @author Anny Yohana
 */
public class Main {
    public static void main (String[] args) {
    int multiplo=1;
    for(;;){
    multiplo=multiplo*2;
    System.out.println(multiplo);
    if(multiplo>50000)//Uso esta condición para evitar que el programa se cuelgue
    break;
    }
    }
    /*¿Qué ocurre cuando ejecuta este programa?
     * El ciclo no termina y el espacio de memoria se va consumiendo
     * lo que ocasiona que el programa se detenga o mejor dicho se
    cuelgue
     * trae consigo problemas de rendimiento
     */
    }
    
