package Modificadores.Aplicacion_Mascotas;

public class Pajaro extends Mascotas {


    public Pajaro(){
        super();

    }
    public Pajaro(String nombre, Dueño dueño){
        super(nombre,dueño);

    }

    @Override
    void saludo() {
        System.out.println("Pio");
    }
}

