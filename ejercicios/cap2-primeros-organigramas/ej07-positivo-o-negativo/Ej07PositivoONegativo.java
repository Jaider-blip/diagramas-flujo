/** Ejercicio 7 (cap. 2): dado un número, contestar si es positivo o negativo (se añade el caso del cero). */
public class Ej07PositivoONegativo {
    public static void main(String[] args) {
        System.out.println("== Ej. 7: positivo o negativo ==");
        double n = Consola.leerDecimal("Da un valor para N");
        if (n > 0) {
            System.out.println("El número N es positivo");
        } else if (n < 0) {
            System.out.println("El número N es negativo");
        } else {
            System.out.println("El número N es cero (ni positivo ni negativo)");
        }
    }
}
