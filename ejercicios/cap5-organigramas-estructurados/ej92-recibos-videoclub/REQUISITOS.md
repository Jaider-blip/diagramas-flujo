# Ej. 92 — Recibos de un videoclub (estructurado)

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 5: Organigramas estructurados · págs. 190-191 (PDF pág. 97)

## 1. Enunciado del libro (resumido)

Matriz en memoria con los datos de los abonados de un videoclub: nombre, dirección, teléfono, nº de películas llevadas, cuota mínima, etc. Realizar el recibo de cada socio: cuota mínima más 100 ptas por película si son menos de 20, 75 ptas por cada película que pase de 20 y no llegue a 50, y 50 ptas por las que pasen de 50. Contar los socios que se llevan más de 50 películas.

## 2. Historia de usuario

Como gerente del videoclub quiero emitir el recibo mensual de cada socio y saber cuántos son clientes muy frecuentes.

## 3. Requerimientos funcionales

- **RF-01** Leer N y los datos de cada socio.
- **RF-02** Calcular el importe de películas por tramos.
- **RF-03** Recibo = cuota mínima + importe de películas.
- **RF-04** Contar los socios con más de 50 películas.
- **RF-05** Mostrar el recibo de cada socio y el contador final.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–10000 | Número de socios |
| Datos del socio | Texto y números | Nombre, dirección, teléfono, películas, cuota mínima |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Recibo | Decimal | Por socio |
| C50 | Entero | Socios con más de 50 películas |

## 5. Reglas de negocio

- Películas 1–20: 100 ptas c/u.
- Películas 21–50: 75 ptas c/u.
- Películas > 50: 50 ptas c/u.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej92.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej92.in` / `ej92.out`).

## 7. Supuestos y decisiones

- El enunciado es ambiguo en los límites: se interpreta por tramos (cada película se cobra según el tramo en que cae).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 12 películas, cuota 500 | 500 + 1200 = 1700 |
| 35 películas, cuota 500 | 500 + 3125 = 3625 |
| 60 películas, cuota 800 | 800 + 4750 = 5550 · socios > 50: 1 |

La entrada completa de la prueba automática está en `ej92.in` y la salida de referencia en `ej92.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej92.drawio`](ej92.drawio) |
| Código Java | [`Ej92RecibosVideoclub.java`](Ej92RecibosVideoclub.java) |
| Prueba automática | `ej92.in` → `ej92.out` |

**Ejecutar:** `java -cp out Ej92RecibosVideoclub < ej92.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej92RecibosVideoclub`.
