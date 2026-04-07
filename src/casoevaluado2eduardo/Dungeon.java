package casoevaluado2eduardo;

import java.util.Random;

public class Dungeon {
    private Objeto[][] mapa;
    private Random random;
    
    // Constantes de colores ANSI para consola
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

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
    
    public boolean hayObjetosRestantes() {
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (mapa[i][j] != null) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void removerObjeto(int fila, int col) {
        mapa[fila][col] = null;
    }
    
    public void mostrarMapa(int jugadorFila, int jugadorColumna) {
        System.out.println("\n=== MAPA ACTUAL ===");
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (i == jugadorFila && j == jugadorColumna) {
                    System.out.print(RED + "[J]" + RESET + " ");
                } else if (mapa[i][j] != null) {
                    // Colores segun el tipo de objeto
                    String tipo = mapa[i][j].getTipo();
                    if (tipo.equals("pocion")) {
                        System.out.print(CYAN + "[O]" + RESET + " ");
                    } else if (tipo.equals("comida")) {
                        System.out.print(GREEN + "[O]" + RESET + " ");
                    } else if (tipo.equals("artefacto")) {
                        System.out.print(YELLOW + "[O]" + RESET + " ");
                    } else {
                        System.out.print(WHITE + "[O]" + RESET + " ");
                    }
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
        System.out.println(CYAN + "[O]" + RESET + " = Pocion, " + 
                          GREEN + "[O]" + RESET + " = Comida, " + 
                          YELLOW + "[O]" + RESET + " = Artefacto, " + 
                          RED + "[J]" + RESET + " = Jugador, " + 
                          "[ ] = Vacio");
    }
}
