package Modificadores.Aplicacion_Mascotas;

import Herencia.Computadoras.Cliente;
import Unidad1.Persona;

public abstract class Mascotas {
    private String nombre;
    private Dueño dueño;

    public Mascotas(){
        this.nombre="Chocolate";
        this.dueño=new Dueño();
    }


}
