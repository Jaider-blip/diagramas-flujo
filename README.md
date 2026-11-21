# Diagramas de flujo → análisis de requerimientos → Java

Ejercicios del libro **«Diagramas de flujo. Ejercicios y problemas»** (P. Pérez-Lemaur, Paraninfo). Se escogieron **6 ejercicios por capítulo** (4 capítulos con ejercicios numerados = **24 ejercicios**). Cada uno tiene:

1. **Diagrama de flujo** en formato `.drawio` (se abre en <https://app.diagrams.net/>: *Archivo → Abrir desde → Dispositivo*).
2. **Análisis de requerimientos** (`REQUISITOS.md`): historia de usuario, RF, RNF, entradas/salidas, reglas, supuestos, casos de prueba y criterios de aceptación. También se publican como **issues** de GitHub (ver más abajo).
3. **Programa en Java** (consola) con su prueba automática (`ejNN.in` → `ejNN.out`).

## Ejercicios

| Ej. | Cap. | Título | Carpeta |
|---|---|---|---|
| 20 | 2 | Descuento por tanto por ciento | [`ej20-descuento`](ejercicios/cap2-primeros-organigramas/ej20-descuento) |
| 22 | 2 | Salario semanal de los operarios | [`ej22-salario-operarios`](ejercicios/cap2-primeros-organigramas/ej22-salario-operarios) |
| 26 | 2 | Ecuación de segundo grado | [`ej26-ecuacion-segundo-grado`](ejercicios/cap2-primeros-organigramas/ej26-ecuacion-segundo-grado) |
| 28 | 2 | Sondeo de votaciones | [`ej28-votaciones`](ejercicios/cap2-primeros-organigramas/ej28-votaciones) |
| 30 | 2 | Encuesta sobre televisión | [`ej30-encuesta-television`](ejercicios/cap2-primeros-organigramas/ej30-encuesta-television) |
| 31 | 2 | Fecha juliana | [`ej31-fecha-juliana`](ejercicios/cap2-primeros-organigramas/ej31-fecha-juliana) |
| 50 | 3 | Búsqueda binaria en una lista ordenada | [`ej50-busqueda-binaria`](ejercicios/cap3-trabajando-con-tablas/ej50-busqueda-binaria) |
| 56 | 3 | Suma de filas y columnas de una matriz | [`ej56-suma-filas-columnas`](ejercicios/cap3-trabajando-con-tablas/ej56-suma-filas-columnas) |
| 60 | 3 | Ordenar de menor a mayor cada fila de una matriz | [`ej60-ordenar-filas`](ejercicios/cap3-trabajando-con-tablas/ej60-ordenar-filas) |
| 61 | 3 | Alumnos por curso y sexo | [`ej61-alumnos-por-curso`](ejercicios/cap3-trabajando-con-tablas/ej61-alumnos-por-curso) |
| 64 | 3 | Pasar un número decimal a binario | [`ej64-decimal-a-binario`](ejercicios/cap3-trabajando-con-tablas/ej64-decimal-a-binario) |
| 65 | 3 | Factura detallada de la compañía telefónica | [`ej65-factura-telefonica`](ejercicios/cap3-trabajando-con-tablas/ej65-factura-telefonica) |
| 67 | 4 | Crear un fichero con organización indexada | [`ej67-fichero-indexado`](ejercicios/cap4-trabajando-con-ficheros/ej67-fichero-indexado) |
| 68 | 4 | Fichero relativo de 200 registros | [`ej68-fichero-relativo`](ejercicios/cap4-trabajando-con-ficheros/ej68-fichero-relativo) |
| 69 | 4 | Empleados nacidos en 1940 y 1941 | [`ej69-nacidos-1940-1941`](ejercicios/cap4-trabajando-con-ficheros/ej69-nacidos-1940-1941) |
| 70 | 4 | Menores de 18 años y mujeres | [`ej70-menores-18-y-mujeres`](ejercicios/cap4-trabajando-con-ficheros/ej70-menores-18-y-mujeres) |
| 71 | 4 | Matriculados por curso | [`ej71-matriculas-por-curso`](ejercicios/cap4-trabajando-con-ficheros/ej71-matriculas-por-curso) |
| 72 | 4 | Ventas por vendedor y pedidos por stock mínimo | [`ej72-ventas-y-stock`](ejercicios/cap4-trabajando-con-ficheros/ej72-ventas-y-stock) |
| 81 | 5 | Factorial de N números (estructurado) | [`ej81-factorial-n-numeros`](ejercicios/cap5-organigramas-estructurados/ej81-factorial-n-numeros) |
| 83 | 5 | Encuesta de becas en un instituto (estructurado) | [`ej83-encuesta-instituto`](ejercicios/cap5-organigramas-estructurados/ej83-encuesta-instituto) |
| 89 | 5 | Ordenar una tabla de mayor a menor (estructurado) | [`ej89-ordenar-tabla`](ejercicios/cap5-organigramas-estructurados/ej89-ordenar-tabla) |
| 90 | 5 | Decimal a cualquier otra base (estructurado) | [`ej90-decimal-a-otra-base`](ejercicios/cap5-organigramas-estructurados/ej90-decimal-a-otra-base) |
| 91 | 5 | Votantes con edad suficiente (estructurado) | [`ej91-votantes`](ejercicios/cap5-organigramas-estructurados/ej91-votantes) |
| 92 | 5 | Recibos de un videoclub (estructurado) | [`ej92-recibos-videoclub`](ejercicios/cap5-organigramas-estructurados/ej92-recibos-videoclub) |

## Cómo ejecutar

Requiere JDK 17 o superior.

```bash
./scripts/probar.sh                 # compila todo y verifica los 24 ejercicios
java -cp out Ej20Descuento          # ejecutar uno de forma interactiva
```

Estructura: `common/` (utilidades de entrada compartidas) · `ejercicios/capN-…/ejNN-…/` (diagrama, requisitos, código, pruebas) · `scripts/` · `.github/` (CI e issues).

## Subir a GitHub y crear los issues de requerimientos

```bash
git remote add origin https://github.com/<tu-usuario>/diagramas-flujo-java.git
git push -u origin main
gh auth login                       # una sola vez
./scripts/crear_issues.sh           # crea 24 issues con etiquetas por capítulo
```

## Notas sobre el libro

- El libro tiene 4 capítulos con ejercicios numerados: 2 (Ej. 1–31), 3 (32–65), 4 (66–76) y 5 «estructurados» (77–100); las «aplicaciones completas» no son ejercicios numerados y no se incluyeron.
- Los diagramas de los ejercicios estructurados del cap. 5 están dibujados como diagramas de flujo clásicos con la misma lógica (el libro los presenta en estilo estructurado).
- Los supuestos donde el enunciado es ambiguo están documentados en cada `REQUISITOS.md`.
