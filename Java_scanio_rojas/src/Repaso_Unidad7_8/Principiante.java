package Repaso_Unidad7_8;

import Unidad1.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements Cocinar,Servir {
    private HashSet<String> prohibidos;

    public Principiante(String nombre, String apellido, LocalDate f, String l,Color c, HashSet<String> prohibidos) {
        super(nombre,apellido,f,l,c);
        this.prohibidos = prohibidos;
    }
    public Principiante(){
        super();
        this.prohibidos=new HashSet<>();
    }

    public HashSet<String> getProhibidos() {
        return prohibidos;
    }

    public void setProhibidos(HashSet<String> prohibidos) {
        this.prohibidos = prohibidos;
    }

    public void recorrer_prohibidos(){
        int i=1;
        for(String p:prohibidos){
            System.out.println("Ingrediente "+i+":"+p);
            i++;
        }
    }

    public boolean deben(Plato p){
        if(p.getClass().equals(Entrada.class)){
            return true;
        }
        return false;
    }
    public boolean puedo(Plato p){
        int i=0;
        for(String s:prohibidos){
            if(p.getIngredientes().containsKey(s)){
                i++;
            }
        }
        if(i>0){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void preparar_lugar() {
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: ");
        recorrer_prohibidos();
    }

    @Override
    public void Cocinar(Plato p) throws ErrorCocina {
        if(deben(p)==false){
            throw new ErrorCocina("El plato no es una entrada");
        }
        else if(puedo(p)==false){
            throw new ErrorCocina("El plato tiene un ingrediente prohibido");
        }
        else{
            System.out.println("Plato cocinado");
        }
    }

    @Override
    public void servir(Plato p) throws ErrorServir {
        if(deben(p)){
            System.out.println("Plato servido");
        }
        else{
            throw new ErrorServir("El plato no es una entrada");
        }
    }

}
