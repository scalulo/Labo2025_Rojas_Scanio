package Herencia.Flota_vehiculos;

public class Camioneta extends Auto_camioneta{
    private int capacidad_carga_en_kg;

public Camioneta(){
    this.capacidad_carga_en_kg=500;
}

    public Camioneta(int capacidad_carga_en_kg) {
        this.capacidad_carga_en_kg = capacidad_carga_en_kg;
    }

    public int getCapacidad_carga_en_kg() { 
        return capacidad_carga_en_kg;
    }

    public void setCapacidad_carga_en_kg(int capacidad_carga_en_kg) {
        this.capacidad_carga_en_kg = capacidad_carga_en_kg;
    }
}
