package Repaso_evaluacion_unidad6.Diseñadores_esca;

import java.util.HashMap;
import java.util.Map;

public class Diseñadorp {
    private HashMap<Proyecto, Integer> proyectos;
    private Tipo tipo;

    public Diseñadorp(HashMap<Proyecto, Integer> proyectos, Tipo tipo) {
        this.proyectos = proyectos;
        this.tipo = tipo;
    }

    public HashMap<Proyecto, Integer> sumar_cometa (HashMap<Proyecto,Integer> p){
        for (Map.Entry<Proyecto,Integer> t:p.entrySet()){
            p.put(t.getKey(),(Sistema.agregameComision(tipo,t.getKey())));
        }
        this.proyectos=p;
        return p;
    }

    public HashMap<Proyecto, Integer> getProyectos() {
        return proyectos;
    }



    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int sueldo(){
        int suma=0;
        for (Integer p:proyectos.values()){
            suma+=p;
        }
        return suma;
    }

    public int sincometa(Proyecto p){
        if(proyectos.containsKey(p)){
            return p.getPrecio();
        }
        System.out.println("Usted no a realizado este proyecto");
        return 0;
    }

    public void sueldo_disc(){
        for(Map.Entry<Proyecto,Integer>entry:proyectos.entrySet()){
            System.out.println(entry.getKey().getNombre()+ " precio "+entry.getKey().getPrecio() + " precio sin cometA: "+( Sistema.agregameComision(tipo,entry.getKey()) - sincometa(entry.getKey())));
        }
    }

}
