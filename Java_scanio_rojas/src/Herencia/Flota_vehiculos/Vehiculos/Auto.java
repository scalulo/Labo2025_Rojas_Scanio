package Herencia.Flota_vehiculos.Vehiculos;

import Unidad1.Enums.Cant_ruedas;

import java.time.LocalDate;

public class Auto extends Auto_camioneta{
    private boolean descapotable;

public Auto(){
    this.descapotable=true;
}
public Auto(String marca, String modelo, String color, int velocidad, Cant_ruedas cant_ruedas, LocalDate fecha_fabricacion, boolean descapotable){
    super();
    this.descapotable=descapotable;
}

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
