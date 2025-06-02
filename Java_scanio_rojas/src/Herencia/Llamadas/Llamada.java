package Herencia.Llamadas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private LocalTime hora_inicio;
    private LocalTime hora_fin;
    private LocalDate fecha;

    public Llamada(){
        this.origen= new Empleado();
        this.destino= new Empleado("negu","nashe",2412421,12234,"Brasil");
        this.hora_inicio = LocalTime.of(14,23,22);
        this.hora_fin = LocalTime.of(14,24,53);
        this.fecha=LocalDate.of(2024,3,31);
    }

    public Llamada(Empleado origen, Empleado destino, LocalTime hora_inicio, LocalTime hora_fin, LocalDate fecha) {
        this.origen = origen;
        this.destino = destino;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.fecha = fecha;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Duration getDuracion() {
        if (hora_inicio != null && hora_fin != null) {
            return Duration.between(hora_inicio, hora_fin);
        } else {
            return Duration.ZERO;
        }
    }

    public LocalTime getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


}
