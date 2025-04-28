package Curling;

import Unidad1.Fecha;

public class Jugador {
    private String nombre;
    Fecha fecha;
    private int numero;
    private boolean capitan;

    public Jugador(String nombre, Fecha fechaNacimiento, int numeroCamiseta, boolean esCapitan) {
        this.nombre = nombre;
        this.fecha = fechaNacimiento;
        this.numero = numeroCamiseta;
        this.capitan = esCapitan;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}
