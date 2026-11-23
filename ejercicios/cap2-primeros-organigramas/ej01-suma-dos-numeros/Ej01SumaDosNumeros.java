import java.util.Locale;

/** Ejercicio 1 (cap. 2): hallar la suma de dos números X e Y usando un acumulador Z. */
public class Ej01SumaDosNumeros {
    public static void main(String[] args) {
        System.out.println("== Ej. 1: suma de dos números ==");
        double x = Consola.leerDecimal("Dame el número X");
        double y = Consola.leerDecimal("Dame el número Y");
        double z = 0;
        z = z + x;
        z = z + y;
        System.out.printf(Locale.US, "La suma de X e Y es %.2f%n", z);
    }
}
