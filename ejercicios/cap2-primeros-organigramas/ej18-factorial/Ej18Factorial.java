/** Ejercicio 18 (cap. 2): hallar el factorial de un número. */
public class Ej18Factorial {
    public static void main(String[] args) {
        System.out.println("== Ej. 18: factorial de un número ==");
        int n = Consola.leerEntero("Da un número N", 0, 20); // 20! es el mayor factorial que cabe en un long
        long f = 1;
        for (int j = 1; j <= n; j++) f = f * j;
        System.out.println("El factorial de " + n + " es " + f);
    }
}
