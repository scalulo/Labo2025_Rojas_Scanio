package Repaso_Unidad7_8;

import java.time.LocalDate;
import java.util.HashMap;

public abstract class Plato {
    private String nombre;
    private int coccion;
    private HashMap<String,Integer> ingredientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoccion() {
        return coccion;
    }

    public void setCoccion(int coccion) {
        this.coccion = coccion;
    }

    public HashMap<String, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<String, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
