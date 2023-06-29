/*
(Uso de la instrucción for mejorada) Escriba una aplicación que utilice una instrucción for mejorada para
sumar los valores double que se pasan mediante los argumentos de línea de comandos. [Sugerencia: use el método
static parseDouble de la clase Double para convertir un String en un valor double].    

 */
package formejorada;

/**
 *
 * @author Anny Yohana
 */
public class ForMejorada {
    public static void main(String[] args) {
        // Verificar si se pasaron argumentos de línea de comandos
        if (args.length == 0) {
            System.out.println("No se proporcionaron argumentos.");
            return;
        }

        double suma = 0.0;

        // Utilizar una instrucción for mejorada para sumar los valores double
        for (String arg : args) {
            try {
                double valor = Double.parseDouble(arg);
                suma += valor;
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el argumento '" + arg + "' a double.");
            }
        }

        System.out.println("La suma de los valores es: " + suma);
    }
}
