/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordencatch;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */


public class OrdenCatch {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese 'A' para lanzar ExcepcionA o 'B' para lanzar ExcepcionB: ");
            String opcion = scanner.next();

            if (opcion.equalsIgnoreCase("A")) {
                throw new ExcepcionA("Esto es ExcepcionA");
            } else if (opcion.equalsIgnoreCase("B")) {
                throw new ExcepcionB("Esto es ExcepcionB");
            } else {
                System.out.println("Opción no válida.");
            }
            
        } catch (ExcepcionA e) {
            System.out.println("Atrapada ExcepcionA: " + e.getMessage());
        } catch (ExcepcionB e) {
            System.out.println("Atrapada ExcepcionB: " + e.getMessage());
        
        }

        scanner.close();
    }
}

class ExcepcionA extends Exception {
    public ExcepcionA(String message) {
        super(message);
    }
}

class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String message) {
        super(message);
    }
}
