package Curling;
import Curling.Partido;
import Unidad1.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> mañanas;
    private ArrayList<Equipo> tardes;
    private ArrayList<Equipo> noches;


    public Campeonato() {
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
        this.mañanas = new ArrayList<>();
        this.tardes = new ArrayList<>();
        this.noches = new ArrayList<>();
    }
    public void dividir() {
        for (Equipo equipo : equipos) {
            if (equipo.getDisponibilidad().equals("mañana")) {
                mañanas.add(equipo);
            }
            if (equipo.getDisponibilidad().equals("tarde")) {
                tardes.add(equipo);
            }
            if (equipo.getDisponibilidad().equals("noche")) {
                noches.add(equipo);
            }
        }
    }
public void agregar_partidos(ArrayList<Equipo> turno){
        for (int k=0;k<turno.size()-1;k++){
            for(int i=k+1; i< turno.size();i++){
                Partido partido= new Partido(turno.get(k),turno.get(i), LocalDate.now(),turno.get(i).getDisponibilidad() );
                partidos.add(partido);
            }
        }

}

    public void agregarEquipo(Equipo equipo) {
        if (equipos.size() < 30) {
            equipos.add(equipo);
        } else {
            System.out.println("No se pueden agregar más equipos al campeonato.");
        }
    }


public void fixture(){
        dividir();
        agregar_partidos(mañanas);
        agregar_partidos(tardes);
        agregar_partidos(noches);
}


    public static void main(String[] args) {
        Equipo e1 = new Equipo();
        Equipo e2 = new Equipo("Velez", "Liniers", "mañana");


        e1.agregar(new Jugador("Juan Pérez", new Fecha(10, 5, 2005), 7, true));
        e1.agregar(new Jugador("Miño", new Fecha(10, 10, 2007), 11, false));
        e2.agregar(new Jugador("Aquino", new Fecha(10, 10, 2003), 22, false));
        e2.agregar(new Jugador("messi", new Fecha(10, 10, 2002), 10, true));


        Campeonato campeonato1 = new Campeonato();

        campeonato1.agregarEquipo(e1);
        campeonato1.agregarEquipo(e2);
        campeonato1.fixture();
        for(Partido partido : campeonato1.partidos){
        System.out.println("Equipo local: " + partido.getEquipo1().getNombre());
        System.out.println("Equipo visitante: " +partido.getEquipo2().getNombre());
        System.out.println("Fecha: "+partido.getFecha().toString());
        System.out.println("Turno: "+partido.getTurno());

        }}
}