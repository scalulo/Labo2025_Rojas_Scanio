package Herencia.Pedido_alumerzo;

import Unidad1.Persona;

public class Profesor extends Persona {
    private static int descuento=20;

    public Profesor(){
    super();
    this.descuento=20;
    }

    public Profesor(String nombre, int edad, String direccion, String apellido) {
        super(nombre, edad, direccion, apellido);

    }


    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
