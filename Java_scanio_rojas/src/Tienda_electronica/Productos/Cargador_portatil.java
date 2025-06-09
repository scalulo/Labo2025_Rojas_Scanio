package Tienda_electronica.Productos;

public class Cargador_portatil extends Cargador{
    private double duracion;

    public Cargador_portatil(String nombre, int precio, int stock, String tipo_conector, double amperaje, double duracion) {
        super(nombre, precio, stock, tipo_conector, amperaje);
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
