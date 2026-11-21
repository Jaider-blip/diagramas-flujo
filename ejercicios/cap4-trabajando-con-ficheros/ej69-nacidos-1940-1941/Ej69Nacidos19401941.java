import java.io.IOException;

/** Ejercicio 69 (cap. 4): dado un fichero secuencial de empleados, contar los nacidos en 1940 y en 1941. */
public class Ej69Nacidos19401941 {
    public static void main(String[] args) throws IOException {
        System.out.println("== Ej. 69: empleados nacidos en 1940 y 1941 ==");
        int total = 0;
        for (FicheroEmpleados.Empleado e : FicheroEmpleados.leerOCrearDemo()) { // lectura secuencial hasta fin de fichero
            int anio = e.nacimiento().getYear();
            if (anio == 1940 || anio == 1941) total++;
        }
        System.out.println("Total de empleados nacidos en 1940 o 1941: " + total);
    }
}
