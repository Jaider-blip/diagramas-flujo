import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Ejercicio 68 (cap. 4): crear un fichero de acceso directo con organización relativa para 200 registros,
 * rellenándolo a ceros (campos numéricos) y espacios (campos de texto).
 * Registro de longitud fija: clave (int, 4 bytes) + nombre (30 bytes) + cantidad (int, 4 bytes) = 38 bytes.
 */
public class Ej68FicheroRelativo {
    static final int REGISTROS = 200;
    static final int LONG_NOMBRE = 30;
    static final int LONG_REGISTRO = 4 + LONG_NOMBRE + 4;
    static final String RUTA = "datos/articulos.rel";

    static void grabar(RandomAccessFile f, int clave, String nombre, int cantidad) throws IOException {
        byte[] n = new byte[LONG_NOMBRE];
        Arrays.fill(n, (byte) ' ');
        byte[] src = nombre.getBytes(StandardCharsets.US_ASCII);
        System.arraycopy(src, 0, n, 0, Math.min(src.length, LONG_NOMBRE));
        f.seek((long) (clave - 1) * LONG_REGISTRO); // acceso directo por nº de registro
        f.writeInt(0);
        f.write(n);
        f.writeInt(cantidad);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("== Ej. 68: crear fichero relativo de 200 registros ==");
        new java.io.File("datos").mkdirs();
        try (RandomAccessFile f = new RandomAccessFile(RUTA, "rw")) { // abrir fichero
            f.setLength(0);
            for (int clave = 1; clave <= REGISTROS; clave++) {
                grabar(f, clave, "", 0); // rellenar a ceros y espacios y grabar
            }
            System.out.println("Fichero creado: " + RUTA + " con " + REGISTROS + " registros, " + f.length() + " bytes.");
            for (int clave : new int[] {1, 100, REGISTROS}) { // verificación por acceso directo
                f.seek((long) (clave - 1) * LONG_REGISTRO);
                int k = f.readInt();
                byte[] n = new byte[LONG_NOMBRE];
                f.readFully(n);
                int c = f.readInt();
                boolean vacio = new String(n, StandardCharsets.US_ASCII).isBlank();
                System.out.println("Registro " + clave + ": clave=" + k + ", nombre en blanco=" + vacio + ", cantidad=" + c);
            }
        } // cerrar fichero
    }
}
