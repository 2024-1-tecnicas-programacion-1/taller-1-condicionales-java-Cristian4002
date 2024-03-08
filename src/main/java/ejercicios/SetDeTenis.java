package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
        // Problema 1: No pueden ser menores que 0
        if (numVictoriasA < 0 || numVictoriasB < 0) {
            return "Datos incorrectos";
        }

        // Problema 2: No pueden ser mayores que 7
        if (numVictoriasA > 7 || numVictoriasB > 7) {
            return "Datos incorrectos";
        }

        // Problema 3: No pueden ambos ser iguales a 7
        if (numVictoriasA == 7 && numVictoriasB == 7) {
            return "Datos incorrectos";
        }

        // Problema 4: si el resultado es 6-7 o 7-6
        if ((numVictoriasA == 7 && numVictoriasB == 6) || (numVictoriasA == 6 && numVictoriasB == 7)) {
            if (numVictoriasA == 7) {
                return "Gana el jugador A";
            } else {
                return "Gana el jugador B";
            }
        }

        // Problema 5: No pueden ser igual a 7 y tener una diferencia mayor a 2 con el otro
        if ((numVictoriasA == 7 && numVictoriasB > 5) || (numVictoriasB == 7 && numVictoriasA > 5)) {
            return "Datos incorrectos";
        }

        // Problema 6: Si uno es igual a 7, el otro debe ser 5 o 6
        if (numVictoriasA == 7 && !(numVictoriasB == 5 || numVictoriasB == 6)
                || numVictoriasB == 7 && !(numVictoriasA == 5 || numVictoriasA == 6)) {
            return "Datos incorrectos";
        }

        // Problema 7: Si ambos son iguales, el partido no ha terminado
        if (numVictoriasA == numVictoriasB) {
            return "Aún no termina";
        }

        // Problema 8: Si el resultado es 5 - 7 o 7 - 5
        if ((numVictoriasA == 7 && numVictoriasB == 5) || (numVictoriasA == 5 && numVictoriasB == 7)) {
            if (numVictoriasA == 7) {
                return "Gana el jugador A";
            } else {
                return "Gana el jugador B";
            }
        }
        // Problema 9: Si alguno llega a 6 con una diferencia de dos puntos
        if (numVictoriasA == 6 || numVictoriasB == 6) {
            if (Math.abs(numVictoriasA - numVictoriasB) >= 2) {
                if (numVictoriasA == 6) {
                    return "Gana el jugador A";
                } else {
                    return "Gana el jugador B";
                }
            }
        }

        // Si ninguno de los problemas anteriores se ha encontrado, el juego está en progreso
        return "Aún no termina";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
