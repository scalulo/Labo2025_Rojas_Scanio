package Repaso_lulo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Desarrollador {
    private String nombre;
    private LocalDate fechaIngreso;
    private ArrayList<Ticket> lista_tickets;

    public Desarrollador(){
        this.nombre="Santiago";
        this.fechaIngreso=LocalDate.now();
        this.lista_tickets=new ArrayList<>();
    }

    public Desarrollador(String nombre, LocalDate fechaIngreso, ArrayList<Ticket> lista) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.lista_tickets=lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public ArrayList<Ticket> getLista_tickets() {
        return lista_tickets;
    }

    public void setLista_tickets(ArrayList<Ticket> lista_tickets) {
        this.lista_tickets = lista_tickets;
    }

    public int cantidad_resueltos(){
        int contador=0;
        for(Ticket t:lista_tickets){
            if(t.getEstado()==Estado.RESUELTO){
                contador++;
            }
        }



        return contador;
    }

    public boolean esta(Ticket ticket){
        for(Ticket t:lista_tickets){
            if(t.equals(ticket)){
                return true;
            }

        }
        return false;
    }
}
