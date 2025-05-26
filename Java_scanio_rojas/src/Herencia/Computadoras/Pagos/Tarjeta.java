package Herencia.Computadoras.Pagos;

public class Tarjeta {
    private int numero_tarjeta;
    private String nombre;
    private int recargo;

    public Tarjeta(int numero_tarjeta, String nombre, int recargo) {
        this.numero_tarjeta = numero_tarjeta;
        this.nombre = nombre;
        this.recargo = recargo;
    }

    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }
}
