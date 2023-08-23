/*
 *(Mejora a la clase Tiempo2) Modifique la clase Tiempo2 de la figura 8.5 para incluir un método tictac,
que aumente el tiempo almacenado en un objeto Tiempo2 en un segundo. Proporcione el método incrementarMinuto
para incrementar en uno el minuto, y el método incrementarHora para adelantar en uno la hora.
Escriba un programa para probar los métodos tictac, incrementarMinuto e incrementarHora, para asegurarse de que funcionen
de manera correcta. Asegúrese de probar los siguientes casos:
a) incrementar el minuto, de manera que cambie al siguiente minuto.
b) aumentar la hora, de manera que cambie a la siguiente hora, y
c) adelantar el tiempo de manera que cambie al siguiente día (por ejemplo, de 11:59:59 PM a 12:00:00 AM).
 */
package tiempo2;

/**
 *
 * @author Anny Yohana
 */
public class Tiempo2 {
    private int hora; // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    // Constructor de Tiempo sin argumentos:
    // inicializa cada variable de instancia a cero
    public Tiempo2() {
        this(0, 0, 0); // invoca al constructor de Tiempo con tres argumentos
    }

    public Tiempo2(int hora) {
        this(hora, 0, 0); // invoca al constructor con tres argumentos
    }

    public Tiempo2(int hora, int minuto) {
        this(hora, minuto, 0); // invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo: se suministran hora, minuto y segundo
    public Tiempo2(int hora, int minuto, int segundo) {
        establecerTiempo(hora, minuto, segundo);
    }

    // Constructor de Tiempo: se suministra otro objeto Tiempo
    public Tiempo2(Tiempo2 tiempo) {
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }

    // Métodos Establecer
    // establece un nuevo valor de tiempo usando la hora universal;
    // valida los datos
    public void establecerTiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("Segundo debe estar entre 0 y 59");

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // valida y establece la hora
    public void establecerHora(int hora) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora debe estar entre 0 y 23");
        this.hora = hora;
    }

    // valida y establece el minuto
    public void establecerMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");

        this.minuto = minuto;
    }

    // valida y establece el segundo
    public void establecerSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("Segundo debe estar entre 0 y 59");

        this.segundo = segundo;
    }

    // Métodos Obtener
    // obtiene el valor de la hora
    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    // convierte a String en formato de hora estándar (H:MM:SS AM o PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12),
                obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
    }

    // Método tictac: aumenta el tiempo almacenado en un segundo
    public void tictac() {
        incrementarSegundo();
    }

    // Método incrementarMinuto: incrementa en uno el minuto
    public void incrementarMinuto() {
        minuto++;
        if (minuto >= 60) {
            minuto = 0;
            incrementarHora();
        }
    }

    // Método incrementarHora: adelanta en uno la hora
    public void incrementarHora() {
        hora++;
        if (hora >= 24) {
            hora = 0;
        }
    }

    // Método privado para incrementar el segundo
    private void incrementarSegundo() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            incrementarMinuto();
        }
    }
}
