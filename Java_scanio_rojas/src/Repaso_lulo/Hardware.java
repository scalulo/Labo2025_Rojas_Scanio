package Repaso_lulo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hardware extends Ticket{

    private Dispositivo dispositivo;
    private boolean repuesto;

    public Hardware(){
        super();
        this.dispositivo=Dispositivo.CAMARAS;
        this.repuesto=true;

    }
    public Hardware(Cliente cliente, String descripcion, LocalDateTime creacion, LocalDateTime finalizacion, ArrayList<String> comentarios, Estado estado, Dispositivo dispositivo, boolean repuesto ){
        super(cliente,descripcion, creacion,finalizacion,estado,comentarios );
        this.dispositivo=dispositivo;
        this.repuesto=repuesto;

    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public boolean isRepuesto() {
        return repuesto;
    }

    public void setRepuesto(boolean repuesto) {
        this.repuesto = repuesto;
    }






    @Override
    public boolean comprobar() {

        if(repuesto==true & getEstado()==Estado.EN_PROGRESO){
            cambiar(Estado.RESUELTO);
            return true;
        }
        else{
            return false;
        }

    }


    }
