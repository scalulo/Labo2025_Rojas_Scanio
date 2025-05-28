package Herencia.Alarmas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Dispositivo> dispositivos;

    public Sistema() {
        this.dispositivos=new ArrayList<>();
    }
    public void alarma(){
        for(Dispositivo d:dispositivos){
            if(d.getClass()== Detector.class ){
                 .comparar();

            }
           else if(d.getClass()== Sensor_presion.class ){
                d.comparar();

            }
           else(){
               d.comparar;
            }
        }
    }

    public static void main(String[] args) {
        Sistema sistema1=new Sistema();

    }
}




