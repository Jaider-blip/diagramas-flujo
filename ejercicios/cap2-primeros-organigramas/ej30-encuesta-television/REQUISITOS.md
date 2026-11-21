# Ej. 30 — Encuesta sobre televisión

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 2: Los primeros organigramas · págs. 48-49 (PDF pág. 26)

## 1. Enunciado del libro (resumido)

Encuesta por ordenador: ¿tienen televisión o no? (contarlos); ¿es en color o no? (contarlos); ¿piensan comprarla o no? (contarlos); y hallar los tantos por ciento de todo.

## 2. Historia de usuario

Como investigador de mercado quiero registrar respuestas de una encuesta y ver los porcentajes para analizar el consumo de televisores.

## 3. Requerimientos funcionales

- **RF-01** Por encuestado preguntar si tiene televisión.
- **RF-02** Si la tiene: preguntar si es en color y contar color / blanco y negro.
- **RF-03** Si no la tiene: preguntar si piensa comprarla y contar sí / no.
- **RF-04** Preguntar si hay más encuestados y repetir.
- **RF-05** Calcular y mostrar los tantos por ciento (protegiendo la división por cero).

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| Tiene TV | 1 / 0 |  |
| Es color | 1 / 0 | Solo si tiene TV |
| Piensa comprarla | 1 / 0 | Solo si no tiene TV |
| Más encuestados | 1 / 0 |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Totales | Enteros | Encuestados, con/sin TV, color/B-N, comprarían/no |
| Porcentajes | Decimales | Ver reglas |

## 5. Reglas de negocio

- % tienen = TS·100/T (sobre el total).
- % color y % B/N = sobre los que tienen TV (TS).
- % comprarla y % no comprarla = sobre los que no tienen TV (TN).
- Si el divisor es 0 el porcentaje es 0.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej30.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej30.in` / `ej30.out`).

## 7. Supuestos y decisiones

- Las preguntas de «color» y «piensa comprarla» solo se hacen a quien corresponde.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| 4 encuestados: (TV color), (TV B/N), (sin TV, no compra), (sin TV, no compra) | Tienen 50 %; color 50 %; B/N 50 %; comprarla 0 %; no comprarla 100 % |

La entrada completa de la prueba automática está en `ej30.in` y la salida de referencia en `ej30.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej30.drawio`](ej30.drawio) |
| Código Java | [`Ej30EncuestaTelevision.java`](Ej30EncuestaTelevision.java) |
| Prueba automática | `ej30.in` → `ej30.out` |

**Ejecutar:** `java -cp out Ej30EncuestaTelevision < ej30.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej30EncuestaTelevision`.
