package Modificadores.Aplicacion_Mascotas;

import Herencia.Computadoras.Cliente;
import Unidad1.Persona;

import java.util.ArrayList;

public abstract class Mascotas {
    private String nombre;
    private Dueño dueño;

    public Mascotas(){
        this.nombre="Chocolate";
        this.dueño=new Dueño();
    }
    public Mascotas(String nombre, Dueño dueño){
        this.nombre=nombre;
        this.dueño=dueño;
    }

    abstract void saludo();


}
