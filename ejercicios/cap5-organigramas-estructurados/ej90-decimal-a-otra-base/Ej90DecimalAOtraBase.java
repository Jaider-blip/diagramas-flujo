/** Ejercicio 90 (cap. 5, estructurado): pasar un número decimal a cualquier otra base (2 a 16). Se prevé un final. */
public class Ej90DecimalAOtraBase {
    static final String DIGITOS = "0123456789ABCDEF";

    static String convertir(long decimal, int base) {
        if (decimal == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(DIGITOS.charAt((int) (decimal % base)));
            decimal /= base;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 90: decimal a otra base ==");
        boolean hayMas;
        do {
            long d = Consola.leerLargo("Número decimal D", 0, Long.MAX_VALUE);
            int b = Consola.leerEntero("Base B", 2, 16);
            System.out.println(d + " en base " + b + " es " + convertir(d, b));
            hayMas = Consola.leerSiNo("¿Hay más números?");
        } while (hayMas);
    }
}
