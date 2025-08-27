package Repaso_evaluacion_unidad6.Electricidad_viviendas;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public class Departamento extends Vivienda {
    private int ambientes;
    private static  int precio=50;

    public Departamento(){
        super();
        this.ambientes=2;

    }

    public Departamento(String direccion, int codigo_postal, Dueño dueño, HashMap<Year, HashMap<Month, Integer>> almacenamiento, int ambientes) {
        super(direccion, codigo_postal, dueño, almacenamiento);
        this.ambientes = ambientes;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public static int getPrecio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        Departamento.precio = precio;
    }

    @Override
    Integer cuanto_pago(Integer consumido) {
        return consumido*precio;
    }
}


