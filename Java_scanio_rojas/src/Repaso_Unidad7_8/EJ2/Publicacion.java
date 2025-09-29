package Repaso_Unidad7_8.EJ2;

import Try_catch.Biblioteca_virtual.Autor;

import java.time.LocalDate;

public abstract class Publicacion {
    private String titulo;
    private Autor autor;
    private int anio_pub;
    private int stock;

    public Publicacion(String titulo, Autor autor, int anio_pub, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio_pub = anio_pub;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio_pub() {
        return anio_pub;
    }

    public void setAnio_pub(int anio_pub) {
        this.anio_pub = anio_pub;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract int get_multa();
}
