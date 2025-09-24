package Repaso_evaluacion_unidad6.Vacunatorio_Esca;

import java.util.HashSet;

public class Ciudadanos {
    private int dni;
    private String nombre;
    private String apellido;
    private String provincia;
    private String mail;
    private HashSet<Vacuna> vacunas;


    public Ciudadanos(int dni, String nombre, String apellido, String provincia, String mail, HashSet<Vacuna> vacunas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.mail = mail;
        this.vacunas = vacunas;
    }


    public HashSet<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(HashSet<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
