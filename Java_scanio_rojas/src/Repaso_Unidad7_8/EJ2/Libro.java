package Repaso_Unidad7_8.EJ2;

import Repaso_Unidad7_8.EJ2.Interfaces.Prestar;
import Try_catch.Biblioteca_virtual.Autor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Libro extends Publicacion implements Prestar {
    private boolean tiene_saga;
    private static int multa=7500;

    public Libro(String titulo, Autor autor, int anio_pub, int stock, boolean tiene_saga) {
        super(titulo, autor, anio_pub, stock);
        this.tiene_saga = tiene_saga;
    }

    public boolean isTiene_saga() {
        return tiene_saga;
    }

    public void setTiene_saga(boolean tiene_saga) {
        this.tiene_saga = tiene_saga;
    }


    @Override
    public int get_multa() {
        return multa;
    }

    public static void setMulta(int multa) {
        Libro.multa = multa;
    }

    @Override
    public Prestamo prestar(Usuario user) {
        Libro pub= this;
        Prestamo p=new Prestamo(pub,user.getNumero_socio(),LocalDate.now(),LocalDate.now().plusDays(15),true);

        if (user.getPub_prestamo().containsKey(pub)) {
            int actual = user.getPub_prestamo().get(pub);
            user.getPub_prestamo().put(pub, actual + 1);
        } else {
            user.getPub_prestamo().put(pub, 1);
        }

        user.getPrestamos_realizados().add(p);
        System.out.println("usted se llevo el libro: " + pub.getTitulo() + " y la fecha de devolucion es: " +(ChronoUnit.DAYS.between(LocalDate.now(),p.getFecha_devolucion_estimada()))+" dias");
        return p;
    }
}
