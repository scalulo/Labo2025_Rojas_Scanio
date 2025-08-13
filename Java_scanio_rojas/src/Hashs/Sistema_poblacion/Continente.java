package Hashs.Sistema_poblacion;

import java.util.ArrayList;
import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;



    public Continente(String nombre, int codigo, ArrayList<Integer> coordenadas, HashSet<Pais> paises) {
        super(nombre, codigo, coordenadas);
        this.paises = paises;
    }
    public Continente(){
        super();
        this.paises=paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    @Override
    int cantidad_poblacion() {
        int cant=0;
        for(Pais p:paises){
            cant+=p.cantidad_poblacion();
        }
        return cant;
    }

    @Override
    void agregar(Lugar lugar) {
        paises.add((Pais) lugar);
    }

    @Override
    void eliminar(Lugar lugar) {
        paises.remove(lugar);
    }
}

