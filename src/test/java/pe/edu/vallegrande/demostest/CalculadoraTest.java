package pe.edu.vallegrande.demostest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import pe.edu.vallegrande.demostest.test.Calculadora;

@Slf4j
public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void init() {
        log.info("Iniciando CalculadoraTest");
        calculadora = new Calculadora();
    }

    @AfterEach
    void cleanup() {
        log.info("Finalizando CalculadoraTest");
    }

    // --- SUMA ---
    @Test
    void testSumar() {
        log.info("Probando el método sumar");
        int resultado = calculadora.sumar(5, 3);
        Assertions.assertEquals(8, resultado);
    }

    // --- RESTA ---
    @Test
    void testRestarPositivos() {
        log.info("Probando restar con números positivos");
        Assertions.assertEquals(2, calculadora.restar(5, 3));
    }

    @Test
    void testRestarNegativos() {
        log.info("Probando restar con negativos");
        Assertions.assertEquals(-8, calculadora.restar(-5, 3));
    }

    // --- MULTIPLICAR ---
    @Test
    void testMultiplicarPositivos() {
        log.info("Probando multiplicar positivos");
        Assertions.assertEquals(15, calculadora.multiplicar(5, 3));
    }

    @Test
    void testMultiplicarPorCero() {
        log.info("Probando multiplicar por cero");
        Assertions.assertEquals(0, calculadora.multiplicar(5, 0));
    }

    @Test
    void testMultiplicarNegativos() {
        log.info("Probando multiplicar negativos");
        Assertions.assertEquals(-15, calculadora.multiplicar(-5, 3));
    }

    // --- PORCENTAJE ---
    @Test
    void testPorcentajeNormal() {
        log.info("Probando porcentaje normal");
        Assertions.assertEquals(50.0, calculadora.porcentaje(50, 100));
    }

    @Test
    void testPorcentajeTotalCero() {
        log.info("Probando porcentaje con total=0 (debe lanzar excepción)");
        Assertions.assertThrows(ArithmeticException.class, () -> calculadora.porcentaje(10, 0));
    }

    // --- RAÍZ CUADRADA ---
    @Test
    void testRaizCuadradaNormal() {
        log.info("Probando raíz cuadrada normal");
        Assertions.assertEquals(4.0, calculadora.raizCuadrada(16));
    }

    @Test
    void testRaizCuadradaNegativa() {
        log.info("Probando raíz cuadrada negativa (debe lanzar excepción)");
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculadora.raizCuadrada(-9));
    }
}
