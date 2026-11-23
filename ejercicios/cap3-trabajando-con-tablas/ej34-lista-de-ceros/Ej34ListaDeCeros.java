import java.util.Arrays;

/** Ejercicio 34 (cap. 3): crear una lista en memoria para N elementos y rellenarla con ceros. */
public class Ej34ListaDeCeros {
    public static void main(String[] args) {
        System.out.println("== Ej. 34: lista de N elementos rellena con ceros ==");
        int n = Consola.leerEntero("Dame el número de elementos N", 1, 10000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = 0;
        System.out.println("Lista creada con " + n + " elementos, todos iguales a 0.");
        if (n <= 20) System.out.println("Contenido: " + Arrays.toString(a));
    }
}
