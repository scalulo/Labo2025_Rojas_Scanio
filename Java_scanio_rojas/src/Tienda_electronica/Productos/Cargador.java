package Tienda_electronica.Productos;

import Tienda_electronica.Producto;

public class Cargador extends Producto {
    private String tipo_conector;
    private double Amperaje;
    static Categoria categoria=Categoria.CARGARODES;

    public Cargador(String nombre, int precio, int stock, String tipo_conector, double amperaje) {
        super(nombre, precio, stock);
        this.tipo_conector = tipo_conector;
        Amperaje = amperaje;
    }

    public String getTipo_conector() {
        return tipo_conector;
    }

    public void setTipo_conector(String tipo_conector) {
        this.tipo_conector = tipo_conector;
    }

    public double getAmperaje() {
        return Amperaje;
    }

    public void setAmperaje(double amperaje) {
        Amperaje = amperaje;
    }
}
