package Herencia.Llamadas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Empleado> empleados;
    private ArrayList<Llamada> llamadas;

    public Sistema() {
        this.empleados = new ArrayList<Empleado>();
        this.llamadas = new ArrayList<Llamada>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }


    public void Llamadas_empleado(Empleado emp) {
        for (Llamada llam : llamadas) {
            if (llam.getOrigen() == emp || llam.getDestino() == emp) {
                emp.getLlamadas_emp().add(llam);
                System.out.println("nombre origen: " +llam.getOrigen().getNombre());
                System.out.println("nombre destino: " +llam.getDestino().getNombre());
                System.out.println("hora inicio: " +llam.getHora_inicio());
                System.out.println("hora fin: " +llam.getHora_fin());
            }
        }
    }

    public void ranking() {
        ArrayList<Empleado> empleadosOrdenados = new ArrayList<>();
        ArrayList<Duration> tiemposOrdenados = new ArrayList<>();

        for (Empleado emp : empleados) {
            Duration total_tiempo = Duration.ZERO;
            for (Llamada llam : emp.getLlamadas_emp()) {
                if (!llam.getDestino().getPais().equals(emp.getPais())) {
                    total_tiempo = total_tiempo.plus(llam.getDuracion());
                }
            }

            if (!total_tiempo.isZero()) {
                boolean agregado = false;
                for (int i = 0; i < tiemposOrdenados.size(); i++) {
                    if (total_tiempo.compareTo(tiemposOrdenados.get(i)) > 0) {
                        empleadosOrdenados.add(i, emp);
                        tiemposOrdenados.add(i, total_tiempo);
                        agregado = true;
                        break;
                    }
                }
                if (!agregado) {
                    empleadosOrdenados.add(emp);
                    tiemposOrdenados.add(total_tiempo);
                }
            }
        }

        System.out.println("Ranking de empleados por tiempo total de llamadas al exterior:");
            for(Empleado emp:empleadosOrdenados){
            System.out.println(emp.getNombre());
        }
    }

    public static void main(String[] args) {
        Sistema s1=new Sistema();
        Empleado e1=new Empleado();
        Empleado e2=new Empleado("negu","la jumpa",243244,1532422,"Argentina");
        Empleado e3=new Empleado("luca","la jumpa",243244,1532422,"Brasil");
        Llamada l1=new Llamada();
        Llamada l2=new Llamada(e2,e3, LocalTime.of(4,5,2),LocalTime.of(4,5,40),LocalDate.of(2025,4,2));
        Llamada l3=new Llamada(e1,e3, LocalTime.of(14,5,2),LocalTime.of(15,5,40),LocalDate.of(2025,4,2));
        s1.getEmpleados().add(e1);
        s1.getEmpleados().add(e2);
        s1.getEmpleados().add(e3);
        s1.getLlamadas().add(l1);
        s1.getLlamadas().add(l2);
        s1.getLlamadas().add(l3);
        s1.Llamadas_empleado(e1);
        s1.Llamadas_empleado(e2);
        s1.Llamadas_empleado(e3);
        s1.ranking();
    }
}






