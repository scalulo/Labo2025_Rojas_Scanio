package Repaso_Unidad7_8;

public class Expertos extends Participante {
    private static int tiempo=80;
    private int tiempo_actual;

    public Expertos(String nombre, int tiempo_actual) {
        super(nombre);
        this.tiempo_actual = tiempo_actual;
    }

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        Expertos.tiempo = tiempo;
    }

    public int getTiempo_actual() {
        return tiempo_actual;
    }

    public void setTiempo_actual(int tiempo_actual) {
        this.tiempo_actual = tiempo_actual;
    }

    @Override
    public void preparar_lugar() {

    }


}
