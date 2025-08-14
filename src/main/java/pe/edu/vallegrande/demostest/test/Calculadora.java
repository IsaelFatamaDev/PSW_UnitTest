package pe.edu.vallegrande.demostest.test;

/**
 * Clase Calculadora que implementa operaciones matemáticas básicas
 * Incluye validaciones y manejo de excepciones
 *
 * @author Javi Dev
 * @version 1.0
 */
public class Calculadora {

    // ═══════════════════════════════════════════════════════════════
    //                    OPERACIONES BÁSICAS
    // ═══════════════════════════════════════════════════════════════

    /**
     * Suma dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return resultado de a + b
     */
    public int sumar(int a, int b) {
        System.out.println("➕ Método sumar: " + a + " + " + b);
        int resultado = a + b;
        System.out.println("✅ Resultado: " + resultado);
        return resultado;
    }

    /**
     * Resta dos números enteros
     * @param a minuendo
     * @param b sustraendo
     * @return resultado de a - b
     */
    public int restar(int a, int b) {
        System.out.println("➖ Método restar: " + a + " - " + b);
        int resultado = a - b;
        System.out.println("✅ Resultado: " + resultado);
        return resultado;
    }

    /**
     * Multiplica dos números enteros
     * @param a primer factor
     * @param b segundo factor
     * @return resultado de a × b
     */
    public int multiplicar(int a, int b) {
        System.out.println("✖️ Método multiplicar: " + a + " × " + b);
        int resultado = a * b;
        System.out.println("✅ Resultado: " + resultado);
        return resultado;
    }

    /**
     * Divide dos números enteros
     * @param a dividendo
     * @param b divisor
     * @return resultado de a ÷ b
     * @throws ArithmeticException si b = 0
     */
    public double dividir(int a, int b) {
        System.out.println("➗ Método dividir: " + a + " ÷ " + b);
        if (b == 0) {
            System.out.println("❌ Error: División por cero");
            throw new ArithmeticException("No se puede dividir por cero");
        }
        double resultado = (double) a / b;
        System.out.println("✅ Resultado: " + resultado);
        return resultado;
    }

    // ═══════════════════════════════════════════════════════════════
    //                    OPERACIONES AVANZADAS
    // ═══════════════════════════════════════════════════════════════

    /**
     * Calcula el porcentaje de una parte respecto al total
     * @param parte valor parcial
     * @param total valor total
     * @return porcentaje calculado como (parte * 100) / total
     * @throws ArithmeticException si total = 0
     */
    public double porcentaje(int parte, int total) {
        System.out.println("📊 Método porcentaje: " + parte + " de " + total);
        if (total == 0) {
            System.out.println("❌ Error: Total no puede ser cero");
            throw new ArithmeticException("El total no puede ser cero");
        }
        double resultado = (parte * 100.0) / total;
        System.out.println("✅ Resultado: " + resultado + "%");
        return resultado;
    }

    /**
     * Calcula la raíz cuadrada de un número
     * @param x número del cual calcular la raíz cuadrada
     * @return raíz cuadrada de x
     * @throws IllegalArgumentException si x < 0
     */
    public double raizCuadrada(double x) {
        System.out.println("√️ Método raizCuadrada: √" + x);
        if (x < 0) {
            System.out.println("❌ Error: Número negativo");
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        double resultado = Math.sqrt(x);
        System.out.println("✅ Resultado: " + resultado);
        return resultado;
    }
}
