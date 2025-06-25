package Modificadores.Aplicacion_Mascotas;

public class Gato extends Mascota {
    private int felicidad;

    public Gato(){
        super();
        this.felicidad=0;
    }
    public Gato(String nombre, Dueño dueño, int felicidad){
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
            for (int i = 0; i < felicidad; i++) {
                System.out.println("Miau");

            }
        }

        else {
            for (int i = 0; i < felicidad; i++) {
                System.out.println("MIAU");
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
