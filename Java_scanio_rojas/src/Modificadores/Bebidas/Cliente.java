package Modificadores.Bebidas;

import Unidad1.Persona;

import java.util.ArrayList;

public class Cliente extends Persona {
    private int dni;
    private ArrayList<Bebida> bebidas;

    public Cliente(String nombre, int edad, String direccion, String apellido, int dni, int hidratacion) {
        super(nombre, edad, direccion, apellido);
        this.dni = dni;
        this.bebidas=new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public void tomar_bebida(Bebida bebida){
        System.out.println("glugluglu..... ahhhh");
        bebidas.add(bebida);
    }

    public int hidratacion(){
        int hidratacion=0;
        for(Bebida b:bebidas){
            hidratacion+=b.calcular_hidratacion();
        }
        return hidratacion;
    }
}
