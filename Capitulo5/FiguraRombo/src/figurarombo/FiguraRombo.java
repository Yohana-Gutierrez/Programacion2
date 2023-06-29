/*
(Programa para imprimir rombos) Escriba una aplicación que imprima la siguiente figura de rombo. 
Puede utilizar instrucciones de salida que impriman un solo asterisco (*), un solo espacio o un solo carácter de nueva línea.
Maximice el uso de la repetición (con instrucciones for anidadas), y minimice el número de instrucciones de salida. 
 */
package figurarombo;

public class FiguraRombo {
    public static void main(String[] args) {
        int n = 5; // Tamaño del rombo
        
        // Imprimir la mitad superior del rombo
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // Nueva línea
        }
        
        // Imprimir la mitad inferior del rombo
        for (int i = n - 1; i >= 1; i--) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // Nueva línea
        }
    }
}

