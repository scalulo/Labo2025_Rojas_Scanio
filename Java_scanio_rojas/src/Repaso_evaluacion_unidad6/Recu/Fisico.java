package Repaso_evaluacion_unidad6.Recu;

import java.time.LocalDate;
import java.util.HashSet;

public class Fisico extends Libro{
    private int pags;
    private Idioma idioma;


    public Fisico(String isbn, String titulo, LocalDate fecha_adq, int pags, Idioma idioma) {
        super(isbn, titulo, fecha_adq);
        this.pags = pags;
        this.idioma = idioma;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public int getPags() {
        return pags;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }

}
