package casoevaluado2eduardo;

import java.util.ArrayList;

public class Inventario {
    private String idJugador;
    private ArrayList<Objeto> objetos;
    private int total;

    public Inventario(String idJugador) {
        this.idJugador = idJugador;
        this.objetos = new ArrayList<>();
        this.total = 0;
    }

    public void agregarObjeto(Objeto obj) {
        if (obj != null) {
            objetos.add(obj);
            total += obj.getValor();
        }
    }
    public String getIdJugador() {
        return idJugador;
    }
    
    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void mostrarReporte(int movimientos) {
        System.out.println("=== REPORTE FINAL ===");

        if (objetos.isEmpty()) {
            System.out.println("No se recolectaron objetos.");
        } else {
            for (Objeto o : objetos) {
                System.out.println(o.getNombre() + " (" + o.getTipo() + ") - Valor: " + o.getValor());
            }
        }

        System.out.println("Total acumulado: " + total);
        System.out.println("Movimientos realizados: " + movimientos);
    }

    
}
