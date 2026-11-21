# Ej. 60 — Ordenar de menor a mayor cada fila de una matriz

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 84-85 (PDF pág. 44)

## 1. Enunciado del libro (resumido)

Dada una matriz de N por M elementos, ordenar de menor a mayor cada una de sus filas.

## 2. Historia de usuario

Como usuario quiero que cada fila de mi tabla quede ordenada de forma ascendente.

## 3. Requerimientos funcionales

- **RF-01** Leer N, M y los elementos de la matriz.
- **RF-02** Ordenar cada fila por el método de la burbuja.
- **RF-03** Mostrar la matriz con las filas ordenadas.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N, M | Enteros 1–100 | Dimensiones |
| A(I,J) | Enteros | Elementos |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Matriz | Matriz de enteros | Con cada fila ordenada ascendentemente |

## 5. Reglas de negocio

- Si A(I,J) > A(I,J+1) se intercambian; el tope B baja de M a 1.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej60.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej60.in` / `ej60.out`).

## 7. Supuestos y decisiones

- Las columnas no se ordenan entre sí; solo cada fila por separado.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| [9 3 7 1; 5 5 −2 0] | [1 3 7 9; −2 0 5 5] |

La entrada completa de la prueba automática está en `ej60.in` y la salida de referencia en `ej60.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej60.drawio`](ej60.drawio) |
| Código Java | [`Ej60OrdenarFilas.java`](Ej60OrdenarFilas.java) |
| Prueba automática | `ej60.in` → `ej60.out` |

**Ejecutar:** `java -cp out Ej60OrdenarFilas < ej60.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej60OrdenarFilas`.
