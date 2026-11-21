# Ej. 83 — Encuesta de becas en un instituto (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 180-181 (PDF pág. 92)

## 1. Enunciado del libro (resumido)

En la puerta de un Instituto de Formación Profesional se hace una encuesta: cuántos alumnos tienen beca y cuántos no; dentro de los que tienen beca, cuántos son de 1.º, 2.º y 3.º; y dentro de los que no la tienen, cuántos son de Informática.

## 2. Historia de usuario

Como orientador quiero registrar la encuesta de becas para conocer su distribución por curso y especialidad.

## 3. Requerimientos funcionales

- **RF-01** Por alumno preguntar si tiene beca.
- **RF-02** Con beca: pedir el curso (1–3) y contar total y por curso.
- **RF-03** Sin beca: preguntar si es de Informática y contar total y de Informática.
- **RF-04** Preguntar si hay más alumnos y repetir; mostrar los resultados.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| Beca | 1 / 0 |  |
| Curso | 1–3 | Solo con beca |
| Informática | 1 / 0 | Solo sin beca |
| Más alumnos | 1 / 0 |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Totales | Enteros | Con beca (y por curso), sin beca (y de Informática) |

## 5. Reglas de negocio

- El curso solo se pregunta a quien tiene beca; Informática solo a quien no la tiene.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej83.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej83.in` / `ej83.out`).

## 7. Supuestos y decisiones

- Se responde 1/0 (también se aceptan s/n).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 5 alumnos: beca 1.º, beca 2.º, sin beca Informática, sin beca no Informática, sin beca no Informática | Con beca 2 (1.º:1, 2.º:1, 3.º:0) · Sin beca 3 (Informática: 1) |

La entrada completa de la prueba automática está en `ej83.in` y la salida de referencia en `ej83.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej83.drawio`](ej83.drawio) |
| Código Java | [`Ej83EncuestaInstituto.java`](Ej83EncuestaInstituto.java) |
| Prueba automática | `ej83.in` → `ej83.out` |

**Ejecutar:** `java -cp out Ej83EncuestaInstituto < ej83.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej83EncuestaInstituto`.
