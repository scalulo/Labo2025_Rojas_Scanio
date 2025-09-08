package Interfaces.Elecciones;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador implements Enviador {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fecha_nacimiento;
    private int cuil;
    private int sueldo;
    private String direccion;
    private LocalTime inicio;
    private LocalTime fin;

    public Trabajador(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, int cuil, int sueldo, String direccion, LocalTime inicio, LocalTime fin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.inicio = inicio;
        this.fin = fin;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFin() {
        return fin;
    }

    public void setFin(LocalTime fin) {
        this.fin = fin;
    }

    @Override
    public void enviar_mensaje(String mensaje) {
        if(LocalTime.now().isBefore(fin) && LocalTime.now().isBefore(inicio)){
            System.out.println("Yo, "+nombre+" te invito a que "+mensaje);
        }
        else{
            System.out.println("Trabajador fuera de horario");
        }
    }
}
