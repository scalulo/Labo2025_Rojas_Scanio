package Interfaces.Campeonato_arco_flecha;

import java.util.HashSet;

public class BeneficioBebida extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> comidas;

    public BeneficioBebida(String nombre_creador, String nombre_beneficio, HashSet<String> comidas) {
        super(nombre_creador, nombre_beneficio);
        this.comidas = comidas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int aplicar_dto() {
        return 1000;
    }
}
