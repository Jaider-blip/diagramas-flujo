# Ej. 78 — Positivo o negativo (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 174-175 (PDF pág. 89)

## 1. Enunciado del libro (resumido)

Dado un número, contestar si es positivo o negativo.

## 2. Historia de usuario

Como usuario quiero conocer el signo de un número usando una estructura de selección.

## 3. Requerimientos funcionales

- **RF-01** Solicitar N.
- **RF-02** Si N > 0 mostrar «positivo»; si N < 0 «negativo»; si N = 0 «cero».

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Decimal |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Mensaje | Texto |  |

## 5. Reglas de negocio

- Selección múltiple con if / else if / else.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej78.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej78.in` / `ej78.out`).

## 7. Supuestos y decisiones

- Se añade el caso del cero.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=12 | positivo |
| N=−4 | negativo |
| N=0 | cero |

La entrada completa de la prueba automática está en `ej78.in` y la salida de referencia en `ej78.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej78.drawio`](ej78.drawio) |
| Código Java | [`Ej78PositivoONegativo.java`](Ej78PositivoONegativo.java) |
| Prueba automática | `ej78.in` → `ej78.out` |

**Ejecutar:** `java -cp out Ej78PositivoONegativo < ej78.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej78PositivoONegativo`.
