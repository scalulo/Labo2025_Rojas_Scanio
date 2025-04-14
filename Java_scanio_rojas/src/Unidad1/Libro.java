package Unidad1;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int paginas;
    private String editorial;
    private Fecha fecha;

    public Libro() {
        this.titulo = "Don quijote";
        this.autor = new Persona();
        this.isbn = 124214;
        this.paginas = 321;
        this.editorial = "pepo";
        this.fecha = new Fecha();
    }
    public Libro(String titulo1){
        this.titulo=titulo1;
        this.autor = new Persona();
        this.isbn = 124214;
        this.paginas = 321;
        this.editorial = "pepo";
        this.fecha = new Fecha();
    }
    public Libro (String titulo,Persona autor,int isbn,int paginas,String editorial,Fecha fecha){
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
        Persona autor=new Persona();
        int isbn = 2453;
        int paginas=213;
        String editorial="manu";
        Fecha fecha= new Fecha(4, 6, 2022);

        Libro l1= new Libro();
        Libro l2= new Libro(titulo,autor,isbn,paginas,editorial,fecha);
        Libro l3= new Libro("martin fierro");
        l1.mostrar();
        System.out.println("f1 es menor que f2 " + l1.fecha_igual(l2));

    }
}