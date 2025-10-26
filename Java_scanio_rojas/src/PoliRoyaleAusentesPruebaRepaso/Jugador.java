package PoliRoyaleAusentesPruebaRepaso;

public class Jugador {
    private String nombre;
    private String tag;
    private String clan;
    private Arena arena;
    private int nivel_rey;

    public Jugador() {
        this.nombre = "Lulo";
        this.tag = "Lulito";
        this.clan = "lol";
        this.arena = Arena.LABO;
        this.nivel_rey = 14;
    }

    public Jugador(String nombre, String tag, String clan, Arena arena, int nivel_rey) {
        this.nombre = nombre;
        this.tag = tag;
        this.clan = clan;
        this.arena = arena;
        this.nivel_rey = nivel_rey;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public int getNivel_rey() {
        return nivel_rey;
    }

    public void setNivel_rey(int nivel_rey) {
        this.nivel_rey = nivel_rey;
    }
}
