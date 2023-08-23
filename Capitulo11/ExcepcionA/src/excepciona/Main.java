/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciona;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean excepcionCRealizada = false;
        
        do {
            try {
                System.out.print("Introduce un número entero: ");
                int dato = scanner.nextInt();
                
                if (dato < 0) {
                    throw new ExcepcionA("El número no puede ser negativo.");
                } else if (dato == 0) {
                    throw new ExcepcionB("El número no puede ser cero.");
                } else {
                    throw new ExcepcionC("El número es positivo.");
                }
            } catch (ExcepcionC e) {
                excepcionCRealizada = true;
                System.out.println("ExcepcionC atrapada: " + e.getMessage());
            } catch (ExcepcionB e) {
                System.out.println("ExcepcionB atrapada: " + e.getMessage());
            } catch (ExcepcionA e) {
                System.out.println("ExcepcionA atrapada: " + e.getMessage());
            } catch (Exception e) {
                // Este bloque captura cualquier otra excepción no específica
                System.out.println("Otra excepción atrapada: " + e.getMessage());
            } finally {
                scanner.nextLine(); // Limpiamos el buffer del scanner
            }
        } while (!excepcionCRealizada);
        
        scanner.close();
    }
}




