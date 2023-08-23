/*
 *(Modificación de la representación de datos interna de una clase) Sería perfectamente razonable para la
clase Tiempo2 de la figura 8.5 representar la hora internamente como el número de segundos transcurridos desde 
medianoche, en vez de usar los tres valores enteros hora, minuto y segundo. Los clientes podrían usar 
los mismos métodos public y obtener los mismos resultados. Modifique la clase Tiempo2 de la figura 8.5 para implementar el tiempo
como el número de segundos transcurridos desde medianoche, y mostrar que no hay cambios visibles para los clientes 
de la clase
 */
package modinterna;

/**
 *
 * @author Anny Yohana
 */
public class ModInterna {
    private int segundosDesdeMedianoche;

    // Constructor de Tiempo sin argumentos:
    // inicializa los segundos desde medianoche a cero
    public ModInterna() {
        this(0, 0, 0); // invoca al constructor de Tiempo con tres argumentos
    }

    public ModInterna(int hora) {
        this(hora, 0, 0); // invoca al constructor con tres argumentos
    }

    public ModInterna(int hora, int minuto) {
        this(hora, minuto, 0); // invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo: se suministran hora, minuto y segundo
    public ModInterna(int hora, int minuto, int segundo) {
        establecerTiempo(hora, minuto, segundo); // valida y establece el tiempo
    }

    // Constructor de Tiempo: se suministra otro objeto Tiempo
    public ModInterna(ModInterna tiempo) {
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }

    // Métodos Establecer
    // establece un nuevo valor de tiempo usando la hora universal;
    // valida los datos
    public void establecerTiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        segundosDesdeMedianoche = hora * 3600 + minuto * 60 + segundo;
    }

    // valida y establece la hora
    public void establecerHora(int hora) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        segundosDesdeMedianoche = hora * 3600 + obtenerMinuto() * 60 + obtenerSegundo();
    }

    // valida y establece el minuto
    public void establecerMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        segundosDesdeMedianoche = obtenerHora() * 3600 + minuto * 60 + obtenerSegundo();
    }

    // valida y establece el segundo
    public void establecerSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        segundosDesdeMedianoche = obtenerHora() * 3600 + obtenerMinuto() * 60 + segundo;
    }

    // Métodos Obtener
    // obtiene el valor de la hora
    public int obtenerHora() {
        return segundosDesdeMedianoche / 3600;
    }

    public int obtenerMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }

    public int obtenerSegundo() {
        return segundosDesdeMedianoche % 60;
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
}
