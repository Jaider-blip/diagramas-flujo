# Ej. 45 — Ordenar una tabla de menor a mayor

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 68-69 (PDF pág. 36)

## 1. Enunciado del libro (resumido)

Dada una tabla en memoria de N elementos, ordenarla de menor a mayor.

## 2. Historia de usuario

Como usuario quiero ordenar mis datos de menor a mayor.

## 3. Requerimientos funcionales

- **RF-01** Leer N y los N elementos.
- **RF-02** Recorrer la tabla intercambiando los pares desordenados y poniendo SW = 1.
- **RF-03** Repetir mientras SW = 1.
- **RF-04** Mostrar la tabla ordenada.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–10000 |  |
| A(I) | Enteros |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Tabla | Lista de enteros | Orden ascendente |

## 5. Reglas de negocio

- Si A(I) > A(I+1) se intercambian.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej45.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej45.in` / `ej45.out`).

## 7. Supuestos y decisiones

- Con N = 1 no hay nada que ordenar.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 15, −3, 42, 7, 7, 100 | [−3, 7, 7, 15, 42, 100] |

La entrada completa de la prueba automática está en `ej45.in` y la salida de referencia en `ej45.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej45.drawio`](ej45.drawio) |
| Código Java | [`Ej45OrdenarMenorAMayor.java`](Ej45OrdenarMenorAMayor.java) |
| Prueba automática | `ej45.in` → `ej45.out` |

**Ejecutar:** `java -cp out Ej45OrdenarMenorAMayor < ej45.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej45OrdenarMenorAMayor`.
