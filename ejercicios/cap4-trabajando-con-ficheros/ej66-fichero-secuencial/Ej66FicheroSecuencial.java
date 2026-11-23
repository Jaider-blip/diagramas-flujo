import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Ejercicio 66 (cap. 4): crear un fichero con organización secuencial para 1.000 registros.
 * Registro (texto, una línea por registro): numero;nombre;telefono. El número de registros se pide (máx. 1.000)
 * para poder probarlo con pocos datos; con N = 1000 reproduce el enunciado.
 */
public class Ej66FicheroSecuencial {
    static final Path RUTA = Path.of("datos", "secuencial.txt");

    public static void main(String[] args) throws IOException {
        System.out.println("== Ej. 66: crear fichero secuencial ==");
        int n = Consola.leerEntero("Número de registros N (el libro usa 1000)", 1, 1000);
        Files.createDirectories(RUTA.getParent());
        try (BufferedWriter w = Files.newBufferedWriter(RUTA, StandardCharsets.UTF_8)) { // abrir fichero
            for (int i = 1; i <= n; i++) {
                System.out.println("-- Registro " + i + " de " + n);
                String nombre = Consola.leerTexto("Nombre").replace(';', ',');
                String telefono = Consola.leerTexto("Teléfono").replace(';', ',');
                w.write(i + ";" + nombre + ";" + telefono);  // grabar registro
                w.newLine();
            }
        } // cerrar fichero
        List<String> lineas = Files.readAllLines(RUTA, StandardCharsets.UTF_8);
        System.out.println("Fichero cerrado: " + lineas.size() + " registros en " + RUTA);
        System.out.println("Primer registro: " + lineas.get(0));
        System.out.println("Último registro: " + lineas.get(lineas.size() - 1));
    }
}
