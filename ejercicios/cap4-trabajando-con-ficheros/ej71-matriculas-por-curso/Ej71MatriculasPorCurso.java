import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Ejercicio 71 (cap. 4): fichero secuencial de matrículas. Contar los alumnos matriculados en cada curso y, dentro de
 * 1.º, los que pagan más de 1.000 ptas de tasas.
 * Registro (texto): numero;nombre;curso;tasas;rama;especialidad  (el campo "información" del libro no se usa).
 */
public class Ej71MatriculasPorCurso {
    static final Path RUTA = Path.of("datos", "matriculas.csv");

    static void crearDemo() throws IOException {
        Files.createDirectories(RUTA.getParent());
        Files.write(RUTA, List.of(
                "1;Ana Ruiz;1;1200;FP;Informática",
                "2;Luis Gómez;1;900;FP;Informática",
                "3;Marta Gil;2;1500;FP;Electrónica",
                "4;Pedro Soto;3;800;FP;Informática",
                "5;Lucía Vera;1;1000;FP;Administración",
                "6;Iván Paz;1;1001;FP;Informática",
                "7;Sara León;2;700;FP;Informática"), StandardCharsets.UTF_8);
        System.out.println("(No existía datos/matriculas.csv: se creó un fichero de demostración con 7 matrículas.)");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("== Ej. 71: matrículas por curso ==");
        if (!Files.exists(RUTA)) crearDemo();
        int[] porCurso = new int[4];
        int primeroMasDe1000 = 0;
        for (String linea : Files.readAllLines(RUTA, StandardCharsets.UTF_8)) {
            if (linea.isBlank()) continue;
            String[] c = linea.split(";");
            int curso = Integer.parseInt(c[2].trim());
            double tasas = Double.parseDouble(c[3].trim());
            if (curso < 1 || curso > 3) {
                System.out.println("  Registro ignorado (curso no válido): " + linea);
                continue;
            }
            porCurso[curso]++;
            if (curso == 1 && tasas > 1000) primeroMasDe1000++;
        }
        for (int curso = 1; curso <= 3; curso++) System.out.println("Alumnos matriculados en " + curso + ".º: " + porCurso[curso]);
        System.out.println("Alumnos de 1.º que pagan más de 1.000 ptas: " + primeroMasDe1000);
    }
}
