package Repaso_Unidad7_8.EJ2;

import java.time.LocalDate;

public class Prestamo {
    private Publicacion pub;
    private int numero_socio;
    private LocalDate fecha_prestamo;
    private LocalDate fecha_devolucion_estimada;

    public Prestamo(Publicacion pub, int numero_socio, LocalDate fecha_prestamo, LocalDate fecha_devolucion_estimada) {
        this.pub = pub;
        this.numero_socio = numero_socio;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion_estimada = fecha_devolucion_estimada;
    }

    public Publicacion getPub() {
        return pub;
    }

    public void setPub(Publicacion pub) {
        this.pub = pub;
    }

    public int getNumero_socio() {
        return numero_socio;
    }

    public void setNumero_socio(int numero_socio) {
        this.numero_socio = numero_socio;
    }

    public LocalDate getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(LocalDate fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public LocalDate getFecha_devolucion_estimada() {
        return fecha_devolucion_estimada;
    }

    public void setFecha_devolucion_estimada(LocalDate fecha_devolucion_estimada) {
        this.fecha_devolucion_estimada = fecha_devolucion_estimada;
    }
}
