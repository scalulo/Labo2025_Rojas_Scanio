package Repaso_Unidad7_8.EJ1;

import java.util.HashMap;

public abstract class Plato {
    private String nombre;
    private int coccion;
    private HashMap<String,Integer> ingredientes;

    public Plato(String nombre, int coccion, HashMap<String, Integer> ingredientes) {
        this.nombre = nombre;
        this.coccion = coccion;
        this.ingredientes = ingredientes;
    }
    public Plato(){
        this.nombre="rico";
        this.coccion=30;
        this.ingredientes=new HashMap<>();
    }

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
