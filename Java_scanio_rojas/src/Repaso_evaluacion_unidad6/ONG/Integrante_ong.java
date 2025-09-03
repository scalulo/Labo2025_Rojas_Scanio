package Repaso_evaluacion_unidad6.ONG;

import Unidad1.Persona;

import java.util.HashMap;
import java.util.Set;

public abstract class Integrante_ong extends Persona {
    private int codigo_postal;
    private boolean contribuir;
    private static Set<String> barrios=  Set.of(
            "Montserrat", "Nueva Pompeya", "Nuñez", "Belgrano", "Constitución"
    );

    public Integrante_ong(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir) {
        super(nombre, edad, direccion, apellido);
        this.codigo_postal = codigo_postal;
        this.contribuir = contribuir;
    }

    public static Set<String> getBarrios() {
        return barrios;
    }

    public static void setBarrios(Set<String> barrios) {
        Integrante_ong.barrios = barrios;
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

    public boolean mayor(){
        return getEdad()>=18;
    }

     abstract void accion_solidaria();
}
