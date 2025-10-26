package PoliRoyaleAusentesPruebaRepaso;

public interface Jugables {
    String desbloquear_arena(Arena arena) throws ArenaInadecuada;
    String descripcion();
    void recibir_dano(int dano);
    String mejorar(int elixir) throws MejoraNoPosible;
}
