package Hashs.Vacunatorio;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashMap<Integer, Ciudadano> mapa;


    public Sistema(HashMap<Integer, Ciudadano> mapa) {
        this.mapa = mapa;
    }
    public Sistema(){
    this.mapa=new HashMap<>();
    }

    public HashMap<Integer, Ciudadano> getMapa() {
        return mapa;
    }

    public void setMapa(HashMap<Integer, Ciudadano> mapa) {
        this.mapa = mapa;
    }

    public void registrar_vacuna(Vacuna vacuna, Integer dni){
        mapa.get(dni).getHistorial().add(vacuna);


    }

    public void consultar_historial(Integer dni){
        if(mapa.containsKey(dni)){
            mapa.get(dni).mostrar_historial();
        }
        else{
            System.out.println("Ese dni no esta registrado");
        }

    }

    public HashMap<Provincias,Integer> cantidad_por_provincia(){
        HashMap<Provincias,Integer> aux=new HashMap<>();


        for(Ciudadano c:mapa.values()){
            if(aux.containsKey(c.getProvincia())){
                aux.put(c.getProvincia(),aux.get(c.getProvincia())+1);
            }

            else{
                aux.put(c.getProvincia(),1);
            }
        }

        return aux;
    }

    public HashSet<Ciudadano> cumple_cantidad(int cantidad){

        HashSet<Ciudadano> cumplen=new HashSet<>();

        for(Ciudadano c: mapa.values()){
            if(c.getHistorial().size()>=cantidad){
                cumplen.add(c);
            }
        }
        return cumplen;
    }

    public void se_dieron(Vacuna vacuna){

        for(Ciudadano c: mapa.values()){
                if(c.getHistorial().contains(vacuna)){
                    System.out.println("Se la dio el ciudadano con dni:" +c.getDni());
                }

        }
    }

    public static void main(String[] args) {

        Ciudadano c1=new Ciudadano();
        Vacuna v1=new Vacuna();
        Sistema s1=new Sistema();

        s1.registrar_vacuna(v1,22418304);
        s1.consultar_historial(22418302);
        System.out.println(s1.cantidad_por_provincia());
        s1.cumple_cantidad(3);
        s1.se_dieron(v1);


    }
}
