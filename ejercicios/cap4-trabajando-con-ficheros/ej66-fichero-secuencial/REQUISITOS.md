# Ej. 66 — Crear un fichero secuencial de 1.000 registros

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 4: Trabajando con ficheros · págs. 96-97 (PDF pág. 50)

## 1. Enunciado del libro (resumido)

Crear un fichero con organización secuencial para 1.000 registros.

## 2. Historia de usuario

Como administrador quiero grabar registros uno tras otro en un fichero para guardarlos de forma permanente.

## 3. Requerimientos funcionales

- **RF-01** Pedir el número de registros N (máximo 1.000).
- **RF-02** Abrir el fichero secuencial.
- **RF-03** Por cada registro pedir nombre y teléfono y grabarlo con su número.
- **RF-04** Cerrar el fichero y mostrar cuántos registros quedaron y el primero y último.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| N | Entero 1–1000 | El libro usa 1000 |
| Nombre, Teléfono | Texto | Por registro |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| datos/secuencial.txt | Fichero de texto | Una línea por registro: nº;nombre;teléfono |
| Resumen | Texto |  |

## 5. Reglas de negocio

- Los registros se graban en orden de llegada.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej66.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej66.in` / `ej66.out`).

## 7. Supuestos y decisiones

- Los campos del registro no los fija el libro: se usan nº, nombre y teléfono.
- Se pide N para poder probarlo con pocos registros; con N = 1000 reproduce el enunciado.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| N=3 | 3 registros grabados; primero 1;Ana Torres;3001111, último 3;María Gómez;3003333 |

La entrada completa de la prueba automática está en `ej66.in` y la salida de referencia en `ej66.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej66.drawio`](ej66.drawio) |
| Código Java | [`Ej66FicheroSecuencial.java`](Ej66FicheroSecuencial.java) |
| Prueba automática | `ej66.in` → `ej66.out` |

**Ejecutar:** `java -cp out Ej66FicheroSecuencial < ej66.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej66FicheroSecuencial`.
