package Interfaces.Campeonato_arco_flecha;

import java.util.HashMap;

public class Cuadrado extends Diana{
    private int lado;

    public Cuadrado(String nombre, String nivel, HashMap<Integer, Color> puntajes, int lado) {
        super(nombre, nivel, puntajes);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}
