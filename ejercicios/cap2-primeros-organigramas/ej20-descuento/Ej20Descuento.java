import java.util.Locale;

/** Ejercicio 20 (cap. 2): dado un número y un tanto por ciento, hallar el descuento y la cantidad a pagar. */
public class Ej20Descuento {
    public static void main(String[] args) {
        System.out.println("== Ej. 20: descuento por tanto por ciento ==");
        double n = Consola.leerDecimal("Dame el número (importe) N");
        double t = Consola.leerDecimal("Dame el tanto por ciento T");
        if (t < 0 || t > 100) {
            System.out.println("Porcentaje inválido: debe estar entre 0 y 100.");
            return;
        }
        double descuento = n * t / 100.0;
        double pagar = n - descuento;
        System.out.printf(Locale.US, "Número: %.2f%n", n);
        System.out.printf(Locale.US, "Tanto por ciento: %.2f%%%n", t);
        System.out.printf(Locale.US, "Cantidad del descuento: %.2f%n", descuento);
        System.out.printf(Locale.US, "Cantidad a pagar: %.2f%n", pagar);
    }
}
