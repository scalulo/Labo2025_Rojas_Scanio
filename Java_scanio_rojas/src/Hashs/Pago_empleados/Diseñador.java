package Hashs.Pago_empleados;

import java.util.HashMap;
import java.util.Map;

public class Diseñador {
    private String nombre;
    private TipoDiseñador tipo;
    private HashMap<Proyecto, Double>proyectos;

    public Diseñador(String nombre, TipoDiseñador tipo, HashMap<Proyecto, Double> proyectos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.proyectos = proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDiseñador getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiseñador tipo) {
        this.tipo = tipo;
    }

    public HashMap<Proyecto, Double> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<Proyecto, Double> proyectos) {
        this.proyectos = proyectos;
    }

public double cometa(Proyecto p){
        double cometa=proyectos.get(p);
    if(tipo.equals(TipoDiseñador.UX)){
        cometa=cometa*0.08;
    } else if (tipo.equals(TipoDiseñador.UI)) {
        cometa=cometa*0.07;
    }
    else{
        cometa=cometa*0.12;
    }
    return cometa;
}

    public double sueldo(){
       double sueldo=0;
        for (Proyecto proyecto: proyectos.keySet()){
            sueldo+=cometa(proyecto);
        }

        return sueldo;
    }


    public int cant_proyectos(){
        return proyectos.size();
    }

    public double ganancia_sin_cometa(Proyecto p){
        return proyectos.get(p);
    }

    public void detalles_proyecto(){
        for (Map.Entry<Proyecto, Double> entrada:proyectos.entrySet()){
            String nom=entrada.getKey().getNombre();
            Double costo=entrada.getValue();
            Double sueldo=cometa(entrada.getKey());
            System.out.println("Descripcion del proyecto: ");
            System.out.println(nom);
            System.out.println("ganancia total: "+costo);
            System.out.println("sueldo: "+sueldo);
        }
    }
}
