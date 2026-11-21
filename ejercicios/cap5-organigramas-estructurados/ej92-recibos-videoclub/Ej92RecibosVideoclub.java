import java.util.Locale;

/**
 * Ejercicio 92 (cap. 5, estructurado): matriz en memoria con los datos de los socios de un videoclub (nombre, dirección,
 * teléfono, nº de películas llevadas, cuota mínima). Recibo = cuota mínima + importe de las películas del mes.
 * Tarifa (interpretación por tramos): 100 ptas por cada una de las 20 primeras películas, 75 ptas por cada una de la 21 a la 50
 * y 50 ptas por cada una de las que pasen de 50. Además se cuentan los socios que se llevan más de 50 películas.
 */
public class Ej92RecibosVideoclub {
    static double importePeliculas(int p) {
        int tramo1 = Math.min(p, 20);
        int tramo2 = Math.min(Math.max(p - 20, 0), 30);
        int tramo3 = Math.max(p - 50, 0);
        return tramo1 * 100.0 + tramo2 * 75.0 + tramo3 * 50.0;
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 92: recibos de un videoclub ==");
        int n = Consola.leerEntero("Número de socios N", 1, 10000);
        int masDe50 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("-- Socio " + i + " de " + n);
            String nombre = Consola.leerTexto("Nombre");
            Consola.leerTexto("Dirección");
            Consola.leerTexto("Teléfono");
            int peliculas = Consola.leerEntero("Películas llevadas en el mes", 0, 100000);
            double cuota = Consola.leerDecimalMin("Cuota mínima", 0);
            double recibo = cuota + importePeliculas(peliculas);
            if (peliculas > 50) masDe50++;
            System.out.printf(Locale.US, "RECIBO de %s: cuota %.2f + películas %.2f = %.2f ptas%n", nombre, cuota, importePeliculas(peliculas), recibo);
        }
        System.out.println("Socios que se llevan más de 50 películas: " + masDe50);
    }
}
