# Ej. 20 — Descuento por tanto por ciento

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 34-35 (PDF pág. 19)

## 1. Enunciado del libro (resumido)

Dado un número y un tanto por ciento, contestar: el número y el tanto por ciento; la cantidad obtenida con el tanto por ciento de descuento y la cantidad a pagar.

## 2. Historia de usuario

Como cliente quiero conocer el descuento aplicado y el importe final para saber cuánto debo pagar.

## 3. Requerimientos funcionales

- **RF-01** Solicitar el número N y el tanto por ciento T.
- **RF-02** Validar que T esté entre 0 y 100.
- **RF-03** Calcular el descuento D = N × T / 100.
- **RF-04** Calcular la cantidad a pagar P = N − D.
- **RF-05** Mostrar N, T, D y P con dos decimales.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Decimal | Número o importe base |
| T | Decimal 0–100 | Tanto por ciento de descuento |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| D | Decimal | Cantidad del descuento |
| P | Decimal | Cantidad a pagar |

## 5. Reglas de negocio

- D = N × T / 100
- P = N − D
- Si T < 0 o T > 100 se rechaza el dato y no se calcula nada.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej20.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej20.in` / `ej20.out`).

## 7. Supuestos y decisiones

- Se acepta coma o punto como separador decimal.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=200, T=15 | D=30.00, P=170.00 |
| N=80, T=0 | D=0.00, P=80.00 |
| N=50, T=120 | «Porcentaje inválido» |

La entrada completa de la prueba automática está en `ej20.in` y la salida de referencia en `ej20.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej20.drawio`](ej20.drawio) |
| Código Java | [`Ej20Descuento.java`](Ej20Descuento.java) |
| Prueba automática | `ej20.in` → `ej20.out` |

**Ejecutar:** `java -cp out Ej20Descuento < ej20.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej20Descuento`.
