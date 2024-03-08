package test;

import ejercicios.Edad;
import ejercicios.SetDeTenis;
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
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Su edad es: 24 años.";
        String valorActual = Edad.evaluar(1, 1, 2000);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test1985Febrero10() {
        String valorEsperado = "Su edad es: 39 años.";
        String valorActual = Edad.evaluar(10, 2, 1985);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test2005Diciembre4() {
        String valorEsperado = "Su edad es: 18 años.";
        String valorActual = Edad.evaluar(4, 12, 2005);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
}
