# Ej. 64 — Pasar un número decimal a binario

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 90-91 (PDF pág. 47)

## 1. Enunciado del libro (resumido)

Realizar el organigrama para pasar un número de decimal a binario.

## 2. Historia de usuario

Como estudiante quiero convertir números decimales a binario para entender la representación de datos.

## 3. Requerimientos funcionales

- **RF-01** Leer el número decimal M (entero ≥ 0).
- **RF-02** Dividir sucesivamente entre 2 guardando los restos en R(I).
- **RF-03** Escribir los restos en orden inverso como resultado binario.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| M | Entero ≥ 0 | Número decimal |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Binario | Texto de 0 y 1 | Restos en orden inverso |

## 5. Reglas de negocio

- R(I) = N mod 2 ; N = N div 2 hasta que N = 0.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej64.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej64.in` / `ej64.out`).

## 7. Supuestos y decisiones

- El 0 se representa como «0».

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| M=37 | 100101 |
| M=0 | 0 |
| M=255 | 11111111 |

La entrada completa de la prueba automática está en `ej64.in` y la salida de referencia en `ej64.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej64.drawio`](ej64.drawio) |
| Código Java | [`Ej64DecimalABinario.java`](Ej64DecimalABinario.java) |
| Prueba automática | `ej64.in` → `ej64.out` |

**Ejecutar:** `java -cp out Ej64DecimalABinario < ej64.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej64DecimalABinario`.
