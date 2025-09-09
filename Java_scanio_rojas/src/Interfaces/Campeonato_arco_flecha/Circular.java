package Interfaces.Campeonato_arco_flecha;

import java.util.HashMap;

public class Circular extends Diana{
        private static int radio =13;

    public Circular(String nombre, String nivel, HashMap<Integer, Color> puntajes) {
        super(nombre, nivel, puntajes);
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        Circular.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }
}
