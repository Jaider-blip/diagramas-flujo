# Ej. 70 — Menores de 18 años y mujeres

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 4: Trabajando con ficheros · págs. 100-101 (PDF pág. 52)

## 1. Enunciado del libro (resumido)

Dado un fichero con organización secuencial de los empleados de una empresa, contar todos los empleados que sean menores de 18 años y todos los de sexo femenino.

## 2. Historia de usuario

Como responsable de RR. HH. quiero contar los empleados menores de edad y las mujeres para el informe legal anual.

## 3. Requerimientos funcionales

- **RF-01** Pedir la fecha actual FA.
- **RF-02** Leer el fichero secuencial hasta fin de fichero.
- **RF-03** Contar los empleados con menos de 18 años a la fecha FA.
- **RF-04** Contar los empleados de sexo femenino (M).
- **RF-05** Mostrar ambos totales; una mujer menor de edad se cuenta en los dos totales.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| FA | Día, mes, año | Fecha actual |
| datos/empleados.csv | Fichero secuencial |  |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Menores | Entero | Empleados menores de 18 años |
| Mujeres | Entero | Empleados de sexo femenino |

## 5. Reglas de negocio

- Es menor si nacimiento + 18 años > FA.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej70.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej70.in` / `ej70.out`).

## 7. Supuestos y decisiones

- Código de sexo: H = hombre, M = mujer.

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| FA = 20/11/2026 con el fichero del ej. 67 | Menores: 1 · Mujeres: 2 |

La entrada completa de la prueba automática está en `ej70.in` y la salida de referencia en `ej70.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej70.drawio`](ej70.drawio) |
| Código Java | [`Ej70MenoresYMujeres.java`](Ej70MenoresYMujeres.java) |
| Prueba automática | `ej70.in` → `ej70.out` |

**Ejecutar:** `java -cp out Ej70MenoresYMujeres < ej70.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej70MenoresYMujeres`.
