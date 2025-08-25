package Try_catch.Biblioteca_virtual;

public class Libro_electronico {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String nom_pdf;
    private static int descargas_disp=145;
    private int descargas_disp_actuales=descargas_disp;


    public Libro_electronico(String titulo, Autor autor, Genero genero, String nom_pdf, int descargas_disp_actuales) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nom_pdf = nom_pdf;
        this.descargas_disp_actuales = descargas_disp_actuales;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNom_pdf() {
        return nom_pdf;
    }

    public void setNom_pdf(String nom_pdf) {
        this.nom_pdf = nom_pdf;
    }

    public static int getDescargas_disp() {
        return descargas_disp;
    }

    public static void setDescargas_disp(int descargas_disp) {
        Libro_electronico.descargas_disp = descargas_disp;
    }

    public int getDescargas_disp_actuales() {
        return descargas_disp_actuales;
    }

    public void setDescargas_disp_actuales(int descargas_disp_actuales) {
        this.descargas_disp_actuales = descargas_disp_actuales;
    }
}
