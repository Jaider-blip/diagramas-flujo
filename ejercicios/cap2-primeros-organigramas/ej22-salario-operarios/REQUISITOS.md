# Ej. 22 — Salario semanal de los operarios

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 36-37 (PDF pág. 20)

## 1. Enunciado del libro (resumido)

Una empresa paga a sus operarios semanalmente según las horas trabajadas, a razón de D ptas por hora y 1,5·D por cada hora que exceda de 40. Indicar el salario a percibir por cada operario.

## 2. Historia de usuario

Como administrador de nómina quiero calcular el salario semanal de cada operario para generar los pagos.

## 3. Requerimientos funcionales

- **RF-01** Solicitar el pago por hora D y el número de operarios N.
- **RF-02** Por cada operario pedir nombre y horas trabajadas H.
- **RF-03** Si H ≤ 40: S = H × D; si H > 40: S = 40 × D + (H − 40) × 1,5 × D.
- **RF-04** Mostrar nombre y salario de cada operario.
- **RF-05** Repetir hasta procesar los N operarios.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| D | Decimal ≥ 0 | Pago por hora |
| N | Entero ≥ 1 | Número de operarios |
| Nombre | Texto | Nombre del operario |
| H | Decimal ≥ 0 | Horas trabajadas |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| S | Decimal | Salario semanal del operario |

## 5. Reglas de negocio

- Primeras 40 horas a D.
- Horas que exceden de 40 a 1,5 × D.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej22.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej22.in` / `ej22.out`).

## 7. Supuestos y decisiones

- El libro fija 100 operarios; el programa pide N para poder probarlo con pocos datos (puede escribirse 100).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| D=1000, H=38 | S=38000.00 |
| D=1000, H=40 | S=40000.00 |
| D=1000, H=45 | S=47500.00 |

La entrada completa de la prueba automática está en `ej22.in` y la salida de referencia en `ej22.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej22.drawio`](ej22.drawio) |
| Código Java | [`Ej22SalarioOperarios.java`](Ej22SalarioOperarios.java) |
| Prueba automática | `ej22.in` → `ej22.out` |

**Ejecutar:** `java -cp out Ej22SalarioOperarios < ej22.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej22SalarioOperarios`.
