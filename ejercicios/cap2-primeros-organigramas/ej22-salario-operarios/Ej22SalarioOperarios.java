import java.util.Locale;

/**
 * Ejercicio 22 (cap. 2): salario semanal de los operarios. Se paga D por hora y 1,5·D por cada hora
 * que exceda de 40. El libro fija 100 operarios; aquí el número se pide al inicio.
 */
public class Ej22SalarioOperarios {
    static final double HORAS_NORMALES = 40;
    static final double RECARGO = 1.5;

    static double salario(double horas, double pagoHora) {
        if (horas > HORAS_NORMALES) {
            return HORAS_NORMALES * pagoHora + (horas - HORAS_NORMALES) * RECARGO * pagoHora;
        }
        return horas * pagoHora;
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 22: salario semanal de operarios ==");
        double d = Consola.leerDecimalMin("Pago por hora D", 0);
        int n = Consola.leerEntero("Número de operarios (el libro usa 100)", 1, 100000);
        for (int i = 1; i <= n; i++) {
            System.out.println("-- Operario " + i + " de " + n);
            String nombre = Consola.leerTexto("Nombre del operario");
            double h = Consola.leerDecimalMin("Horas trabajadas H", 0);
            System.out.printf(Locale.US, "Nombre: %s | Salario: %.2f%n", nombre, salario(h, d));
        }
    }
}
