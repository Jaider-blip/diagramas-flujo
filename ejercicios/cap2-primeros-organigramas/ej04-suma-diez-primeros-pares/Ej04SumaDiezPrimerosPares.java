/** Ejercicio 4 (cap. 2): hallar la suma de los diez primeros números pares (2, 4, ..., 20). */
public class Ej04SumaDiezPrimerosPares {
    public static void main(String[] args) {
        System.out.println("== Ej. 4: suma de los diez primeros pares ==");
        int i = 0;
        int s = 0;
        do {
            i = i + 2;   // va generando los pares
            s = s + i;   // suma acumulada
        } while (i != 20);
        System.out.println("La suma de los diez primeros números pares es " + s);
    }
}
