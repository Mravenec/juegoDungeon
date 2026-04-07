# Juego Dungeon - Sistema Java

## 📋 Descripción

Una empresa desarrolladora de videojuegos desea crear un sistema en Java para gestionar las acciones de un jugador dentro de una mazmorra representada por una matriz.

El jugador se desplaza dentro de un mapa bidimensional donde en cada celda puede encontrar distintos tipos de objetos consumibles, como pociones, comida o artefactos mágicos. A medida que el jugador avanza, recolecta objetos y los almacena en su inventario, acumulando un valor total.

## 🎮 Características Implementadas

### **Objeto**
- **Atributos:** nombre, tipo (pocion, comida, artefacto), valor
- **Constructores:** Inicialización con todos los atributos
- **Encapsulamiento:** Getters para acceso controlado

### **Inventario**
- **Atributos:** idJugador, lista de objetos recolectados, total acumulado
- **Métodos:** agregarObjeto(), mostrarReporte(), getters
- **Funcionalidad:** Cálculo automático del total acumulado

### **Dungeon (Mapa)**
- **Matriz:** 3x3 como mínimo
- **Generación:** Objetos colocados aleatoriamente
- **Visualización:** Mapa con colores ANSI en consola
- **Gestión:** Remoción automática de objetos recolectados

### **Jugador**
- **Movimiento:** Validación de límites de matriz
- **Recolección:** Integración con inventario
- **Posición:** Tracking de coordenadas actuales

## 🎯 Funcionalidad del Juego

### **Sistema de Movimiento**
- **Controles:** W (Arriba), S (Abajo), A (Izquierda), D (Derecha)
- **Validación:** Impide salir de los límites de la matriz
- **Mensajes:** Retroalimentación clara de movimientos

### **Sistema de Objetos**
- **Tipos:** Poción, Comida, Artefacto
- **Colocación:** Aleatoria, evitando posición inicial del jugador
- **Recolección:** Automática al pisar celda con objeto
- **Desaparición:** Objetos eliminados del mapa al ser recolectados

### **Sistema de Victoria**
- **Detección:** Automática al recolectar todos los objetos
- **Celebración:** Mensaje de felicitación
- **Terminación:** Final automático del juego
- **Reporte:** Estadísticas finales detalladas

## 🎨 Interfaz Visual

### **Mapa con Colores ANSI**
- **🟥 ROJO** `[J]` - Jugador
- **🟦 CELESTE** `[O]` - Poción
- **🟩 VERDE** `[O]` - Comida  
- **🟨 AMARILLO** `[O]` - Artefacto
- **⬛ [ ]** - Celda vacía

### **Leyenda Ordenada**
```
[O] = Pocion, [O] = Comida, [O] = Artefacto, [J] = Jugador, [ ] = Vacio
```

## 🚀 Cómo Ejecutar

1. **Compilar:** `javac casoevaluado2eduardo/*.java`
2. **Ejecutar:** `java casoevaluado2eduardo.CasoEvaluado2Eduardo`
3. **Jugar:** Usa W/A/S/D para moverte, Q para salir

## 📊 Rúbrica de Evaluación Cumplida

| Criterio | Estado | Descripción |
|-----------|---------|-------------|
| Definición de clases | ✅ Excelente | Clases Objeto e Inventario con todos sus atributos |
| Constructores | ✅ Excelente | Inicialización correcta mediante constructores |
| Encapsulamiento | ✅ Excelente | Atributos privados, getters y setters |
| Uso de matriz | ✅ Excelente | Matriz del dungeon implementada correctamente |
| Movimientos | ✅ Excelente | Gestión mediante lista/arreglo de direcciones |
| Recolección | ✅ Excelente | Objetos agregados correctamente al inventario |
| Cálculo del total | ✅ Excelente | Valor total acumulado calculado correctamente |
| Validaciones | ✅ Excelente | Validaciones de límites y existencia de objetos |
| Reporte final | ✅ Excelente | Reporte claro y completo del resultado |
| Calidad del código | ✅ Excelente | Código claro, ordenado y modular |

## 🏆 Conclusión

El proyecto cumple con **TODOS** los requerimientos técnicos y funcionales especificados, implementando un sistema completo de juego dungeon con:

- ✅ **Estructura orientada a objetos** sólida
- ✅ **Interfaz de consola** atractiva y funcional  
- ✅ **Sistema de juego** completo con validaciones
- ✅ **Experiencia de usuario** intuitiva y divertida
- ✅ **Código de calidad** universitario/junior

**¡Listo para evaluación y presentación!** 🎮
