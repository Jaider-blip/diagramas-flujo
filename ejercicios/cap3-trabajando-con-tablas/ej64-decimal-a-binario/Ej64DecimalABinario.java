/** Ejercicio 64 (cap. 3): pasar un número decimal a binario con divisiones sucesivas por 2 y tabla de restos R(I). */
public class Ej64DecimalABinario {
    public static void main(String[] args) {
        System.out.println("== Ej. 64: decimal a binario ==");
        long m = Consola.leerLargo("Dame el número decimal M", 0, Long.MAX_VALUE);
        int[] r = new int[64];
        int i = 0;
        long n = m;
        do {
            r[i++] = (int) (n % 2); // resto de la división
            n /= 2;
        } while (n > 0);
        StringBuilder sb = new StringBuilder();
        for (int k = i - 1; k >= 0; k--) sb.append(r[k]); // restos en orden inverso
        System.out.println("El número decimal " + m + " en binario es " + sb);
    }
}
