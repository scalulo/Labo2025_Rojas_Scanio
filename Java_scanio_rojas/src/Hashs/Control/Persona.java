package Hashs.Control;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private Has

    public Persona(){
        this.nombre="Messi";
        this.apellido="ROnaldo";
        this.nacimiento=LocalDate.now();
    }

    public Persona(String nombre, String apellido, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
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

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}
