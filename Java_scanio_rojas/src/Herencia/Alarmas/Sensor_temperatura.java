package Herencia.Alarmas;

public class Sensor_temperatura extends Dispositivo{
    public Sensor_temperatura() {
        super();
    }

    public Sensor_temperatura(String estado, double medida, double inicial, int anio) {
        super(estado, medida, inicial, anio);
    }
    @Override
    public void comparar(){
        if(getEstado().equals("Conectado") && getMedida()>getInicial()){
            System.out.println("¡Cuidado! La temperatura sube");
        }
    }
}

