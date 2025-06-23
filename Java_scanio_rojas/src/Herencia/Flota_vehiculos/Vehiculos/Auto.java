package Herencia.Flota_vehiculos.Vehiculos;

import Unidad1.Enums.Cant_ruedas;
import Unidad1.Enums.Color;

import java.time.LocalDate;

public class Auto extends Auto_camioneta{
    private boolean descapotable;
    static Cant_ruedas cant_ruedas=Cant_ruedas.CUATRO;

    public Auto(String marca, String modelo, Color color, int velocidad, Cant_ruedas cant_ruedas, LocalDate fecha_fabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, velocidad, cant_ruedas, fecha_fabricacion, patente);
        this.descapotable = descapotable;
    }


    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
