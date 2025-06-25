package Modificadores.Aplicacion_Mascotas;

import Unidad1.Persona;

import java.util.ArrayList;

public class Dueño extends Persona {
ArrayList<Mascota> mascotas;

public Dueño(){
        super();
        this.mascotas=new ArrayList<>();
    }
public Dueño(String nombre, int edad, String direccion, String apellido, ArrayList<Mascota> mascotas){
    super(nombre,edad,direccion,apellido);
    this.mascotas=mascotas;

}






}
