/** Ejercicio 56 (cap. 3): sumar los elementos de cada fila y de cada columna de una matriz N x M. */
public class Ej56SumaFilasColumnas {
    public static void main(String[] args) {
        System.out.println("== Ej. 56: suma de filas y columnas ==");
        int n = Consola.leerEntero("Número de filas N", 1, 50);
        int m = Consola.leerEntero("Número de columnas M", 1, 50);
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = Consola.leerEntero("A(" + (i + 1) + "," + (j + 1) + ")");
        long[] columnas = new long[m];
        for (int i = 0; i < n; i++) {
            long fila = 0;
            for (int j = 0; j < m; j++) {
                fila += a[i][j];
                columnas[j] += a[i][j];
            }
            System.out.println("Suma fila " + (i + 1) + " = " + fila);
        }
        for (int j = 0; j < m; j++) System.out.println("Suma columna " + (j + 1) + " = " + columnas[j]);
    }
}
