/*
6.26 (Invertir dígitos) Escriba un método que tome un valor entero y devuelva el número con sus dígitos invertidos.
Por ejemplo, para el número 7631, el método debe regresar 1367. Incorpore el método en una aplicación que
reciba como entrada un valor del usuario y muestre el resultado
 */
package cap6inverso;
import java.util.Scanner;

/**
 *
 * @author Anny Yohana
 */
public class Cap6Inverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int numeroInvertido = invertirDigitos(numero);

        System.out.println("El número con sus dígitos invertidos es: " + numeroInvertido);
    }

    public static int invertirDigitos(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroInvertido;
    }
}
