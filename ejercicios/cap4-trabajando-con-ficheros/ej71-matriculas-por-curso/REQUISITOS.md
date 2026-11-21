# Ej. 71 — Matriculados por curso

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 4: Trabajando con ficheros · págs. 100-101 (PDF pág. 52)

## 1. Enunciado del libro (resumido)

Dado un fichero secuencial con registros de la forma: nº, nombre, tasas, rama, especialidad, información; contar el número de alumnos matriculados en cada curso y, dentro de los de 1.º, los que pagan más de 1.000 ptas.

## 2. Historia de usuario

Como secretario del centro quiero conocer las matrículas por curso y cuántos alumnos de 1.º pagan tasas altas.

## 3. Requerimientos funcionales

- **RF-01** Abrir el fichero secuencial de matrículas (si no existe, se crea uno de demostración).
- **RF-02** Leer registro a registro hasta fin de fichero.
- **RF-03** Contar los alumnos de cada curso (1.º, 2.º, 3.º).
- **RF-04** Contar, entre los de 1.º, los que pagan más de 1.000 ptas.
- **RF-05** Ignorar y avisar de los registros con curso no válido.
- **RF-06** Mostrar los resultados.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| datos/matriculas.csv | Fichero secuencial | Registros: nº; nombre; curso; tasas; rama; especialidad |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| C1, C2, C3 | Enteros | Matriculados por curso |
| P | Entero | Alumnos de 1.º con tasas > 1000 |

## 5. Reglas de negocio

- «Más de 1.000» es estrictamente mayor (1.000 no cuenta).

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej71.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej71.in` / `ej71.out`).

## 7. Supuestos y decisiones

- El enunciado no indica dónde va el curso: se añade el campo «curso» al registro.
- El campo «información» no se usa.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Demo de 7 matrículas | 1.º: 4 · 2.º: 2 · 3.º: 1 · 1.º con tasas > 1000: 2 |

La entrada completa de la prueba automática está en `ej71.in` y la salida de referencia en `ej71.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej71.drawio`](ej71.drawio) |
| Código Java | [`Ej71MatriculasPorCurso.java`](Ej71MatriculasPorCurso.java) |
| Prueba automática | `ej71.in` → `ej71.out` |

**Ejecutar:** `java -cp out Ej71MatriculasPorCurso < ej71.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej71MatriculasPorCurso`.
