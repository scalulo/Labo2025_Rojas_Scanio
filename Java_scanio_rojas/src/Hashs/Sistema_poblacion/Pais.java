package Hashs.Sistema_poblacion;

import java.util.ArrayList;
import java.util.HashSet;

public class Pais extends Lugar {
    private HashSet<Provincia> provincias;

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    public Pais(String nombre, int codigo, ArrayList<Integer> coordenadas, HashSet<Provincia> provincias) {
        super(nombre, codigo, coordenadas);
        this.provincias = provincias;
    }
    public Pais(){
        super();
        this.provincias=new HashSet<>();
    }

    @Override
    int cantidad_poblacion() {
        int cant=0;
        for(Provincia p:provincias){
            cant+=p.cantidad_poblacion();
        }
        return cant;
    }

    @Override
    void agregar(Lugar lugar) {
        provincias.add((Provincia) lugar);
    }

    @Override
    void eliminar(Lugar lugar) {
        provincias.remove(lugar);
    }

    @Override
    void modificar() {

    }
}

