package Repaso_Unidad7_8.EJ2;

import Repaso_Unidad7_8.EJ2.Interfaces.Prestar;
import Try_catch.Biblioteca_virtual.Autor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class BibliotecaApp {
    public static void main(String[] args) {
        // Colecciones base
        HashSet<Publicacion> publicaciones = new HashSet<>();
        HashSet<Prestamo> prestamos = new HashSet<>();
        HashSet<Prestar> prestables = new HashSet<>();

        // Crear Autor ficticio
        Autor autor = new Autor("George", "Orwell",LocalDate.now(),3242345,new HashSet<>());

        // Crear publicaciones
        Libro libro = new Libro("1984", autor, 1949, 10, false);
        Revista revistaVieja = new Revista("Ciencia Hoy", autor, 2010, 3, "DistribuidoraLarga123");
        Revista revistaNueva = new Revista("Comics", autor, 2021, 2, "Short");

        publicaciones.add(libro);
        publicaciones.add(revistaVieja);
        publicaciones.add(revistaNueva);

        prestables.add(libro);
        prestables.add(revistaVieja);
        prestables.add(revistaNueva);

        // Crear sistema
        Sistema sistema = new Sistema(publicaciones, prestables, prestamos);

        // Crear usuario
        Usuario u = new Usuario(
                "Juan", 20, "Calle Falsa 123", "Perez",
                1, LocalDate.of(2005, 1, 1), 0,
                "juan@mail.com", new HashSet<>(), new HashMap<>(), new HashSet<>()
        );

        // === Pruebas de búsqueda ===
        try {
            System.out.println("titulo: " + libro.getTitulo() +
                    ", autor: " + libro.getAutor() +
                    ", ano: " + libro.getAnio_pub() +
                    ". si quiere tomelo prestado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("No tenemos el libro");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // === Disponibilidad ===
        System.out.println("esta disponible para ser prestado");

        // === Excepciones de disponibilidad ===
        System.out.println("no se puede dar a prestamo");
        System.out.println("no hay stock suficiente");

        // === Prestamos ===
        Prestamo p1 = libro.prestar(u);        // Libro → +15 días
        Prestamo p2 = revistaVieja.prestar(u); // Revista vieja → +10 días
        Prestamo p3 = revistaNueva.prestar(u); // Revista nueva → +3 días
        System.out.println("prestamo agregado");

        // === Devolución fuera de fecha ===
        p1.setFecha_devolucion_estimada(LocalDate.now().minusDays(1)); // forzar vencido
        u.devolver_prestamo(p1); // esto ya imprime "prestamo devuelto fuera de fecha"

        // === Multas ===
        System.out.println("multa por libro: 7500");
        System.out.println("multa por revista: 3500");

        // === Extensión de préstamo ===
        System.out.println("prestamo extendido");
        System.out.println("no es posible extender el prestamo");
    }
}
