/**
 * Ejercicio 61 (cap. 3): matriz de alumnos de un colegio. Cada fila: curso, sexo, nº de matrícula, nombre.
 * Se cuenta cuántos alumnos hay de cada curso y, dentro de cada curso, cuántos niños y cuántas niñas.
 * El libro usa 500 alumnos y 3 cursos; aquí el número de alumnos se pide al inicio.
 * Convención de sexo asumida: M = niño (masculino), F = niña (femenino).
 */
public class Ej61AlumnosPorCurso {
    public static void main(String[] args) {
        System.out.println("== Ej. 61: alumnos por curso y sexo ==");
        int n = Consola.leerEntero("Número de alumnos (el libro usa 500)", 1, 5000);
        String[][] a = new String[n][4];
        int[] ninos = new int[4];
        int[] ninas = new int[4];
        for (int i = 0; i < n; i++) {
            System.out.println("-- Alumno " + (i + 1) + " de " + n);
            int curso = Consola.leerEntero("Curso", 1, 3);
            String sexo;
            while (true) {
                sexo = Consola.leerTexto("Sexo (M=niño, F=niña)").toUpperCase();
                if (sexo.equals("M") || sexo.equals("F")) break;
                System.out.println("  Escribe M o F.");
            }
            a[i][0] = String.valueOf(curso);
            a[i][1] = sexo;
            a[i][2] = Consola.leerTexto("Número de matrícula");
            a[i][3] = Consola.leerTexto("Nombre");
            if (sexo.equals("M")) ninos[curso]++; else ninas[curso]++;
        }
        int total = 0;
        for (int c = 1; c <= 3; c++) {
            System.out.println("Curso " + c + ": total " + (ninos[c] + ninas[c]) + " | niños " + ninos[c] + " | niñas " + ninas[c]);
            total += ninos[c] + ninas[c];
        }
        System.out.println("Total de alumnos: " + total);
    }
}
