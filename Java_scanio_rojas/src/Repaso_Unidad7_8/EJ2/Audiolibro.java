package Repaso_Unidad7_8.EJ2;

import Try_catch.Biblioteca_virtual.Autor;

import java.time.LocalDate;

public class Audiolibro extends Publicacion{
    private int duracion;
    private int peso;

    public Audiolibro(String titulo, Autor autor, int anio_pub, int stock, int duracion, int peso) {
        super(titulo, autor, anio_pub, stock);
        this.duracion = duracion;
        this.peso = peso;
    }

    public int getDuracion() {
        return duracion;
    }



    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
