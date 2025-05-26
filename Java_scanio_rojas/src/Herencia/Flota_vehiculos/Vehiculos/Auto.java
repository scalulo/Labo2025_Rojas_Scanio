package Herencia.Flota_vehiculos.Vehiculos;

import java.time.LocalDate;

public class Auto extends Auto_camioneta{
    private boolean descapotable;

public Auto(){
    this.descapotable=true;
}
public Auto(String marca, String modelo, String color, int velocidad, int cant_ruedas, LocalDate fecha_fabricacion, boolean descapotable){
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
