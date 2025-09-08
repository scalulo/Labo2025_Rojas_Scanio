package Interfaces.Elecciones;

public class Paloma_mensajera extends Ave implements Enviador {
    private boolean aprendio_mapa;
    private boolean volar;

    public Paloma_mensajera(String nombre, String color, String especie, boolean aprendio_mapa) {
        super(nombre, color, especie);
        this.aprendio_mapa = aprendio_mapa;
    }

    public boolean isAprendio_mapa() {
        return aprendio_mapa;
    }

    public void setAprendio_mapa(boolean aprendio_mapa) {
        this.aprendio_mapa = aprendio_mapa;
    }

    @Override
    public void enviar_mensaje(String mensaje) {
        if(volar){
            System.out.println(mensaje+" Lanzando un papelito que dice:");
        }
        else{
            System.out.println("No aprendio a volar");
        }
    }
}
