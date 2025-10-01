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
                System.out.println(pub.getTitulo()+" lo escribio: "+pub.getAutor()+" se publico el año: "+pub.getAnio_pub());

               return pub.getTitulo()+" lo escribio: "+pub.getAutor()+" se publico el año: "+pub.getAnio_pub() + ", ademas "+es_prestable(pub);

            }
        }
        throw new  No_encontrado("No tenemos el libro");
    }

    public String es_prestable(Publicacion pub){
        if(pub instanceof Prestar){
            return "Estpa disponible para ser prestado";
        }
        else if (pub.getStock()==0){
        throw new No_stock("No hay stock suficiente");
        }
        else{
            throw new No_prestable("No se puede dar a prestamo");
        }
    }

    public void agregarPrestamo (Prestar pub, Usuario user){
        prestamos_realizados.add( pub.prestar(user) );
    }

}
