# Ej. 16 — Par o impar

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 30-31 (PDF pág. 17)

## 1. Enunciado del libro (resumido)

Determinar si un número es par o impar.

## 2. Historia de usuario

Como estudiante quiero saber si un entero es par o impar.

## 3. Requerimientos funcionales

- **RF-01** Solicitar el entero N.
- **RF-02** Si N mod 2 = 0 mostrar «par»; si no, «impar».

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero | Puede ser negativo o cero |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Mensaje | Texto | Par / impar |

## 5. Reglas de negocio

- Es par si el resto de dividir entre 2 es 0.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej16.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej16.in` / `ej16.out`).

## 7. Supuestos y decisiones

- El libro usa Z = N/2 y compara con INT(Z)×2; el resultado es el mismo que con el resto.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=7 | impar |
| N=10 | par |
| N=0 | par |
| N=−3 | impar |

La entrada completa de la prueba automática está en `ej16.in` y la salida de referencia en `ej16.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej16.drawio`](ej16.drawio) |
| Código Java | [`Ej16ParOImpar.java`](Ej16ParOImpar.java) |
| Prueba automática | `ej16.in` → `ej16.out` |

**Ejecutar:** `java -cp out Ej16ParOImpar < ej16.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej16ParOImpar`.
