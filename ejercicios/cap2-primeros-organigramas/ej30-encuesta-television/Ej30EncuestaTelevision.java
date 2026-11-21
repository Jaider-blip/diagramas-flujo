import java.util.Locale;

/**
 * Ejercicio 30 (cap. 2): encuesta sobre televisión. Por encuestado: ¿tiene TV? Si la tiene: ¿es en color?
 * Si no la tiene: ¿piensa comprarla? Al final se muestran los totales y los tantos por ciento.
 */
public class Ej30EncuestaTelevision {
    static void linea(String texto, double valor) {
        System.out.printf(Locale.US, "%-52s %6.2f %%%n", texto, valor);
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 30: encuesta de televisión ==");
        int tienen = 0, noTienen = 0, color = 0, blancoNegro = 0, comprarian = 0, noComprarian = 0;
        boolean hayMas;
        do {
            if (Consola.leerSiNo("¿Tiene televisión?")) {
                tienen++;
                if (Consola.leerSiNo("¿Es en color?")) color++; else blancoNegro++;
            } else {
                noTienen++;
                if (Consola.leerSiNo("¿Piensa comprarla?")) comprarian++; else noComprarian++;
            }
            hayMas = Consola.leerSiNo("¿Hay más encuestados?");
        } while (hayMas);

        int total = tienen + noTienen;
        System.out.println("---- Resultados ----");
        System.out.println("Total encuestados: " + total);
        System.out.println("Tienen TV: " + tienen + " | No tienen TV: " + noTienen);
        System.out.println("En color: " + color + " | Blanco y negro: " + blancoNegro);
        System.out.println("Piensan comprarla: " + comprarian + " | No piensan comprarla: " + noComprarian);
        linea("Tanto por ciento que tienen TV (sobre el total)", Consola.porcentaje(tienen, total));
        linea("Tanto por ciento que la tienen en color (de los que tienen)", Consola.porcentaje(color, tienen));
        linea("Tanto por ciento que la tienen en B/N (de los que tienen)", Consola.porcentaje(blancoNegro, tienen));
        linea("Tanto por ciento que piensan comprarla (de los que no tienen)", Consola.porcentaje(comprarian, noTienen));
        linea("Tanto por ciento que no piensan comprarla (de los que no tienen)", Consola.porcentaje(noComprarian, noTienen));
    }
}
