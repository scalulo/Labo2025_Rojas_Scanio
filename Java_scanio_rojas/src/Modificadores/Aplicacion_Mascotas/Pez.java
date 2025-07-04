package Modificadores.Aplicacion_Mascotas;

public class Pez extends Mascota {
    private static int vidas = 10;
    private int vidas_actuales;

    public Pez() {
        super();
        this.vidas_actuales = vidas;

    }

    public Pez(String nombre, Dueño dueño) {
        super(nombre, dueño);
        this.vidas_actuales = vidas;
    }

    public static int getVidas() {
        return vidas;
    }

    public static void setVidas(int vidas) {
        Pez.vidas = vidas;
    }

    public int getVidas_actuales() {
        return vidas_actuales;
    }

    public void setVidas_actuales(int vidas_actuales) {
        this.vidas_actuales = vidas_actuales;
    }

    @Override
    void saludo(Dueño dueño) {

        if (dueño == getDueño()) {
            setVidas_actuales(getVidas_actuales() - 1);

        } else {
            setVidas_actuales(0);
        }


    }
    @Override
    void alimentar(){
        if(getVidas_actuales()>=1 && getVidas_actuales()<10){
            setVidas_actuales(getVidas_actuales()+1);
        }
    }


}
