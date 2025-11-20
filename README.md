# Gestión de Vuelos - Prueba Técnica en Java

## Descripción

Este proyecto corresponde a la **segunda prueba técnica**, desarrollada en **Java**, que implementa operaciones de **filtrado** y **ordenamiento** de vuelos utilizando **Streams** y clases utilitarias (`Utils`).

El sistema permite:

- Filtrar vuelos según un **rango de fechas** (*fechaInicio* y *fechaFin*).
- Ordenar los vuelos por **fecha de salida**.
- Devolver los resultados en un formato legible, mostrando los vuelos uno debajo del otro.

El proyecto incluye:

- Clase `Vuelo` con sus atributos y métodos de acceso.
- Clase `filtro` en el paquete `utils` para el filtrado y ordenamiento.
- Clase `Main` para la ejecución y prueba del filtrado, con **10 vuelos de ejemplo**.

---

## Requisitos

- Java 17 o superior (compatible con Streams y API de fecha `LocalDate`).
- IDE recomendado: IntelliJ IDEA, Eclipse o similar.

---

## Ejecución

1. Clonar o descargar el repositorio:  
   git clone https://github.com/JS1305/Gestion-Clientes

2. Abrir el proyecto en su IDE preferido.

3. Ejecutar la clase `Main`.

4. Modificar las variables `fechaInicio` y `fechaFin` en el `Main` para probar distintos filtros:

```java
LocalDate fechaInicio = LocalDate.of(2024,1,1);
LocalDate fechaFin = LocalDate.of(2026,12,31);

// También es posible probar con fechas nulas:
LocalDate fechaInicio = null;
LocalDate fechaFin = LocalDate.of(2025,3,31);
Los resultados se imprimirán en consola mostrando los vuelos filtrados y ordenados por fecha de salida.
Ejemplo de salida
Vuelo{id=3, nombreVuelo='H003-V', empresa='Emirates', lugarSalida='Londres', lugarLlegada='Frankfurt', fechaSalida=2025-03-14, fechaLlegada=2025-03-14}
Vuelo{id=9, nombreVuelo='H009-V', empresa='LATAM Airlines', lugarSalida='Bogota', lugarLlegada='Santiago de chile', fechaSalida=2025-03-18, fechaLlegada=2025-03-18}
...
Notas
Si fechaInicio es null, se devolverán todos los vuelos hasta fechaFin.
Si fechaFin es null, se devolverán todos los vuelos desde fechaInicio.
Si ambas fechas son null, se devolverán todos los vuelos.
El filtrado y ordenamiento se realiza mediante Streams de Java para mayor eficiencia y legibilidad.