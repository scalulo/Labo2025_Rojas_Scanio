package Tienda_electronica.Productos;

import Tienda_electronica.Producto;

public class Television extends Producto {
    private Calidad calidad;

    public Television(String nombre, int precio, int stock, Calidad calidad) {
        super(nombre, precio, stock);
        this.calidad = calidad;
    }

    public Calidad getCalidad() {
        return calidad;
    }

    public void setCalidad(Calidad calidad) {
        this.calidad = calidad;
    }
}
