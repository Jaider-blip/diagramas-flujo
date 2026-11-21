import java.time.LocalDate;
import java.util.Locale;

/**
 * Ejercicio 91 (cap. 5, estructurado): tabla en memoria de 1001 elementos: el primero contiene la fecha de una votación
 * y los restantes las fechas de nacimiento de los votantes (AAAAMMDD). Se investiga cuántos tienen edad suficiente
 * (18 años cumplidos en la fecha de votación) y cuántos no, con su tanto por ciento. El libro usa 1000 votantes.
 */
public class Ej91Votantes {
    public static void main(String[] args) {
        System.out.println("== Ej. 91: votantes con edad suficiente ==");
        int n = Consola.leerEntero("Número de votantes (el libro usa 1000)", 1, 1000);
        LocalDate[] t = new LocalDate[n + 1];
        t[0] = Consola.leerFechaCompacta("Dame la fecha de votación");
        for (int i = 1; i <= n; i++) {
            while (true) {
                t[i] = Consola.leerFechaCompacta("Dame la fecha de nacimiento " + i + " de " + n);
                if (!t[i].isAfter(t[0])) break;
                System.out.println("  No puede haber nacido después de la votación.");
            }
        }
        int si = 0, no = 0;
        for (int i = 1; i <= n; i++) {
            if (Consola.tieneAlMenos(t[i], t[0], 18)) si++; else no++;
        }
        System.out.println("Pueden votar: " + si + " (" + String.format(Locale.US, "%.2f", Consola.porcentaje(si, n)) + " %)");
        System.out.println("No pueden votar: " + no + " (" + String.format(Locale.US, "%.2f", Consola.porcentaje(no, n)) + " %)");
    }
}
