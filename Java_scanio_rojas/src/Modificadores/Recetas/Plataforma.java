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


/*
    public void filtrar(){
    ArrayList<Receta> entradas =new ArrayList<>();
        ArrayList<Receta> postres =new ArrayList<>();
        ArrayList<Receta> principales =new ArrayList<>();

    for(Receta r:recetas){
        if(r.getClass()== Entrada.class){
            entradas.add(r);
        }
        if(r.getClass()== Principal.class){
            principales.add(r);
        }
        if(r.getClass()== Postre.class){
            postres.add(r);
        }
    }
    }
    */

    public void filtrarDesafio(Receta princi, Receta pos, Receta entra){
        ArrayList<Receta> entradas =new ArrayList<>();
        ArrayList<Receta> postres =new ArrayList<>();
        ArrayList<Receta> principales =new ArrayList<>();

        for(Receta r: recetas){
            if(entra.esDelTipo(r)) {
                entradas.add(r);
            }
            else if (princi.esDelTipo(r)){
                principales.add(r);
            }
            else if (pos.esDelTipo(r)){
                postres.add(r);
            }
        }

    }


    public void buscar(Dificultad dificultad){
        int n=1;
        ArrayList<Receta> encontradas=new ArrayList<>();
        for(Receta r:recetas){
            if(r.getDificultad()==dificultad){
                encontradas.add(r);
            }


        }
        for(Receta dificultades:encontradas){
            System.out.println("Receta con la dificultad parametrizada numero "+n+": "+dificultades);
        }

    }

    public void cantidad(){
        int cant=0;

        cant=recetas.size();

        System.out.println("Cantidad de recetas cargadas: "+cant);
    }

    public void mayor(){
        Receta mayor=recetas.get(0);


        for(Receta r:recetas) {
            if (r.getPasos().size() > mayor.getPasos().size()) {
                mayor = r;
            }
        }
        System.out.println("Nombre de la receta con mayor cantidad de pasos:"+mayor.getNombre());

    }


    public static void main(String[] args) {
        Plataforma plataforma1=new Plataforma();
        Principal principal1=new Principal();
        Postre postre1=new Postre("Flan",Dificultad.DIFICIL, new ArrayList<String>(),true, 180  );
        Entrada entrada1=new Entrada("Rabas", Dificultad.MEDIO, new ArrayList<String>(),Temperatura.CALIENTE);

        plataforma1.agregar(principal1);
        plataforma1.eliminar(principal1);
        plataforma1.modificar(principal1, postre1);
        Dificultad dificultad=Dificultad.DIFICIL;
        plataforma1.buscar(dificultad);
        plataforma1.cantidad();
        plataforma1.filtrarDesafio(principal1,postre1,entrada1);


    }
}