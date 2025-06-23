package Modificadores.Aplicacion_Mascotas;

public class Gato extends Mascotas {

    public Gato(){
        super();
    }
    public Gato(String nombre, Dueño dueño){
        super(nombre,dueño);
    }

    @Override
    void saludo() {
        System.out.println("Miau");
    }
}
