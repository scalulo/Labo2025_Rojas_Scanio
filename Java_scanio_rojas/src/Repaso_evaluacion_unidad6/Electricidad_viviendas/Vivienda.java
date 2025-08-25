package Repaso_evaluacion_unidad6.Electricidad_viviendas;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int codigo_postal;
    private Dueño dueño;
    private HashMap<Year,HashMap<Month,Integer>> almacenamiento;

    public Vivienda(){
        this.direccion="Baunes 2121";
        this.codigo_postal=2;
        this.dueño=new Dueño();
        this.almacenamiento=new HashMap<>();
    }

    public Vivienda(String direccion, int codigo_postal, Dueño dueño, HashMap<Year, HashMap<Month, Integer>> almacenamiento) {
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.dueño = dueño;
        this.almacenamiento = almacenamiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public HashMap<Year, HashMap<Month, Integer>> getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(HashMap<Year, HashMap<Month, Integer>> almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

        public void cargar(Integer consumido, Month mes, Year ano){

            if(almacenamiento.containsKey(ano) && almacenamiento.get(ano).containsKey(mes)){
                System.out.println("Ya esta cargado");
            }
            
        }
}
