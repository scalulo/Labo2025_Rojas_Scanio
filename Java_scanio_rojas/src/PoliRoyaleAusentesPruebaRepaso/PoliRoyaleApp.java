package PoliRoyaleAusentesPruebaRepaso;

import java.util.HashMap;
import java.util.HashSet;

public class PoliRoyaleApp {

    public static void main(String[] args) {
        // === Crear estructura principal del juego ===
        PoliRoyale juego = new PoliRoyale();

        // === Crear colecciones ===
        HashSet<Carta> todasLasCartas = new HashSet<>();
        HashSet<Jugables> cartasJugables = new HashSet<>();
        HashMap<Jugador, Carta> historialJugadores = new HashMap<>();

        // === Crear cartas ===
        Carta comun = new Comun("Espíritu de Miguez", 2, 10, Arena.LABO,4);
        Especial especial = new Especial("Mago Pruscino", 4, 20, Arena.CUARTITO, 3, 10, 3);
        Epica epica1 = new Epica("Verdugo Scovenna", 5, 25, Arena.SUM, 8);
        Epica epica2 = new Epica("Príncipe Barbieri", -2, 30, Arena.SUM, 5);
        Epica epica3 = new Epica("Cazador Callipo", 4, 22, Arena.BUFFET, 6);
        Epica epica4 = new Epica("LulitoPro", 4, 22, Arena.BUFFET, 6);

        // === Agregar cartas a las listas ===
        todasLasCartas.add(comun);
        todasLasCartas.add(especial);
        todasLasCartas.add(epica1);
        todasLasCartas.add(epica2);
        todasLasCartas.add(epica3);

        // Jugables: especiales y épicas

        cartasJugables.add(epica3);

        // === Crear jugadores ===
        Jugador jugador1 = new Jugador("Luciano", "Lucho05", "Clan Politécnico", Arena.LABO, 8);
        Jugador jugador2 = new Jugador("María", "MaryX", "Clan Informática", Arena.SUM, 10);
        Jugador jugador3 = new Jugador("Juan", "Juani77", "Clan Buffet", Arena.BUFFET, 6);

        // === Asignar cartas favoritas ===

        historialJugadores.put(jugador2, epica1);
        historialJugadores.put(jugador3, epica3);


        System.out.println(juego.cartas_jugables());

        try{
            juego.nueva_carta(comun);
        } catch (CartaInvalida e) {
            System.out.println(e.getMessage());
        }

        try{
            juego.nueva_carta(epica2);
        } catch (CartaInvalida e) {
            System.out.println(e.getMessage());
        }
        try{
            juego.nueva_carta(epica4);
        } catch (CartaInvalida e) {
            System.out.println(e.getMessage());
        }

        System.out.println(juego.cartas_jugables());

        try{
            System.out.println(juego.registrar_favorita(jugador1,epica3));
        } catch (AsignacionNoPosible e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(juego.registrar_favorita(jugador1,especial));
        } catch (AsignacionNoPosible e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(juego.registrar_favorita(jugador1,especial));
        } catch (AsignacionNoPosible e) {
            System.out.println(e.getMessage());
        }

        comun.frase();
        especial.frase();
        epica1.frase();

        try{
            System.out.println( epica3.desbloquear_arena(Arena.BUFFET));
        } catch (ArenaInadecuada e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(epica3.desbloquear_arena(Arena.CUARTITO));
        } catch (ArenaInadecuada e) {
            System.out.println(e.getMessage());
        }

        System.out.println(epica3.descripcion());
        System.out.println(especial.descripcion());

        try{
            System.out.println( juego.subir_nivel(epica3,3));
        } catch (MejoraNoPosible e) {
            System.out.println(e.getMessage());
        }

    }
    }

