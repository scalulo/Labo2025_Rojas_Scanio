package Repaso_Unidad7_8.EJ1;

import Repaso_Unidad7_8.EJ1.Expeciones.ErrorCocina;
import Repaso_Unidad7_8.EJ1.Expeciones.ErrorServir;
import Repaso_Unidad7_8.EJ1.Interfaces.PlatoEntrada;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements PlatoEntrada {
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
    public void cocinar(Entrada p) throws ErrorCocina {

         if(puedo(p)==false){
            throw new ErrorCocina("El plato tiene un ingrediente prohibido");
        }
        else{
            System.out.println("Plato cocinado");
        }
    }

    @Override
    public void servir(Entrada p) throws ErrorServir {

            System.out.println("Plato servido");


    }

}
