package Modificadores.Drones;

import java.time.LocalDate;

public class Carga extends Dron{
    private double carga;

    public Carga(String nombre, LocalDate fecha_adquisicion, int nivel_carga, int nro, Estado estado, double carga) {
        super(nombre, fecha_adquisicion, nivel_carga, nro, estado);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    void chequear_mision(double latitud_destino,double longitud_destino) {
        if(estado.equals(Estado.EN_OPERATIVA) || estado.equals(Estado.VUELO)) {


            double distancia = Convertir(latitud_destino, longitud_destino);
            System.out.println("La distancia es " + distancia);
            if (distancia <= 30) {
                if (getNivel_carga() < 50) {
                    System.out.println("La mision no sera exitosa porque la bateria no es la suficiente");
                } else {
                    System.out.println("Mision en curso");
                    setNivel_carga(getNivel_carga() - 50);

                }
            } else {
                System.out.println("La mision no sera exitosa porque la longitud es mayor a 30km");

            }
        }
        else{
            System.out.println("no se puede realizar la mision porque el dron se encuentra en "+ estado.toString());

        }
    }

    public static void main(String[] args) {
        Carga dron= new Carga("DJI", LocalDate.of(2024,2,4),100,1,Estado.EN_OPERATIVA,100);
        dron.chequear_mision(-84.603738,-58.381570);
    }
}
