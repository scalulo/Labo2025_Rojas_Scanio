package Herencia.Llamadas;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String apellido;
    private int DNI;
    private int telefono;
    private String pais;
    private ArrayList<Llamada> llamadas_emp;

public Empleado(){
    this.nombre = "pepo";
    this.apellido ="de santis";
    this.DNI = 234445553;
    this.telefono = 18373488;
    this.pais = "Argentina";
    this.llamadas_emp=new ArrayList<>();
}

    public Empleado(String nombre, String apellido, int DNI, int telefono, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.pais = pais;
        this.llamadas_emp=new ArrayList<>();
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Llamada> getLlamadas_emp() {
        return llamadas_emp;
    }

    public void setLlamadas_emp(ArrayList<Llamada> llamadas_emp) {
        this.llamadas_emp = llamadas_emp;
    }
}
