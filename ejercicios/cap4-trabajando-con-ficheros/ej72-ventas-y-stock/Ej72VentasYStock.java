/**
 * Ejercicio 72 (cap. 4): una empresa vende tres artículos mediante vendedores. Semanalmente se registra (una "tarjeta")
 * lo vendido por cada vendedor de cada artículo (C1, C2, C3). A fin de mes se actualizan las existencias y se comprueba
 * si se alcanza el stock mínimo (artículo 1 = 10, artículo 2 = 100, artículo 3 = 47); en ese caso hay que hacer pedido.
 * La variable SW indica qué artículos pedir: unidades = artículo 1, decenas = artículo 2, centenas = artículo 3.
 */
public class Ej72VentasYStock {
    static final int[] STOCK_MINIMO = {10, 100, 47};

    public static void main(String[] args) {
        System.out.println("== Ej. 72: actualización de existencias y pedidos ==");
        long[] existencias = new long[3];
        long[] vendido = new long[3];
        for (int i = 0; i < 3; i++) existencias[i] = Consola.leerLargo("Existencias iniciales del artículo " + (i + 1), 0, 1000000000L);
        boolean hayMas;
        do {
            Consola.leerTexto("Vendedor");
            for (int i = 0; i < 3; i++) vendido[i] += Consola.leerLargo("  Unidades vendidas del artículo " + (i + 1), 0, 1000000000L);
            hayMas = Consola.leerSiNo("¿Hay más tarjetas de ventas?");
        } while (hayMas);

        int sw = 0;
        int peso = 1;
        for (int i = 0; i < 3; i++) {
            existencias[i] -= vendido[i];
            System.out.println("Artículo " + (i + 1) + ": vendido " + vendido[i] + " | existencias finales " + existencias[i]);
            if (existencias[i] < 0) System.out.println("  Aviso: se vendió más de lo que había en existencias.");
            if (existencias[i] <= STOCK_MINIMO[i]) {
                sw += peso;
                System.out.println("  -> Hacer un nuevo pedido del artículo " + (i + 1) + " (stock mínimo " + STOCK_MINIMO[i] + ").");
            }
            peso *= 10;
        }
        System.out.printf("SW = %03d%n", sw);
    }
}
