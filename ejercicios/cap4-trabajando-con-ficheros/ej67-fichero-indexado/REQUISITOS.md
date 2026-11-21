# Ej. 67 — Crear un fichero con organización indexada

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 4: Trabajando con ficheros · págs. 98-99 (PDF pág. 51)

## 1. Enunciado del libro (resumido)

Crear un fichero con organización indexada.

## 2. Historia de usuario

Como administrador quiero crear y alimentar un fichero de empleados accesible por clave para consultarlo después sin recorrerlo entero.

## 3. Requerimientos funcionales

- **RF-01** Abrir el fichero indexado (si ya existe, cargar sus registros).
- **RF-02** Pedir el campo clave y rechazar claves repetidas.
- **RF-03** Pedir los datos del registro: nombre, fecha de nacimiento y sexo (H/M).
- **RF-04** Grabar el registro en el fichero.
- **RF-05** Preguntar si hay más registros y repetir; al terminar, cerrar el fichero.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| Clave | Entero 1–999999 | Nº de empleado, único |
| Nombre | Texto |  |
| Nacimiento | Día, mes, año |  |
| Sexo | H / M |  |
| Z | 1 / 0 | ¿Más registros? |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| datos/empleados.csv | Fichero | Registros ordenados por clave |
| Mensajes | Texto | Registro grabado / clave duplicada / total |

## 5. Reglas de negocio

- La clave es única.
- El fichero queda ordenado por clave (índice TreeMap en memoria).

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej67.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej67.in` / `ej67.out`).

## 7. Supuestos y decisiones

- La organización indexada se simula con un CSV y un índice en memoria; no se usa una base de datos.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Claves 10, 10 (repetida), 20, 30 | Se graban 3 registros; la repetida se rechaza |
| Resultado | Total de registros: 3 |

La entrada completa de la prueba automática está en `ej67.in` y la salida de referencia en `ej67.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej67.drawio`](ej67.drawio) |
| Código Java | [`Ej67FicheroIndexado.java`](Ej67FicheroIndexado.java) |
| Prueba automática | `ej67.in` → `ej67.out` |

**Ejecutar:** `java -cp out Ej67FicheroIndexado < ej67.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej67FicheroIndexado`.
