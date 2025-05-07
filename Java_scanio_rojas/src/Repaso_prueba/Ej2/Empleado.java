package Repaso_prueba.Ej2;

import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    LocalDate fecha_nacimiento;
    LocalDate fecha_ingreso;

public Empleado(){
    this.nombre="lucas";
    this.apellido="marto";
    this.dni=23453232;
    this.fecha_nacimiento=LocalDate.of(2002,4,2);
    this.fecha_ingreso=LocalDate.of(2022,8,2);
}

    public Empleado(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, LocalDate fecha_ingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
    }

    public Empleado(String nombre, String apellido, int dni, LocalDate fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = LocalDate.now();
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

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int antiguedad (){
            return  LocalDate.now().getYear()-fecha_ingreso.getYear();
        }

}
