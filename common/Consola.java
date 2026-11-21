import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** Utilidades de entrada por consola compartidas por todos los ejercicios. */
public final class Consola {
    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final DateTimeFormatter COMPACTA = DateTimeFormatter.ofPattern("uuuuMMdd");

    private Consola() { }

    public static String leerTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                String s = IN.readLine();
                if (s == null) {
                    System.out.println();
                    System.out.println("(fin de la entrada)");
                    System.exit(0);
                }
                s = s.trim();
                if (!s.isEmpty()) return s;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    public static int leerEntero(String mensaje) {
        while (true) {
            String s = leerTexto(mensaje);
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("  Valor no válido: escribe un número entero.");
            }
        }
    }

    public static int leerEntero(String mensaje, int min, int max) {
        while (true) {
            int v = leerEntero(mensaje + " [" + min + ".." + max + "]");
            if (v >= min && v <= max) return v;
            System.out.println("  Fuera de rango: debe estar entre " + min + " y " + max + ".");
        }
    }

    public static long leerLargo(String mensaje, long min, long max) {
        while (true) {
            String s = leerTexto(mensaje + " [" + min + ".." + max + "]");
            try {
                long v = Long.parseLong(s);
                if (v >= min && v <= max) return v;
                System.out.println("  Fuera de rango: debe estar entre " + min + " y " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("  Valor no válido: escribe un número entero.");
            }
        }
    }

    /** Lee un decimal; acepta coma o punto como separador. */
    public static double leerDecimal(String mensaje) {
        while (true) {
            String s = leerTexto(mensaje).replace(',', '.');
            try {
                double v = Double.parseDouble(s);
                if (!Double.isNaN(v) && !Double.isInfinite(v)) return v;
            } catch (NumberFormatException e) {
                // se repite la pregunta
            }
            System.out.println("  Valor no válido: escribe un número (ej. 12.5).");
        }
    }

    public static double leerDecimalMin(String mensaje, double min) {
        while (true) {
            double v = leerDecimal(mensaje);
            if (v >= min) return v;
            System.out.println("  Debe ser mayor o igual que " + min + ".");
        }
    }

    /** Acepta 1/0, s/n, si/sí/no. */
    public static boolean leerSiNo(String mensaje) {
        while (true) {
            String s = leerTexto(mensaje + " (1=sí, 0=no)").toLowerCase();
            if (s.equals("1") || s.equals("s") || s.equals("si") || s.equals("sí")) return true;
            if (s.equals("0") || s.equals("n") || s.equals("no")) return false;
            System.out.println("  Responde 1 (sí) o 0 (no).");
        }
    }

    /** Lee día, mes y año por separado y valida que la fecha exista. */
    public static LocalDate leerFecha(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            int d = leerEntero("  Día", 1, 31);
            int m = leerEntero("  Mes", 1, 12);
            int a = leerEntero("  Año", 1, 9999);
            try {
                return LocalDate.of(a, m, d);
            } catch (DateTimeException e) {
                System.out.println("  Esa fecha no existe, inténtalo de nuevo.");
            }
        }
    }

    /** Lee una fecha en formato AAAAMMDD (ej. 19840821). */
    public static LocalDate leerFechaCompacta(String mensaje) {
        while (true) {
            String s = leerTexto(mensaje + " (AAAAMMDD)");
            try {
                if (s.length() != 8) throw new DateTimeException("longitud");
                return LocalDate.parse(s, COMPACTA);
            } catch (DateTimeException e) {
                System.out.println("  Fecha no válida, usa el formato AAAAMMDD.");
            }
        }
    }

    /** true si una persona nacida en {@code nacimiento} tiene al menos {@code anios} años en {@code referencia}. */
    public static boolean tieneAlMenos(LocalDate nacimiento, LocalDate referencia, int anios) {
        return !nacimiento.plusYears(anios).isAfter(referencia);
    }

    public static double porcentaje(long parte, long total) {
        return total == 0 ? 0.0 : parte * 100.0 / total;
    }
}
