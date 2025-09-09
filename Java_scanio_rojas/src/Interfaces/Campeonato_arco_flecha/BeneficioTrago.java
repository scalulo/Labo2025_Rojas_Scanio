package Interfaces.Campeonato_arco_flecha;

import java.util.HashSet;

public class BeneficioTrago extends Beneficio{
    private HashSet<String>tragos;

    public BeneficioTrago(String nombre_creador, String nombre_beneficio, HashSet<String> tragos) {
        super(nombre_creador, nombre_beneficio);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
