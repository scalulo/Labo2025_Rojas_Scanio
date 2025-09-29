package Repaso_Unidad7_8.EJ1;

import java.time.LocalDate;

public abstract class Participante  {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String localidad;
    private Color color;

    public Participante(String nombre, String apellido, LocalDate fecha_nacimiento, String localidad, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        localidad = localidad;
        color = color;
    }
    public Participante(){
        this.nombre="lol";
        this.apellido="xd";
        this.fecha_nacimiento=LocalDate.now();
        this.localidad="omg";
        this.color=Color.ROJO;
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

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void preparar_lugar();

}

