import java.io.IOException;
import java.time.LocalDate;
import java.util.TreeMap;

/**
 * Ejercicio 67 (cap. 4): crear un fichero con organización indexada. El campo clave es el número de empleado.
 * Implementación: el fichero datos/empleados.csv se carga como índice (TreeMap) y se vuelve a grabar ordenado por clave.
 */
public class Ej67FicheroIndexado {
    public static void main(String[] args) throws IOException {
        System.out.println("== Ej. 67: crear fichero indexado de empleados ==");
        TreeMap<Integer, FicheroEmpleados.Empleado> indice = FicheroEmpleados.leerIndexado(); // abrir fichero
        System.out.println("Fichero abierto con " + indice.size() + " registros previos.");
        boolean hayMas;
        do {
            int clave = Consola.leerEntero("Dame el campo clave (nº de empleado)", 1, 999999);
            if (indice.containsKey(clave)) {
                System.out.println("  Error: la clave " + clave + " ya existe; no se graba el registro.");
            } else {
                String nombre = Consola.leerTexto("Nombre del empleado").replace(';', ',');
                LocalDate nacimiento = Consola.leerFecha("Fecha de nacimiento:");
                String sexo;
                while (true) {
                    sexo = Consola.leerTexto("Sexo (H=hombre, M=mujer)").toUpperCase();
                    if (sexo.equals("H") || sexo.equals("M")) break;
                    System.out.println("  Escribe H o M.");
                }
                indice.put(clave, new FicheroEmpleados.Empleado(clave, nombre, nacimiento, sexo.charAt(0))); // grabar registro
                System.out.println("  Registro grabado.");
            }
            hayMas = Consola.leerSiNo("¿Hay más registros?");
        } while (hayMas);
        FicheroEmpleados.guardar(indice); // cerrar fichero
        System.out.println("Fichero cerrado. Total de registros: " + indice.size());
    }
}
