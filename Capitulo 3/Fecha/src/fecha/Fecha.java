/*
3.14 (La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un
día (tipo int) y un año (tipo int). Su clase debe tener un constructor que inicialice las tres variables de instancia, y
debe asumir que los valores que se proporcionan son correctos. Proporcione un método establecer y un método obtener 
para cada variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año, separados
por barras diagonales (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de
la clase Fecha.
 */
package Fecha;

public class Fecha {
    private int mes;
    private int dia;
    private int year;

    public Fecha(int mes, int dia, int year) {
        this.mes = mes;
        this.dia = dia;
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + year);
    }
}


