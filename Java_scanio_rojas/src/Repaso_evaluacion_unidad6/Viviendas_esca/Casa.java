package Repaso_evaluacion_unidad6.Viviendas_esca;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public class Casa extends Vivienda{
    private int m_desc;
    private int m_cub;
    private static int precio=100;

    public Casa(String direccion, Dueño dueño, int cp, HashMap<Integer, HashMap<Month, Integer>> consumo, int m_desc, int m_cub) {
        super(direccion, dueño, cp, consumo);
        this.m_desc = m_desc;
        this.m_cub = m_cub;
    }

    public int getM_desc() {
        return m_desc;
    }

    public void setM_desc(int m_desc) {
        this.m_desc = m_desc;
    }

    public int getM_cub() {
        return m_cub;
    }

    public void setM_cub(int m_cub) {
        this.m_cub = m_cub;
    }

    public static int getPrecio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        Casa.precio = precio;
    }

    @Override
    public int get_precio() {
        return precio;
    }
}
