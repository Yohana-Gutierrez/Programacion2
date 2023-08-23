/*
 6.20 (Área de un círculo) Escriba una aplicación que pida al usuario el radio de un círculo y que utilice un método
llamado circuloArea para calcular e imprimir el área.
 */
package cap6ejemplo2;
 import javax.swing.JOptionPane;

/**
 *
 * @author Anny Yohana
 */
public class Cap6ejemplo2 {
      public static void main(String[] args) {
        
          //Entrada
           JOptionPane.showMessageDialog(null, "BIENVENIDO AL CALCULO DE UN  CIRCULO: " );
          
        // Solicitar al usuario el radio del círculo
        String radioStr = JOptionPane.showInputDialog("Ingrese el radio del círculo:");
        double radio = Double.parseDouble(radioStr);

        // Calcular el área del círculo utilizando el método circuloArea
        double area = circuloArea(radio);

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
    }

    public static double circuloArea(double radio) {
        // Calcular el área utilizando la fórmula: área = π * radio^2
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}


