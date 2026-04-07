package casoevaluado2eduardo;

import java.util.Random;

public class Dungeon {
    private Objeto[][] mapa;
    private Random random;

    public Dungeon(int filas, int columnas) {
        mapa = new Objeto[filas][columnas];
        random = new Random();
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
    
    public void colocarObjetosAlAzar() {
        String[] nombres = {"Pocion", "Pan", "Anillo", "Espada", "Manzana"};
        String[] tipos = {"pocion", "comida", "artefacto", "artefacto", "comida"};
        int[] valores = {10, 5, 20, 15, 3};
        
        int cantidadObjetos = 5;
        int colocados = 0;
        
        while (colocados < cantidadObjetos) {
            int fila = random.nextInt(getFilas());
            int columna = random.nextInt(getColumnas());
            
            // No colocar en la posicion inicial del jugador (0,0)
            if (fila == 0 && columna == 0) {
                continue;
            }
            
            // No colocar si ya hay un objeto en esa posicion
            if (mapa[fila][columna] == null) {
                mapa[fila][columna] = new Objeto(nombres[colocados], tipos[colocados], valores[colocados]);
                colocados++;
            }
        }
    }
    
    public void removerObjeto(int fila, int col) {
        mapa[fila][col] = null;
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
        System.out.println("[J] = Jugador, [O] = Objeto, [ ] = Vacio");
    }
}
