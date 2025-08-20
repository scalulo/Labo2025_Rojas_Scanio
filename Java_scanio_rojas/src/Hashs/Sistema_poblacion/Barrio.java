package Hashs.Sistema_poblacion;

import java.util.ArrayList;

public  class Barrio extends Lugar{
    private int poblacion;

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Barrio(String nombre, int codigo, ArrayList<Integer> coordenadas, int poblacion) {
        super(nombre, codigo, coordenadas);
        this.poblacion = poblacion;
    }

    @Override
    int cantidad_poblacion() {
        return poblacion;
    }

    @Override
    void agregar(Lugar lugar) {

    }

    @Override
    void eliminar(Lugar lugar) {

    }

    @Override
    void modificar() {

    }
}
