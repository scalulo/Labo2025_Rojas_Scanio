package Interfaces.Elecciones;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int afiliados;
    private HashSet<Enviador> enviadores;


    public Partido(String nombre, String direccion, int afiliados, HashSet<Enviador> enviadores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.afiliados = afiliados;
        this.enviadores = enviadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(int afiliados) {
        this.afiliados = afiliados;
    }

    public HashSet<Enviador> getEnviadores() {
        return enviadores;
    }

    public void setEnviadores(HashSet<Enviador> enviadores) {
        this.enviadores = enviadores;
    }

    public void agregar(Enviador e){
        enviadores.add(e);
    }

    public void hacer_campana(){
        String mensaje="Vote por el partido para un mejor futuro";
        for(Enviador e:enviadores){
            e.enviar_mensaje(mensaje);
        }
    }

}
