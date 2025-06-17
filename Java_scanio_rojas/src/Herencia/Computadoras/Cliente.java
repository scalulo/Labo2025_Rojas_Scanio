package Herencia.Computadoras;


import Unidad1.Persona;

public class Cliente extends Persona {
    private  int numero;


    public Cliente(String nombre, int edad, String direccion, String apellido, int numero) {
        super(nombre, edad, direccion, apellido);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
