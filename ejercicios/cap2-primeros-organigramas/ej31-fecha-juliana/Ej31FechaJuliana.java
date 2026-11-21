/** Ejercicio 31 (cap. 2): dada una fecha juliana (día del año, 1..365) indicar a qué día y mes corresponde. */
public class Ej31FechaJuliana {
    static final String[] MESES = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO",
            "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
    static final int[] DIAS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println("== Ej. 31: fecha juliana (año no bisiesto) ==");
        boolean hayMas;
        do {
            int f = Consola.leerEntero("Fecha juliana F", 1, 365);
            int x = f;
            int m = 0;
            while (x > DIAS[m]) {
                x -= DIAS[m];
                m++;
            }
            System.out.println("Es el " + x + " de " + MESES[m]);
            hayMas = Consola.leerSiNo("¿Hay más fechas?");
        } while (hayMas);
    }
}
