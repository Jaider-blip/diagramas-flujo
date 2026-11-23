# Diagramas de flujo → análisis de requerimientos → Java

Ejercicios del libro **«Diagramas de flujo. Ejercicios y problemas»**: **6 ejercicios por capítulo (24 en total)**. Cada uno tiene:

1. **Diagrama de flujo** en formato `.drawio` (se abre en <https://app.diagrams.net/>: *Archivo → Abrir desde → Dispositivo*).
2. **Análisis de requerimientos** (`REQUISITOS.md`): historia de usuario, RF, RNF, entradas/salidas, reglas, supuestos, casos de prueba y criterios de aceptación. También se publican como **issues** de GitHub.
3. **Programa en Java** (consola) con su prueba automática (`ejNN.in` → `ejNN.out`).

## Ejercicios

| Ej. | Cap. | Título | Carpeta |
|---|---|---|---|
| 1 | 2 | Suma de dos números | [`ej01-suma-dos-numeros`](ejercicios/cap2-primeros-organigramas/ej01-suma-dos-numeros) |
| 3 | 2 | Cubo de un número | [`ej03-cubo-de-un-numero`](ejercicios/cap2-primeros-organigramas/ej03-cubo-de-un-numero) |
| 4 | 2 | Suma de los diez primeros números pares | [`ej04-suma-diez-primeros-pares`](ejercicios/cap2-primeros-organigramas/ej04-suma-diez-primeros-pares) |
| 7 | 2 | Positivo o negativo | [`ej07-positivo-o-negativo`](ejercicios/cap2-primeros-organigramas/ej07-positivo-o-negativo) |
| 16 | 2 | Par o impar | [`ej16-par-o-impar`](ejercicios/cap2-primeros-organigramas/ej16-par-o-impar) |
| 18 | 2 | Factorial de un número | [`ej18-factorial`](ejercicios/cap2-primeros-organigramas/ej18-factorial) |
| 32 | 3 | Lista en memoria de diez elementos | [`ej32-lista-diez-elementos`](ejercicios/cap3-trabajando-con-tablas/ej32-lista-diez-elementos) |
| 34 | 3 | Lista de N elementos rellena con ceros | [`ej34-lista-de-ceros`](ejercicios/cap3-trabajando-con-tablas/ej34-lista-de-ceros) |
| 36 | 3 | Contar positivos, negativos y ceros de una lista | [`ej36-positivos-negativos-ceros`](ejercicios/cap3-trabajando-con-tablas/ej36-positivos-negativos-ceros) |
| 39 | 3 | Suma de los elementos de una lista | [`ej39-suma-de-elementos`](ejercicios/cap3-trabajando-con-tablas/ej39-suma-de-elementos) |
| 44 | 3 | Valor más grande y su posición | [`ej44-mayor-y-posicion`](ejercicios/cap3-trabajando-con-tablas/ej44-mayor-y-posicion) |
| 45 | 3 | Ordenar una tabla de menor a mayor | [`ej45-ordenar-menor-a-mayor`](ejercicios/cap3-trabajando-con-tablas/ej45-ordenar-menor-a-mayor) |
| 66 | 4 | Crear un fichero secuencial de 1.000 registros | [`ej66-fichero-secuencial`](ejercicios/cap4-trabajando-con-ficheros/ej66-fichero-secuencial) |
| 67 | 4 | Crear un fichero con organización indexada | [`ej67-fichero-indexado`](ejercicios/cap4-trabajando-con-ficheros/ej67-fichero-indexado) |
| 68 | 4 | Fichero relativo de 200 registros | [`ej68-fichero-relativo`](ejercicios/cap4-trabajando-con-ficheros/ej68-fichero-relativo) |
| 69 | 4 | Empleados nacidos en 1940 y 1941 | [`ej69-nacidos-1940-1941`](ejercicios/cap4-trabajando-con-ficheros/ej69-nacidos-1940-1941) |
| 70 | 4 | Menores de 18 años y mujeres | [`ej70-menores-18-y-mujeres`](ejercicios/cap4-trabajando-con-ficheros/ej70-menores-18-y-mujeres) |
| 71 | 4 | Matriculados por curso | [`ej71-matriculas-por-curso`](ejercicios/cap4-trabajando-con-ficheros/ej71-matriculas-por-curso) |
| 77 | 5 | Suma de los diez primeros números pares (estructurado) | [`ej77-suma-diez-pares`](ejercicios/cap5-organigramas-estructurados/ej77-suma-diez-pares) |
| 78 | 5 | Positivo o negativo (estructurado) | [`ej78-positivo-o-negativo`](ejercicios/cap5-organigramas-estructurados/ej78-positivo-o-negativo) |
| 79 | 5 | Los N primeros múltiplos de 3 | [`ej79-multiplos-de-3`](ejercicios/cap5-organigramas-estructurados/ej79-multiplos-de-3) |
| 80 | 5 | Contar números pares e impares | [`ej80-pares-e-impares`](ejercicios/cap5-organigramas-estructurados/ej80-pares-e-impares) |
| 81 | 5 | Factorial de N números (estructurado) | [`ej81-factorial-n-numeros`](ejercicios/cap5-organigramas-estructurados/ej81-factorial-n-numeros) |
| 86 | 5 | Positivos, negativos y ceros de una lista (estructurado) | [`ej86-positivos-negativos-ceros`](ejercicios/cap5-organigramas-estructurados/ej86-positivos-negativos-ceros) |

## Cómo ejecutar

Requiere JDK 17 o superior.

```bash
./scripts/probar.sh                 # compila todo y verifica los 24 ejercicios
java -cp out Ej18Factorial          # ejecutar uno de forma interactiva
```

Estructura: `common/` (utilidades de entrada compartidas) · `ejercicios/capN-…/ejNN-…/` (diagrama, requisitos, código, pruebas) · `scripts/` · `.github/` (CI e issues).

## Subir a GitHub y crear los issues de requerimientos

```bash
git remote add origin https://github.com/<tu-usuario>/diagramas-flujo-java.git
git push -u origin main
gh auth login                       # una sola vez
./scripts/crear_issues.sh           # crea 24 issues con etiquetas por capítulo
```

## Notas

- Capítulos con ejercicios numerados: 2 (Ej. 1–31), 3 (32–65), 4 (66–76) y 5 «estructurados» (77–100).
- Los diagramas de los ejercicios estructurados del cap. 5 están dibujados como diagramas de flujo clásicos con la misma lógica.
- Los supuestos donde el enunciado es ambiguo están documentados en cada `REQUISITOS.md`.
- Los ficheros del cap. 4 se adaptan a Java con archivos de texto/binarios en la carpeta `datos/`.
