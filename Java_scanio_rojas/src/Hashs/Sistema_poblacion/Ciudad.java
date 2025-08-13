package Hashs.Sistema_poblacion;

import java.util.ArrayList;
import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio> barrios;

    public Ciudad(String nombre, int codigo, ArrayList<Integer> coordenadas, HashSet<Barrio> barrios) {
        super(nombre, codigo, coordenadas);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    @Override
    int cantidad_poblacion() {
        int cant=0;
        for(Barrio b:barrios){
            cant+=b.cantidad_poblacion();
        }
        return cant;
    }

    @Override
    void agregar(Lugar lugar) {
        barrios.add((Barrio) lugar);
    }

    @Override
    void eliminar(Lugar lugar) {
        barrios.remove(lugar);
    }
}
