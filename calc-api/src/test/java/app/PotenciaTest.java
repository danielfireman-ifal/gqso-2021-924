package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class PotenciaTest {
    
    private Potencia potencia;

    @BeforeEach
    public void setup() {
        potencia = new Potencia();
    }

    @Test
    public void testPotencia_success() {
        assertEquals(16, potencia.potencia("4.", "2."));
    }

    @Test
    public void testPotencia_baseInvalida() {
        assertThrows(IllegalArgumentException.class, ()->{
            potencia.potencia("a", "2.");
        });
    }

    @Test
    public void testPotencia_expoenteInvalido() {
        assertThrows(IllegalArgumentException.class, ()->{
            potencia.potencia("4.", "a");
        });
    }
}