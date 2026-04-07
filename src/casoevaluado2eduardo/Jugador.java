package casoevaluado2eduardo;

public class Jugador {
    private int fila;
    private int columna;
    private Inventario inventario;
    private int movimientos;

    public Jugador(int filaInicial, int colInicial, String id) {
        this.fila = filaInicial;
        this.columna = colInicial;
        this.inventario = new Inventario(id);
        this.movimientos = 0;
    }

    public void mover(Direccion dir, Dungeon dungeon) {
        int nuevaFila = fila;
        int nuevaCol = columna;

        switch (dir) {
            case ARRIBA: nuevaFila--; break;
            case ABAJO: nuevaFila++; break;
            case IZQUIERDA: nuevaCol--; break;
            case DERECHA: nuevaCol++; break;
        }

        // Validación de límites
        if (nuevaFila >= 0 && nuevaFila < dungeon.getFilas() &&
            nuevaCol >= 0 && nuevaCol < dungeon.getColumnas()) {

            fila = nuevaFila;
            columna = nuevaCol;
            movimientos++;

            Objeto obj = dungeon.obtenerObjeto(fila, columna);

            if (obj != null) {
                inventario.agregarObjeto(obj);
                System.out.println("!Recolectado: " + obj.getNombre() + " (valor: " + obj.getValor() + ")");
                dungeon.removerObjeto(fila, columna); // El objeto desaparece del mapa
            } else {
                System.out.println("Celda vacia.");
            }

        } else {
            System.out.println("❌ Movimiento invalido - Te sales de los limites de la matriz.");
        }
    }

    public void mostrarResultado() {
        inventario.mostrarReporte(movimientos);
    }
    
    public int getFila() {
        return fila;
    }
    
    public int getColumna() {
        return columna;
    }
    
    public Inventario getInventario() {
        return inventario;
    }
}
