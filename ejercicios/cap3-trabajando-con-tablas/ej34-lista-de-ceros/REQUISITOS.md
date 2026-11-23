# Ej. 34 — Lista de N elementos rellena con ceros

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 58-59 (PDF pág. 31)

## 1. Enunciado del libro (resumido)

Crear una lista en memoria para N elementos y rellenarla con ceros.

## 2. Historia de usuario

Como programador quiero inicializar una lista a cero antes de usarla.

## 3. Requerimientos funcionales

- **RF-01** Solicitar N (1 a 10000).
- **RF-02** Poner A(I) = 0 para I = 1..N.
- **RF-03** Informar la creación y mostrar la lista si es pequeña (N ≤ 20).

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–10000 |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Lista | Lista de ceros |  |

## 5. Reglas de negocio

- Todos los elementos valen 0.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej34.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej34.in` / `ej34.out`).

## 7. Supuestos y decisiones

- Para listas grandes solo se informa el tamaño.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=5 | [0, 0, 0, 0, 0] |

La entrada completa de la prueba automática está en `ej34.in` y la salida de referencia en `ej34.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej34.drawio`](ej34.drawio) |
| Código Java | [`Ej34ListaDeCeros.java`](Ej34ListaDeCeros.java) |
| Prueba automática | `ej34.in` → `ej34.out` |

**Ejecutar:** `java -cp out Ej34ListaDeCeros < ej34.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej34ListaDeCeros`.
