package Repaso_evaluacion_unidad6.Diseñadores_esca;

public class Proyecto {
    private int precio;
    private String nombre;

    public Proyecto(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
