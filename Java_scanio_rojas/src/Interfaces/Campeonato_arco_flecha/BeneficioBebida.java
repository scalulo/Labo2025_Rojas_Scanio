package Interfaces.Campeonato_arco_flecha;

import java.util.HashSet;

public class BeneficioBebida extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> bebidas;

    public BeneficioBebida(String nombre_creador, String nombre_beneficio, HashSet<String> bebidas) {
        super(nombre_creador, nombre_beneficio);
        this.bebidas = bebidas;
    }

    public HashSet<String> getbebidas() {
        return bebidas;
    }

    public void setbebidas(HashSet<String> bebidas) {
        this.bebidas = bebidas;
    }

    @Override
    public int aplicar_dto() {
        return 1000;
    }
}
