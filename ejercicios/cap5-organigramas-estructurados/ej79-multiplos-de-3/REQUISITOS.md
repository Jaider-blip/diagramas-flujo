# Ej. 79 — Los N primeros múltiplos de 3

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 176-177 (PDF pág. 90)

## 1. Enunciado del libro (resumido)

Hallar los N primeros múltiplos de 3.

## 2. Historia de usuario

Como estudiante quiero listar los primeros múltiplos de 3.

## 3. Requerimientos funcionales

- **RF-01** Solicitar N (≥ 1).
- **RF-02** Para I = 1..N calcular M = 3 × I.
- **RF-03** Mostrar cada múltiplo.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–100000 |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Múltiplos | Lista | 3, 6, 9, … |

## 5. Reglas de negocio

- M = 3 × I.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej79.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej79.in` / `ej79.out`).

## 7. Supuestos y decisiones

- —

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=5 | 3, 6, 9, 12, 15 |

La entrada completa de la prueba automática está en `ej79.in` y la salida de referencia en `ej79.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej79.drawio`](ej79.drawio) |
| Código Java | [`Ej79MultiplosDe3.java`](Ej79MultiplosDe3.java) |
| Prueba automática | `ej79.in` → `ej79.out` |

**Ejecutar:** `java -cp out Ej79MultiplosDe3 < ej79.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej79MultiplosDe3`.
