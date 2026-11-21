# Ej. 89 — Ordenar una tabla de mayor a menor (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 186-187 (PDF pág. 95)

## 1. Enunciado del libro (resumido)

Dada una tabla en memoria de 100 elementos, ordenarla de mayor a menor y a continuación escribir la tabla ordenada.

## 2. Historia de usuario

Como usuario quiero ver una lista de valores ordenada de mayor a menor para identificar los más altos.

## 3. Requerimientos funcionales

- **RF-01** Leer N y los N elementos de la tabla.
- **RF-02** Ordenar de mayor a menor por burbuja con un tope B que va bajando.
- **RF-03** Escribir la tabla ordenada.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–1000 | El libro usa 100 |
| A(I) | Enteros | Elementos |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Tabla | Lista de enteros | Orden descendente |

## 5. Reglas de negocio

- Si A(I) < A(I+1) se intercambian; B baja de N a 2.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej89.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej89.in` / `ej89.out`).

## 7. Supuestos y decisiones

- Se pide N en lugar de fijar 100 elementos para poder probarlo; con N = 100 reproduce el enunciado.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 15, −3, 42, 7, 7, 100 | [100, 42, 15, 7, 7, −3] |

La entrada completa de la prueba automática está en `ej89.in` y la salida de referencia en `ej89.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej89.drawio`](ej89.drawio) |
| Código Java | [`Ej89OrdenarTabla.java`](Ej89OrdenarTabla.java) |
| Prueba automática | `ej89.in` → `ej89.out` |

**Ejecutar:** `java -cp out Ej89OrdenarTabla < ej89.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej89OrdenarTabla`.
