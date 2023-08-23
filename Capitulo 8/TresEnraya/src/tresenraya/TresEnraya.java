/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresenraya;
 import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class TresEnraya {

    private enum Celda {
        X, O, VACIO
    }

    private Celda[][] tablero;

    public TresEnraya() {
        tablero = new Celda[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = Celda.VACIO;
            }
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        boolean turnoX = true;
        boolean hayGanador = false;

        while (!hayGanador && !tableroLleno()) {
            imprimirTablero();

            if (turnoX) {
                System.out.print("Jugador X, ingrese la fila (0-2): ");
            } else {
                System.out.print("Jugador O, ingrese la fila (0-2): ");
            }
            fila = scanner.nextInt();

            System.out.print("Ingrese la columna (0-2): ");
            columna = scanner.nextInt();

            if (esMovimientoValido(fila, columna)) {
                if (turnoX) {
                    tablero[fila][columna] = Celda.X;
                } else {
                    tablero[fila][columna] = Celda.O;
                }
                hayGanador = hayGanador();
                turnoX = !turnoX;
            } else {
                System.out.println("Movimiento inválido. Intente nuevamente.");
            }
        }

        imprimirTablero();

        if (hayGanador) {
            if (turnoX) {
                System.out.println("¡Jugador O gana!");
            } else {
                System.out.println("¡Jugador X gana!");
            }
        } else {
            System.out.println("¡Empate!");
        }
    }

    private boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == Celda.VACIO;
    }

    private boolean hayGanador() {
        // Comprobar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != Celda.VACIO && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] != Celda.VACIO && tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j]) {
                return true;
            }
        }

        // Comprobar diagonales
        if (tablero[0][0] != Celda.VACIO && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }
        if (tablero[0][2] != Celda.VACIO && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return true;
        }

        return false;
    }

    private boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == Celda.VACIO) {
                    return false;
                }
            }
        }
        return true;
    }

    private void imprimirTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TresEnraya juego = new TresEnraya();
        juego.jugar();
    }
}
