import java.util.Locale;

/**
 * Ejercicio 65 (cap. 3): factura detallada de la compañía telefónica. El cliente paga 3 ptas por cada paso del contador
 * más un alquiler según la zona (zona 1: 1.000, zona 2: 1.200, zona 3: 1.500). Los datos de los clientes están en una
 * matriz en memoria: nº de cliente, nombre, dirección, lectura anterior y zona.
 */
public class Ej65FacturaTelefonica {
    record Cliente(int numero, String nombre, String direccion, int lecturaAnterior, int zona) { }

    static final int PRECIO_PASO = 3;
    static final int[] ALQUILER_ZONA = {0, 1000, 1200, 1500};

    static final Cliente[] CLIENTES = {
        new Cliente(1, "Ana Torres", "Cra 5 # 10-20", 1200, 1),
        new Cliente(2, "Luis Pérez", "Cl 8 # 3-45", 3400, 2),
        new Cliente(3, "María Gómez", "Av 6N # 20-10", 800, 3),
        new Cliente(4, "Carlos Díaz", "Cl 15 # 7-30", 150, 1),
        new Cliente(5, "Sofía Ramos", "Cra 12 # 4-18", 2750, 2)
    };

    static Cliente buscar(int numero) {
        for (Cliente c : CLIENTES) if (c.numero() == numero) return c;
        return null;
    }

    public static void main(String[] args) {
        System.out.println("== Ej. 65: factura telefónica ==");
        boolean hayMas;
        do {
            int nc = Consola.leerEntero("Dame el nº de cliente NC");
            int la = Consola.leerEntero("Dame la lectura actual LA", 0, Integer.MAX_VALUE);
            Cliente c = buscar(nc);
            if (c == null) {
                System.out.println("Error: no existe ese cliente.");
            } else if (la < c.lecturaAnterior()) {
                System.out.println("Error: la lectura actual (" + la + ") es menor que la anterior (" + c.lecturaAnterior() + ").");
            } else {
                int pasos = la - c.lecturaAnterior();
                int consumo = pasos * PRECIO_PASO;
                int alquiler = ALQUILER_ZONA[c.zona()];
                System.out.println("========== FACTURA ==========");
                System.out.println("Cliente: " + c.numero() + " - " + c.nombre());
                System.out.println("Dirección: " + c.direccion() + " | Zona: " + c.zona());
                System.out.println("Lectura anterior: " + c.lecturaAnterior() + " | Lectura actual: " + la);
                System.out.printf(Locale.US, "Pasos consumidos: %d x %d ptas = %d ptas%n", pasos, PRECIO_PASO, consumo);
                System.out.printf(Locale.US, "Alquiler zona %d: %d ptas%n", c.zona(), alquiler);
                System.out.printf(Locale.US, "TOTAL A PAGAR: %d ptas%n", consumo + alquiler);
            }
            hayMas = Consola.leerSiNo("¿Hay más clientes?");
        } while (hayMas);
    }
}
