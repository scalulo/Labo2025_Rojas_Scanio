package Repaso_Unidad7_8.EJ2;

import Repaso_Unidad7_8.EJ2.Exepciones.No_encontrado;
import Repaso_Unidad7_8.EJ2.Exepciones.No_prestable;
import Repaso_Unidad7_8.EJ2.Exepciones.No_stock;
import Repaso_Unidad7_8.EJ2.Interfaces.Prestar;

import java.util.HashSet;

public class Sistema {
    private HashSet<Publicacion> publicaciones;
    private HashSet<Prestar> prestables;
    private HashSet<Prestamo> prestamos_realizados;

    public Sistema(HashSet<Publicacion> publicaciones, HashSet<Prestar> prestables, HashSet<Prestamo> prestamos_realizados) {
        this.publicaciones = publicaciones;
        this.prestables = prestables;
        this.prestamos_realizados = prestamos_realizados;
    }

    public HashSet<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(HashSet<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public HashSet<Prestar> getPrestables() {
        return prestables;
    }

    public void setPrestables(HashSet<Prestar> prestables) {
        this.prestables = prestables;
    }

    public HashSet<Prestamo> getPrestamos_realizados() {
        return prestamos_realizados;
    }

    public void setPrestamos_realizados(HashSet<Prestamo> prestamos_realizados) {
        this.prestamos_realizados = prestamos_realizados;
    }

    public String busqueda (String nombre) {
        for(Publicacion pub:publicaciones){

            if(nombre.equals(pub.getTitulo())){
                    if (es_prestable(pub)) {
                        return "titulo " + pub.getTitulo() + " autor: " + pub.getAutor() + " se publico el ano: " + pub.getAnio_pub() + ", ademas si quiere tomelo prestado";
                    }
                    else{
                        return "titulo " + pub.getTitulo() + " autor: " + pub.getAutor() + " se publico el ano: " + pub.getAnio_pub() + ", pero no se puede dar a prestamo";
                    }
            }
        }
        throw new  No_encontrado("No tenemos el libro");
    }

    public Boolean es_prestable(Publicacion pub){

         if (pub.getStock()==0){
        throw new No_stock("sin stock");

        }
        else if(pub instanceof Prestar){
            System.out.println("esta disponible para ser prestado");
            return true ;
        }

        else{
            throw new No_prestable("no se puede dar a prestamo");
        }
    }

    public void agregarPrestamo (Prestar pub, Usuario user){
        prestamos_realizados.add( pub.prestar(user) );
    }

}
