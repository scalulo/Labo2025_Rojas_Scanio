package Try_catch.Biblioteca_virtual;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor {
    private String nombre;
    private String apellido;
    private LocalDate fecha_n;
    private int dni;
    private HashSet<Libro_electronico> bibliografia;

    public Autor(String nombre, String apellido, LocalDate fecha_n, int dni, HashSet<Libro_electronico> bibliografia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_n = fecha_n;
        this.dni = dni;
        this.bibliografia = bibliografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(LocalDate fecha_n) {
        this.fecha_n = fecha_n;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashSet<Libro_electronico> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro_electronico> bibliografia) {
        this.bibliografia = bibliografia;
    }
}
