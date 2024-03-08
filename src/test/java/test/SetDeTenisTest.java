package test;

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
public class SetDeTenisTest {
    @Test
    public void testProblema1() {
        String valorEsperado = "Datos incorrectos";
        String valorActual = SetDeTenis.evaluar(-4, -5);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema2() {
        String valorEsperado = "Datos incorrectos";
        String valorActual = SetDeTenis.evaluar(8, 9);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema3() {
        String valorEsperado = "Datos incorrectos";
        String valorActual = SetDeTenis.evaluar(7, 7);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema4A() {
        String valorEsperado = "Gana el jugador A";
        String valorActual = SetDeTenis.evaluar(7, 6);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema4B() {
        String valorEsperado = "Gana el jugador B";
        String valorActual = SetDeTenis.evaluar(6, 7);
        assertEquals(valorEsperado, valorActual);
    }@Test
    public void testProblema5() {
        String valorEsperado = "Datos incorrectos";
        String valorActual = SetDeTenis.evaluar(4, 7);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema6() {
        String valorEsperado = "Datos incorrectos";
        String valorActual = SetDeTenis.evaluar(7, 2);
        assertEquals(valorEsperado, valorActual);
    }@Test
    public void testProblema7() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(5, 5);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema8A() {
        String valorEsperado = "Gana el jugador A";
        String valorActual = SetDeTenis.evaluar(7, 5);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema8B() {
        String valorEsperado = "Gana el jugador B";
        String valorActual = SetDeTenis.evaluar(5, 7);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema9A() {
        String valorEsperado = "Gana el jugador A";
        String valorActual = SetDeTenis.evaluar(6, 1);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema9B() {
        String valorEsperado = "Gana el jugador B";
        String valorActual = SetDeTenis.evaluar(1, 6);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testProblema10() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(2, 0);
        assertEquals(valorEsperado, valorActual);
    }
    
    
    // TODO: Agrega tus otros casos de prueba aquí
}
