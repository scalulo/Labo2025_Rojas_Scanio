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
        Libro libro1 = new Libro("hola", autor, 1949, 0, false);
        Revista revistaVieja = new Revista("Ciencia Hoy", autor, 2010, 3, "DistribuidoraLarga123");
        Revista revistaNueva = new Revista("Comics", autor, 2021, 2, "Short");

        publicaciones.add(libro);
        publicaciones.add(libro1);
        publicaciones.add(revistaVieja);
        publicaciones.add(revistaNueva);

        prestables.add(libro);
        prestables.add(libro1);
        prestables.add(revistaVieja);
        prestables.add(revistaNueva);

        // Crear sistema
        Sistema sistema = new Sistema(publicaciones, prestables, prestamos);

        // Crear usuario
        Usuario u = new Usuario(
                "Juan", 20, "Calle Falsa 123", "Perez",
                1, LocalDate.of(2005, 1, 1), 1111110,
                "juan@mail.com", new HashSet<>(), new HashMap<>(), new HashSet<>()
        );

        // === Pruebas de búsqueda ===

        System.out.println(sistema.busqueda("1984"));

        try {
            System.out.println(sistema.es_prestable(libro1));

        } catch  (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sistema.busqueda("asd"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // === Excepciones de disponibilidad ===


        // === Prestamos ===
        Prestamo p1 = libro.prestar(u);        // Libro → +15 días
        Prestamo p2 = revistaVieja.prestar(u); // Revista vieja → +10 días
        Prestamo p3 = revistaNueva.prestar(u); // Revista nueva → +3 días
        System.out.println("prestamo agregado");

        // === Devolución fuera de fecha ===
        p1.setFecha_devolucion_estimada(LocalDate.now().minusDays(1)); // forzar vencido
        u.devolver_prestamo(p1); // esto ya imprime "prestamo devuelto fuera de fecha"
        System.out.println(u.getCredito_ganado());
        // === Multas ===
        System.out.println(u.solicitar_extension_de_prestamo(p2));
        // === Extensión de préstamo ===
        System.out.println(p1.getFecha_devolucion_estimada());
    }
}
