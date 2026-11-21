import java.util.Arrays;

/** Ejercicio 89 (cap. 5, estructurado): ordenar una tabla en memoria de mayor a menor y escribirla. El libro usa 100 elementos. */
public class Ej89OrdenarTabla {
    public static void main(String[] args) {
        System.out.println("== Ej. 89: ordenar una tabla de mayor a menor ==");
        int n = Consola.leerEntero("Número de elementos de la tabla (el libro usa 100)", 1, 1000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Consola.leerEntero("A(" + (i + 1) + ")");
        for (int b = n; b > 1; b--) {           // B = tope hasta donde llevamos ordenada la tabla
            for (int i = 0; i < b - 1; i++) {
                if (a[i] < a[i + 1]) {          // mayor a menor: intercambiar si está al revés
                    int m = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = m;
                }
            }
        }
        System.out.println("La tabla ordenada es: " + Arrays.toString(a));
    }
}
