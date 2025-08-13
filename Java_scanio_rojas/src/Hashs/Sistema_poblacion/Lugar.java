package Hashs.Sistema_poblacion;

import java.util.ArrayList;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private Coordenada coordenadas;

    public Lugar(){
        this.nombre="XXX";
        this.codigo=2;
        this.coordenadas=new Coordenada();
    }

    public Lugar(String nombre, int codigo, ArrayList<Integer> coordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordenadas = new Coordenada();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Coordenada getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenada coordenadas) {
        this.coordenadas = coordenadas;
    }

    abstract void agregar(Lugar lugar);
    abstract void eliminar(Lugar lugar);
    abstract void modificar();
    abstract int cantidad_poblacion();

}
