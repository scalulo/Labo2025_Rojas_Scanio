package Hashs.Sistema_poblacion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Mundo {
    private HashSet<Continente> continentes;
    private HashMap<Integer, Lugar> lugares;


    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public Mundo(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public int consulta(int codigo){
         return lugares.get(codigo).cantidad_poblacion();
    }

    public Mundo(){
        this.continentes=new HashSet<>();
        this.lugares=new HashMap<>();
    }

    public Pais pais_mayor(){
        Pais aux=new Pais();

        for(Continente c:continentes){
            for(Pais p:c.getPaises()){
                if(p.cantidad_poblacion()> aux.cantidad_poblacion()){
                    aux=p;
                }
            }
        }
        return aux;
    }

    public Pais pais_menor(){
        Pais aux=new Pais();

        for(Continente c:continentes){
            for(Pais p:c.getPaises()){
                if(p.cantidad_poblacion()< aux.cantidad_poblacion()){
                    aux=p;
                }
            }
        }
        return aux;
    }

    public Continente continente_mayor(){
        Continente aux=new Continente();
        for(Continente c:continentes){
            if(c.cantidad_poblacion()>aux.cantidad_poblacion()){
                aux=c;
            }
        }
        return aux;
    }

    public Continente continente_menor(){
        Continente aux=new Continente();
        for(Continente c:continentes){
            if(c.cantidad_poblacion()<aux.cantidad_poblacion()){
                aux=c;
            }
        }
        return aux;
    }


    public void Pantalla(){

        System.out.println("Pais con mayor poblacion: "+pais_mayor());
        System.out.println("Pais con menor poblacion: "+pais_menor());
        System.out.println("Continente con mayor poblacion: "+continente_mayor());
        System.out.println("Continente con menor poblacion: "+continente_menor());


    }


    public static void main(String[] args) {

        Mundo m1=new Mundo();

    }
}
