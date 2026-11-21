# Ej. 69 — Empleados nacidos en 1940 y 1941

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 4: Trabajando con ficheros · págs. 98-99 (PDF pág. 51)

## 1. Enunciado del libro (resumido)

Dado un fichero secuencial con los datos de los empleados de una empresa, contar todos aquellos empleados que hayan nacido en 1940 y 1941.

## 2. Historia de usuario

Como responsable de RR. HH. quiero saber cuántos empleados nacieron en 1940 o 1941 para un estudio de jubilaciones.

## 3. Requerimientos funcionales

- **RF-01** Abrir el fichero secuencial de empleados (si no existe, se crea uno de demostración).
- **RF-02** Leer registro a registro hasta fin de fichero.
- **RF-03** Contar los empleados cuyo año de nacimiento es 1940 o 1941.
- **RF-04** Mostrar el total y cerrar el fichero.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| datos/empleados.csv | Fichero secuencial | Registros: nº; nombre; AAAA-MM-DD; sexo |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Total | Entero | Empleados nacidos en 1940 o 1941 |

## 5. Reglas de negocio

- Se cuenta una vez cada empleado cuyo año sea 1940 o 1941.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej69.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej69.in` / `ej69.out`).

## 7. Supuestos y decisiones

- Usa el mismo fichero que genera el ejercicio 67.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Fichero del ej. 67 (Carlos 1940, Marta 1941, Sara 2012) | Total: 2 |

La entrada completa de la prueba automática está en `ej69.in` y la salida de referencia en `ej69.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej69.drawio`](ej69.drawio) |
| Código Java | [`Ej69Nacidos19401941.java`](Ej69Nacidos19401941.java) |
| Prueba automática | `ej69.in` → `ej69.out` |

**Ejecutar:** `java -cp out Ej69Nacidos19401941 < ej69.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej69Nacidos19401941`.
