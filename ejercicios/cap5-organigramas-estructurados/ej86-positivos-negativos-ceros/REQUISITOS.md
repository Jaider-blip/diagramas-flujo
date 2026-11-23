# Ej. 86 — Positivos, negativos y ceros de una lista (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 182-183 (PDF pág. 93)

## 1. Enunciado del libro (resumido)

Crear una lista en memoria para N elementos y a continuación contar los positivos, los negativos y los ceros.

## 2. Historia de usuario

Como analista quiero crear una lista y obtener la cantidad de positivos, negativos y ceros.

## 3. Requerimientos funcionales

- **RF-01** Leer N y crear la lista pidiendo cada elemento.
- **RF-02** Recorrer la lista contando positivos, negativos y ceros.
- **RF-03** Mostrar los contadores.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–10000 |  |
| A(I) | Enteros |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| P, NE, C | Enteros |  |

## 5. Reglas de negocio

- P + NE + C = N.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej86.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej86.in` / `ej86.out`).

## 7. Supuestos y decisiones

- La lógica es la del ej. 36, presentada en la sección de organigramas estructurados.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 4, −1, 0, 7, 0, −3 | Positivos 2 · Negativos 2 · Ceros 2 |

La entrada completa de la prueba automática está en `ej86.in` y la salida de referencia en `ej86.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej86.drawio`](ej86.drawio) |
| Código Java | [`Ej86PositivosNegativosCeros.java`](Ej86PositivosNegativosCeros.java) |
| Prueba automática | `ej86.in` → `ej86.out` |

**Ejecutar:** `java -cp out Ej86PositivosNegativosCeros < ej86.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej86PositivosNegativosCeros`.
