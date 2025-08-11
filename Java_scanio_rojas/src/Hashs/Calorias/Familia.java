package Hashs.Calorias;

import java.util.HashSet;

public class Familia {
    String apellido;
    HashSet<Persona> integrantes;

    public Familia(String apellido, HashSet<Persona> integrantes) {
        this.apellido = apellido;
        this.integrantes = integrantes;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashSet<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(HashSet<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public float promedio_calorias(){
        float calorias=0;
        for (Persona p : integrantes){
            calorias+=p.calorias_totales();
        }
        return calorias/integrantes.size();
    }

    public Persona mas_gordo(){
        Persona obeso=null;
        for (Persona p:integrantes){
            if(obeso == null || p.calorias_totales()> obeso.calorias_totales() ) {
                obeso=p;
            }
        }
    return obeso;
    }

    public Persona mas_flaco(){
        Persona flaquito=null;
        for (Persona p:integrantes){
            if(flaquito == null || p.calorias_totales()< flaquito.calorias_totales()  ){
                flaquito=p;
            }
        }
        return flaquito;
    }


}
