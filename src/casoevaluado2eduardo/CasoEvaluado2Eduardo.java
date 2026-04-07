/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado2eduardo;

import java.util.Scanner;

public class CasoEvaluado2Eduardo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear el dungeon
        Dungeon dungeon = new Dungeon(3, 3);
        
        // Colocar objetos en el mapa
        dungeon.colocarObjeto(0, 1, new Objeto("Pocion", "pocion", 10));
        dungeon.colocarObjeto(1, 2, new Objeto("Pan", "comida", 5));
        dungeon.colocarObjeto(2, 2, new Objeto("Anillo", "artefacto", 20));
        dungeon.colocarObjeto(2, 0, new Objeto("Espada", "artefacto", 15));
        dungeon.colocarObjeto(1, 0, new Objeto("Manzana", "comida", 3));
        
        // Crear jugador
        Jugador jugador = new Jugador(0, 0, "Jugador1");
        
        System.out.println("🎮 !BIENVENIDO AL DUNGEON!");
        System.out.println("Objetivo: Recoge todos los objetos que puedas.");
        System.out.println("Controles: W=Arriba, S=Abajo, A=Izquierda, D=Derecha, Q=Salir");
        System.out.println("================================================");
        
        // Mostrar mapa inicial
        dungeon.mostrarMapa(jugador.getFila(), jugador.getColumna());
        
        boolean jugando = true;
        
        while (jugando) {
            System.out.print("\nIngresa tu movimiento (W/A/S/D) o Q para salir: ");
            String input = scanner.nextLine().toUpperCase();
            
            if (input.equals("Q")) {
                jugando = false;
                System.out.println("🏁 !Juego terminado por el jugador!");
                break;
            }
            
            Direccion direccion = null;
            
            switch (input) {
                case "W": direccion = Direccion.ARRIBA; break;
                case "S": direccion = Direccion.ABAJO; break;
                case "A": direccion = Direccion.IZQUIERDA; break;
                case "D": direccion = Direccion.DERECHA; break;
                default:
                    System.out.println("❌ Tecla invalida. Usa W/A/S/D para moverte o Q para salir.");
                    continue;
            }
            
            // Realizar movimiento
            jugador.mover(direccion, dungeon);
            
            // Mostrar mapa actualizado
            dungeon.mostrarMapa(jugador.getFila(), jugador.getColumna());
            
            // Mostrar inventario actual
            System.out.println("\n📦 Inventario actual:");
            System.out.println("Movimientos: " + (jugador.getInventario().getObjetos().size() > 0 ? 
                "Total acumulado: " + jugador.getInventario().getTotal() : "Sin objetos aun"));
        }
        
        // Mostrar reporte final
        jugador.mostrarResultado();
        
        scanner.close();
    }
}
