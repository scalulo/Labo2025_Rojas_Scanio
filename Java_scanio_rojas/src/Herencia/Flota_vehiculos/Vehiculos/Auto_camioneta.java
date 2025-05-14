package Herencia.Flota_vehiculos;

import Unidad1.Vehiculo;

import java.time.LocalDate;

public class Auto_camioneta extends Vehiculo {
    private String patente;


    public Auto_camioneta(){
        this.patente="FDF 345";
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

