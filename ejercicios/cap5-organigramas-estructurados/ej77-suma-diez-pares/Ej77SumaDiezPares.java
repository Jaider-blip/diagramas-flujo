/** Ejercicio 77 (cap. 5, estructurado): hallar la suma de los diez primeros números pares (iteración con contador). */
public class Ej77SumaDiezPares {
    public static void main(String[] args) {
        System.out.println("== Ej. 77: suma de los diez primeros pares (estructurado) ==");
        int i = 0;
        int s = 0;
        for (int k = 1; k <= 10; k++) {
            i = i + 2;
            s = s + i;
        }
        System.out.println("La suma de los diez primeros números pares es " + s);
    }
}
