package Modificadores.Aplicacion_Mascotas;

public class Cantores extends Pajaro{
    private String canto;

    public Cantores(){
    super();
    this.canto="lololo";

    }
    public Cantores(String nombre, Dueño dueño, String canto){
        super(nombre,dueño);
        this.canto=canto;
    }

    @Override
    void saludo() {
        System.out.println(canto);
    }
}
