package PoliRoyaleAusentesPruebaRepaso;

public class Epica extends Carta implements Jugables{
    private int segundos;

    public Epica(String nombre, int elixir, int vida, Arena arena_desbloqueo, int segundos) {
        super(nombre, elixir, vida, arena_desbloqueo);
        this.segundos = segundos;
    }
    public Epica(){
        super();
        this.segundos=4;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    void frase() {
        System.out.println("Soy una carta epica, me jugaron y me desbloqueo en: "+this.segundos);
    }

    @Override
    public String desbloquear_arena(Arena arena) throws ArenaInadecuada {
        if(this.getArena_desbloqueo()!=arena){
            throw new ArenaInadecuada("No se puede desbloquear la carta");
        }
        return "Carta desbloqueada en la arena correcta";
    }

    @Override
    public String descripcion() {
        return "Soy una carta epica y puedo contra todo!";
    }

    @Override
    public void recibir_dano(int dano) {
        if(getVida()>dano){
            setVida(getVida()-dano);
            System.out.println("Sigo en combate hasta el final");
        }
        else{
            System.out.println("Mori en la batalla protegiendo al rey");
            setVida(0);
        }
    }

    @Override
    public String mejorar(int elixir) throws MejoraNoPosible {
        if(this.segundos==1){
            throw new MejoraNoPosible("Ya no puede restarse mas segundos");
        }
        this.segundos--;
        setElixir(getElixir()+elixir);
        return "La carta ha sido reforzada correctamente, mi nuevo elixir es:"+getElixir();
    }

    @Override
    boolean valida() {
        if (getVida()<=0 || getElixir()<=0 ||segundos<=0){
            return false;
        }
        return true;
    }
}
