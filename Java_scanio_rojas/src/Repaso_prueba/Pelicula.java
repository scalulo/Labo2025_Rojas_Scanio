package Repaso_prueba;

import Unidad1.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    double duracion;
    private ArrayList<Persona> actores;
    private ArrayList<Persona> directores;
    private int idiomas;


    public Pelicula() {
        this.nombre = "Avengers";
        this.genero = "Ficcion";
        this.duracion = 60;
        this.actores = new ArrayList<>();
        Persona p1 = new Persona();
        actores.add(p1);
        this.directores = new ArrayList<>();
        this.idiomas = 3;

    }

    public Pelicula(String nombre, String genero, double duracion, int idiomas) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.actores = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.idiomas = idiomas;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public ArrayList<Persona> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        this.directores = directores;
    }

    public int getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(int idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<Persona> mayoresEdad() {
        int mayor = 18;
        ArrayList<Persona> mayores = new ArrayList<>();
        for (Persona actor : actores) {
            if (actor.getEdad() >= mayor) {
                mayores.add(actor);
            }
        }

        return mayores;

    }

    public void mostrarNombre(ArrayList<Persona> mayores){
        for(int i=0;i<mayores.size();i++){
            System.out.println("Nombre del actor mayor de edad: " +mayores.get(i).getNombre());
        }
    }
}
