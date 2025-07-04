package Repaso_lulo;

import Unidad1.Fecha;
import Unidad1.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private Cliente cliente;
    private String descripcion;
    private LocalDateTime creacion;
    private LocalDateTime finalizacion;
    private ArrayList<String> comentarios;
    private Estado estado;


    public Ticket(){
        this.cliente=new Cliente();
        this.descripcion="";
        this.creacion=LocalDateTime.now();
        this.comentarios=new ArrayList<>();
        this.estado=Estado.ABIERTO;
    }

    public Ticket(Cliente cliente, String descripcion, LocalDateTime creacion, LocalDateTime finalizacion, Estado estado, ArrayList<String> comentarios ) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.creacion = creacion;
        this.finalizacion =finalizacion;
        this.estado = estado;
        this.comentarios = comentarios;
    }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDateTime getFechaCreacion() { return creacion; }
    public void setFechaCreacion(LocalDateTime fechaCreacion) { this.creacion = fechaCreacion; }

    public LocalDateTime getFechaFinalizacion() { return finalizacion; }
    public void setFechaFinalizacion(LocalDateTime fechaFinalizacion) { this.finalizacion = fechaFinalizacion; }

    public ArrayList<String> getComentarios() { return comentarios; }
    public void setComentarios(ArrayList<String> comentarios) { this.comentarios = comentarios; }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }


    public void cambiar(Estado nuevo) {
        this.estado = nuevo;
        if (nuevo == Estado.CERRADO.RESUELTO ||
                nuevo == Estado.CERRADO.CERRADO ||
                nuevo == Estado.CANCELADO ) {
            this.finalizacion = LocalDateTime.now();

        }
    }

    public void agregar(String comentario){
        comentarios.add(comentario);
    }

    public abstract boolean comprobar();


    }




