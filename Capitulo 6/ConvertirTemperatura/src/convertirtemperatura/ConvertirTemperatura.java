/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirtemperatura;
import javax.swing.JOptionPane;

/**
 *
 * @author Anny Yohana
 */
public class ConvertirTemperatura {
    public static void main(String[] args) {
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
