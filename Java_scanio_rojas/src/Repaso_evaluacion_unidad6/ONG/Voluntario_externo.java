package Repaso_evaluacion_unidad6.ONG;

public class Voluntario_externo extends Integrante_ong {
    private String nom_instituncion;
    private String dire_instituncion;

    public Voluntario_externo(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir, String nom_instituncion, String dire_instituncion) {
        super(nombre, edad, direccion, apellido, codigo_postal, contribuir);
        this.nom_instituncion = nom_instituncion;
        this.dire_instituncion = dire_instituncion;
    }

    public String getNom_instituncion() {
        return nom_instituncion;
    }

    public void setNom_instituncion(String nom_instituncion) {
        this.nom_instituncion = nom_instituncion;
    }

    public String getDire_instituncion() {
        return dire_instituncion;
    }

    public void setDire_instituncion(String dire_instituncion) {
        this.dire_instituncion = dire_instituncion;
    }
}
