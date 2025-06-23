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
    public ArrayList<Receta> buscar(Dificultad dificultad){
        ArrayList<Receta> encontradas=new ArrayList<>();
        for(Receta r:recetas){
            if (r.getDificultad()==dificultad){
                encontradas.add(r);
            }
        }
    return encontradas;
    }

    public int cantidadrecetas(){
        int cantidad=recetas.size();
        return cantidad;
    }

    public void cantidadPasos(){
        int aux=0;
        Receta receta=null;

        for(Receta r: recetas){
            if(r.getPasos().size()>aux){
                aux=r.getPasos().size();
                receta=r;
            }
        }
        System.out.println("La receta con mayor cantidad de pasos es:"+receta.getNombre());
        System.out.println("Tiene "+aux+" cantidad de pasos");
    }

    public void filtrar(){
        ArrayList<Receta> postres=new ArrayList<>();
        ArrayList<Receta> entradas=new ArrayList<>();
        ArrayList<Receta> principales=new ArrayList<>();

        for(Receta r:recetas){
            if(r.getClass()==Principal.class){
                principales.add(r);
            }
            else if(r.getClass()== Entrada.class){
                entradas.add(r);
            }
            if(r.getClass()==Postre.class){
                postres.add(r);
            }
        }



    }





    public static void main(String[] args) {
        Plataforma plataforma1=new Plataforma();
        Principal principal1=new Principal();
        Postre postre1=new Postre("Flan",Dificultad.DIFICIL, new ArrayList<String>(),true, 180  );

        plataforma1.agregar(principal1);
        plataforma1.eliminar(principal1);
        plataforma1.modificar(principal1, postre1);
        Dificultad dificultad=Dificultad.DIFICIL;
        plataforma1.buscar(dificultad);
        plataforma1.cantidadPasos();
        plataforma1.filtrar();


    }
}
