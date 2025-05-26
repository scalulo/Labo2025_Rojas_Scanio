package Herencia.Flota_vehiculos.Vehiculos;

import java.time.LocalDate;

public class Camioneta extends Auto_camioneta{
    private int capacidad_carga_en_kg;
    private int carga_en_kg;

public Camioneta(){
    this.capacidad_carga_en_kg=500;
    this.carga_en_kg=200;
}

    public Camioneta(String marca, String modelo, String color, int velocidad, int cant_ruedas, LocalDate fecha_fabricacion,int capacidad_carga_en_kg, int carga_en_kg) {
    super();
    this.capacidad_carga_en_kg = capacidad_carga_en_kg;
    this.carga_en_kg=carga_en_kg;

    }

    public int getCarga_en_kg() {
        return carga_en_kg;
    }

    public void setCarga_en_kg(int carga_en_kg) {
        this.carga_en_kg = carga_en_kg;
    }

    public int getCapacidad_carga_en_kg() {
        return capacidad_carga_en_kg;
    }

    public void setCapacidad_carga_en_kg(int capacidad_carga_en_kg) {
        this.capacidad_carga_en_kg = capacidad_carga_en_kg;
    }

    public void sumar_peso(int peso){
        if(getCarga_en_kg()+peso>getCapacidad_carga_en_kg()){
            System.out.println("la capacidad de carga a sido excedida");
        }
        else{
            carga_en_kg+=peso;
            System.out.println("todo joya");
        }
        return;
    }
        public static void main(String[] args) {
        Camioneta c1=new Camioneta("Volkswagen","Amarok","blanca",250,4, LocalDate.now(),500,200);
        c1.sumar_peso(200);
}
}
