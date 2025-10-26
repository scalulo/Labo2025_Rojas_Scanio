package PoliRoyaleAusentesPruebaRepaso;

public class Comun extends Carta{
    private static int dano=3;

    public Comun() {
        super();
        this.dano=2;
    }
    public Comun(String nombre,int elixir,int vida,Arena arena,int dano){
        super(nombre,elixir,vida,arena);
        this.dano=dano;
    }

    public static int getDano() {
        return dano;
    }

    public static void setDano(int dano) {
        Comun.dano = dano;
    }

    @Override
    void frase() {
        System.out.println("Soy una carta común y mi danio es:"+dano);
    }

    @Override
    boolean valida() {
        if (getVida()<=0 || getElixir()<=0 ||this.dano<=0){
            return false;
        }
        return true;    }
}
