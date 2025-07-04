package Repaso_lulo;

import java.util.ArrayList;

public class Cliente {
     private String nombre;
     private ArrayList<Ticket> tickets;


     public Cliente() {
         this.nombre = "Luciano";
         this.tickets=new ArrayList<>();

     }

     public Cliente(String nombre, ArrayList<Ticket> tickets) {
         this.nombre = nombre;
         this.tickets=tickets;

     }

     public String getNombre() {
         return nombre;
     }


     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}


