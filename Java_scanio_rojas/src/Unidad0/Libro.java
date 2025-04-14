package Unidad0;

import Unidad1.Fecha;
import Unidad1.Persona;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona profesor;
    private int isbn;
    private int paginas;
    private String editorial;
    private Fecha fecha;

    public Libro() {
        this.titulo = "Don quijote";
        this.profesor = new Persona();
        this.isbn = 124214;
        this.paginas = 321;
        this.editorial = "pepo";
        this.fecha = new Fecha();
    }
    public Libro (String titulo,Persona profesor,int isbn,int paginas,String editorial,Fecha fecha){
        this.titulo=titulo;
        this.profesor=profesor;
        this.isbn=isbn;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fecha=fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getProfesor() {
        return profesor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getEditorial() {
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

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setProfesor(Persona profesor) {
        this.profesor = profesor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void  mostrar (){
        System.out.println("el titulo es: "+getTitulo());
        System.out.println("el profe es: "+profesor.getNombre());
        System.out.println("el isbn es: "+getIsbn());
        System.out.println("la fecha es: "+getFecha().getDia()+"-"+getFecha().getMes()+"-"+getFecha().getAnio());
        System.out.println("paginas: "+getPaginas());
    }
    public boolean fecha_igual(Libro libro){
        LocalDate f1 = LocalDate.of(getFecha().getDia(), getFecha().getMes(), getFecha().getAnio());
        LocalDate f2 = LocalDate.of(libro.getFecha().getDia(), libro.getFecha().getMes(), libro.getFecha().getAnio());
        return f1.isBefore(f2);
    }

    public static void main(String[] args) {
        String titulo="La biblia";
        Persona profesor=new Persona();
        int isbn = 2453;
        int paginas=213;
        String editorial="manu";
        Fecha fecha= new Fecha(4, 6, 2022);
        Libro l1= new Libro();
        Libro l2= new Libro(titulo,profesor,isbn,paginas,editorial,fecha);
        l1.mostrar();
        System.out.println("¿f1 es menor que f2? " + l1.fecha_igual(l2));

    }
}