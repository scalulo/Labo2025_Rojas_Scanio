package Repaso_evaluacion_unidad6.Recu;

import java.time.LocalDate;

public abstract class Libro {
    private String isbn;
    private String titulo;
    private LocalDate fecha_adq;


    public Libro(String isbn, String titulo, LocalDate fecha_adq) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fecha_adq = fecha_adq;
    }

    public LocalDate getFecha_adq() {
        return fecha_adq;
    }

    public void setFecha_adq(LocalDate fecha_adq) {
        this.fecha_adq = fecha_adq;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String info(){
        return "El isbn es:" + isbn +"y el titulo: "+titulo;
    }

}
