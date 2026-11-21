import java.util.Arrays;

/** Ejercicio 60 (cap. 3): dada una matriz de N por M elementos, ordenar de menor a mayor cada una de sus filas. */
public class Ej60OrdenarFilas {
    /** Ordenación por burbuja de una fila (como en el organigrama del libro). */
    static void burbuja(int[] fila) {
        for (int b = fila.length; b > 1; b--) {
            for (int j = 0; j < b - 1; j++) {
                if (fila[j] > fila[j + 1]) {
                    int p = fila[j];
                    fila[j] = fila[j + 1];
                    fila[j + 1] = p;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 60: ordenar cada fila de una matriz ==");
        int n = Consola.leerEntero("Número de filas N", 1, 100);
        int m = Consola.leerEntero("Número de columnas M", 1, 100);
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = Consola.leerEntero("A(" + (i + 1) + "," + (j + 1) + ")");
        for (int[] fila : a) burbuja(fila);
        System.out.println("Matriz con las filas ordenadas de menor a mayor:");
        for (int[] fila : a) System.out.println(Arrays.toString(fila));
    }
}
