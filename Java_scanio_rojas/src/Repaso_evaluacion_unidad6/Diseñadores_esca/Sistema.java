package Repaso_evaluacion_unidad6.Diseñadores_esca;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Diseñadorp> diseñadores;
    private HashSet<Proyecto> proyectos;

    private static HashMap<Tipo,Integer> comision= Sistema.setComision() ;

    public static HashMap<Tipo, Integer> setComision(){
        HashMap<Tipo, Integer> com=new HashMap<>();
        com.put(Tipo.UX, 8);
        com.put(Tipo.UI, 7);
        com.put(Tipo.IT, 12);
        return com;
    }
    public static int agregameComision(Tipo t, Proyecto p) {
        return p.getPrecio() + p.getPrecio() * Sistema.comision.get(t) / 100;
    }

    public HashSet<Diseñadorp> getDiseñadores() {
        return diseñadores;
    }

    public void setDiseñadores(HashSet<Diseñadorp> diseñadores) {
        this.diseñadores = diseñadores;
    }

    public HashSet<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashSet<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public static HashMap<Tipo, Integer> getComision() {
        return comision;
    }

    public static void setComision(HashMap<Tipo, Integer> comision) {
        Sistema.comision = comision;
    }


}
