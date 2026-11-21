# Ej. 68 — Fichero relativo de 200 registros

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 4: Trabajando con ficheros · págs. 98-99 (PDF pág. 51)

## 1. Enunciado del libro (resumido)

Crear un fichero de acceso directo, con organización relativa, para 200 registros, rellenándolo a ceros y espacios.

## 2. Historia de usuario

Como programador quiero reservar un fichero de 200 registros vacíos para poder grabar y leer cada uno por su número de posición.

## 3. Requerimientos funcionales

- **RF-01** Abrir el fichero de acceso directo.
- **RF-02** Para cada clave de 1 a 200: rellenar los campos numéricos a ceros y los de texto a espacios.
- **RF-03** Grabar el registro en la posición CLAVE.
- **RF-04** Cerrar el fichero y verificar el tamaño leyendo algunos registros por acceso directo.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| — | — | El programa no pide datos |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| datos/articulos.rel | Fichero binario | 200 registros de longitud fija (38 bytes) = 7600 bytes |
| Verificación | Texto | Lectura de los registros 1, 100 y 200 |

## 5. Reglas de negocio

- Longitud de registro = 4 (clave) + 30 (nombre) + 4 (cantidad) = 38 bytes.
- Posición del registro k = (k − 1) × 38.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej68.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej68.in` / `ej68.out`).

## 7. Supuestos y decisiones

- Si el fichero ya existe se vuelve a crear desde cero.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Ejecución | 200 registros, 7600 bytes; registros 1, 100 y 200 con clave 0, nombre en blanco y cantidad 0 |

La entrada completa de la prueba automática está en `ej68.in` y la salida de referencia en `ej68.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej68.drawio`](ej68.drawio) |
| Código Java | [`Ej68FicheroRelativo.java`](Ej68FicheroRelativo.java) |
| Prueba automática | `ej68.in` → `ej68.out` |

**Ejecutar:** `java -cp out Ej68FicheroRelativo < ej68.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej68FicheroRelativo`.
