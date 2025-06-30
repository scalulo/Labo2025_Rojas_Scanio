package Modificadores.Bebidas;

public class Azucarada extends Bebida {
    private int cant_azucar;
    private static int positividad=1;
    private int negatividad;


    public Azucarada(String nombre, int cant_azucar) {
        super(nombre);
        this.cant_azucar = cant_azucar;
        this.negatividad = cant_azucar*10 ;
    }

    public int getCant_azucar() {
        return cant_azucar;
    }

    public void setCant_azucar(int cant_azucar) {
        this.cant_azucar = cant_azucar;
    }

    public int getNegatividad() {
        return negatividad;
    }

    public static int getPositividad() {
        return positividad;
    }

    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }

    @Override
    int calcular_hidratacion() {
        return 1-(negatividad);
    }
}
