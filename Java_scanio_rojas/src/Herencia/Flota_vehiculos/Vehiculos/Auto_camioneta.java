package Herencia.Flota_vehiculos.Vehiculos;

import Unidad1.Enums.Cant_ruedas;
import Unidad1.Enums.Color;
import Unidad1.Vehiculo;

import java.time.LocalDate;

public class Auto_camioneta extends Vehiculo {
    private  String patente;


    public Auto_camioneta(String marca, String modelo, Color color, int velocidad, Cant_ruedas cant_ruedas, LocalDate fecha_fabricacion, String patente) {
        super(marca, modelo, color, velocidad, cant_ruedas, fecha_fabricacion);
        this.patente = patente;
    }

    public Auto_camioneta(String patente) {
        this.patente=patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}

