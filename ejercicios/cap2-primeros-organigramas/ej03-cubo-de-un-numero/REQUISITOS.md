# Ej. 3 — Cubo de un número

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 22-23 (PDF pág. 13)

## 1. Enunciado del libro (resumido)

Hallar el cubo de un número X.

## 2. Historia de usuario

Como estudiante quiero calcular el cubo de un número para verificar mis operaciones.

## 3. Requerimientos funcionales

- **RF-01** Solicitar el número X.
- **RF-02** Calcular C = X × X × X.
- **RF-03** Mostrar C.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| X | Decimal |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| C | Decimal | Cubo de X |

## 5. Reglas de negocio

- C = X³

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej03.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej03.in` / `ej03.out`).

## 7. Supuestos y decisiones

- Se aceptan decimales y negativos.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| X=3 | 27.00 |
| X=−2 | −8.00 |
| X=0.5 | 0.13 (0.125) |

La entrada completa de la prueba automática está en `ej03.in` y la salida de referencia en `ej03.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej03.drawio`](ej03.drawio) |
| Código Java | [`Ej03CuboDeUnNumero.java`](Ej03CuboDeUnNumero.java) |
| Prueba automática | `ej03.in` → `ej03.out` |

**Ejecutar:** `java -cp out Ej03CuboDeUnNumero < ej03.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej03CuboDeUnNumero`.
