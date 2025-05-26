package Herencia.Computadoras;

public class Componente {
    private String nombre;
    private String fabricante;
    private String modelo;
    private int precio;
    private int stock;

    public Componente(String nombre, String fabricante, String modelo, int precio, int stock) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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