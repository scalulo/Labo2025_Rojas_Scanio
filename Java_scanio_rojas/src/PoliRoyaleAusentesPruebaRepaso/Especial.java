package PoliRoyaleAusentesPruebaRepaso;

public class Especial extends Carta implements Jugables {
    private int nivel_desbloqueo;
    private int dano_variable;
    private int bonus;

    public Especial(String nombre, int elixir, int vida, Arena arena_desbloqueo, int nivel_desbloqueo, int dano_variable, int bonus) {
        super(nombre, elixir, vida, arena_desbloqueo);
        this.nivel_desbloqueo = nivel_desbloqueo;
        this.dano_variable = dano_variable;
        this.bonus = bonus;
    }
    public Especial(){
        super();
        this.nivel_desbloqueo=2;
        this.dano_variable=2;
        this.bonus=4;
    }

    public int getNivel_desbloqueo() {
        return nivel_desbloqueo;
    }

    public void setNivel_desbloqueo(int nivel_desbloqueo) {
        this.nivel_desbloqueo = nivel_desbloqueo;
    }

    public int getDano_variable() {
        return dano_variable;
    }

    public void setDano_variable(int dano_variable) {
        this.dano_variable = dano_variable;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    void frase() {
        System.out.println("Soy una carta especial de nivel"+nivel_desbloqueo+" y mi danio actual es: "+dano_variable);
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
        return "Soy una carta especial pero no por eso soy dificil de conseguir!";
    }

    @Override
    public void recibir_dano(int dano) {
        if(getVida()>dano){
            setVida(getVida()-dano);
            System.out.println("Sigo en combate hasta el final");
        }
        else{
            System.out.println("Mori en la batalla protegiendo al rey");
        }
    }

    @Override
    public String mejorar(int elixir) throws MejoraNoPosible {
        setElixir(getElixir()+elixir);
        return "La carta ha sido reforzada correctamente, mi nuevo elixir es:"+getElixir();
    }

    @Override
    boolean valida() {
        if (getVida()<=0 || getElixir()<=0 ||this.dano_variable<=0 || bonus <=0 || this.nivel_desbloqueo<=0){
            return false;
        }
        return true;
    }
}
