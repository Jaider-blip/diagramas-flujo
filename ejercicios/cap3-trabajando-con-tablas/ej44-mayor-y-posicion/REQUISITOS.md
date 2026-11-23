# Ej. 44 — Valor más grande y su posición

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 68-69 (PDF pág. 36)

## 1. Enunciado del libro (resumido)

Dada una tabla en memoria de N elementos, obtener el valor más grande y la posición donde se encuentra.

## 2. Historia de usuario

Como analista quiero encontrar el máximo de una lista y saber dónde está.

## 3. Requerimientos funcionales

- **RF-01** Leer N y los N elementos.
- **RF-02** Tomar el primero como mayor provisional (M, K).
- **RF-03** Recorrer el resto actualizando M y K si hay uno mayor.
- **RF-04** Mostrar M y K.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–10000 |  |
| A(I) | Enteros |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| M | Entero | Valor mayor |
| K | Entero base 1 | Posición |

## 5. Reglas de negocio

- Si hay empate se informa la primera posición.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej44.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej44.in` / `ej44.out`).

## 7. Supuestos y decisiones

- —

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 12, 45, 7, 45, 3, 19 | Mayor 45 en la posición 2 |

La entrada completa de la prueba automática está en `ej44.in` y la salida de referencia en `ej44.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej44.drawio`](ej44.drawio) |
| Código Java | [`Ej44MayorYPosicion.java`](Ej44MayorYPosicion.java) |
| Prueba automática | `ej44.in` → `ej44.out` |

**Ejecutar:** `java -cp out Ej44MayorYPosicion < ej44.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej44MayorYPosicion`.
