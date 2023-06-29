/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimirrombos;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
    public class ImprimirRombos {
    public static void main (String[] args) {
    Scanner entrada=new Scanner(System.in);
    int numero;
        System.out.println("\n-----------Creación de Rombos-----------");
        System.out.println("Recuerde que las filas de un rombo son impares");
        System.out.println("Ademas, debe ser un numero entre 1 y 19, exluyendo el 1");
        System.out.println("Considero que no exite un rombo de una fila");
    do{
        System.out.print("\nIngrese el Nro filas que tendra el rombo: ");
        numero=entrada.nextInt();
        if((numero<1 || numero>19) || (numero%2==0)){
        System.out.println("\nEl numero ingresado esta fuera del rango <1,19] o es par.");
        System.out.println("Intente de nuevo.");
    }
    else{
            int centro=numero/2 + 1;
            for (int fila=1; fila<=numero; fila++) {
            for (int columna = 1; columna<=numero;
            columna++) {
            if (fila <= centro) {
            if (((centro - fila) < columna)&&
            (columna < (centro + fila)))
            System.out.print("*");
            else
            System.out.print(" ");
            }
            else {
            if (((fila - centro) < columna)&&
            (columna < (centro * 2 - (fila - centro))))
            System.out.print("*");
            else
            System.out.print(" ");
    }
    }
        System.out.println();
        }
    }
        }while((numero<1 || numero>19) || (numero%2==0));
        }
    }
