package Herencia.Pedido_alumerzo;

public class Plato {
    private String nombre;
    private double precio;
    private int cantidadPedidos;

    public Plato() {
        this.nombre = "Milanesa";
        this.precio = 10000;
        this.cantidadPedidos=0;
    }

    public Plato(String nombre, int precio, int cantidadPedidos) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadPedidos(int cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
    }

    public int getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void aumentarCantidadPedidos() {
        cantidadPedidos++;
    }
}



