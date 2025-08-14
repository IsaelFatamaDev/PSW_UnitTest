package pe.edu.vallegrande.demostest.test;

public class Calculadora {

    public int sumar(int a, int b) {
        System.out.println("Método sumar");
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        System.out.println("Método restar");
        int resultado = a - b;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public int multiplicar(int a, int b) {
        System.out.println("Método multiplicar");
        int resultado = a * b;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public double dividir(int a, int b) {
        System.out.println("Método dividir");
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        double resultado = (double) a / b;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public double porcentaje(int parte, int total) {
        System.out.println("Método porcentaje");
        if (total == 0) {
            throw new ArithmeticException("El total no puede ser cero");
        }
        double resultado = (parte * 100.0) / total;
        System.out.println("Resultado: " + resultado + "%");
        return resultado;
    }

    public double raizCuadrada(double x) {
        System.out.println("Método raizCuadrada");
        if (x < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        double resultado = Math.sqrt(x);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}
