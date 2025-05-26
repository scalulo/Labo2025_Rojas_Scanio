package Herencia.Computadoras;


import Unidad1.Persona;

public class Cliente extends Persona {
    private  int numero;

public Cliente(){
    super();
    this.numero=11243423;
}


    public Cliente(String nombre, String apellido, int numero) {
        super(nombre, apellido);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
