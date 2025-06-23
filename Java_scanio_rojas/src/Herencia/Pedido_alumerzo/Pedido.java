package Herencia.Pedido_alumerzo;

import Herencia.Computadoras.Cliente;
import Unidad1.Persona;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedido {
    private LocalDate creacion;
    private LocalTime entrega;
    private Estado_plato estado;
    private ArrayList<Plato> platos;
    private Persona Solicitante;


    public Pedido(){
        this.creacion = LocalDate.of(2025,10,12);
        this.entrega = LocalTime.from(LocalDate.of(2025,10,15));
        this.estado = Estado_plato.PENDIENTE;
        this.platos = platos;
        Solicitante = new Cliente("pepo",23,"cueca 343","de satnis",2344);
    }
    public Pedido(LocalDate creacion, LocalTime entrega, Estado_plato estado, ArrayList<Plato> platos, Persona solicitante) {
        this.creacion = creacion;
        this.entrega = entrega;
        this.estado = estado;
        this.platos = platos;
        Solicitante = solicitante;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public LocalTime getEntrega() {
        return entrega;
    }

    public void setEntrega(LocalTime entrega) {
        this.entrega = entrega;
    }

    public Estado_plato getEstado() {
        return estado;
    }

    public void setEstado(Estado_plato estado) {
        this.estado = estado;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public Persona getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        Solicitante = solicitante;
    }
}

