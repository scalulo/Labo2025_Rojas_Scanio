package Herencia.Alarmas;

public class Detector extends Dispositivo {


    public Detector(){
        super();
    }
    public Detector(String estado, double medida, double inicial,int anio ){
        super(estado,medida, inicial,anio);
    }

    public void comparar(){
        if(getEstado().equals("Conectado") && getMedida()>getInicial()){
            System.out.println("LLAMAR BOMBEROS");
        }
    }
}
