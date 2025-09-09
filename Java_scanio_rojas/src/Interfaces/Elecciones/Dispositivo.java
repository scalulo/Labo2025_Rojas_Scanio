package Interfaces.Elecciones;

public class Dispositivo {
    private int numero_serie;
    private String fabricante;
    private String modelo;

    public Dispositivo(int numero_serie, String fabricante, String modelo) {
        this.numero_serie = numero_serie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
