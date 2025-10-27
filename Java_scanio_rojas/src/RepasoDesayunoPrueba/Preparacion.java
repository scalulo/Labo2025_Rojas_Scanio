package RepasoDesayunoPrueba;

import java.util.HashMap;

public abstract class Preparacion {
    private HashMap<Ingrediente,Integer>ingredientes;
    private int stock;
    private int precio_unidad;

    public Preparacion(HashMap<Ingrediente, Integer> ingredientes, int stock, int precio_unidad) {
        this.ingredientes = ingredientes;
        this.stock = stock;
        this.precio_unidad = precio_unidad;
    }
    public Preparacion(){
        this.ingredientes=new HashMap<>();
        this.stock=1;
        this.precio_unidad=400;
    }

    public HashMap<Ingrediente, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<Ingrediente, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(int precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    abstract String conocer_receta();
}
