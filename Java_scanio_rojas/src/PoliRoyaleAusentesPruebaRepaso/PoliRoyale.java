package PoliRoyaleAusentesPruebaRepaso;

import java.util.HashMap;
import java.util.HashSet;

public class PoliRoyale {
    private HashSet<Carta> cartas;
    private HashSet<Jugables> jugables;
    private HashMap<Jugador, Carta> historial;

    public PoliRoyale(HashSet<Carta> cartas, HashSet<Jugables> jugables, HashMap<Jugador, Carta> historial) {
        this.cartas = cartas;
        this.jugables = jugables;
        this.historial = historial;
    }

    public PoliRoyale() {
        this.cartas = new HashSet<>();
        this.jugables = new HashSet<>();
        this.historial = new HashMap<>();
    }

    public HashSet<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(HashSet<Carta> cartas) {
        this.cartas = cartas;
    }

    public HashSet<Jugables> getJugables() {
        return jugables;
    }

    public void setJugables(HashSet<Jugables> jugables) {
        this.jugables = jugables;
    }

    public HashMap<Jugador, Carta> getHistorial() {
        return historial;
    }

    public void setHistorial(HashMap<Jugador, Carta> historial) {
        this.historial = historial;
    }

    public String registrar_favorita(Jugador jugador, Carta carta) throws AsignacionNoPosible {
        if (historial.containsKey(jugador) && historial.get(jugador).equals(carta)) {
            throw new AsignacionNoPosible("Ya tenia esta carta asignada como favorita");
        }

        historial.put(jugador, carta);
        return "Carta favorita registrada con exito";
    }

    public void nueva_carta(Carta carta) throws CartaInvalida{
        if(carta.valida()){
            cartas.add(carta);
            try{
                Jugables j=(Jugables) carta;
                jugables.add(j);
            }
            catch (ClassCastException e){
                System.out.println("No es una carta jugable");
            }
            System.out.println("Se ha agregado correctamente la carta");
        }
        else{
            throw new CartaInvalida("Carta con valores invalidos");
        }

    }

    public String subir_nivel(Jugables jugable,int elixir) throws MejoraNoPosible {
      return jugable.mejorar(elixir);
    }

    public String cartas_jugables(){
        return "La cantidad de cartas jugables son:"+ jugables.size();
    }
}
