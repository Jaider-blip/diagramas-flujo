# Ej. 32 — Lista en memoria de diez elementos

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 58-59 (PDF pág. 31)

## 1. Enunciado del libro (resumido)

Crear una lista en memoria para almacenar diez elementos.

## 2. Historia de usuario

Como usuario quiero guardar diez valores en una lista para usarlos después.

## 3. Requerimientos funcionales

- **RF-01** Pedir los diez elementos uno a uno y guardarlos en A(1..10).
- **RF-02** Mostrar la lista creada.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| A(I) | Enteros | 10 valores |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Lista | Lista de enteros | Contenido final |

## 5. Reglas de negocio

- Índices de 1 a 10.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej32.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej32.in` / `ej32.out`).

## 7. Supuestos y decisiones

- Elementos enteros.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 1,2,…,10 | [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] |

La entrada completa de la prueba automática está en `ej32.in` y la salida de referencia en `ej32.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej32.drawio`](ej32.drawio) |
| Código Java | [`Ej32ListaDiezElementos.java`](Ej32ListaDiezElementos.java) |
| Prueba automática | `ej32.in` → `ej32.out` |

**Ejecutar:** `java -cp out Ej32ListaDiezElementos < ej32.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej32ListaDiezElementos`.
