package Herencia.Computadoras;

public class Dispositivo_salida {
    private String nombre;
    private int puertos;
    private int precio;
    private int stock;

    public Dispositivo_salida(String nombre, int puertos, int precio, int stock) {
        this.nombre = nombre;
        this.puertos = puertos;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
