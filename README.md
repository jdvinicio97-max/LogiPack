# LogiPack Ecuador - Motor de Enrutamiento Logístico

Proyecto final de la asignatura **Estructura de Datos**.

## Descripción

Este proyecto implementa un sistema de optimización de rutas para la empresa ficticia **LogiPack Ecuador**.

El programa trabaja con cinco centros logísticos:

- Quito
- Manta
- Guayaquil
- Ambato
- Cuenca

El objetivo es calcular la ruta más corta entre dos sedes utilizando el **algoritmo de Dijkstra**.

## Tecnologías utilizadas

- Java 25
- IntelliJ IDEA
- Git
- GitHub

## Estructuras de datos utilizadas

Para representar las conexiones entre las ciudades se utiliza una **matriz de adyacencia**.

También se utilizan:

- Arreglos
- Listas
- Arreglo de nodos visitados
- Arreglo de distancias mínimas
- Arreglo para reconstruir la ruta

## Algoritmo de Dijkstra

El algoritmo de Dijkstra permite encontrar la distancia mínima entre un nodo de origen y los demás nodos del grafo.

En este proyecto se utiliza para calcular la mejor ruta entre dos centros logísticos.

El programa:

1. Inicializa las distancias.
2. Selecciona el nodo con menor distancia acumulada.
3. Marca el nodo como visitado.
4. Actualiza las distancias de los nodos vecinos.
5. Guarda el nodo anterior.
6. Reconstruye la ruta óptima.
7. Muestra la distancia total.

## Conexiones utilizadas

Las rutas del sistema son:

- Quito ↔ Ambato: 150 km
- Quito ↔ Guayaquil: 420 km
- Ambato ↔ Cuenca: 220 km
- Guayaquil ↔ Cuenca: 195 km
- Guayaquil ↔ Manta: 190 km
- Ambato ↔ Manta: 310 km

## Ejemplo de ejecución

```text
===============================================================================
LOGIPACK ECUADOR - SISTEMA DE OPTIMIZACIÓN
Estudiante: Jofre Pilacuán
===============================================================================

[Ruta seleccionada]: QUITO (0) --> CUENCA (4)

[Grafica de la ruta óptima]:
[0] QUITO --(150 km)--> [3] AMBATO --(220 km)--> [4] CUENCA

[Detalle del Despacho]:
 • Origen: Quito [Sede 0]
 • Destino: Cuenca [Sede 4]
 • Secuencia Óptima: Quito -> Ambato -> Cuenca
 • Distancia Total: 370 km
===============================================================================
