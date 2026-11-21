import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Fichero de empleados compartido por los ejercicios 67, 69 y 70.
 * Formato (texto, una línea por registro): numero;nombre;AAAA-MM-DD;sexo(H|M)
 */
public final class FicheroEmpleados {
    public static final Path RUTA = Path.of("datos", "empleados.csv");

    public record Empleado(int numero, String nombre, LocalDate nacimiento, char sexo) {
        String aLinea() {
            return numero + ";" + nombre + ";" + nacimiento + ";" + sexo;
        }
        static Empleado deLinea(String linea) {
            String[] p = linea.split(";");
            return new Empleado(Integer.parseInt(p[0].trim()), p[1].trim(), LocalDate.parse(p[2].trim()), p[3].trim().charAt(0));
        }
    }

    private FicheroEmpleados() { }

    public static boolean existe() {
        return Files.exists(RUTA);
    }

    /** Carga los registros en el orden en que están grabados (acceso secuencial). */
    public static List<Empleado> leerSecuencial() throws IOException {
        List<Empleado> lista = new ArrayList<>();
        if (!existe()) return lista;
        for (String linea : Files.readAllLines(RUTA, StandardCharsets.UTF_8)) {
            if (!linea.isBlank()) lista.add(Empleado.deLinea(linea));
        }
        return lista;
    }

    /** Carga el fichero como índice por clave (organización indexada simulada). */
    public static TreeMap<Integer, Empleado> leerIndexado() throws IOException {
        TreeMap<Integer, Empleado> indice = new TreeMap<>();
        for (Empleado e : leerSecuencial()) indice.put(e.numero(), e);
        return indice;
    }

    public static void guardar(TreeMap<Integer, Empleado> indice) throws IOException {
        Files.createDirectories(RUTA.getParent());
        List<String> lineas = new ArrayList<>();
        for (Empleado e : indice.values()) lineas.add(e.aLinea());
        Files.write(RUTA, lineas, StandardCharsets.UTF_8);
    }

    /** Si el fichero no existe crea uno de demostración para poder ejecutar los ejercicios 69 y 70. */
    public static List<Empleado> leerOCrearDemo() throws IOException {
        if (!existe()) {
            TreeMap<Integer, Empleado> demo = new TreeMap<>();
            Object[][] d = {
                {1, "Carlos Ruiz", "1940-03-12", 'H'}, {2, "Marta Gil", "1941-11-02", 'M'},
                {3, "Pedro Soto", "1955-07-30", 'H'}, {4, "Lucía Vera", "1941-01-15", 'M'},
                {5, "Iván Paz", "2010-05-20", 'H'}, {6, "Sara León", "2012-09-09", 'M'},
                {7, "Julio Mora", "1978-12-31", 'H'}, {8, "Elena Cruz", "1990-04-04", 'M'}};
            for (Object[] r : d) {
                demo.put((Integer) r[0], new Empleado((Integer) r[0], (String) r[1], LocalDate.parse((String) r[2]), (Character) r[3]));
            }
            guardar(demo);
            System.out.println("(No existía datos/empleados.csv: se creó un fichero de demostración con 8 empleados.)");
        }
        return leerSecuencial();
    }
}
