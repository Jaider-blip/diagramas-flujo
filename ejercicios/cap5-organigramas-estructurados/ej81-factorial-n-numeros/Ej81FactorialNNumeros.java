/** Ejercicio 81 (cap. 5, estructurado): hallar el factorial de N números introducidos por teclado. */
public class Ej81FactorialNNumeros {
    static long factorial(int x) {
        long f = 1;
        for (int j = 1; j <= x; j++) f *= j;
        return f;
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 81: factorial de N números ==");
        int n = Consola.leerEntero("Dame un valor para N (cuántos números)", 1, 100000);
        for (int i = 1; i <= n; i++) {
            int x = Consola.leerEntero("Dame el nº a investigar (" + i + " de " + n + ")", 0, 20); // 20! es el máximo que cabe en long
            System.out.println("El factorial de " + x + " es " + factorial(x));
        }
    }
}
