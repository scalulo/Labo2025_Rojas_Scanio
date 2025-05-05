package Repaso_prueba;

import Unidad1.Persona;
import java.util.ArrayList;

public class Estanteria {
    private ArrayList<Pelicula> peliculas;
    private int codigo;

    public Estanteria(){
    this.peliculas=new ArrayList<Pelicula>();
    this.codigo=2;
}

public Estanteria(int codigo){
    this.peliculas=new ArrayList<Pelicula>();
    this.codigo=codigo;
}

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public ArrayList<Persona> directores_mas_d_una_peli() {
        ArrayList<Persona> resultado = new ArrayList<>();

        for (int i = 0; i < peliculas.size(); i++) {
            ArrayList<Persona> directoresPeli = peliculas.get(i).getDirectores();
            for (int j = 0; j < directoresPeli.size(); j++) {
                Persona directorActual = directoresPeli.get(j);
                int contador = 0;

                for (int k = 0; k < peliculas.size(); k++) {
                    if (peliculas.get(k).getDirectores().contains(directorActual)) {
                        contador++;
                    }
                }

                if (contador > 1 && !resultado.contains(directorActual)) {
                    resultado.add(directorActual);
                }
            }
        }
        return resultado;
    }
    public void mostrarNombre(ArrayList<Persona> mayores){
        for(int i=0;i<mayores.size();i++){
            System.out.println("Nombre del actor mayor de edad: " +mayores.get(i).getNombre());
        }
    }


}
