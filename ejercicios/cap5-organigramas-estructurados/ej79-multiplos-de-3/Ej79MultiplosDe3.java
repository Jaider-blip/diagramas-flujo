/** Ejercicio 79 (cap. 5, estructurado): hallar los N primeros múltiplos de 3. */
public class Ej79MultiplosDe3 {
    public static void main(String[] args) {
        System.out.println("== Ej. 79: los N primeros múltiplos de 3 ==");
        int n = Consola.leerEntero("Da un valor para N", 1, 100000);
        for (int i = 1; i <= n; i++) {
            int m = 3 * i;
            System.out.println("El múltiplo nº " + i + " de 3 es " + m);
        }
    }
}
