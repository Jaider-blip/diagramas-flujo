# Ej. 81 — Factorial de N números (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 178-179 (PDF pág. 91)

## 1. Enunciado del libro (resumido)

Hallar el factorial de N números.

## 2. Historia de usuario

Como estudiante quiero calcular el factorial de varios números seguidos para practicar bucles anidados.

## 3. Requerimientos funcionales

- **RF-01** Leer N, la cantidad de números.
- **RF-02** Por cada número X (0 a 20) calcular X! = 1·2·…·X con un bucle.
- **RF-03** Mostrar «El factorial de X es F».

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero ≥ 1 | Cantidad de números |
| X | Entero 0–20 | Número a investigar |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| F | Entero largo | Factorial de cada X |

## 5. Reglas de negocio

- 0! = 1.
- Para x ≤ 20 el resultado cabe en un entero de 64 bits.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej81.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej81.in` / `ej81.out`).

## 7. Supuestos y decisiones

- Se limita X a 20 para evitar desbordamiento.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=3: 5, 0, 10 | 120, 1, 3628800 |

La entrada completa de la prueba automática está en `ej81.in` y la salida de referencia en `ej81.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej81.drawio`](ej81.drawio) |
| Código Java | [`Ej81FactorialNNumeros.java`](Ej81FactorialNNumeros.java) |
| Prueba automática | `ej81.in` → `ej81.out` |

**Ejecutar:** `java -cp out Ej81FactorialNNumeros < ej81.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej81FactorialNNumeros`.
