package Repaso_Unidad7_8;

import Unidad1.Persona;

import java.util.HashSet;

public class Principiante extends Participante {
    private HashSet<String> prohibidos;

    public Principiante(String nombre, HashSet<String> prohibidos) {
        super(nombre);
        this.prohibidos = prohibidos;
    }

    public HashSet<String> getProhibidos() {
        return prohibidos;
    }

    public void setProhibidos(HashSet<String> prohibidos) {
        this.prohibidos = prohibidos;
    }

    @Override
    public void preparar_lugar() {

    }
}
