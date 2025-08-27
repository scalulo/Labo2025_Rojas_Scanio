package Repaso_evaluacion_unidad6.ONG;

import Unidad1.Persona;

import java.util.HashMap;

public class Integrante_ong extends Persona {
    private int codigo_postal;
    private boolean contribuir;


    public Integrante_ong(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir) {
        super(nombre, edad, direccion, apellido);
        this.codigo_postal = codigo_postal;
        this.contribuir = contribuir;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public boolean isContribuir() {
        return contribuir;
    }

    public void setContribuir(boolean contribuir) {
        this.contribuir = contribuir;
    }
}
