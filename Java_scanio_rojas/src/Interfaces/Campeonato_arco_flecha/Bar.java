package Interfaces.Campeonato_arco_flecha;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private int cant_clientes_q_juegan;
    private int recaudado;
    private HashSet<Beneficio> beneficios_implemenables;
    private HashSet<BeneficioAcumulable> acumulables;

    public Bar(HashSet<Diana> dianas, int cant_clientes_q_juegan, int recaudado, HashSet<Beneficio> beneficios_implemenables, HashSet<BeneficioAcumulable> acumulables) {
        this.dianas = dianas;
        this.cant_clientes_q_juegan = cant_clientes_q_juegan;
        this.recaudado = recaudado;
        this.beneficios_implemenables = beneficios_implemenables;
        this.acumulables = acumulables;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getCant_clientes_q_juegan() {
        return cant_clientes_q_juegan;
    }

    public void setCant_clientes_q_juegan(int cant_clientes_q_juegan) {
        this.cant_clientes_q_juegan = cant_clientes_q_juegan;
    }

    public int getRecaudado() {
        return recaudado;
    }

    public void setRecaudado(int recaudado) {
        this.recaudado = recaudado;
    }

    public HashSet<Beneficio> getBeneficios_implemenables() {
        return beneficios_implemenables;
    }

    public void setBeneficios_implemenables(HashSet<Beneficio> beneficios_implemenables) {
        this.beneficios_implemenables = beneficios_implemenables;
    }

    public HashSet<BeneficioAcumulable> getAcumulables() {
        return acumulables;
    }

    public void setAcumulables(HashSet<BeneficioAcumulable> acumulables) {
        this.acumulables = acumulables;
    }

    public int cant_tragos(){
        return beneficios_implemenables.
    }
}
