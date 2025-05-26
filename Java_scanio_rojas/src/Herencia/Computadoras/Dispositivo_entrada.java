package Herencia.Computadoras;

public class Dispositivo_entrada {
    private String nombre;
    private String tipo_conector;
    private int puertos;
    private int precio;
    private int stock;

    public Dispositivo_entrada(String nombre, String tipo_conector, int puertos, int precio, int stock) {
        this.nombre = nombre;
        this.tipo_conector = tipo_conector;
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

    public String getTipo_conector() {
        return tipo_conector;
    }

    public void setTipo_conector(String tipo_conector) {
        this.tipo_conector = tipo_conector;
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
