# Ej. 80 — Contar números pares e impares

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 176-177 (PDF pág. 90)

## 1. Enunciado del libro (resumido)

Dados varios números por pantalla, contestar cuál es par y cuál es impar, contando los pares y los impares. Prever un final.

## 2. Historia de usuario

Como usuario quiero clasificar varios números y ver cuántos pares e impares hay.

## 3. Requerimientos funcionales

- **RF-01** Por cada número indicar si es par o impar.
- **RF-02** Contar pares e impares.
- **RF-03** Preguntar si hay más números (final) y repetir.
- **RF-04** Mostrar los totales.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero |  |
| K | 1 / 0 | ¿Hay más números? |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Mensajes | Texto | par / impar |
| P, I | Enteros | Totales |

## 5. Reglas de negocio

- Par si N mod 2 = 0.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej80.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej80.in` / `ej80.out`).

## 7. Supuestos y decisiones

- —

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 4, 7, 10, 3 | Pares 2 · Impares 2 |

La entrada completa de la prueba automática está en `ej80.in` y la salida de referencia en `ej80.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej80.drawio`](ej80.drawio) |
| Código Java | [`Ej80ParesEImpares.java`](Ej80ParesEImpares.java) |
| Prueba automática | `ej80.in` → `ej80.out` |

**Ejecutar:** `java -cp out Ej80ParesEImpares < ej80.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej80ParesEImpares`.
