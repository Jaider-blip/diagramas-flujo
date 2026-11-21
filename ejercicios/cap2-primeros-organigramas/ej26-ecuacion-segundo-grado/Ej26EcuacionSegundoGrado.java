import java.util.Locale;

/** Ejercicio 26 (cap. 2): ecuación de segundo grado A·x² + B·x + C = 0, incluyendo soluciones imaginarias. */
public class Ej26EcuacionSegundoGrado {
    private static double limpia(double v) {
        return v == 0 ? 0.0 : v; // evita mostrar "-0.00"
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 26: ecuación de segundo grado ==");
        double a = Consola.leerDecimal("Coeficiente A (de x²)");
        double b = Consola.leerDecimal("Coeficiente B (de x)");
        double c = Consola.leerDecimal("Término independiente C");
        if (a == 0) {
            System.out.println("La ecuación no es de segundo grado (A = 0).");
            return;
        }
        double z = b * b - 4 * a * c;
        if (z > 0) {
            double raiz = Math.sqrt(z);
            double x1 = (-b + raiz) / (2 * a);
            double x2 = (-b - raiz) / (2 * a);
            System.out.printf(Locale.US, "Dos soluciones reales: X1 = %.4f | X2 = %.4f%n", limpia(x1), limpia(x2));
        } else if (z == 0) {
            System.out.printf(Locale.US, "Una solución real doble: X = %.4f%n", limpia(-b / (2 * a)));
        } else {
            double re = limpia(-b / (2 * a));
            double im = Math.sqrt(-z) / (2 * a);
            System.out.println("Soluciones imaginarias:");
            System.out.printf(Locale.US, "X1 = %.4f + %.4fi%n", re, Math.abs(im));
            System.out.printf(Locale.US, "X2 = %.4f - %.4fi%n", re, Math.abs(im));
        }
    }
}
