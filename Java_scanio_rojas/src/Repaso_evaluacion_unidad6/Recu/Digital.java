package Repaso_evaluacion_unidad6.Recu;

import java.time.LocalDate;
import java.util.HashSet;

public class Digital extends Libro{
    private Formato formato;
    private HashSet<Idioma>idiomas;

    public Digital(String isbn, String titulo, LocalDate fecha_adq, Formato formato, HashSet<Idioma> idiomas) {
        super(isbn, titulo, fecha_adq);
        this.formato = formato;
        this.idiomas = idiomas;
    }

    public HashSet<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(HashSet<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
}
