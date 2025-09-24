package Repaso_evaluacion_unidad6.Viviendas_esca;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public class Dpto extends Vivienda {
    private int cant_am;
    private static int precio=50;

    public Dpto (String direccion, Dueño dueño, int cp, HashMap<Integer, HashMap<Month,Integer>> consumo, int cant_am){
        super(direccion,dueño,cp,consumo);
        this.cant_am=cant_am;
    }

    public int getCant_am() {
        return cant_am;
    }

    public void setCant_am(int cant_am) {
        this.cant_am = cant_am;
    }

    @Override
    public int get_precio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        Dpto.precio = precio;
    }
}
