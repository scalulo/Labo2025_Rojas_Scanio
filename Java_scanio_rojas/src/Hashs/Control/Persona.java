package Hashs.Control;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private HashMap<LocalDate, Registro> historial;

    public Persona(){
        this.nombre="Messi";
        this.apellido="ROnaldo";
        this.nacimiento=LocalDate.now();
        this.historial=new HashMap<>();
    }

    public Persona(String nombre, String apellido, LocalDate nacimiento, HashMap<LocalDate, Registro> historial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.historial = historial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public HashMap<LocalDate, Registro> getHistorial() {
        return historial;
    }

    public void setHistorial(HashMap<LocalDate, Registro> historial) {
        this.historial = historial;
    }

    public boolean comprobacion(LocalDate comprobar){
        if(historial.containsKey(comprobar)){
            return true;
        }
        else{
            return false;
        }
    }

    public void fecha_particular(LocalDate fecha){
        if(comprobacion(fecha)){
            historial.get(fecha).mostrar();
        }
       else{
            System.out.println("NO hay registro en esa fecha");
        }

    }

    public void promedio(){
        float promedio_peso=0;
        float promedio_altura=0;
        float contador=0;


        for(LocalDate f: historial.keySet()){
            if(f.isAfter(LocalDate.of(2024,8,11))){
                promedio_altura+=historial.get(f).getAltura();
                promedio_peso+=historial.get(f).getPeso();
                contador++;
            }
        }
        System.out.println("Promedio altura durante el ultimo año: "+promedio_altura/contador);
        System.out.println("Promedio peso durante el ultimo año: "+promedio_peso/contador);



    }

    public void crecimiento(LocalDate primera, LocalDate ultima){



        if(comprobacion(primera) && comprobacion(ultima)){

            double altura1=historial.get(primera).getAltura();
            double altura2=historial.get(ultima).getAltura();
            double peso1=historial.get(primera).getPeso();
            double peso2=historial.get(ultima).getPeso();

            System.out.println("Porcentaje de altura"+((altura1-altura2)/altura1)/100);
            System.out.println("Porcentaje de peso"+((peso1-peso2)/peso1)/100);
        }
        else{
            System.out.println("Alguna de esas fechas no tiene registro");
        }

    }


    public static void main(String[] args) {
        Persona p1=new Persona();
        Registro r1=new Registro();
        Registro r2=new Registro(120,185);

        p1.fecha_particular(LocalDate.now());
        p1.promedio();
        p1.crecimiento(LocalDate.now(),LocalDate.of(2025,7,10));
    }
}
