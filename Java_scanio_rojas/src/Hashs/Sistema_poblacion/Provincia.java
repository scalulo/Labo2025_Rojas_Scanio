package Hashs.Sistema_poblacion;

import java.util.ArrayList;
import java.util.HashSet;

public  class Provincia extends Lugar{
    private HashSet<Ciudad> ciudades;



    public Provincia(String nombre, int codigo, ArrayList<Integer> coordenadas, HashSet<Ciudad> ciudades) {
        super(nombre, codigo, coordenadas);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    int cantidad_poblacion() {
        int cant=0;
        for(Ciudad c:ciudades){
            cant+=c.cantidad_poblacion();
        }
        return cant;
    }

    @Override
    void agregar(Lugar lugar) {
        ciudades.add((Ciudad) lugar);
    }

    @Override
    void eliminar(Lugar lugar) {
        ciudades.remove(lugar);
    }
}

