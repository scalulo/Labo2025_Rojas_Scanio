package Repaso_evaluacion_unidad6.Viviendas_esca;

import Modificadores.Recetas.Principal;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private Dueño dueño;
    private int cp;
    private HashMap<Integer, HashMap<Month, Integer>> consumo;

    public Vivienda(String direccion, Dueño dueño, int cp, HashMap<Integer, HashMap<Month, Integer>> consumo) {
        this.direccion = direccion;
        this.dueño = dueño;
        this.cp = cp;
        this.consumo = consumo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public HashMap<Integer, HashMap<Month, Integer>> getConsumo() {
        return consumo;
    }

    public void setConsumo(HashMap<Integer, HashMap<Month, Integer>> consumo) {
        this.consumo = consumo;
    }

    public void cargar_consumo(LocalDate fecha, int con){
        if(consumo.containsKey(fecha.getYear()) && consumo.get(fecha.getYear()).containsKey(fecha.getMonth())) {
            System.out.println("ya esta cargado");
        }

        else if(consumo.containsKey(fecha.getYear()) && !consumo.get(fecha.getYear()).containsKey(fecha.getMonth())){
            consumo.get(fecha.getYear()).put(fecha.getMonth(),con);
        }
        else {
                HashMap<Month,Integer>c=new HashMap<>();
                c.put(fecha.getMonth(),con);
                consumo.put(fecha.getYear(),c);
        }
    }

    public abstract int get_precio();

    public int total(int año, Month mes){
        if (consumo.containsKey(año) && consumo.get(año).containsKey(mes)){
            return consumo.get(año).get(mes)*get_precio();
        }
        else {
            System.out.println("la fecha no esta cargada");
            return 0;
        }
    }

    public int aplicar_dto(Month mes, int año){
        if(consumo.containsKey(año) && consumo.get(año).containsKey(mes)){
            if ((consumo.get((año-1)).get(mes)*0.9)>(consumo.get(año).get(mes))){
                return (int) (total(año,mes)*0.95);
            }
        }
        return total(año,mes);

    }
}
