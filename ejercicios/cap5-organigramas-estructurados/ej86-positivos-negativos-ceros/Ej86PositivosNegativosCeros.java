/** Ejercicio 86 (cap. 5, estructurado): crear una lista en memoria para N elementos y a continuación contar los positivos, negativos y ceros. */
public class Ej86PositivosNegativosCeros {
    public static void main(String[] args) {
        System.out.println("== Ej. 86: positivos, negativos y ceros (estructurado) ==");
        int n = Consola.leerEntero("Dame el total de elementos de la lista", 1, 10000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Consola.leerEntero("Dame elemento " + (i + 1));
        int p = 0, ne = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) p++;
            else if (a[i] < 0) ne++;
            else c++;
        }
        System.out.println("Positivos = " + p + " | Negativos = " + ne + " | Ceros = " + c);
    }
}
