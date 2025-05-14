package Herencia.Flota_vehiculos;

public class Auto extends Auto_camioneta{
    private boolean descapotable;

public Auto(){
    this.descapotable=true;
}
public Auto(boolean descapotable){
    this.descapotable=descapotable;
}

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
