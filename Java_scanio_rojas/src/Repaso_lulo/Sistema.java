package Repaso_lulo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Desarrollador> desarroladores;
    private ArrayList<Ticket> tickets;

    public Sistema(){
        this.desarroladores=new ArrayList<>();
        this.tickets=new ArrayList<>();
    }

    public Sistema(ArrayList<Desarrollador> desarroladores, ArrayList<Ticket> tickets) {
        this.desarroladores = desarroladores;
        this.tickets = tickets;
    }

    public ArrayList<Desarrollador> getDesarroladores() {
        return desarroladores;
    }

    public void setDesarroladores(ArrayList<Desarrollador> desarroladores) {
        this.desarroladores = desarroladores;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int determinado_estado(Estado estado){
        int contador=0;

        for(Ticket t:tickets){
            if(t.getEstado()==estado){
                contador++;
            }

        }
        return contador;

    }

    public int cantidad_total(){
        return tickets.size();
    }

    public Ticket mas_antiguo(){
        LocalDateTime aux=tickets.get(0).getFechaCreacion();
        Ticket mas_antiguo=null;



        for(Ticket t: tickets){
            if(t.getFechaCreacion().isBefore(aux) && t.getEstado()==Estado.ABIERTO){
                aux=t.getFechaCreacion();
                mas_antiguo=t;

            }
        }
        return mas_antiguo;
    }

    public Desarrollador desarrollador_mas_resueltos(){
        Desarrollador crack=new Desarrollador();
        int aux=0;

        for(Desarrollador d:desarroladores){
            if(d.cantidad_resueltos()>aux){
                aux=d.cantidad_resueltos();
                crack=d;
            }
        }
        return crack;
    }

    public ArrayList asignados(Desarrollador desarrolador){
        return desarrolador.getLista_tickets();
    }

    public Desarrollador viejo(){
        Desarrollador viejito=new Desarrollador();
        LocalDate aux=desarroladores.get(0).getFechaIngreso();

        for(Desarrollador d:desarroladores){
            if(d.getFechaIngreso().isBefore(aux)){
                aux=d.getFechaIngreso();
                viejito=d;
            }
        }
        return viejito;
    }

    public void conocer(Ticket ticket){

        ArrayList<Desarrollador> cantidad=new ArrayList<>();

        for(Desarrollador d:desarroladores){
            if(d.esta(ticket)==true){
                cantidad.add(d);
            }


        }
        for(Desarrollador d:cantidad){
            System.out.println(d);
        }


    }

    public Duration promedio(){
        Duration total=Duration.ZERO;


        for(Ticket t:tickets){
            if(t.getEstado().equals(Estado.RESUELTO) ||t.getEstado().equals(Estado.CANCELADO) || t.getEstado().equals(Estado.CERRADO)  ){
                Duration duracion = Duration.between(t.getFechaCreacion(), t.getFechaFinalizacion());
                total=total.plus(duracion);
            }


        }
        return total.dividedBy(tickets.size());
    }

    public static void main(String[] args) {

    }
}
