package test;

import ejercicios.IMC;
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
public class IMCTest {

    @Test
    public void testBajo() {
        String valorEsperado = "bajo";
        String valorActual = IMC.evaluar(50, 1.7, 20);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testMedio() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(45, 1.5, 48);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testAlto() {
        String valorEsperado = "alto";
        String valorActual = IMC.evaluar(64, 1.6, 45);
        assertEquals(valorEsperado, valorActual);
    }
    // TODO: Agrega tus otros casos de prueba aquí
}
