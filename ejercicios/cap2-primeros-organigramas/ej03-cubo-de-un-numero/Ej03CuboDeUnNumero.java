import java.util.Locale;

/** Ejercicio 3 (cap. 2): hallar el cubo de un número X. */
public class Ej03CuboDeUnNumero {
    public static void main(String[] args) {
        System.out.println("== Ej. 3: cubo de un número ==");
        double x = Consola.leerDecimal("Dame el número X");
        double c = x * x * x;
        System.out.printf(Locale.US, "El cubo de %.2f es %.2f%n", x, c);
    }
}
