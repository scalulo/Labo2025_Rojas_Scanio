package Modificadores.Recetas;

import java.util.ArrayList;

public abstract class Receta {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> pasos;

    public Receta(String nombre, Dificultad dificultad, ArrayList<String> pasos) {

        this.nombre = nombre;
        this.dificultad = dificultad;
        this.pasos = pasos;
    }

    public Receta() {
        this.nombre = "Milanesa";
        this.dificultad = Dificultad.DIFICIL;
        this.pasos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    abstract void mostrar_pasos();

    abstract boolean esDelTipo(Receta r);

    public boolean sosEntrada(){
        return false;
    }
    public boolean sosPrincipal(){
        return false;
    }
    public boolean sosPostre(){
        return false;
    }
}
