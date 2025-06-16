package Modificadores.Recetas;

import java.util.ArrayList;

public class Entrada extends Receta {
    private Temperatura temperatura;


    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, Temperatura temperatura) {
        super(nombre, dificultad, pasos);
        this.temperatura = temperatura;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    void mostrar_pasos() {
        int n = 1;
        if (temperatura.equals(Temperatura.FRIA)) {


            for (String p : getPasos()) {

                System.out.println("Paso numero" + n + ":" + p);
                n++;
            }
            System.out.println("Guarda el postre en la heladera");
        }
        else{

            System.out.println("Recuerda encender el horno");
            for (String p : getPasos()) {

                System.out.println("Paso numero" + n + ":" + p);
                n++;
            }
        }
    }

    public boolean sosEntrada() {
        return true;
    }

    @Override
    boolean esDelTipo(Receta r) {
        return r.sosEntrada();
    }
}


