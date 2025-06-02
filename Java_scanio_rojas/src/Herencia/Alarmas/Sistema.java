package Herencia.Alarmas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Dispositivo> dispositivos;
    private ArrayList<Dispositivo> sensores;

    public Sistema() {
        this.dispositivos=new ArrayList<>();
    }
    public void alarma(){
        for(Dispositivo d:dispositivos){
                 d.comparar();



        }
    }


    public void compuesto(){
        int suma=0;

        for(Dispositivo d:sensores){
            suma+=d.getMedida();
        }
        if(suma>5){
            System.out.println("Alarma compuesta activada");
        }
    }

    public void agregardispositivo(Dispositivo dispo){
        dispositivos.add(dispo);
    }
    public void agregarSensores(Dispositivo senso){

        dispositivos.add(senso);
    }

    public static void main(String[] args) {
        Sistema sistema1=new Sistema();


        Detector detector1 =new Detector();
        Sensor_presion sensorPresion1=new Sensor_presion();
        Sensor_temperatura sensorTemperatura1=new Sensor_temperatura();

        sistema1.agregardispositivo(detector1);
        sistema1.agregardispositivo(sensorPresion1);
        sistema1.agregardispositivo(sensorTemperatura1);

        sistema1.agregarSensores(sensorTemperatura1);

        sistema1.compuesto();
        sistema1.alarma();



    }
}




