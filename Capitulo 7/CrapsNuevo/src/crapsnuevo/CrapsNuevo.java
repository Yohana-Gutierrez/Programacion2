/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crapsnuevo;
   import java.util.Random;
/**
 *
 * @author Anny Yohana
 */
public class CrapsNuevo {
    public static void main(String[] args) {
        int numjuegos = 1000000;
        int[] gano = new int[22];  // Para almacenar el número de juegos ganados en el tiro correspondiente
        int[] perdio = new int[22];  // Para almacenar el número de juegos perdidos en el tiro correspondiente
        int[] duracion = new int[numjuegos];  // Para almacenar la duración de cada juego

        Random random = new Random();

        for (int i = 0; i < numjuegos; i++) {
            int Resultjuego = playCraps(random);
            duracion[i] = Resultjuego;

            if (Resultjuego == 1) {
                gano[0]++;
            } else if (Resultjuego > 1 && Resultjuego <= 21) {
                gano[Resultjuego]++;
            } else {
                perdio[-Resultjuego]++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("a) Número de juegos ganados en el primer tiro, segundo tiro, ..., vigésimo tiro y después de éste:");
        for (int i = 0; i <= 20; i++) {
            System.out.println("Tiro " + (i+1) + ": " + gano[i]);
        }
        System.out.println("Después del vigésimo tiro: " + gano[21]);

        System.out.println("\nb) Número de juegos perdidos en el primer tiro, segundo tiro, ..., vigésimo tiro y después de éste:");
        for (int i = 0; i <= 20; i++) {
            System.out.println("Tiro " + (i+1) + ": " + perdio[i]);
        }
        System.out.println("Después del vigésimo tiro: " + perdio[21]);

        double Probabilidadganar = (double) gano[0] / numjuegos;
        System.out.println("\nc) Probabilidades de ganar en Craps:");
        System.out.println("Probabilidad de ganar en el primer tiro: " + Probabilidadganar);
        System.out.println("Probabilidad de perder en el primer tiro: " + (1 - Probabilidadganar));

        double averageGameLength = calculateAverage(duracion);
        System.out.println("\nd) Duración promedio de un juego de Craps: " + averageGameLength);
    }

    private static int playCraps(Random random) {
        int point = rollDice(random);

        if (point == 7 || point == 11) {
            return 1;  // Gana en el primer tiro
        } else if (point == 2 || point == 3 || point == 12) {
            return -1;  // Pierde en el primer tiro
        } else {
            int Resultjuego;
            do {
                int nextRoll = rollDice(random);
                if (nextRoll == point) {
                    Resultjuego = point;  // Gana después del primer tiro
                } else if (nextRoll == 7) {
                    Resultjuego = -point;  // Pierde después del primer tiro
                } else {
                    Resultjuego = 0;  // Continúa el juego
                }
            } while (Resultjuego == 0);
            return Resultjuego;
        }
    }

    private static int rollDice(Random random) {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        return die1 + die2;
    }

    private static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
 
    