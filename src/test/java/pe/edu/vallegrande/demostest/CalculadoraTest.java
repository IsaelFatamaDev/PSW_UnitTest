package pe.edu.vallegrande.demostest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import pe.edu.vallegrande.demostest.test.Calculadora;

@Slf4j
@DisplayName("Tests para la clase Calculadora")
public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void init() {
        log.info("🔧 Iniciando CalculadoraTest");
        calculadora = new Calculadora();
    }

    @AfterEach
    void cleanup() {
        log.info("✅ Finalizando CalculadoraTest");
    }

    // ═══════════════════════════════════════════════════════════════
    //                          TESTS DE SUMA
    // ═══════════════════════════════════════════════════════════════

    @Test
    @DisplayName("Suma de números positivos")
    void testSumar() {
        log.info("🧮 Probando suma: 5 + 3 = 8");
        int resultado = calculadora.sumar(5, 3);
        log.info("📊 Esperado: 8, Obtenido: {}", resultado);
        Assertions.assertEquals(8, resultado, "La suma de 5 + 3 debe ser 8");
    }

    // ═══════════════════════════════════════════════════════════════
    //                          TESTS DE RESTA
    // ═══════════════════════════════════════════════════════════════

    @Test
    @DisplayName("Resta con números positivos")
    void testRestarPositivos() {
        log.info("🧮 Probando resta positivos: 5 - 3 = 2");
        int resultado = calculadora.restar(5, 3);
        log.info("📊 Esperado: 2, Obtenido: {}", resultado);
        Assertions.assertEquals(2, resultado, "La resta de 5 - 3 debe ser 2");
    }

    @Test
    @DisplayName("Resta con números negativos")
    void testRestarNegativos() {
        log.info("🧮 Probando resta negativos: -5 - 3 = -8");
        int resultado = calculadora.restar(-5, 3);
        log.info("📊 Esperado: -8, Obtenido: {}", resultado);
        Assertions.assertEquals(-8, resultado, "La resta de -5 - 3 debe ser -8");
    }

    // ═══════════════════════════════════════════════════════════════
    //                      TESTS DE MULTIPLICACIÓN
    // ═══════════════════════════════════════════════════════════════

    @Test
    @DisplayName("Multiplicación con números positivos")
    void testMultiplicarPositivos() {
        log.info("🧮 Probando multiplicación positivos: 5 × 3 = 15");
        int resultado = calculadora.multiplicar(5, 3);
        log.info("📊 Esperado: 15, Obtenido: {}", resultado);
        Assertions.assertEquals(15, resultado, "La multiplicación de 5 × 3 debe ser 15");
    }

    @Test
    @DisplayName("Multiplicación por cero")
    void testMultiplicarPorCero() {
        log.info("🧮 Probando multiplicación por cero: 5 × 0 = 0");
        int resultado = calculadora.multiplicar(5, 0);
        log.info("📊 Esperado: 0, Obtenido: {}", resultado);
        Assertions.assertEquals(0, resultado, "La multiplicación por cero debe ser 0");
    }

    @Test
    @DisplayName("Multiplicación con números negativos")
    void testMultiplicarNegativos() {
        log.info("🧮 Probando multiplicación negativos: -5 × 3 = -15");
        int resultado = calculadora.multiplicar(-5, 3);
        log.info("📊 Esperado: -15, Obtenido: {}", resultado);
        Assertions.assertEquals(-15, resultado, "La multiplicación de -5 × 3 debe ser -15");
    }

    // ═══════════════════════════════════════════════════════════════
    //                       TESTS DE PORCENTAJE
    // ═══════════════════════════════════════════════════════════════

    @Test
    @DisplayName("Cálculo de porcentaje normal")
    void testPorcentajeNormal() {
        log.info("🧮 Probando porcentaje normal: 50 de 100 = 50%");
        double resultado = calculadora.porcentaje(50, 100);
        log.info("📊 Esperado: 50.0, Obtenido: {}", resultado);
        Assertions.assertEquals(50.0, resultado, "El porcentaje de 50 de 100 debe ser 50.0");
    }

    @Test
    @DisplayName("Porcentaje con total cero (debe lanzar ArithmeticException)")
    void testPorcentajeTotalCero() {
        log.info("⚠️ Probando porcentaje con total=0 (debe lanzar ArithmeticException)");
        ArithmeticException exception = Assertions.assertThrows(
            ArithmeticException.class,
            () -> calculadora.porcentaje(10, 0),
            "Debe lanzar ArithmeticException cuando total = 0"
        );
        log.info("✅ Excepción capturada correctamente: {}", exception.getMessage());
    }

    // ═══════════════════════════════════════════════════════════════
    //                     TESTS DE RAÍZ CUADRADA
    // ═══════════════════════════════════════════════════════════════

    @Test
    @DisplayName("Raíz cuadrada de número positivo")
    void testRaizCuadradaNormal() {
        log.info("🧮 Probando raíz cuadrada normal: √16 = 4.0");
        double resultado = calculadora.raizCuadrada(16);
        log.info("📊 Esperado: 4.0, Obtenido: {}", resultado);
        Assertions.assertEquals(4.0, resultado, "La raíz cuadrada de 16 debe ser 4.0");
    }

    @Test
    @DisplayName("Raíz cuadrada de número negativo (debe lanzar IllegalArgumentException)")
    void testRaizCuadradaNumeroNegativo() {
        log.info("⚠️ Probando raíz cuadrada de número negativo (debe lanzar IllegalArgumentException)");
        IllegalArgumentException exception = Assertions.assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.raizCuadrada(-4),
            "Debe lanzar IllegalArgumentException cuando x < 0"
        );
        log.info("✅ Excepción capturada correctamente: {}", exception.getMessage());
    }
}
