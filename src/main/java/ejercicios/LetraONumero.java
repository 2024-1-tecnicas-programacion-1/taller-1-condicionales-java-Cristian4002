package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {

    public static String evaluar(char caracter) {
        if (Character.isLetter(caracter)) {
            if (Character.isUpperCase(caracter)) {
                return "El caracter ingresado es una letra mayúscula.";
            } else {
                return "El caracter ingresado es una letra minúscula.";
            }
        } else if (Character.isDigit(caracter)) {
            return "El caracter ingresado es un número.";
        } else {
            return "El caracter ingresado no es ni letra ni número.";
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);

        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
