package test;

import ejercicios.LetraONumero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class LetraONumeroTest {
    @Test
    public void testEsNumero() {
        String valorEsperado = "El caracter ingresado es un número.";
        String valorActual = LetraONumero.evaluar('5');
        assertEquals(valorEsperado, valorActual);
    }@Test
    public void testEsLetraMinuscula() {
        String valorEsperado = "El caracter ingresado es una letra minúscula.";
        String valorActual = LetraONumero.evaluar('c');
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testEsletraMayuscula() {
        String valorEsperado = "El caracter ingresado es una letra mayúscula.";
        String valorActual = LetraONumero.evaluar('G');
        assertEquals(valorEsperado, valorActual);
    }@Test
    public void testNoEsLetraNiNumero() {
        String valorEsperado = "El caracter ingresado no es ni letra ni número.";
        String valorActual = LetraONumero.evaluar('$');
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
    
}
