package EjerciciosCurso.DukeChoice;

public class Clothing {
    private String description;
    private double precio;
    private double minPrecio = 10.0;
    private double tax = 1.2;
    private String talle = "M";

    public Clothing(String description, double precio, String talle) {
        this.description = description;
        this.precio = precio;
        this.precio = talle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrecio() {
        return precio * tax;
    }

    public void setPrecio(double precio) {
        if (precio > minPrecio){
            this.precio = precio;
        }
    }

    public String gettalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }
}
