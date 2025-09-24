package Repaso_evaluacion_unidad6.Vacunatorio_Esca;

import Hashs.Vacunatorio.Ciudadano;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CampañaVacunacion {
    private HashMap<Integer, Ciudadanos> ciudadanos;

    public CampañaVacunacion( HashMap<Integer, Ciudadanos> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }



    public HashMap<Integer, Ciudadanos> getCiudadanos() {
        return ciudadanos;
    }

    public void setCiudadanos(HashMap<Integer, Ciudadanos> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }

    public void registrar_vacuna(Ciudadanos c, Vacuna v){
            if (ciudadanos.containsKey(c.getDni()   )){
                if(!c.getVacunas().contains(v)){
                c.getVacunas().add(v);
                  }
                else {
                    System.out.println("esta vacuna ya fue agregada");
                }
            }
    }

    public void historial_dni(int dni){
        if (ciudadanos.containsKey(dni)){
            for(Vacuna v: ciudadanos.get(dni).getVacunas()){
                System.out.println("Vacuna: "+ v.getNombreComercial());
            }
        }
        else {
            System.out.println("el dni no esta asociado a ningun ciudadano");
        }
    }

    public void vacunados_provincia(){

        HashMap<String, Integer>conteo=new HashMap<>();

        for (Ciudadanos c:ciudadanos.values()){
            if(!c.getVacunas().isEmpty()) {
                conteo.put(c.getProvincia(), conteo.getOrDefault(c.getProvincia(), 0) + 1);
            }
        }

        for(Map.Entry<String, Integer>entry:conteo.entrySet()){
            System.out.println("provincia: "+ entry.getKey() +" tiene vacunados: "+entry.getValue());
        }
    }

    public void cumple_con(int n){
            for (Ciudadanos c: ciudadanos.values()){
                if (c.getVacunas().size()>=n) {
                    System.out.println("el ciudadano con dni" + c.getDni() + "cumple con la cant requerida d vacunas");
                }
            }
    }

    public void cumplenconV(Vacuna v){
        for(Ciudadanos c: ciudadanos.values()){
            if(c.getVacunas().contains(v)){
                System.out.println("el ciudadano con dni "+c.getDni()+" cumple con la vacuna dada");
            }
        }
    }

}


