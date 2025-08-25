package Try_catch.Biblioteca_virtual;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario {
    private String nombre;
    private String apellido;
    private LocalDate fecha_n;
    private int dni;
    private Membresia nivel;
    private HashSet<Libro_electronico> prestamos;

    public Usuario(String nombre, String apellido, LocalDate fecha_n, int dni, Membresia nivel, HashSet<Libro_electronico> prestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_n = fecha_n;
        this.dni = dni;
        this.nivel = nivel;
        this.prestamos = prestamos;
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

    public Membresia getNivel() {
        return nivel;
    }

    public void setNivel(Membresia nivel) {
        this.nivel = nivel;
    }

    public HashSet<Libro_electronico> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(HashSet<Libro_electronico> prestamos) {
        this.prestamos = prestamos;
    }
}
