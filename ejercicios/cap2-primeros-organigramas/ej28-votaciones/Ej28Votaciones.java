import java.time.LocalDate;

/**
 * Ejercicio 28 (cap. 2): sondeo de votaciones. Se pide la fecha de la votación y la fecha de nacimiento de cada
 * persona; se informa si VOTA (tiene al menos 18 años en la fecha de la votación) o NO VOTA y se cuentan los que votan.
 */
public class Ej28Votaciones {
    public static void main(String[] args) {
        System.out.println("== Ej. 28: sondeo de votaciones ==");
        LocalDate votacion = Consola.leerFecha("Fecha de la votación:");
        int votan = 0;
        boolean hayMas;
        do {
            LocalDate nacimiento = Consola.leerFecha("Fecha de nacimiento del individuo:");
            if (nacimiento.isAfter(votacion)) {
                System.out.println("  Error: nació después de la fecha de votación; se ignora este dato.");
            } else if (Consola.tieneAlMenos(nacimiento, votacion, 18)) {
                votan++;
                System.out.println("VOTA");
            } else {
                System.out.println("NO VOTA");
            }
            hayMas = Consola.leerSiNo("¿Hay más personas?");
        } while (hayMas);
        System.out.println("Total de personas que votan: " + votan);
    }
}
