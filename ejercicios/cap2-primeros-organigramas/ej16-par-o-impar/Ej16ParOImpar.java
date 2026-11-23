/** Ejercicio 16 (cap. 2): determinar si un número entero es par o impar. */
public class Ej16ParOImpar {
    public static void main(String[] args) {
        System.out.println("== Ej. 16: par o impar ==");
        int n = Consola.leerEntero("Da un número entero N");
        if (n % 2 == 0) {
            System.out.println("El número " + n + " es par");
        } else {
            System.out.println("El número " + n + " es impar");
        }
    }
}
