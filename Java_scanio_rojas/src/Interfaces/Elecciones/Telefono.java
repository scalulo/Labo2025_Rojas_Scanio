package Interfaces.Elecciones;

public class Telefono extends Dispositivo implements Enviador {
    private Compania compania;
    private int bateria;
    private int credito;

    public Telefono(int numero_serie, String fabricante, String modelo, Compania compania, int bateria, int credito) {
        super(numero_serie, fabricante, modelo);
        this.compania = compania;
        this.bateria = bateria;
        this.credito = credito;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public void enviar_mensaje(String mensaje) {
        if(bateria>0 && credito>0){
            System.out.println("Conectado con la antena mas cercana "+mensaje);
        }
        else{
            System.out.println("Dispositivo no disponible");
        }
    }
}
