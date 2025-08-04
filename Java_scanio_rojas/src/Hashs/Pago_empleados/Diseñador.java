package Hashs.Pago_empleados;

import java.util.HashMap;

public class Diseñador {
    private String nombre;
    private TipoDiseñador tipo;
    private HashMap<Proyecto, Double>proyectos;

    public Diseñador(String nombre, TipoDiseñador tipo, HashMap<Proyecto, Double> proyectos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.proyectos = proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDiseñador getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiseñador tipo) {
        this.tipo = tipo;
    }

    public HashMap<Proyecto, Double> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<Proyecto, Double> proyectos) {
        this.proyectos = proyectos;
    }
}
