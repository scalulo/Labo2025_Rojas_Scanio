package Unidad1;

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion() {
        this.titulo=" ";
        this.autor=" ";
    }

    public Cancion(String autor, String titulo){
        this.autor=autor;
        this.titulo=titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static void main(String[] args) {
        Cancion cancion1= new Cancion();
        Cancion cancion2= new Cancion("duki","nueva era");

    }
}