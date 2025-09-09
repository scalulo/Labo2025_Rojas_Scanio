package Interfaces.Campeonato_arco_flecha;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Bar>bares;
    private HashSet<Tipo_diana> tipos_d_diana;
    private HashSet<Beneficio> beneficios;

    public Sistema(HashSet<Bar> bares, HashSet<Tipo_diana> tipos_d_diana, HashSet<Beneficio> beneficios) {
        this.bares = bares;
        this.tipos_d_diana = tipos_d_diana;
        this.beneficios = beneficios;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Tipo_diana> getTipos_d_diana() {
        return tipos_d_diana;
    }

    public void setTipos_d_diana(HashSet<Tipo_diana> tipos_d_diana) {
        this.tipos_d_diana = tipos_d_diana;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public Bar bar_con_mas_ptaje(){
        Bar b_mayor = null;
        int max_puntajes = 0;

        for (Bar bar : bares) {
            for (Diana d : bar.getDianas()) {
                int puntajes_actuales = d.getPuntajes().keySet().size();
                if (puntajes_actuales > max_puntajes) {
                    max_puntajes = puntajes_actuales;
                    b_mayor = bar;
                }
            }
        }

        return b_mayor;
    }

    public void agregarBar(Bar bar) {
        bares.add(bar);
    }

    public void agregartipos_d_diana(Tipo_diana tipo) {
        tipos_d_diana.add(tipo);
    }

    public void agregarBeneficio(Beneficio beneficio) {
        beneficios.add(beneficio);
    }
    
    public static void main(String[] args) {
        HashSet<String> bebidas = new HashSet<>();
        HashSet<String> comidas = new HashSet<>();
        HashSet<String> tragos = new HashSet<>();

        BeneficioBebida beneficioBebida = new BeneficioBebida("CreadorBeb", "PromoBeb", bebidas);
        BeneficioComida beneficioComida = new BeneficioComida("CreadorCom", "PromoCom", comidas);
        BeneficioTrago beneficioTrago = new BeneficioTrago("CreadorTr", "PromoTr", tragos);

        HashMap<Integer, Color> puntajes = new HashMap<>();
        puntajes.put(10, Color.AMARILLO);
        puntajes.put(5, Color.NEGRO);
        puntajes.put(0, Color.ROJO);

        Circular circular = new Circular("DianaCircular", "Avanzado", puntajes);
        Rectangular rectangular = new Rectangular("DianaRect", "Inicial", puntajes, 4, 6);

        HashSet<Diana> dianas = new HashSet<>();
        dianas.add(circular);
        dianas.add(rectangular);

        HashSet<Beneficio> beneficios = new HashSet<>();
        beneficios.add(beneficioBebida);
        beneficios.add(beneficioComida);
        beneficios.add(beneficioTrago);

        HashSet<BeneficioAcumulable> acumulables = new HashSet<>();
        acumulables.add(beneficioBebida);
        acumulables.add(beneficioComida);

        Bar bar = new Bar(dianas, 12, 15000, beneficios, acumulables);

        HashSet<Bar> bares = new HashSet<>();
        bares.add(bar);

        Sistema sistema = new Sistema(bares, null, beneficios);

        System.out.println("el bar tiene esta cant de beneficios no acumulables: "+bar.contarBeneficiosTragos());
        System.out.println("Area: "+circular.area());
        System.out.println("Area: "+rectangular.area());
        System.out.println(sistema.bar_con_mas_ptaje());
    }
}
