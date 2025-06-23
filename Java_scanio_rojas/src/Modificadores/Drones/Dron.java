package Modificadores.Drones;

import java.time.LocalDate;

public abstract class Dron {
     String nombre;
     LocalDate fecha_adquisicion;
     int nivel_carga;
     int nro;
     Estado estado;


    public Dron(String nombre, LocalDate fecha_adquisicion, int nivel_carga, int nro, Estado estado) {
        this.nombre = nombre;
        this.fecha_adquisicion = fecha_adquisicion;
        this.nivel_carga = nivel_carga;
        this.nro = nro;
        this.estado = estado;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(LocalDate fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public int getNivel_carga() {
        return nivel_carga;
    }

    public void setNivel_carga(int nivel_carga) {
        this.nivel_carga = nivel_carga;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void cargar_bateria(){
        if(nivel_carga<=20){
            setNivel_carga(100);
        }
        else{
            setNivel_carga(nivel_carga+10);
        }
    }
    abstract void chequear_mision(double latitud_destino,double longitud_destino);


    // Convertir a radianes
    public double Convertir(double latitud_destino,double longitud_destino){
        double longitud_origen=-58.504111;
        double latitud_origen=-34.573195;

    double lat1Rad = Math.toRadians(longitud_origen);
    double lon1Rad = Math.toRadians(latitud_origen);
    double lat2Rad = Math.toRadians(latitud_destino);
    double lon2Rad = Math.toRadians(longitud_destino);

    // Fórmula de Haversine
    double dLat = lat2Rad - lat1Rad;
    double dLon = lon2Rad - lon1Rad;
    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
            Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double radioTierraKm = 6371;
    return (radioTierraKm * c)/120;
    }
}
