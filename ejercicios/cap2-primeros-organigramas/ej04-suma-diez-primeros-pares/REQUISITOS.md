# Ej. 4 — Suma de los diez primeros números pares

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 22-23 (PDF pág. 13)

## 1. Enunciado del libro (resumido)

Hallar la suma de los diez primeros números pares.

## 2. Historia de usuario

Como estudiante quiero sumar los diez primeros pares para practicar los acumuladores y los ciclos.

## 3. Requerimientos funcionales

- **RF-01** Inicializar I = 0 y S = 0.
- **RF-02** Repetir: I = I + 2; S = S + I.
- **RF-03** Terminar cuando I = 20.
- **RF-04** Mostrar S.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| — | — | No se piden datos |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| S | Entero | Suma de 2+4+…+20 |

## 5. Reglas de negocio

- Los diez primeros pares son 2, 4, …, 20.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej04.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej04.in` / `ej04.out`).

## 7. Supuestos y decisiones

- El 0 no se cuenta como primer par (el diagrama del libro empieza con I = 0 y suma desde 2).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Ejecución | S = 110 |

La entrada completa de la prueba automática está en `ej04.in` y la salida de referencia en `ej04.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej04.drawio`](ej04.drawio) |
| Código Java | [`Ej04SumaDiezPrimerosPares.java`](Ej04SumaDiezPrimerosPares.java) |
| Prueba automática | `ej04.in` → `ej04.out` |

**Ejecutar:** `java -cp out Ej04SumaDiezPrimerosPares < ej04.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej04SumaDiezPrimerosPares`.
