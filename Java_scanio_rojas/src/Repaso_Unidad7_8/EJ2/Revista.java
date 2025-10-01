package Repaso_Unidad7_8.EJ2;

import Repaso_Unidad7_8.EJ2.Interfaces.Prestar;
import Try_catch.Biblioteca_virtual.Autor;

import java.time.LocalDate;
import java.time.Year;

public class Revista extends Publicacion implements Prestar {
    private String nombre_distribuidora;
    private static int multa=3500;

    public Revista(String titulo, Autor autor, int anio_pub, int stock, String nombre_distribuidora) {
        super(titulo, autor, anio_pub, stock);
        this.nombre_distribuidora = nombre_distribuidora;
    }

    public String getNombre_distribuidora() {
        return nombre_distribuidora;
    }

    public void setNombre_distribuidora(String nombre_distribuidora) {
        this.nombre_distribuidora = nombre_distribuidora;
    }



    public static void setMulta(int multa) {
        Revista.multa = multa;
    }

    @Override
    public int get_multa() {
        return multa;
    }

    @Override
    public Prestamo prestar(Usuario user) {
        Prestamo p;
        Revista pub=this;
        if(pub.getAnio_pub()<2020){
             p=new Prestamo(pub,user.getNumero_socio(),LocalDate.now(),LocalDate.now().plusDays(10),true);
        }
        else{
             p=new Prestamo(pub,user.getNumero_socio(),LocalDate.now(),LocalDate.now().plusDays(3),true);
        }

        if (user.getPub_prestamo().containsKey(pub)) {
            int actual = user.getPub_prestamo().get(pub);
            user.getPub_prestamo().put(pub, actual + 1);
        } else {
            user.getPub_prestamo().put(pub, 1);
        }
        user.getPrestamos_realizados().add(p);


        System.out.println("usted se llevo el libro: " + pub.getTitulo() + " y la fecha de devolucion es: " + p.getFecha_devolucion_estimada());
        return p;
    }
}
