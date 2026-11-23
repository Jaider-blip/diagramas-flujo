import java.util.Arrays;

/** Ejercicio 45 (cap. 3): dada una tabla en memoria de N elementos, ordenarla de menor a mayor usando la variable SW (hubo cambio / no hubo cambio). */
public class Ej45OrdenarMenorAMayor {
    public static void main(String[] args) {
        System.out.println("== Ej. 45: ordenar una tabla de menor a mayor ==");
        int n = Consola.leerEntero("Dame el número de elementos N", 1, 10000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Consola.leerEntero("Elemento A(" + (i + 1) + ")");
        int sw;
        do {
            sw = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int m = a[i];       // M = auxiliar del intercambio
                    a[i] = a[i + 1];
                    a[i + 1] = m;
                    sw = 1;             // se produjo un cambio
                }
            }
        } while (sw == 1);
        System.out.println("Tabla ordenada: " + Arrays.toString(a));
    }
}
