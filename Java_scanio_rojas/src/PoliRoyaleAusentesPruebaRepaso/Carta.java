package PoliRoyaleAusentesPruebaRepaso;

public abstract class Carta {
    private String nombre;
    private int elixir;
    private int vida;
    private Arena arena_desbloqueo;

    public Carta() {
        this.nombre = "monta";
        this.elixir = 4;
        this.vida = 5;
        this.arena_desbloqueo = Arena.LABO;
    }

    public Carta(String nombre, int elixir, int vida, Arena arena_desbloqueo) {
        this.nombre = nombre;
        this.elixir = elixir;
        this.vida = vida;
        this.arena_desbloqueo = arena_desbloqueo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arena getArena_desbloqueo() {
        return arena_desbloqueo;
    }

    public void setArena_desbloqueo(Arena arena_desbloqueo) {
        this.arena_desbloqueo = arena_desbloqueo;
    }

    abstract void frase();
    abstract boolean valida();
}
