/** Ejercicio 80 (cap. 5, estructurado): dados varios números, decir cuál es par y cuál impar contando los pares y los impares. Se prevé un final. */
public class Ej80ParesEImpares {
    public static void main(String[] args) {
        System.out.println("== Ej. 80: pares e impares ==");
        int pares = 0, impares = 0;
        boolean hayMas;
        do {
            int n = Consola.leerEntero("Da un número a investigar");
            if (n % 2 == 0) {
                System.out.println("El nº es par");
                pares++;
            } else {
                System.out.println("El nº es impar");
                impares++;
            }
            hayMas = Consola.leerSiNo("¿Hay más números?");
        } while (hayMas);
        System.out.println("Total de pares: " + pares + " | Total de impares: " + impares);
    }
}
