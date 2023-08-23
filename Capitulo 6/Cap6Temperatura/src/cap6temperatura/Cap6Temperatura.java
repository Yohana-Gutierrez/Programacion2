/*
 6.22 (Conversiones de temperatura) Implemente los siguientes métodos enteros:
a) El método centigrados que devuelve la equivalencia en grados Centígrados de una temperatura en grados
Fahrenheit, mediante el cálculo
 centigrados = 5.0 / 9.0 * (fahrenheit – 32);
b) El método fahrenheit que devuelve la equivalencia en grados Fahrenheit de una temperatura en grados
Centígrados, con el cálculo
 fahrenheit = 9.0 / 5.0 * centigrados + 32;
 */
package cap6temperatura;
import java.util.Scanner;

/**
 *
 * @author Anny Yohana
 */
public class Cap6Temperatura {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        
        // Entrada
        System.out.println(" ____________________________________________________________");
        System.out.println("|                                                            |");
        System.out.println("|                       BIENVENIDO                           |");
        System.out.println("|                    Hoy es dia Martes                       |");
        System.out.println(" ___________________________________________________________");
        
        
        //Menu
        while (continuar) {
        System.out.println("");
        System.out.println("Seleccione una opción:");
        System.out.println("____________________________________________");
        System.out.println("| 1. Convertir de Fahrenheit a Centígrados |");
        System.out.println("| 2. Convertir de Centígrados a Fahrenheit |");
        System.out.println("| 3.                Salir                  |");
        System.out.println("____________________________________________");
        int opcion = scanner.nextInt();

        //desarrollo
        switch (opcion) {
                case 1:
                    System.out.println("Ingrese la temperatura en grados Fahrenheit:");
                    double fahrenheit = scanner.nextDouble();
                    double centigrados = convertirAFahrenheit(fahrenheit);
                    System.out.println("Equivalente en Centígrados: " + centigrados +  "°C");
                    break;
                case 2:
                    System.out.println("Ingrese la temperatura en grados Centígrados:");
                    double centigradosInput = scanner.nextDouble();
                    double fahrenheitOutput = convertirACentigrados(centigradosInput);
                    System.out.println("Equivalente en Fahrenheit: " + fahrenheitOutput + "°F");
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
        }
         System.out.println(); // Línea en blanco para separar cada conversión
    }
        System.out.println("¡Hasta luego!");
        scanner.close();
    }

    public static double convertirACentigrados(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double convertirAFahrenheit(double centigrados) {
        return 9.0 / 5.0 * centigrados + 32;
    }
    
}
