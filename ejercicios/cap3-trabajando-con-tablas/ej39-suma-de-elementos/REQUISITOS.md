# Ej. 39 — Suma de los elementos de una lista

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 62-63 (PDF pág. 33)

## 1. Enunciado del libro (resumido)

Crear una lista en memoria con X elementos. A continuación hallar la suma de los X elementos e imprimirla.

## 2. Historia de usuario

Como usuario quiero obtener el total de una lista de valores.

## 3. Requerimientos funcionales

- **RF-01** Leer X y los X elementos.
- **RF-02** Acumular la suma S de todos los elementos.
- **RF-03** Mostrar S.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| X | Entero 1–10000 |  |
| A(I) | Enteros |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| S | Entero largo | Suma de la lista |

## 5. Reglas de negocio

- S = Σ A(I).

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej39.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej39.in` / `ej39.out`).

## 7. Supuestos y decisiones

- La suma se guarda en un long.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 10, 20, 30, 40 | S = 100 |

La entrada completa de la prueba automática está en `ej39.in` y la salida de referencia en `ej39.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej39.drawio`](ej39.drawio) |
| Código Java | [`Ej39SumaDeElementos.java`](Ej39SumaDeElementos.java) |
| Prueba automática | `ej39.in` → `ej39.out` |

**Ejecutar:** `java -cp out Ej39SumaDeElementos < ej39.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej39SumaDeElementos`.
