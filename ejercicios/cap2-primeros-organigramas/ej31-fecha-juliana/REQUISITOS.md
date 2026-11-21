# Ej. 31 — Fecha juliana

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 50-51 (PDF pág. 27)

## 1. Enunciado del libro (resumido)

Dada una fecha juliana (día del año), contestar con la fecha que le corresponde (día y mes). Se prevé un final para varias fechas.

## 2. Historia de usuario

Como usuario quiero convertir un día del año en día y mes para interpretar fechas julianas.

## 3. Requerimientos funcionales

- **RF-01** Solicitar la fecha juliana F (1 a 365).
- **RF-02** Restar los días de cada mes mientras X sea mayor que los días del mes.
- **RF-03** Mostrar «Es el X de MES».
- **RF-04** Preguntar si hay más fechas y repetir.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| F | Entero 1–365 | Día del año |
| S | 1 / 0 | ¿Hay más fechas? |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Fecha | Texto | Día y nombre del mes |

## 5. Reglas de negocio

- Año no bisiesto: 31,28,31,30,31,30,31,31,30,31,30,31 días.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej31.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej31.in` / `ej31.out`).

## 7. Supuestos y decisiones

- Se usa una tabla de días por mes y un bucle en lugar de 12 decisiones encadenadas (mismo resultado).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| F=1 | Es el 1 de ENERO |
| F=59 | Es el 28 de FEBRERO |
| F=60 | Es el 1 de MARZO |
| F=365 | Es el 31 de DICIEMBRE |
| F=400 | Rechazado (fuera de 1..365) |

La entrada completa de la prueba automática está en `ej31.in` y la salida de referencia en `ej31.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej31.drawio`](ej31.drawio) |
| Código Java | [`Ej31FechaJuliana.java`](Ej31FechaJuliana.java) |
| Prueba automática | `ej31.in` → `ej31.out` |

**Ejecutar:** `java -cp out Ej31FechaJuliana < ej31.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej31FechaJuliana`.
