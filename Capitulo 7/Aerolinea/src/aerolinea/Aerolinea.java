/*
 7.19 (Sistema de reservaciones de una aerolínea) Una pequeña aerolínea acaba de comprar una computadora 
para su nuevo sistema de reservaciones automatizado. Se le ha pedido a usted que desarrolle el nuevo sistema. Usted
escribirá una aplicación para asignar asientos en cada vuelo del único avión de la aerolínea (capacidad: 10 asientos).
Su aplicación debe mostrar las siguientes alternativas: Por favor escriba 1 para Primera Clase y Por favor 
escriba 2 para Economico. Si el usuario escribe 1, su aplicación debe asignarle un asiento en la sección de primera 
clase (asientos 1 a 5). Si el usuario escribe 2, su aplicación debe asignarle un asiento en la sección económica (asientos 
6 a 10). Su aplicación deberá entonces imprimir un pase de abordar, indicando el número de asiento de la persona y 
si se encuentra en la sección de primera clase o clase económica.
Use un arreglo unidimensional del tipo primitivo boolean para representar la tabla de asientos del avión. 
Inicialice todos los elementos del arreglo con false para indicar que todos los asientos están vacíos. A medida que se 
asigne cada asiento, establezca el elemento correspondiente del arreglo en true para indicar que ese asiento ya no está 
disponible.
Su aplicación nunca deberá asignar un asiento que ya haya sido asignado. Cuando esté llena la sección económica,
su programa deberá preguntar a la persona si acepta ser colocada en la sección de primera clase (y viceversa). Si 
la persona acepta, haga la asignación de asiento apropiada. Si no, imprima el mensaje “El proximo vuelo sale en 3 
horas”
 */
package aerolinea;
   import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class Aerolinea {
                 
    private static boolean[] asientos = new boolean[10];
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
       mostrarBienvenida();
        int opcion;

        while (true) {
            mostrarMenu();
            opcion = scanner.nextInt();

            if (opcion == 1) {
                asignarAsientoPrimeraClase();
            } else if (opcion == 2) {
                asignarAsientoEconomico();
            } else {
                System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        }
    }
    private static void mostrarBienvenida() {
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|                                                 |");  
        System.out.println("|                                                 |");
        System.out.println("|       BIENVENIDO A AEROLINEAS SAFE-TRAVEL       |");
        System.out.println("|            EL Placer de Viajar bien!            |");
        System.out.println("|                                                 |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static void mostrarMenu() {
        System.out.println("");
        System.out.println("      *************************************");
        System.out.println("       DE LAS OPCIONES SIGUIENTES ELIJA UNA");
        System.out.println("       Por favor escriba 1 para Primera Clase");
        System.out.println("       Por favor escriba 2 para Económico");
        System.out.println("      *************************************");
    }

    private static void asignarAsientoPrimeraClase() {
        for (int i = 0; i < 5; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                imprimirPaseAbordar(i + 1, "Primera Clase");
                return;
            }
        }

        System.out.println("La sección de Primera Clase está llena.");
        System.out.println("¿Aceptar asiento en la sección Económica? (Sí = 1 / No = 2)");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            asignarAsientoEconomico();
        } else {
            System.out.println("El próximo vuelo sale en 3 horas.");
        }
    }

    private static void asignarAsientoEconomico() {
        for (int i = 5; i < 10; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                imprimirPaseAbordar(i + 1, "Económico");
                return;
            }
        }

        System.out.println("La sección Económica está llena.");
        System.out.println("¿Aceptar asiento en la sección de Primera Clase? (Sí = 1 / No = 2)");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            asignarAsientoPrimeraClase();
        } else {
            System.out.println("El próximo vuelo sale en 3 horas.");
        }
    }

    private static void imprimirPaseAbordar(int numeroAsiento, String seccion) {
        System.out.println("¡Felicitaciones! Ha sido asignado al asiento número " + numeroAsiento + " en la sección de " + seccion + ".");
        System.out.println("=== PASE DE ABORDAR ===");
        System.out.println("Asiento: " + numeroAsiento);
        System.out.println("Sección: " + seccion);
        System.out.println("=======================");
        System.out.println("*************************************");
        System.out.println("QUE DISFRUTES TU VIAJE");
    }
}

