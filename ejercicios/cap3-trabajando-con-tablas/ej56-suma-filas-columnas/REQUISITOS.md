# Ej. 56 — Suma de filas y columnas de una matriz

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 80-81 (PDF pág. 42)

## 1. Enunciado del libro (resumido)

Sumar todos los elementos de cada fila de una matriz y todos los elementos de cada columna.

## 2. Historia de usuario

Como analista quiero obtener los totales por fila y por columna de una tabla de datos.

## 3. Requerimientos funcionales

- **RF-01** Leer las dimensiones N y M y los N×M elementos.
- **RF-02** Acumular la suma de cada fila y mostrarla.
- **RF-03** Acumular la suma de cada columna y mostrarla.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N, M | Enteros 1–50 | Filas y columnas |
| A(I,J) | Enteros | Elementos de la matriz |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Sumas de fila | Enteros | Una por fila |
| Sumas de columna | Enteros | Una por columna |

## 5. Reglas de negocio

- F(I) = Σ A(I,J) para J = 1..M
- C(J) = Σ A(I,J) para I = 1..N

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej56.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej56.in` / `ej56.out`).

## 7. Supuestos y decisiones

- Elementos enteros (tipo long para las sumas).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Matriz 2×3: [1 2 3; 4 5 6] | Filas: 6 y 15 · Columnas: 5, 7 y 9 |

La entrada completa de la prueba automática está en `ej56.in` y la salida de referencia en `ej56.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej56.drawio`](ej56.drawio) |
| Código Java | [`Ej56SumaFilasColumnas.java`](Ej56SumaFilasColumnas.java) |
| Prueba automática | `ej56.in` → `ej56.out` |

**Ejecutar:** `java -cp out Ej56SumaFilasColumnas < ej56.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej56SumaFilasColumnas`.
