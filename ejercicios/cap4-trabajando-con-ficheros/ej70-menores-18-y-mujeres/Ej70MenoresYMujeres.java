import java.io.IOException;
import java.time.LocalDate;

/** Ejercicio 70 (cap. 4): en un fichero secuencial de empleados, contar los menores de 18 años y las mujeres. */
public class Ej70MenoresYMujeres {
    public static void main(String[] args) throws IOException {
        System.out.println("== Ej. 70: menores de 18 años y mujeres ==");
        LocalDate hoy = Consola.leerFecha("Fecha actual FA:");
        int menores = 0, mujeres = 0;
        for (FicheroEmpleados.Empleado e : FicheroEmpleados.leerOCrearDemo()) {
            if (!Consola.tieneAlMenos(e.nacimiento(), hoy, 18)) menores++;
            if (e.sexo() == 'M') mujeres++;
        }
        System.out.println("Total de menores de 18 años: " + menores);
        System.out.println("Total de mujeres: " + mujeres);
    }
}
