/** Ejercicio 44 (cap. 3): dada una tabla en memoria de N elementos, obtener el valor más grande y la posición donde se encuentra. */
public class Ej44MayorYPosicion {
    public static void main(String[] args) {
        System.out.println("== Ej. 44: valor mayor y su posición ==");
        int n = Consola.leerEntero("Dame el número de elementos N", 1, 10000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Consola.leerEntero("Elemento A(" + (i + 1) + ")");
        int m = a[0];   // M = mayor encontrado hasta ahora
        int k = 1;      // K = lugar (base 1) donde está
        for (int i = 1; i < n; i++) {
            if (a[i] > m) {
                m = a[i];
                k = i + 1;
            }
        }
        System.out.println("El valor más grande es " + m + " y está en la posición " + k + " (primera aparición)");
    }
}
