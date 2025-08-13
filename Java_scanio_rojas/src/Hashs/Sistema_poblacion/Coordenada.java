package Hashs.Sistema_poblacion;

public class Coordenada {
    private float latitud;
    private float altitud;

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getAltitud() {
        return altitud;
    }

    public void setAltitud(float altitud) {
        this.altitud = altitud;
    }

    public Coordenada(float latitud, float altitud) {
        this.latitud = latitud;
        this.altitud = altitud;
    }
    public Coordenada(){
        this.latitud=0121;
        this.altitud=4249;
    }
}
