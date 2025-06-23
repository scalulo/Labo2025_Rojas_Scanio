package Unidad1;

import Herencia.Computadoras.Cliente;
import Unidad1.Enums.Editorial;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int paginas;
    private Editorial editorial;
    private Fecha fecha;

    public Libro() {
        this.titulo = "Don quijote";
        this.isbn = 124214;
        this.paginas = 321;
        this.editorial =  Editorial.SUDAMERICA  ;
        this.fecha = new Fecha();
    }
    public Libro(String titulo1){
        this.titulo=titulo1;
        this.isbn = 124214;
        this.paginas = 321;
        this.editorial = Editorial.ALIANZA;
        this.fecha = new Fecha();
    }
    public Libro (String titulo, Persona autor, int isbn, int paginas, Editorial editorial, Fecha fecha){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fecha=fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getautor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setautor(Persona autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void  mostrar (){
        System.out.println("el titulo es: "+getTitulo());
        System.out.println("el profe es: "+autor.getNombre());
        System.out.println("el isbn es: "+getIsbn());
        System.out.println("la fecha es: "+getFecha().getDia()+"-"+getFecha().getMes()+"-"+getFecha().getAnio());
        System.out.println("paginas: "+getPaginas());
    }
    public boolean fecha_igual(Libro libro){
        LocalDate f1 = LocalDate.of(getFecha().getAnio(), getFecha().getMes(), getFecha().getDia());
        LocalDate f2 = LocalDate.of(libro.getFecha().getAnio(), libro.getFecha().getMes(), libro.getFecha().getDia());
        return f1.isBefore(f2);
    }


    public static void main(String[] args) {
        String titulo="La biblia";
        Cliente autor=new Cliente("pepo",3,"cnid","wdawd",1244);
        int isbn = 2453;
        int paginas=213;
        Editorial editorial= Editorial.KAPELUSZ;
        Fecha fecha= new Fecha(4, 6, 2022);

        Libro l1= new Libro();
        Libro l2= new Libro(titulo,autor,isbn,paginas,editorial,fecha);
        Libro l3= new Libro("martin fierro");
        l1.mostrar();
        System.out.println("f1 es menor que f2 " + l1.fecha_igual(l2));

    }
}