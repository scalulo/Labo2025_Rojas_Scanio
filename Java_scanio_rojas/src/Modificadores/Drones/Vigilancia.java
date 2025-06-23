package Modificadores.Drones;

import java.time.LocalDate;

public class Vigilancia extends Dron {
    private int memoria;

    public Vigilancia(String nombre, LocalDate fecha_adquisicion, int nivel_carga, int nro, Estado estado, int memoria) {
        super(nombre, fecha_adquisicion, nivel_carga, nro, estado);
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    void chequear_mision(double latitud_destino, double longitud_destino) {
        if(estado.equals(Estado.EN_OPERATIVA) || estado.equals(Estado.VUELO)) {
            double distancia = Convertir(latitud_destino, longitud_destino);
            System.out.println("La distancia es " + distancia);

            if (getEstado().equals(Estado.INACTIVO) || getEstado().equals(Estado.MANTENIMIENTO)) {
                System.out.println("El dron esta inactivo o en mantenimiento");
                return;
            }
            int cantidad_memoria_a_usar = ((int) distancia / 2) * 12;
            System.out.println("se necesita " + cantidad_memoria_a_usar + "mb de memoria y tenemos " + memoria + "gb");
            if (cantidad_memoria_a_usar <= memoria) {
                System.out.println("Mision en curso");
                setMemoria(memoria - cantidad_memoria_a_usar);
            } else {
                System.out.println("no hay tanta memoria disponible");
            }
        }
        else {
            System.out.println("no se puede realizar la mision porque el dron se encuentra en "+ estado.toString());
        }
    }

    public static void main(String[] args) {
        Vigilancia dron_v= new Vigilancia("DIJ", LocalDate.of(2024,2,4),100,3,Estado.EN_OPERATIVA,168);
        dron_v.chequear_mision(-30.603738,-58.381570);
    }
}
