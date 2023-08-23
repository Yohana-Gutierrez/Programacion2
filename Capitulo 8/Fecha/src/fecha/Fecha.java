/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fecha;

/**
 *
 * @author Anny Yohana
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    private static final String[] nombresMeses = {
        "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    private static final String[] nombresDias = {
        "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
    };

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(String nombreMes, int dia, int anio) {
        this.dia = dia;
        this.anio = anio;

        for (int i = 1; i < nombresMeses.length; i++) {
            if (nombreMes.equals(nombresMeses[i])) {
                this.mes = i;
                break;
            }
        }
    }

    public Fecha(int numeroDiaAnio, int anio) {
        this.anio = anio;

        int acumulado = 0;
        int i = 1;

        while (acumulado < numeroDiaAnio && i < nombresMeses.length) {
            acumulado += diasEnMes(i, anio);
            i++;
        }

        this.mes = i - 1;
        this.dia = numeroDiaAnio - (acumulado - diasEnMes(mes, anio));
    }

    private int diasEnMes(int mes, int anio) {
        if (mes == 2) {
            return esBisiesto(anio) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public void imprimirFormato1() {
        System.out.printf("%02d/%02d/%04d%n", mes, dia, anio);
    }

    public void imprimirFormato2() {
        if (mes >= 1 && mes <= 12) {
            System.out.printf("%s %02d, %04d%n", nombresMeses[mes], dia, anio);
        } else {
            System.out.println("Mes inválido");
        }
    }

    public void imprimirFormato3() {
        int numeroDiaAnio = calcularNumeroDiaAnio();
        System.out.printf("%03d %04d%n", numeroDiaAnio, anio);
    }

    private int calcularNumeroDiaAnio() {
        int numeroDiaAnio = dia;

        for (int i = 1; i < mes; i++) {
            numeroDiaAnio += diasEnMes(i, anio);
        }

        return numeroDiaAnio;
    }
}


