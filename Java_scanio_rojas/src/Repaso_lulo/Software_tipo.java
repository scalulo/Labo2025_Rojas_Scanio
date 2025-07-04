package Repaso_lulo;

public class Software_tipo {
    private String nombre;
    private boolean parche;

    public Software_tipo(){
        this.nombre="XXX";
        this.parche=true;

    }

    public Software_tipo(String nombre, boolean parche) {
        this.nombre = nombre;
        this.parche = parche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getParche() {
        return parche;
    }

    public void setParche(boolean parche) {
        this.parche = parche;
    }
}
