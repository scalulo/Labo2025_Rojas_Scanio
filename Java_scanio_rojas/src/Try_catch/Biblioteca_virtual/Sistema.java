package Try_catch.Biblioteca_virtual;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private static HashMap<Membresia, Integer> nivel_prestamo = Sistema.nivel_prestamo_Creacion();//relacion nivel/cant presatmo

    public static HashMap<Membresia, Integer> nivel_prestamo_Creacion(){
        HashMap<Membresia, Integer>nivel_prestamo=new HashMap<Membresia, Integer>();
        nivel_prestamo.put(Membresia.BRONCE, 5);
        nivel_prestamo.put(Membresia.PLATA, 15);
        nivel_prestamo.put(Membresia.ORO, 50);
        return nivel_prestamo;
    }

    private HashMap<Integer, Usuario> usuarios; //clave dni
    private HashSet<Libro_electronico> libros;

    public Sistema(HashMap<Integer, Usuario> usuarios, HashSet<Libro_electronico> libros) {
        this.usuarios = usuarios;
        this.libros = libros;
    }

    public static HashMap<Membresia, Integer> getNivel_prestamo() {
        return nivel_prestamo;
    }

    public static void setNivel_prestamo(HashMap<Membresia, Integer> nivel_prestamo) {
        Sistema.nivel_prestamo = nivel_prestamo;
    }

    public HashMap<Integer, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<Integer, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public HashSet<Libro_electronico> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro_electronico> libros) {
        this.libros = libros;
    }

    public boolean verificar_nivel_usuario (Usuario usuario){

        return  !(usuario.getPrestamos().size()>=nivel_prestamo.get(usuario.getNivel()));

       /* for (Membresia nivel : nivel_prestamo.keySet()){
            if (nivel.equals(usuario.getNivel())){
                if (usuario.getPrestamos().size()>=nivel_prestamo.get(nivel)){
                  return false;
                }
            }
        }
        return true;*/
    }

    public boolean verificar_libro(Libro_electronico libro){
        if (libro.getDescargas_disp_actuales()==0){
            return false;
        }
        return true;
    }

    public void tomarPrestado(Usuario prestamista, Libro_electronico libro){

        try {

            if (!verificar_nivel_usuario(prestamista)  ){
                    throw new nivel_usuario_exep ("has alcanzado el limite de prestamos");
            }

             if (!verificar_libro(libro)) {
                throw  new descargas_libros_excep("el libro que haz elegido a alcanzado el limite de descargas");
            }

                prestamista.getPrestamos().add(libro);
                libro.setDescargas_disp_actuales(libro.getDescargas_disp_actuales()-1);
                System.out.println("prestamo realizado con exito");

        }catch (nivel_usuario_exep e) {
            System.err.println("Error de membresía: " + e.getMessage());
        } catch (descargas_libros_excep e) {
            System.err.println("Error de descargas: " + e.getMessage());
        }
    }

    public void devolver (Usuario usuario, Libro_electronico libro){
        try {
            if (!usuario.getPrestamos().contains(libro)){
                throw new Libro_no_encontrado_excep("Este libro no esta en tu lista de prestamo");
            }
            else {
                usuario.getPrestamos().remove(libro);
            }
        } catch (Libro_no_encontrado_excep e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
            // Crear usuarios
            HashSet<Libro_electronico> prestamosU1 = new HashSet<>();
            Usuario u1 = new Usuario("Juan", "Pérez", LocalDate.of(1995, 5, 12), 12345678, Membresia.BRONCE, prestamosU1);

            HashMap<Integer, Usuario> usuarios = new HashMap<>();

            // Crear autor y libros
            Autor autor = new Autor("Gabriel", "García Márquez", LocalDate.of(1927, 3, 6), 1111, new HashSet<>());
            Libro_electronico libro1 = new Libro_electronico("Cien años de soledad", autor, Genero.FICCION, "cien_anos.pdf", 3);
            Libro_electronico libro2 = new Libro_electronico("El coronel no tiene quien le escriba", autor, Genero.FICCION, "coronel.pdf", 1);
            Libro_electronico libro3 = new Libro_electronico("El coronel no tiene quien le escriba", autor, Genero.FICCION, "coronel.pdf", 1);
            Libro_electronico libro4 = new Libro_electronico("El coronel no tiene quien le escriba", autor, Genero.FICCION, "coronel.pdf", 1);
            Libro_electronico libro5 = new Libro_electronico("El coronel no tiene quien le escriba", autor, Genero.FICCION, "coronel.pdf", 1);
            Libro_electronico libro6 = new Libro_electronico("El coronel no tiene quien le escriba", autor, Genero.FICCION, "coronel.pdf", 1);

            HashSet<Libro_electronico> catalogo = new HashSet<>();
            catalogo.add(libro1);
            catalogo.add(libro2);



        // Instanciar sistema
            Sistema sistema = new Sistema(usuarios, catalogo);

            // Pruebas
            System.out.println("=== PRUEBAS DE PRESTAMO Y DEVOLUCION ===");

            sistema.tomarPrestado(u1, libro1); // debería funcionar
            sistema.tomarPrestado(u1, libro2); // debería fallar por membresía o descargas
            sistema.tomarPrestado(u1, libro3); // prueba con otro libro
            sistema.tomarPrestado(u1, libro4); // prueba con otro libro
            sistema.tomarPrestado(u1, libro5); // prueba con otro libro
            sistema.tomarPrestado(u1, libro6); // prueba con otro libro

            sistema.devolver(u1, libro1); // debería devolver OK
            sistema.devolver(u1, libro1); // debería fallar porque ya no lo tiene
        }
    }



