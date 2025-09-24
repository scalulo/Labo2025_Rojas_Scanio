package Repaso_Unidad7_8;

import Modificadores.Aplicacion_Mascotas.Mascota;

public abstract class Participante {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Participante(String nombre) {
        this.nombre = nombre;
    }
    public Participante(){
        this.nombre="Lol";
    }

    public abstract void preparar_lugar();
}

