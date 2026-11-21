# Ej. 28 — Sondeo de votaciones

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 44-45 (PDF pág. 24)

## 1. Enunciado del libro (resumido)

Realizar un sondeo para votaciones: mostrar «VOTA» o «NO VOTA» según se tengan 18 años o no, contando los que votan. Se pide la fecha de la votación y la fecha de nacimiento de cada individuo.

## 2. Historia de usuario

Como organizador de unas elecciones quiero saber quién tiene edad para votar y cuántas personas votan.

## 3. Requerimientos funcionales

- **RF-01** Solicitar la fecha de la votación.
- **RF-02** Por cada individuo, solicitar su fecha de nacimiento.
- **RF-03** Mostrar «VOTA» si cumple 18 años en la fecha de la votación o antes; si no, «NO VOTA».
- **RF-04** Contar los que votan.
- **RF-05** Preguntar si hay más personas y repetir; al final mostrar el total que vota.
- **RF-06** Rechazar fechas inexistentes y nacimientos posteriores a la votación.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| Fecha votación | Día, mes, año | Fecha de las elecciones |
| Fecha nacimiento | Día, mes, año | Por individuo |
| S | 1 / 0 | ¿Hay más personas? |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| VOTA / NO VOTA | Texto | Resultado por individuo |
| C | Entero | Total de personas que votan |

## 5. Reglas de negocio

- Vota si nacimiento + 18 años ≤ fecha de votación (cumple 18 el mismo día de la votación → vota).

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej28.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej28.in` / `ej28.out`).

## 7. Supuestos y decisiones

- Se aplica el método de comparar fechas completas (año, mes y día) en lugar de restar solo años.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Votación 21/08/1984, nace 21/08/1966 | VOTA |
| Nace 22/08/1966 | NO VOTA |
| Nace 21/08/2000 | Error: nació después de la votación |
| Total en esa serie | 1 |

La entrada completa de la prueba automática está en `ej28.in` y la salida de referencia en `ej28.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej28.drawio`](ej28.drawio) |
| Código Java | [`Ej28Votaciones.java`](Ej28Votaciones.java) |
| Prueba automática | `ej28.in` → `ej28.out` |

**Ejecutar:** `java -cp out Ej28Votaciones < ej28.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej28Votaciones`.
