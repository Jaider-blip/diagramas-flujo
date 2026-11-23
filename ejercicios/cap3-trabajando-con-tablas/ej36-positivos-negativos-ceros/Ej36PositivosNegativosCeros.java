/** Ejercicio 36 (cap. 3): crear una lista en memoria para N elementos y a continuación investigarla contando positivos, negativos y ceros. */
public class Ej36PositivosNegativosCeros {
    public static void main(String[] args) {
        System.out.println("== Ej. 36: positivos, negativos y ceros de una lista ==");
        int n = Consola.leerEntero("Dame el número de elementos N", 1, 10000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Consola.leerEntero("Elemento A(" + (i + 1) + ")");
        int positivos = 0, negativos = 0, ceros = 0;
        for (int v : a) {
            if (v > 0) positivos++;
            else if (v < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos = " + positivos + " | Negativos = " + negativos + " | Ceros = " + ceros);
    }
}
