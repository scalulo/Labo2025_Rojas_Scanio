package Repaso_evaluacion_unidad6.Recu;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Biblioteca {
    private HashMap<Integer,Libro> libros; //relacion isbn, libro


    public HashMap<Integer, Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashMap<Integer, Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca(HashMap<Integer, Libro> libros) {
        this.libros = libros;
    }

    public String mas_receinte(){
        LocalDate f_reciente=LocalDate.MIN   ;
        String isbn="";
        for (Libro l:libros.values()){
            if(l.getFecha_adq().isAfter(f_reciente)){
                f_reciente=l.getFecha_adq();
                isbn=l.getIsbn();
            }
        }
        return isbn;
    }

    public void idiomas() {
        HashMap<Idioma, Integer> contador =new HashMap<>();
        for(Libro l: libros.values()){
            if(l instanceof Fisico){
                contador.put(((Fisico) l).getIdioma(), contador.getOrDefault(((Fisico) l).getIdioma(),0)+1);
            } else if (l instanceof Digital) {
                for (Idioma i:((Digital) l).getIdiomas()){
                    contador.put(i,contador.getOrDefault(i,0)+1);
                }
            }
        }
        for(Map.Entry<Idioma,Integer>entry:contador.entrySet()) {
            System.out.println("idioma: " + entry.getKey().name() + " vecees usado: " + entry.getValue());
        }
    }

    public static void main(String[] args) {



                // Libro 1: PDF en español e inglés
                HashSet<Idioma> idiomas1 = new HashSet<>();
                idiomas1.add(Idioma.ESPANOL);
                idiomas1.add(Idioma.INGLES);
                Digital libro1 = new Digital("1111", "Java Básico", LocalDate.of(2020, 5, 15), Formato.PDF, idiomas1);

                // Libro 2: EPUB en francés
                HashSet<Idioma> idiomas2 = new HashSet<>();
                idiomas2.add(Idioma.FRANCES);
                Digital libro2 = new Digital("2222", "Aprender Python", LocalDate.of(2021, 3, 10), Formato.EPUB, idiomas2);

                // Libro 3: MOBI en inglés y alemán
                HashSet<Idioma> idiomas3 = new HashSet<>();
                idiomas3.add(Idioma.ESPANOL);
                idiomas3.add(Idioma.ESPANOL);
                Digital libro3 = new Digital("3333", "Programación Avanzada", LocalDate.of(2019, 8, 20), Formato.MOBI, idiomas3);

                // Libro 4: PDF en español
                HashSet<Idioma> idiomas4 = new HashSet<>();
                idiomas4.add(Idioma.ESPANOL);
                Digital libro4 = new Digital("4444", "Bases de Datos", LocalDate.of(2022, 11, 5), Formato.PDF, idiomas4);

        HashMap<Integer, Libro> mapaLibros = new HashMap<>();
        mapaLibros.put(Integer.parseInt(libro1.getIsbn()), libro1);
        mapaLibros.put(Integer.parseInt(libro2.getIsbn()), libro2);
        mapaLibros.put(Integer.parseInt(libro3.getIsbn()), libro3);
        mapaLibros.put(Integer.parseInt(libro4.getIsbn()), libro4);

        // Creamos la biblioteca con esos libros
        Biblioteca biblioteca = new Biblioteca(mapaLibros);

        biblioteca.idiomas();

    }
}
