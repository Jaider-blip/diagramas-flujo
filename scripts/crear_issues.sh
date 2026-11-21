#!/usr/bin/env bash
# Crea un issue de GitHub por ejercicio con su análisis de requerimientos. Requiere GitHub CLI (gh) autenticado.
set -e
cd "$(dirname "$0")/.."
gh label create "capitulo-2" --description "Los primeros organigramas" --force || true
gh label create "capitulo-3" --description "Trabajando con tablas" --force || true
gh label create "capitulo-4" --description "Trabajando con ficheros" --force || true
gh label create "capitulo-5" --description "Organigramas estructurados" --force || true
gh label create requerimiento --force || true
gh issue create --title "Ej. 20 — Descuento por tanto por ciento" --body-file "ejercicios/cap2-primeros-organigramas/ej20-descuento/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 22 — Salario semanal de los operarios" --body-file "ejercicios/cap2-primeros-organigramas/ej22-salario-operarios/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 26 — Ecuación de segundo grado" --body-file "ejercicios/cap2-primeros-organigramas/ej26-ecuacion-segundo-grado/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 28 — Sondeo de votaciones" --body-file "ejercicios/cap2-primeros-organigramas/ej28-votaciones/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 30 — Encuesta sobre televisión" --body-file "ejercicios/cap2-primeros-organigramas/ej30-encuesta-television/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 31 — Fecha juliana" --body-file "ejercicios/cap2-primeros-organigramas/ej31-fecha-juliana/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 50 — Búsqueda binaria en una lista ordenada" --body-file "ejercicios/cap3-trabajando-con-tablas/ej50-busqueda-binaria/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 56 — Suma de filas y columnas de una matriz" --body-file "ejercicios/cap3-trabajando-con-tablas/ej56-suma-filas-columnas/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 60 — Ordenar de menor a mayor cada fila de una matriz" --body-file "ejercicios/cap3-trabajando-con-tablas/ej60-ordenar-filas/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 61 — Alumnos por curso y sexo" --body-file "ejercicios/cap3-trabajando-con-tablas/ej61-alumnos-por-curso/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 64 — Pasar un número decimal a binario" --body-file "ejercicios/cap3-trabajando-con-tablas/ej64-decimal-a-binario/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 65 — Factura detallada de la compañía telefónica" --body-file "ejercicios/cap3-trabajando-con-tablas/ej65-factura-telefonica/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 67 — Crear un fichero con organización indexada" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej67-fichero-indexado/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 68 — Fichero relativo de 200 registros" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej68-fichero-relativo/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 69 — Empleados nacidos en 1940 y 1941" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej69-nacidos-1940-1941/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 70 — Menores de 18 años y mujeres" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej70-menores-18-y-mujeres/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 71 — Matriculados por curso" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej71-matriculas-por-curso/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 72 — Ventas por vendedor y pedidos por stock mínimo" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej72-ventas-y-stock/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 81 — Factorial de N números (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej81-factorial-n-numeros/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 83 — Encuesta de becas en un instituto (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej83-encuesta-instituto/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 89 — Ordenar una tabla de mayor a menor (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej89-ordenar-tabla/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 90 — Decimal a cualquier otra base (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej90-decimal-a-otra-base/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 91 — Votantes con edad suficiente (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej91-votantes/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 92 — Recibos de un videoclub (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej92-recibos-videoclub/REQUISITOS.md" --label requerimiento --label capitulo-5
