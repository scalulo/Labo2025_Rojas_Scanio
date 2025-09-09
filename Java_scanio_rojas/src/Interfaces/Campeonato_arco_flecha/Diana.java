package Interfaces.Campeonato_arco_flecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private String nivel;
    private HashMap<Integer,Color> puntajes;

    public Diana(String nombre, String nivel, HashMap<Integer, Color> puntajes) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajes = puntajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public HashMap<Integer, Color> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<Integer, Color> puntajes) {
        this.puntajes = puntajes;
    }

    public abstract double area();
}
