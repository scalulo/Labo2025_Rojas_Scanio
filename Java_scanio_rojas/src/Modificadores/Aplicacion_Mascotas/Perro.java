package Modificadores.Aplicacion_Mascotas;

public class Perro extends Mascota {
    private int felicidad;

    public Perro(){
        super();
        this.felicidad=0;
    }
    public Perro(String nombre, Dueño dueño, int felicidad){
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


                System.out.println("Guau");
            }
        }

        else {
            for (int i = 0; i < felicidad; i++) {
                System.out.println("GUAU");
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




