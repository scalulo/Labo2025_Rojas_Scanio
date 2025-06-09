package Modificadores.Recetas;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Receta> recetas;

    public Plataforma() {
        this.recetas = recetas;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public void agregar(Receta p){
        recetas.add(p);
    }
    public void eliminar(Receta p){
        recetas.remove(p);
    }
    public void modificar(Receta p, Receta p2){
        recetas.remove(p);
        recetas.add(p2);
    }
    public void buscar(){
        ArrayList<Receta> encontradas;
    }

    public static void main(String[] args) {
        Plataforma plataforma1=new Plataforma();
        Principal principal1=new Principal();
        Postre postre1=new Postre("Flan",Dificultad.DIFICIL, new ArrayList<String>(),true, 180  );

        plataforma1.agregar(principal1);
        plataforma1.eliminar(principal1);
        plataforma1.modificar(principal1, postre1);
        plataforma1.buscar();


    }
}
