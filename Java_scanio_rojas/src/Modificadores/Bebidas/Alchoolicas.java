package Modificadores.Bebidas;

public class Alchoolicas extends Bebida {
    private int cant_alchool;
    private static int positividad = 0;
    private int negatividad;

    public Alchoolicas(String nombre, int cant_alchool, int negatividad) {
        super(nombre);
        this.cant_alchool = cant_alchool;
        this.negatividad = cant_alchool*20;
    }

    public int getCant_alchool() {
        return cant_alchool;
    }

    public void setCant_alchool(int cant_alchool) {
        this.cant_alchool = cant_alchool;
    }

    public static int getPositividad() {
        return positividad;
    }

    public static void setPositividad(int positividad) {
        Alchoolicas.positividad = positividad;
    }

    public int getNegatividad() {
        return negatividad;
    }

    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }

    @Override
    int calcular_hidratacion() {
        return 1-(negatividad);
    }
}
