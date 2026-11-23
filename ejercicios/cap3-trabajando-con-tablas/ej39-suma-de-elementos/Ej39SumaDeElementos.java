/** Ejercicio 39 (cap. 3): crear una lista en memoria con X elementos y hallar la suma de sus elementos. */
public class Ej39SumaDeElementos {
    public static void main(String[] args) {
        System.out.println("== Ej. 39: suma de los elementos de una lista ==");
        int x = Consola.leerEntero("Dame el número de elementos X", 1, 10000);
        int[] a = new int[x];
        for (int i = 0; i < x; i++) a[i] = Consola.leerEntero("Elemento A(" + (i + 1) + ")");
        long s = 0;
        for (int v : a) s += v;
        System.out.println("La suma de los " + x + " elementos es " + s);
    }
}
