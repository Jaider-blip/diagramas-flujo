# Ej. 1 — Suma de dos números

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 22-23 (PDF pág. 13)

## 1. Enunciado del libro (resumido)

Hallar la suma de dos números: X e Y.

## 2. Historia de usuario

Como usuario quiero sumar dos números para obtener su total.

## 3. Requerimientos funcionales

- **RF-01** Solicitar los números X e Y.
- **RF-02** Acumular en Z: Z = 0, Z = Z + X, Z = Z + Y.
- **RF-03** Mostrar Z.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| X | Decimal |  |
| Y | Decimal |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Z | Decimal | Suma de X e Y |

## 5. Reglas de negocio

- Z = X + Y (con acumulador, como en el libro).

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej01.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej01.in` / `ej01.out`).

## 7. Supuestos y decisiones

- Se aceptan decimales y negativos.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| X=3.5, Y=4 | Z = 7.50 |
| X=−2, Y=2 | Z = 0.00 |

La entrada completa de la prueba automática está en `ej01.in` y la salida de referencia en `ej01.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej01.drawio`](ej01.drawio) |
| Código Java | [`Ej01SumaDosNumeros.java`](Ej01SumaDosNumeros.java) |
| Prueba automática | `ej01.in` → `ej01.out` |

**Ejecutar:** `java -cp out Ej01SumaDosNumeros < ej01.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej01SumaDosNumeros`.
