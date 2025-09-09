package Interfaces.Elecciones;

public class Ave {
    private String nombre;
    private String color;
    private String especie;

    public Ave(String nombre, String color, String especie) {
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
