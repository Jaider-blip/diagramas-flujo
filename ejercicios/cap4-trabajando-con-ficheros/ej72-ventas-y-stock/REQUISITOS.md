# Ej. 72 — Ventas por vendedor y pedidos por stock mínimo

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 4: Trabajando con ficheros · págs. 102-103 (PDF pág. 53)

## 1. Enunciado del libro (resumido)

Una empresa vende tres artículos mediante vendedores. Cada semana se perfora una tarjeta con lo vendido por cada vendedor de cada artículo (C1, C2, C3). A fin de mes se actualizan las existencias y se comprueba si se llegó al stock mínimo (10, 100 y 47 piezas): en ese caso hay que hacer un nuevo pedido. La variable SW indica el artículo a pedir (unidades = art. 1, decenas = art. 2, centenas = art. 3).

## 2. Historia de usuario

Como encargado de almacén quiero actualizar las existencias con las ventas del mes y saber qué artículos debo pedir.

## 3. Requerimientos funcionales

- **RF-01** Leer las existencias iniciales de los 3 artículos.
- **RF-02** Leer tarjetas (vendedor, C1, C2, C3) acumulando Q1, Q2 y Q3 hasta que no haya más.
- **RF-03** Actualizar las existencias: E = E − Q.
- **RF-04** Comparar con el stock mínimo (10, 100, 47) y componer SW (1 / 10 / 100 por artículo).
- **RF-05** Mostrar vendido, existencias finales, artículos a pedir y SW.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| E1, E2, E3 | Enteros ≥ 0 | Existencias iniciales |
| Vendedor | Texto |  |
| C1, C2, C3 | Enteros ≥ 0 | Unidades vendidas en la tarjeta |
| S | 1 / 0 | ¿Más tarjetas? |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Existencias finales | Enteros |  |
| SW | 3 dígitos | Ej. 101 = pedir artículos 1 y 3 |

## 5. Reglas de negocio

- Pedido si Ei ≤ stock mínimo i (10, 100, 47).
- SW = 1·[E1 ≤ 10] + 10·[E2 ≤ 100] + 100·[E3 ≤ 47].

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej72.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej72.in` / `ej72.out`).

## 7. Supuestos y decisiones

- «Han llegado al stock mínimo» se interpreta como existencias ≤ stock mínimo.
- Si se vende más de lo que hay se muestra un aviso (existencias negativas).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Existencias 50, 400, 200; ventas (20,100,60) y (25,150,100) | Vendido 45, 250, 160 → existencias 5, 150, 40 · pedir artículos 1 y 3 · SW = 101 |

La entrada completa de la prueba automática está en `ej72.in` y la salida de referencia en `ej72.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej72.drawio`](ej72.drawio) |
| Código Java | [`Ej72VentasYStock.java`](Ej72VentasYStock.java) |
| Prueba automática | `ej72.in` → `ej72.out` |

**Ejecutar:** `java -cp out Ej72VentasYStock < ej72.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej72VentasYStock`.
