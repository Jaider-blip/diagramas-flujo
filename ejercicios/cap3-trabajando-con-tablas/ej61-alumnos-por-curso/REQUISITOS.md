# Ej. 61 — Alumnos por curso y sexo

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 84-85 (PDF pág. 44)

## 1. Enunciado del libro (resumido)

Matriz en memoria con los datos de los alumnos de un colegio: curso, sexo, nº de matrícula y nombre. Investigar de los 500 alumnos cuántos hay de cada curso y, dentro de cada curso, cuántos niños y cuántas niñas (3 cursos).

## 2. Historia de usuario

Como director del colegio quiero ver cuántos alumnos hay por curso y sexo para planificar los grupos.

## 3. Requerimientos funcionales

- **RF-01** Leer el número de alumnos y, por cada uno, curso (1–3), sexo, matrícula y nombre.
- **RF-02** Contar niños y niñas por curso.
- **RF-03** Mostrar por curso: total, niños y niñas; y el total general.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero | El libro usa 500 |
| Curso | 1–3 |  |
| Sexo | M / F | M = niño, F = niña (convención asumida) |
| Matrícula, Nombre | Texto |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Por curso | Enteros | Total, niños, niñas |
| Total | Entero | Alumnos procesados |

## 5. Reglas de negocio

- Total curso = niños + niñas.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej61.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej61.in` / `ej61.out`).

## 7. Supuestos y decisiones

- El libro no define el código del sexo; se asume M (niño) y F (niña).
- Se usan arreglos de contadores por curso en lugar de 9 variables sueltas.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 5 alumnos: 1.º M, 1.º F, 2.º F, 3.º M, 1.º M | Curso 1: 3 (2 niños, 1 niña) · Curso 2: 1 (0,1) · Curso 3: 1 (1,0) · Total 5 |

La entrada completa de la prueba automática está en `ej61.in` y la salida de referencia en `ej61.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej61.drawio`](ej61.drawio) |
| Código Java | [`Ej61AlumnosPorCurso.java`](Ej61AlumnosPorCurso.java) |
| Prueba automática | `ej61.in` → `ej61.out` |

**Ejecutar:** `java -cp out Ej61AlumnosPorCurso < ej61.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej61AlumnosPorCurso`.
