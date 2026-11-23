#!/usr/bin/env bash
# Crea un issue de GitHub por ejercicio con su análisis de requerimientos. Requiere GitHub CLI (gh) autenticado.
set -e
cd "$(dirname "$0")/.."
gh label create "capitulo-2" --description "Los primeros organigramas" --force || true
gh label create "capitulo-3" --description "Trabajando con tablas" --force || true
gh label create "capitulo-4" --description "Trabajando con ficheros" --force || true
gh label create "capitulo-5" --description "Organigramas estructurados" --force || true
gh label create requerimiento --force || true
gh issue create --title "Ej. 1 — Suma de dos números" --body-file "ejercicios/cap2-primeros-organigramas/ej01-suma-dos-numeros/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 3 — Cubo de un número" --body-file "ejercicios/cap2-primeros-organigramas/ej03-cubo-de-un-numero/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 4 — Suma de los diez primeros números pares" --body-file "ejercicios/cap2-primeros-organigramas/ej04-suma-diez-primeros-pares/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 7 — Positivo o negativo" --body-file "ejercicios/cap2-primeros-organigramas/ej07-positivo-o-negativo/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 16 — Par o impar" --body-file "ejercicios/cap2-primeros-organigramas/ej16-par-o-impar/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 18 — Factorial de un número" --body-file "ejercicios/cap2-primeros-organigramas/ej18-factorial/REQUISITOS.md" --label requerimiento --label capitulo-2
gh issue create --title "Ej. 32 — Lista en memoria de diez elementos" --body-file "ejercicios/cap3-trabajando-con-tablas/ej32-lista-diez-elementos/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 34 — Lista de N elementos rellena con ceros" --body-file "ejercicios/cap3-trabajando-con-tablas/ej34-lista-de-ceros/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 36 — Contar positivos, negativos y ceros de una lista" --body-file "ejercicios/cap3-trabajando-con-tablas/ej36-positivos-negativos-ceros/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 39 — Suma de los elementos de una lista" --body-file "ejercicios/cap3-trabajando-con-tablas/ej39-suma-de-elementos/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 44 — Valor más grande y su posición" --body-file "ejercicios/cap3-trabajando-con-tablas/ej44-mayor-y-posicion/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 45 — Ordenar una tabla de menor a mayor" --body-file "ejercicios/cap3-trabajando-con-tablas/ej45-ordenar-menor-a-mayor/REQUISITOS.md" --label requerimiento --label capitulo-3
gh issue create --title "Ej. 66 — Crear un fichero secuencial de 1.000 registros" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej66-fichero-secuencial/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 67 — Crear un fichero con organización indexada" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej67-fichero-indexado/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 68 — Fichero relativo de 200 registros" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej68-fichero-relativo/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 69 — Empleados nacidos en 1940 y 1941" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej69-nacidos-1940-1941/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 70 — Menores de 18 años y mujeres" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej70-menores-18-y-mujeres/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 71 — Matriculados por curso" --body-file "ejercicios/cap4-trabajando-con-ficheros/ej71-matriculas-por-curso/REQUISITOS.md" --label requerimiento --label capitulo-4
gh issue create --title "Ej. 77 — Suma de los diez primeros números pares (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej77-suma-diez-pares/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 78 — Positivo o negativo (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej78-positivo-o-negativo/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 79 — Los N primeros múltiplos de 3" --body-file "ejercicios/cap5-organigramas-estructurados/ej79-multiplos-de-3/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 80 — Contar números pares e impares" --body-file "ejercicios/cap5-organigramas-estructurados/ej80-pares-e-impares/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 81 — Factorial de N números (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej81-factorial-n-numeros/REQUISITOS.md" --label requerimiento --label capitulo-5
gh issue create --title "Ej. 86 — Positivos, negativos y ceros de una lista (estructurado)" --body-file "ejercicios/cap5-organigramas-estructurados/ej86-positivos-negativos-ceros/REQUISITOS.md" --label requerimiento --label capitulo-5
