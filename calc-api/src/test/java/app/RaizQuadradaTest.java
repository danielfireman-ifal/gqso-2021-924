package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class RaizQuadradaTest {
    RaizQuadrada raiz;

    @BeforeEach
    public void setup() {
        raiz = new RaizQuadrada();
    }

    @Test
    public void testRaizQuadrada_success() {
        assertEquals(2, raiz.raizQuadrada("4."));
    }

    @Test
    public void testRaizQuadrada_entradaLetra() {
        assertThrows(IllegalArgumentException.class, ()->{
            raiz.raizQuadrada("a");
        });
    }

    @Test
    public void testRaizQuadrada_entradaMenorQueZero() {
        assertThrows(IllegalArgumentException.class, ()->{
            raiz.raizQuadrada("-4");
        });
    }
}
