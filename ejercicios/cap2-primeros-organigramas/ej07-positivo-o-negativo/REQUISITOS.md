# Ej. 7 — Positivo o negativo

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 24-25 (PDF pág. 14)

## 1. Enunciado del libro (resumido)

Dado un número, contestar si es positivo o negativo.

## 2. Historia de usuario

Como usuario quiero saber el signo de un número.

## 3. Requerimientos funcionales

- **RF-01** Solicitar N.
- **RF-02** Si N > 0: «positivo».
- **RF-03** Si N < 0: «negativo».
- **RF-04** Si N = 0: informar que es cero.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Decimal |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Mensaje | Texto | Positivo / negativo / cero |

## 5. Reglas de negocio

- Signo según comparación con 0.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej07.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej07.in` / `ej07.out`).

## 7. Supuestos y decisiones

- El libro solo prevé positivo/negativo; se añade el caso del cero para que no quede mal clasificado.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=−4 | negativo |
| N=12 | positivo |
| N=0 | cero |

La entrada completa de la prueba automática está en `ej07.in` y la salida de referencia en `ej07.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej07.drawio`](ej07.drawio) |
| Código Java | [`Ej07PositivoONegativo.java`](Ej07PositivoONegativo.java) |
| Prueba automática | `ej07.in` → `ej07.out` |

**Ejecutar:** `java -cp out Ej07PositivoONegativo < ej07.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej07PositivoONegativo`.
