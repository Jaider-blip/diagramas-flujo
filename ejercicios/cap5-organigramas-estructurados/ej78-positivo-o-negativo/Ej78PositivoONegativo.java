/** Ejercicio 78 (cap. 5, estructurado): dado un número, contestar si es positivo o negativo (selección; se añade el cero). */
public class Ej78PositivoONegativo {
    public static void main(String[] args) {
        System.out.println("== Ej. 78: positivo o negativo (estructurado) ==");
        double n = Consola.leerDecimal("Da un valor para N");
        if (n > 0) {
            System.out.println("El nº es positivo");
        } else if (n < 0) {
            System.out.println("El nº es negativo");
        } else {
            System.out.println("El nº es cero");
        }
    }
}
