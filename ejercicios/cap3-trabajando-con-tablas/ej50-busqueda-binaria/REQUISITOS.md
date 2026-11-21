# Ej. 50 — Búsqueda binaria en una lista ordenada

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 74-75 (PDF pág. 39)

## 1. Enunciado del libro (resumido)

Dada una lista ordenada, realizar una búsqueda binaria de cualquier elemento pedido por teclado.

## 2. Historia de usuario

Como programador quiero localizar un elemento en una lista ordenada en pocos pasos para evitar recorrerla entera.

## 3. Requerimientos funcionales

- **RF-01** Leer N y los N elementos de la lista, exigiendo orden ascendente.
- **RF-02** Pedir el elemento X a buscar.
- **RF-03** Repetir: comparar X con el elemento central y descartar la mitad correspondiente.
- **RF-04** Mostrar la posición si se encuentra o «No existe el elemento buscado».
- **RF-05** Preguntar si se desea buscar otro elemento.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–10000 | Tamaño de la lista |
| A(I) | Enteros ascendentes |  |
| X | Entero | Elemento a buscar |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Posición | Entero base 1 | o mensaje de no encontrado |

## 5. Reglas de negocio

- Medio = ⌊(Bajo + Alto) / 2⌋
- Si X < A(Medio) → Alto = Medio − 1; si X > A(Medio) → Bajo = Medio + 1; termina si Bajo > Alto.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej50.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej50.in` / `ej50.out`).

## 7. Supuestos y decisiones

- Si hay elementos repetidos se devuelve una de sus posiciones.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Lista 2,5,8,12,16,23,38 · X=23 | Posición 6 |
| X=5 | Posición 2 |
| X=1 | No existe |
| X=38 | Posición 7 |
| X=3 | No existe |

La entrada completa de la prueba automática está en `ej50.in` y la salida de referencia en `ej50.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej50.drawio`](ej50.drawio) |
| Código Java | [`Ej50BusquedaBinaria.java`](Ej50BusquedaBinaria.java) |
| Prueba automática | `ej50.in` → `ej50.out` |

**Ejecutar:** `java -cp out Ej50BusquedaBinaria < ej50.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej50BusquedaBinaria`.
