package Repaso_evaluacion_unidad6.Electricidad_viviendas;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public class Casa extends Vivienda{
    private String metros_cuadrados;
    private static  int precio=100;

    public Casa(){
        super();
        this.metros_cuadrados="20cm";


    }

    public Casa(String direccion, int codigo_postal, Dueño dueño, HashMap<Year, HashMap<Month, Integer>> almacenamiento, String metros_cuadrados) {
        super(direccion, codigo_postal, dueño, almacenamiento);
        this.metros_cuadrados = metros_cuadrados;
    }

    public String getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(String metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public static int getPrecio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        Casa.precio = precio;
    }
}
