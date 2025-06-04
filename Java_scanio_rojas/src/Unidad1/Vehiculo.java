package Unidad1;

import Unidad1.Enums.Cant_ruedas;
import Unidad1.Enums.Color;

import java.time.LocalDate;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private Cant_ruedas cant_ruedas;
    private LocalDate fecha_fabricacion;
    private int velocidad;

    public Vehiculo() {
        this.marca = "Peugeot";
        this.modelo = "GTI";
        this.color = Color.ROJO;
        this.velocidad=80;
    }

    public Vehiculo(String marca, String modelo, Color color, int velocidad, Cant_ruedas cant_ruedas, LocalDate fecha_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad=velocidad;
        this.cant_ruedas=cant_ruedas;
        this.fecha_fabricacion=fecha_fabricacion;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Color getColor() {
        return color;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int acelererar(){
        int acelerada;
        acelerada=velocidad+20;
        return acelerada;
    }
    public int frenar(){
        int frenada;
        frenada=velocidad-20;
        return frenada;
    }


    public LocalDate getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(LocalDate fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public Cant_ruedas getCant_ruedas() {
        return cant_ruedas;
    }

    public void setCant_ruedas(Cant_ruedas cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public static void main(String[] args) {
        String marca = "Toyota";
        String modelo = "Hilux";
        Color color = Color.AZUL;
        int velocidad=90;

        Vehiculo c1 = new Vehiculo();

        System.out.println("Marca de c1: " + c1.getMarca());
        System.out.println("Modelo de c1: " + c1.getModelo());
        System.out.println("Color de c1: " + c1.getColor());
        System.out.println("Velocidad actual de c1: " + c1.getVelocidad());
        System.out.println("Velocidad cuando acelera de c1: " + c1.acelererar());
        System.out.println("Velocidad cuando frena de c1: " + c1.frenar());



    }
}