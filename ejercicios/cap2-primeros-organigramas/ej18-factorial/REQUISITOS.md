# Ej. 18 — Factorial de un número

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 32-33 (PDF pág. 18)

## 1. Enunciado del libro (resumido)

Hallar el factorial de un número.

## 2. Historia de usuario

Como estudiante quiero calcular el factorial de un número.

## 3. Requerimientos funcionales

- **RF-01** Solicitar N (0 a 20).
- **RF-02** Calcular F = 1·2·…·N con un bucle.
- **RF-03** Mostrar el resultado.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 0–20 |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| F | Entero largo | N! |

## 5. Reglas de negocio

- 0! = 1.
- 20! es el mayor factorial que cabe en 64 bits.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej18.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej18.in` / `ej18.out`).

## 7. Supuestos y decisiones

- Se limita N a 20 para evitar desbordamiento.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=5 | 120 |
| N=0 | 1 |
| N=20 | 2432902008176640000 |
| N=21 | Rechazado (fuera de rango) |

La entrada completa de la prueba automática está en `ej18.in` y la salida de referencia en `ej18.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej18.drawio`](ej18.drawio) |
| Código Java | [`Ej18Factorial.java`](Ej18Factorial.java) |
| Prueba automática | `ej18.in` → `ej18.out` |

**Ejecutar:** `java -cp out Ej18Factorial < ej18.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej18Factorial`.
