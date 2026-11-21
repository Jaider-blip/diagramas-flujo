/**
 * Ejercicio 83 (cap. 5, estructurado): encuesta en un instituto de Formación Profesional. Se desea saber cuántos alumnos
 * tienen beca y cuántos no; de los que tienen beca, cuántos son de 1.º, 2.º y 3.º; y de los que no la tienen,
 * cuántos son de Informática.
 */
public class Ej83EncuestaInstituto {
    public static void main(String[] args) {
        System.out.println("== Ej. 83: encuesta de becas en el instituto ==");
        int conBeca = 0, sinBeca = 0, sinBecaInformatica = 0;
        int[] becaPorCurso = new int[4];
        boolean hayMas;
        do {
            if (Consola.leerSiNo("¿Tiene beca?")) {
                conBeca++;
                becaPorCurso[Consola.leerEntero("Curso", 1, 3)]++;
            } else {
                sinBeca++;
                if (Consola.leerSiNo("¿Es de Informática?")) sinBecaInformatica++;
            }
            hayMas = Consola.leerSiNo("¿Hay más alumnos?");
        } while (hayMas);

        System.out.println("---- Resultados ----");
        System.out.println("Alumnos con beca: " + conBeca);
        for (int c = 1; c <= 3; c++) System.out.println("  de " + c + ".º: " + becaPorCurso[c]);
        System.out.println("Alumnos sin beca: " + sinBeca);
        System.out.println("  de Informática: " + sinBecaInformatica);
    }
}
