/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modinterna;

/**
 *
 * @author Anny Yohana
 */
public class ModInternaPrueba {
    public static void main(String[] args) {
        ModInterna t1 = new ModInterna(); // 00:00:00
        ModInterna t2 = new ModInterna(2); // 02:00:00
        ModInterna t3 = new ModInterna(21, 34); // 21:34:00
        ModInterna t4 = new ModInterna(12, 25, 42); // 12:25:42
        ModInterna t5 = new ModInterna(t4); // 12:25:42

        System.out.println("Se construyó con:");
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2: se especificó hora; minuto y segundo predeterminados", t2);
        mostrarTiempo("t3: se especificaron hora y minuto; segundo predeterminado", t3);
        mostrarTiempo("t4: se especificaron hora, minuto y segundo", t4);
        mostrarTiempo("t5: se especificó el objeto Tiempo llamado t4", t5);

        // intento de inicializar t6 con valores inválidos
        try {
            ModInterna t6 = new ModInterna(27, 74, 99); // valores inválidos
        } catch (IllegalArgumentException e) {
            System.out.printf("%nExcepción al inicializar t6: %s%n", e.getMessage());
        }
    }

    // muestra un objeto Tiempo en formatos de 24 y 12 horas
    private static void mostrarTiempo(String encabezado, ModInterna t) {
        System.out.printf("%s%n %s%n %s%n", encabezado, t.aStringUniversal(), t.toString());
    }
}


