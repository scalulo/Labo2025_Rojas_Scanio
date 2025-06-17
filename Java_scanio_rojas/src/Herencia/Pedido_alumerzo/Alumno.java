package Herencia.Pedido_alumerzo;

import Unidad1.Persona;

public class Alumno extends Persona {
    private String division;

    public Alumno() {
        super();
        this.division="5A";
    }

    public Alumno(String nombre, int edad, String direccion, String apellido, String division) {
        super(nombre, edad, direccion, apellido);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}