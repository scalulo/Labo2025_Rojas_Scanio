package Herencia.Alarmas;

public class Sensor_presion extends Dispositivo {
    public Sensor_presion() {
        super();
    }

    public Sensor_presion(String estado, double medida, double inicial, int anio) {
        super(estado, medida, inicial, anio);
    }
    @Override
    public void comparar(){
        if(getEstado().equals("Conectado") && getMedida()>getInicial()){
            System.out.println("Sensor de presión activado");
        }
    }
}
