/** Ejercicio 50 (cap. 3): búsqueda binaria de un elemento en una lista ordenada (ascendente). */
public class Ej50BusquedaBinaria {
    /** Devuelve la posición (base 1) del elemento o -1 si no existe. */
    static int buscar(int[] a, int x) {
        int bajo = 0, alto = a.length - 1;
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            if (a[medio] == x) return medio + 1;
            if (x < a[medio]) alto = medio - 1; else bajo = medio + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 50: búsqueda binaria ==");
        int n = Consola.leerEntero("Número de elementos de la lista", 1, 10000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                a[i] = Consola.leerEntero("Elemento " + (i + 1) + " (orden ascendente)");
                if (i == 0 || a[i] >= a[i - 1]) break;
                System.out.println("  La lista debe estar ordenada: introduce un valor >= " + a[i - 1] + ".");
            }
        }
        boolean otra;
        do {
            int x = Consola.leerEntero("Dame el elemento a buscar");
            int pos = buscar(a, x);
            System.out.println(pos > 0 ? "Elemento encontrado en la posición " + pos : "No existe el elemento buscado");
            otra = Consola.leerSiNo("¿Buscar otro elemento?");
        } while (otra);
    }
}
