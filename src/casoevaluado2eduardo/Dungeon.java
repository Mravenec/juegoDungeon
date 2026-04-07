package casoevaluado2eduardo;

public class Dungeon {
    private Objeto[][] mapa;

    public Dungeon(int filas, int columnas) {
        mapa = new Objeto[filas][columnas];
    }

    public void colocarObjeto(int fila, int col, Objeto obj) {
        mapa[fila][col] = obj;
    }

    public Objeto obtenerObjeto(int fila, int col) {
        return mapa[fila][col];
    }

    public int getFilas() { 
        return mapa.length; 
    }
    
    public int getColumnas() { 
        return mapa[0].length; 
    }
    
    public void mostrarMapa(int jugadorFila, int jugadorColumna) {
        System.out.println("\n=== MAPA ACTUAL ===");
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (i == jugadorFila && j == jugadorColumna) {
                    System.out.print("[J] ");
                } else if (mapa[i][j] != null) {
                    System.out.print("[O] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
        System.out.println("[J] = Jugador, [O] = Objeto, [ ] = Vacío");
    }
}
