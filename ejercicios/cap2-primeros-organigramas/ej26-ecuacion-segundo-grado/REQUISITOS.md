# Ej. 26 — Ecuación de segundo grado

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 40-41 (PDF pág. 22)

## 1. Enunciado del libro (resumido)

Realizar el organigrama para resolver una ecuación de segundo grado A·x² + B·x + C = 0 teniendo en cuenta las soluciones imaginarias y la posibilidad de que algún coeficiente sea cero.

## 2. Historia de usuario

Como estudiante quiero resolver ecuaciones de segundo grado, incluso con soluciones imaginarias, para verificar mis ejercicios.

## 3. Requerimientos funcionales

- **RF-01** Solicitar los coeficientes A, B y C.
- **RF-02** Si A = 0 informar que no es de segundo grado y terminar.
- **RF-03** Calcular el discriminante Z = B² − 4AC.
- **RF-04** Z > 0: dos soluciones reales distintas.
- **RF-05** Z = 0: una solución real doble.
- **RF-06** Z < 0: dos soluciones imaginarias (parte real ± parte imaginaria).

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| A | Decimal ≠ 0 | Coeficiente de x² |
| B | Decimal | Coeficiente de x |
| C | Decimal | Término independiente |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| X1, X2 | Real o complejo | Soluciones de la ecuación |

## 5. Reglas de negocio

- X = (−B ± √Z) / 2A
- Si Z < 0: X = −B/2A ± (√(−Z)/2A)·i

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej26.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej26.in` / `ej26.out`).

## 7. Supuestos y decisiones

- Si A = 0 no se resuelve la ecuación lineal; solo se avisa (como en el libro).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| A=1, B=−3, C=2 | X1 = 2.0000, X2 = 1.0000 |
| A=1, B=2, C=1 | X = −1.0000 (doble) |
| A=1, B=2, C=5 | −1.0000 ± 2.0000i |
| A=0, B=2, C=3 | No es de segundo grado |

La entrada completa de la prueba automática está en `ej26.in` y la salida de referencia en `ej26.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej26.drawio`](ej26.drawio) |
| Código Java | [`Ej26EcuacionSegundoGrado.java`](Ej26EcuacionSegundoGrado.java) |
| Prueba automática | `ej26.in` → `ej26.out` |

**Ejecutar:** `java -cp out Ej26EcuacionSegundoGrado < ej26.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej26EcuacionSegundoGrado`.
