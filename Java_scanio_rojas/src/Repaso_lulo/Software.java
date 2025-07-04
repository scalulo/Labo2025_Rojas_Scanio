package Repaso_lulo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Software extends Ticket {

    private Software_tipo tipo_Software;
private static int intentos=3;
private int cantidad_intentos;

    public Software() {

        super();
        this.cantidad_intentos=intentos;
        this.tipo_Software=new Software_tipo();
    }

    public Software(Cliente cliente, String descripcion, LocalDateTime creacion, LocalDateTime finalizacion, ArrayList<String> comentarios, Estado estado, Software_tipo tipo_Software) {
        super(cliente, descripcion, creacion, finalizacion, estado, comentarios);
        this.cantidad_intentos=intentos;
        this.tipo_Software=tipo_Software;
    }

    @Override
    public boolean comprobar() {
        if(tipo_Software.getParche()==true & getEstado()==Estado.EN_PROGRESO & cantidad_intentos>0){
            cambiar(Estado.RESUELTO);
            cantidad_intentos=cantidad_intentos-1;
            return true;
        }
        else{
            return false;
        }


    }
}
