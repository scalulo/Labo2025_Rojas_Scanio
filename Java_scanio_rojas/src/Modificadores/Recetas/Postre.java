package Modificadores.Recetas;

import java.util.ArrayList;

public class Postre extends Receta {
    private boolean diabeticos;
    double temperatura_horno;

    public Postre(String nombre, Dificultad dificultad, ArrayList<String> pasos, boolean diabeticos, double temperatura_horno) {
        super(nombre, dificultad, pasos);
        this.diabeticos = diabeticos;
        this.temperatura_horno = temperatura_horno;
    }


    public boolean isDiabeticos() {
        return diabeticos;
    }

    public void setDiabeticos(boolean diabeticos) {
        this.diabeticos = diabeticos;
    }

    public double getTemperatura_horno() {
        return temperatura_horno;
    }

    public void setTemperatura_horno(double temperatura_horno) {
        this.temperatura_horno = temperatura_horno;
    }

    @Override
    void mostrar_pasos() {

            int n=1;
            for(String p:getPasos()){

                System.out.println("Paso numero"+n+":"+p);
                System.out.println("Recuerda mantener la cocina limpia y el horno al minimo");
                n++;
        }
    }
}
