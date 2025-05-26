package Herencia.Pedido_alumerzo;

import Unidad1.Persona;

public class Profesor extends Persona {
    private int descuento;

    public Profesor(){
    super();
    this.descuento=20;
    }
    public Profesor(String nombre, String apellido, int descuento){
        super(nombre, apellido);
        this.descuento=descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
