package Modificadores.Aplicacion_Mascotas;

public class Pajaro extends Mascota {
    private int felicidad;

    public Pajaro(){
        super();
        this.felicidad=0;

    }
    public Pajaro(String nombre, Dueño dueño, int felicidad){
        super(nombre,dueño);
        this.felicidad=felicidad;

    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    @Override
    void saludo(Dueño dueño) {

        if(dueño==getDueño()) {
            for(int i=0;i<felicidad;i++) {
                System.out.println("Pio");
            }
        }




        if(getFelicidad()>1){
            setFelicidad(getFelicidad()-1);
        }
    }

    @Override
    void alimentar() {
        setFelicidad(getFelicidad()+1);
    }
}

