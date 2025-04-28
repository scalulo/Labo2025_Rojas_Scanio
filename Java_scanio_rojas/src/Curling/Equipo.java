package Curling;


import Unidad1.Fecha;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Jugador> jugadores;
    private String disponibilidad;

    public Equipo() {
        this.nombre = "River";
        this.barrio = "Nuñez";
        this.disponibilidad = "mañana";
        this.jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String barrioProcedencia, String disponibilidadHoraria) {
        this.nombre = nombre;
        this.barrio = barrioProcedencia;
        this.disponibilidad = disponibilidadHoraria;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    public void agregar(Jugador jugador) {

        if (jugadores.size() >= 11) {
            System.out.println("Error: Ya hay 11 jugadores en el equipo.");
            return;
        }
        for (Jugador jugadoR : jugadores) {
            if (jugadoR.getNumero() == jugador.getNumero()) {
                System.out.println("Error: Ya existe un jugador con el número de camiseta " + jugador.getFecha() + ".");
                return;
            }
        }

        jugadores.add(jugador);
    }



        public static void main (String[]args){
            Equipo e1 = new Equipo();
            Equipo e2 = new Equipo();
            Equipo e3 = new Equipo();
            Equipo e4 = new Equipo();


            e1.agregar(new Jugador("Juan Pérez", new Fecha(10, 5, 2005), 7, true));
            e1.agregar(new Jugador("Miño", new Fecha(10, 10, 2007), 11, true));

        }

    }
