package test;

import ejercicios.Division;
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
public class DivisionTest {
    @Test
    public void testDivisionExacta() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(14, 7);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testDivisionNoExacta() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 0\n"
                + "Residuo: 1";
        String valorActual = Division.evaluar(1, 4);
        assertEquals(valorEsperado, valorActual);
    }
    // TODO: Agrega tus otros casos de prueba aquí
}
