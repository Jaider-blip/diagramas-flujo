# Ej. 90 — Decimal a cualquier otra base (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 186-187 (PDF pág. 95)

## 1. Enunciado del libro (resumido)

Hacer un programa que pase un número decimal a cualquier otra base. Prever un final.

## 2. Historia de usuario

Como estudiante quiero convertir un decimal a la base que elija (2 a 16) para practicar sistemas de numeración.

## 3. Requerimientos funcionales

- **RF-01** Pedir el decimal D (≥ 0) y la base B (2 a 16).
- **RF-02** Dividir sucesivamente entre B guardando los restos.
- **RF-03** Escribir los restos en orden inverso usando los dígitos 0–9 y A–F.
- **RF-04** Preguntar si hay más números y repetir.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| D | Entero ≥ 0 |  |
| B | Entero 2–16 | Base de destino |
| S | 1 / 0 | ¿Más números? |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Resultado | Texto | Número en la base B |

## 5. Reglas de negocio

- R = N mod B ; N = N div B hasta N = 0.
- Dígitos: 0123456789ABCDEF.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej90.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej90.in` / `ej90.out`).

## 7. Supuestos y decisiones

- Bases limitadas a 2–16 (dígitos hexadecimales).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 255 en base 16 | FF |
| 10 en base 2 | 1010 |
| 0 en base 8 | 0 |

La entrada completa de la prueba automática está en `ej90.in` y la salida de referencia en `ej90.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej90.drawio`](ej90.drawio) |
| Código Java | [`Ej90DecimalAOtraBase.java`](Ej90DecimalAOtraBase.java) |
| Prueba automática | `ej90.in` → `ej90.out` |

**Ejecutar:** `java -cp out Ej90DecimalAOtraBase < ej90.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej90DecimalAOtraBase`.
