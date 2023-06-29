/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgcontinue;

/**
 *
 * @author Anny Yohana
 */
public class Continue {

 /*Para evitar el uso de continue en el código debemos modificar el
if, la condición del if debe ser contraria (cuenta!=5) y luego
dentro del if poner la instrucción System.out.printf(“%d”,cuenta).
*/
public static void main(String args[]){
for ( int cuenta = 1; cuenta <= 10; cuenta++ ){
if (cuenta != 5)
System.out.printf("%d ",cuenta);
}
System.out.print("\nNO se uso continue, pero igual se omitio la impresion de 5.");
}
}

