# Ej. 91 — Votantes con edad suficiente (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 188-189 (PDF pág. 96)

## 1. Enunciado del libro (resumido)

Crear una tabla en memoria con 1001 elementos: en el primero la fecha de una votación y en los restantes las fechas de nacimiento de los votantes. Investigar la tabla para saber cuántos tienen edad suficiente para votar y cuántos no, así como el tanto por ciento.

## 2. Historia de usuario

Como organizador electoral quiero conocer el porcentaje de votantes con edad suficiente a partir de sus fechas de nacimiento.

## 3. Requerimientos funcionales

- **RF-01** Leer N y la fecha de votación (AAAAMMDD) en T(1).
- **RF-02** Leer las N fechas de nacimiento (no pueden ser posteriores a la votación).
- **RF-03** Contar los que tienen 18 años cumplidos en la fecha de votación.
- **RF-04** Mostrar cuántos pueden y no pueden votar con su tanto por ciento.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–1000 | El libro usa 1000 votantes |
| Fechas | AAAAMMDD | Votación y nacimientos |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| SI, NO | Enteros |  |
| % SI, % NO | Decimales | Sobre N |

## 5. Reglas de negocio

- Puede votar si nacimiento + 18 años ≤ fecha de votación.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej91.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej91.in` / `ej91.out`).

## 7. Supuestos y decisiones

- Se validan las fechas con el calendario real (no se acepta 20230231).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Votación 21/08/1984; nacen 21/08/1966, 22/08/1966, (19900101 rechazada), 15/06/1930 y 01/01/1980 | Pueden votar 2 (50 %) · No pueden 2 (50 %) |

La entrada completa de la prueba automática está en `ej91.in` y la salida de referencia en `ej91.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej91.drawio`](ej91.drawio) |
| Código Java | [`Ej91Votantes.java`](Ej91Votantes.java) |
| Prueba automática | `ej91.in` → `ej91.out` |

**Ejecutar:** `java -cp out Ej91Votantes < ej91.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej91Votantes`.
