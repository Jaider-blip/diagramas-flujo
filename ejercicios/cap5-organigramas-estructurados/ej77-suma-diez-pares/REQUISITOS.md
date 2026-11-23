# Ej. 77 — Suma de los diez primeros números pares (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 174-175 (PDF pág. 89)

## 1. Enunciado del libro (resumido)

Hallar la suma de los diez primeros números pares.

## 2. Historia de usuario

Como estudiante quiero ver la suma de los diez primeros pares con una iteración controlada por contador.

## 3. Requerimientos funcionales

- **RF-01** Repetir 10 veces: I = I + 2; S = S + I.
- **RF-02** Mostrar S.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| — | — | No se piden datos |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| S | Entero | 110 |

## 5. Reglas de negocio

- Iteración con número de repeticiones fijo (10).

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej77.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej77.in` / `ej77.out`).

## 7. Supuestos y decisiones

- La sección del libro es estructurada; aquí el diagrama es de flujo clásico con la misma lógica. Se sigue el enunciado (diez pares).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Ejecución | S = 110 |

La entrada completa de la prueba automática está en `ej77.in` y la salida de referencia en `ej77.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej77.drawio`](ej77.drawio) |
| Código Java | [`Ej77SumaDiezPares.java`](Ej77SumaDiezPares.java) |
| Prueba automática | `ej77.in` → `ej77.out` |

**Ejecutar:** `java -cp out Ej77SumaDiezPares < ej77.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej77SumaDiezPares`.
