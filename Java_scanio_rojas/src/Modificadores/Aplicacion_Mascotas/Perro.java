package Modificadores.Aplicacion_Mascotas;

public class Perro extends Mascotas {
    public Perro(){
        super();
    }
    public Perro(String nombre, Dueño dueño){
        super(nombre,dueño);
    }

    @Override
    void saludo() {
        System.out.println("Guau");
    }
}

