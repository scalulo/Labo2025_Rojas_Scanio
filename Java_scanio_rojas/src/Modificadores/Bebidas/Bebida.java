package Modificadores.Bebidas;

public abstract class Bebida {
    private String nombre;


    public Bebida(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract int calcular_hidratacion();


}
