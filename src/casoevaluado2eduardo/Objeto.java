package casoevaluado2eduardo;

public class Objeto {
    private String nombre;
    private String tipo;
    private int valor;

    public Objeto(String nombre, String tipo, int valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}
