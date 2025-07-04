package Entrega_lulo;

import javax.sound.sampled.Port;
import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private LocalDate fecha_ingreso;
    private int salario;
    private ArrayList<Producto> regalos;

    public Empleado(){
        this.nombre="Luciano";
        this.apellido="Rojas";
        this.fecha_ingreso=LocalDate.now();
        this.nacimiento=LocalDate.now();
        this.salario=1000000;
        this.regalos=new ArrayList<>();
    }

    public Empleado(String nombre, String apellido, LocalDate nacimiento, LocalDate fecha_ingreso, int salario, ArrayList<Producto> regalos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.fecha_ingreso = fecha_ingreso;
        this.salario = salario;
        this.regalos = regalos;
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

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public ArrayList<Producto> getRegalos() {
        return regalos;
    }

    public void setRegalos(ArrayList<Producto> regalos) {
        this.regalos = regalos;
    }
}
