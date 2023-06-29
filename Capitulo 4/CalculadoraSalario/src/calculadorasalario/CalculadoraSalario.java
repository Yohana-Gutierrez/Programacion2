/*
 (Calculadora del salario) Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno de
tres empleados. La empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de la empresa, el
número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada empleado. Su programa debe recibir
como entrada esta información para cada empleado, para luego determinar y mostrar el sueldo bruto de cada trabajador.
Utilice la clase Scanner para introducir los datos.
 */

package calculadorasalario;
import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Empleado " + i);
            System.out.print("Ingrese el numero de horas que trabajo: ");
            int horasTrabajadas = scanner.nextInt();

            System.out.print("Ingrese la tarifa de hora: ");
            double tarifaPorHora = scanner.nextDouble();

            double salarioBruto = calcularSalarioBruto(horasTrabajadas, tarifaPorHora);
            System.out.println("El salario bruto del empleado " + i + " es: " + salarioBruto);
            System.out.println();
        }

        scanner.close();
    }

    public static double calcularSalarioBruto(int horasTrabajadas, double tarifaPorHora) {
        double salarioBruto;

        if (horasTrabajadas <= 40) {
            salarioBruto = horasTrabajadas * tarifaPorHora;
        } else {
            double horasNormales = 40 * tarifaPorHora;
            double horasExtra = (horasTrabajadas - 40) * (tarifaPorHora * 1.5);
            salarioBruto = horasNormales + horasExtra;
        }

        return salarioBruto;
    }
}


   
