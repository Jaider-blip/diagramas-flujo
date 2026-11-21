# Ej. 65 — Factura detallada de la compañía telefónica

> **Libro:** *Diagramas de flujo. Ejercicios y problemas* (P. Pérez-Lemaur) · Capítulo 3: Trabajando con tablas · págs. 92-93 (PDF pág. 48)

## 1. Enunciado del libro (resumido)

Factura detallada: el cliente paga 3 ptas por cada paso del contador más un alquiler según la zona (zona 1: 1.000, zona 2: 1.200, zona 3: 1.500). Los datos de los clientes están en una matriz en memoria: nº, nombre, dirección, lectura anterior y zona. Se pide por pantalla la lectura actual y el nº de cliente; se prevé un final.

## 2. Historia de usuario

Como empleado de facturación quiero generar la factura de un cliente a partir de su lectura actual para cobrar el consumo y el alquiler.

## 3. Requerimientos funcionales

- **RF-01** Cargar la tabla de clientes (nº, nombre, dirección, lectura anterior, zona).
- **RF-02** Pedir NC y LA y buscar al cliente; si no existe, mostrar error.
- **RF-03** Validar que LA ≥ lectura anterior.
- **RF-04** Calcular pasos = LA − lectura anterior y consumo = 3 × pasos.
- **RF-05** Sumar el alquiler según la zona (1.000 / 1.200 / 1.500).
- **RF-06** Imprimir la factura detallada y preguntar si hay más clientes.

## 4. Datos de entrada y salida

**Entradas**

| Dato | Tipo / rango | Descripción |
|---|---|---|
| NC | Entero | Nº de cliente |
| LA | Entero ≥ 0 | Lectura actual del contador |
| S | 1 / 0 | ¿Más clientes? |

**Salidas**

| Dato | Tipo | Descripción |
|---|---|---|
| Factura | Texto | Cliente, dirección, zona, lecturas, pasos, consumo, alquiler, total |

## 5. Reglas de negocio

- Total = 3 × (LA − anterior) + alquiler(zona)
- Alquiler: zona 1 = 1000; zona 2 = 1200; zona 3 = 1500.

## 6. Requerimientos no funcionales

- **RNF-01** Aplicación de consola en Java 17 o superior, sin dependencias externas.
- **RNF-02** Validar toda entrada del usuario (tipo y rango) y volver a preguntar si es inválida; no debe terminar con excepción por un dato mal escrito.
- **RNF-03** El diagrama de flujo (`ej65.drawio`) debe corresponder paso a paso con el código.
- **RNF-04** Código con nombres claros, documentado con comentarios Javadoc y verificado por una prueba automática (`ej65.in` / `ej65.out`).

## 7. Supuestos y decisiones

- La tabla de clientes viene precargada (5 clientes de ejemplo) porque el enunciado la da «en memoria».
- No se actualiza la lectura anterior tras facturar (no lo pide el enunciado).

## 8. Casos de prueba

| Entrada | Resultado esperado |
|---|---|
| Cliente 2, lectura 3500 (anterior 3400, zona 2) | 300 + 1200 = 1500 ptas |
| Cliente 9 | Error: no existe ese cliente |
| Cliente 1, lectura 1000 (anterior 1200) | Error: lectura menor que la anterior |
| Cliente 3, lectura 800 (zona 3) | 0 pasos + 1500 = 1500 ptas |

La entrada completa de la prueba automática está en `ej65.in` y la salida de referencia en `ej65.out`.

## 9. Criterios de aceptación

- [ ] Se cumplen todos los RF de la sección 3.
- [ ] Los casos de la sección 8 producen el resultado esperado.
- [ ] Las entradas inválidas se rechazan con un mensaje y se vuelve a preguntar.
- [ ] `./scripts/probar.sh` termina con todas las pruebas correctas.

## 10. Trazabilidad

| Artefacto | Archivo |
|---|---|
| Diagrama de flujo (draw.io) | [`ej65.drawio`](ej65.drawio) |
| Código Java | [`Ej65FacturaTelefonica.java`](Ej65FacturaTelefonica.java) |
| Prueba automática | `ej65.in` → `ej65.out` |

**Ejecutar:** `java -cp out Ej65FacturaTelefonica < ej65.in` (después de compilar con `./scripts/probar.sh`) o de forma interactiva con `java -cp out Ej65FacturaTelefonica`.
