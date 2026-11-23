# Ej. 36 — Contar positivos, negativos y ceros de una lista

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 60-61 (PDF pág. 32)

## 1. Enunciado del libro (resumido)

Crear una lista en memoria para N elementos y a continuación investigarla, contando los elementos positivos, los negativos y los ceros.

## 2. Historia de usuario

Como analista quiero saber cuántos valores positivos, negativos y nulos tiene mi lista.

## 3. Requerimientos funcionales

- **RF-01** Leer N y los N elementos.
- **RF-02** Recorrer la lista contando positivos, negativos y ceros.
- **RF-03** Mostrar los tres contadores.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–10000 |  |
| A(I) | Enteros |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| P, NE, C | Enteros | Contadores |

## 5. Reglas de negocio

- P + NE + C = N.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej36.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej36.in` / `ej36.out`).

## 7. Supuestos y decisiones

- —

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 4, −1, 0, 7, 0, −3 | Positivos 2 · Negativos 2 · Ceros 2 |

La entrada completa de la prueba automática está en `ej36.in` y la salida de referencia en `ej36.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej36.drawio`](ej36.drawio) |
| Código Java | [`Ej36PositivosNegativosCeros.java`](Ej36PositivosNegativosCeros.java) |
| Prueba automática | `ej36.in` → `ej36.out` |

**Ejecutar:** `java -cp out Ej36PositivosNegativosCeros < ej36.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej36PositivosNegativosCeros`.
