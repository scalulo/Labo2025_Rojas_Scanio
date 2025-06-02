package Herencia.Alarmas;

import Unidad1.Fecha;

import java.time.LocalDate;

public class Dispositivo {
    private String estado;
    private double medida;
    private double inicial;
    private int anio;


    public Dispositivo(){
        this.estado="Conectado";
        this.medida=6.4;
        this.inicial=5.1;
        this.anio=2022;
    }
    public Dispositivo(String estado, double medidad, double inicial, int anio){
    this.estado=estado;
    this.medida=medidad;
    this.inicial=inicial;
    this.anio=anio;

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public double getInicial() {
        return inicial;
    }

    public void setInicial(double inicial) {
        this.inicial = inicial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void comparar(){

    }
}




