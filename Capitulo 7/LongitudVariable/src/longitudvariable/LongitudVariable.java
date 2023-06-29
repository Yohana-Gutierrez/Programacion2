/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package longitudvariable;

/**
 *
 * @author Anny Yohana
 */
public class LongitudVariable {
    public static int producto(int... numeros) {
        int resultado = 1;

        for (int numero : numeros) {
            resultado *= numero;
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de llamadas al método producto con diferentes números de argumentos
        int resultado1 = producto(2, 4, 6);
        System.out.println("Resultado 1: " + resultado1);

        int resultado2 = producto(1, 3, 5, 7, 9);
        System.out.println("Resultado 2: " + resultado2);

        int resultado3 = producto(2, 2, 2, 2, 2, 2);
        System.out.println("Resultado 3: " + resultado3);
        
        int resultado4 = producto(5);
        System.out.println("Resultado 4: " + resultado4);
        
        int resultado5 = producto(4, 10, 2, 3);
        System.out.println("Resultado 5: " + resultado5);
    }
}

 private String nombre;// variable de instancia
 
  // el constructor inicializa nombre con el parámetro nombre
  public Cuenta(String nombre)// el nombre del constructor es el nombre de la clase
 {
 this.nombre = nombre;
 }

 // método para establecer el nombre
 public void establecerNombre(String nombre)
 {
 this.nombre = nombre;
 }

 // métodos para recuperar el nombre
 public String obtenerNombre()
 {
 return nombre;
 }
 }