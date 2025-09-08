package Interfaces.Campeonato_arco_flecha;

public abstract class Beneficio {
    private String nombre_creador;
    private String nombre_beneficio;

    public Beneficio(String nombre_creador, String nombre_beneficio) {
        this.nombre_creador = nombre_creador;
        this.nombre_beneficio = nombre_beneficio;
    }

    public String getNombre_creador() {
        return nombre_creador;
    }

    public void setNombre_creador(String nombre_creador) {
        this.nombre_creador = nombre_creador;
    }

    public String getNombre_beneficio() {
        return nombre_beneficio;
    }

    public void setNombre_beneficio(String nombre_beneficio) {
        this.nombre_beneficio = nombre_beneficio;
    }
}
