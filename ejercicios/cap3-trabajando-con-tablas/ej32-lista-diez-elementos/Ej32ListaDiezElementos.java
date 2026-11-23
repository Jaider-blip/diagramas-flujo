import java.util.Arrays;

/** Ejercicio 32 (cap. 3): crear una lista en memoria para almacenar diez elementos. */
public class Ej32ListaDiezElementos {
    public static void main(String[] args) {
        System.out.println("== Ej. 32: lista de diez elementos ==");
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) a[i] = Consola.leerEntero("Dame el elemento A(" + (i + 1) + ")");
        System.out.println("La lista creada es: " + Arrays.toString(a));
    }
}
