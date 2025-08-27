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

    abstract Integer cuanto_pago(Integer consumido);

    public boolean verificar(Integer consumido, Year ano, Month mes){
        if(almacenamiento.get(ano.minusYears(1)).get(mes)*0.9>=consumido){
            System.out.println("Recibe descuento");
            return true;

        }
        System.out.println("No recibe descuento");
        return false;

    }

    public void cargar(Integer consumido, Month mes, Year ano){

        almacenamiento.putIfAbsent(ano, new HashMap<>()); //si recien arranca el año y no esta cargado nada, pone el año
        if(almacenamiento.containsKey(ano) && almacenamiento.get(ano).containsKey(mes)){
            System.out.println("Ya esta cargado");
        }
        else {
            almacenamiento.get(ano).put(mes, consumido);  //busca el año y carga en ese mes
            System.out.println("Cargado con exito");
        }

    }
    public double calcular(Integer consumido, Month mes, Year ano) {
        double pagar=0;
        if (verificar(consumido, ano, mes)) {
            pagar=cuanto_pago(consumido)*0.95;
        }
        else{
            pagar=cuanto_pago(consumido);
        }
        return pagar;
    }

    public static void main(String[] args) {

        HashMap<Year, HashMap<Month, Integer>> almacenamiento = new HashMap<>();

        // Ejemplo: agregamos un valor para agosto de 2025
        Year ano = Year.of(2025);
        Year ano1 = Year.of(2024);
        Month mes = Month.AUGUST;
        almacenamiento.putIfAbsent(ano, new HashMap<>());
        almacenamiento.get(ano).put(mes, 1200);//le agrego algo al hashmap para comprobar perono hace falta


        Dueño dueño1 = new Dueño("Juan", "Pérez", 12345678);
        Dueño dueño2 = new Dueño("Ana", "Gómez", 87654321);

        Vivienda casa1 = new Casa("Calle Falsa 123", 1000, dueño1, almacenamiento, "30cm");
        Vivienda depto1 = new Departamento("Av. Siempreviva 456", 5000, dueño2,almacenamiento ,3);

        Month mes2=Month.JANUARY;

        casa1.cargar(10,mes,ano);  //verificar que ya habia algo cargado y no puedo cargarlo
        casa1.cargar(10,mes2,ano);
        casa1.cargar(20,mes2,ano);
        casa1.cargar(20,mes2,ano1);

        System.out.println(casa1.calcular(10,mes2,ano));
        System.out.println(casa1.calcular(30,mes2,ano));


    }


}
