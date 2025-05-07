package Repaso_prueba.Ej2;

import Repaso_prueba.Ej1.Pelicula;

import java.time.LocalDate;
import java.util.ArrayList;

public class BancoNacion {
    String direccion;
    boolean tieneSeguridad;
    boolean tieneRampa;

    private ArrayList<Empleado> empleados;


    public BancoNacion(){
        this.direccion="Constituyentes 2354";
        this.tieneSeguridad=true;
        this.tieneRampa=false;
        ArrayList<Empleado> empleados=new ArrayList<>();

    }

    public BancoNacion(String direccion, boolean tieneSeguridad, boolean tieneRampa) {
        this.direccion = direccion;
        this.tieneSeguridad = tieneSeguridad;
        this.tieneRampa = tieneRampa;
        this.empleados = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isTieneSeguridad() {
        return tieneSeguridad;
    }

    public void setTieneSeguridad(boolean tieneSeguridad) {
        this.tieneSeguridad = tieneSeguridad;
    }

    public boolean isTieneRampa() {
        return tieneRampa;
    }

    public void setTieneRampa(boolean tieneRampa) {
        this.tieneRampa = tieneRampa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregar(Empleado empleado){
        empleados.add(empleado);
}

    public int cantTrabajadores(){
        return empleados.size();
    }
    public Empleado empleado_antiguo(){
        Empleado antiguo=empleados.getFirst();
        LocalDate aux=empleados.getFirst().fecha_ingreso;
        for (Empleado e: empleados){
            if(e.fecha_ingreso.isBefore(aux)){
                aux=e.fecha_ingreso;
                antiguo=e;
            }
        }
        System.out.println("el empleado mas antiguo es: "+ antiguo.getNombre()+" "+antiguo.getApellido());
        return antiguo;
    }



    public static void main(String[] args) {
        Empleado p1 = new Empleado("Miguel", "Lopez", 32987990,
                LocalDate.of(1985, 10, 12), LocalDate.of(2020, 5, 8));
        Empleado p2 = new Empleado("Juana", "Gomez", 39987990,
                LocalDate.of(1986, 7, 28));
        Empleado p3 = new Empleado("Candela", "Navarro", 40987990,
                LocalDate.of(1993, 2, 4), LocalDate.of(2017, 5, 25));

        BancoNacion sucursalUrquiza = new BancoNacion("Av. Triunvirato 3450", true, false);
        BancoNacion sucursalPueyrredon = new BancoNacion("Cochrane 2874", true, true);

        ArrayList<BancoNacion> sucursales = new ArrayList<>();

        sucursales.add(sucursalUrquiza);
        sucursales.add(sucursalPueyrredon);

        sucursalUrquiza.agregar(p1);
        sucursalUrquiza.agregar(p3);
        sucursalPueyrredon.agregar(p2);
        sucursalPueyrredon.agregar(p1);
        System.out.println("cantidad de empleados de la sucursal: "+sucursalPueyrredon.cantTrabajadores());

        for (BancoNacion b : sucursales) {
            Empleado p = b.empleado_antiguo();
            System.out.println(p.getNombre() + " trabaja hace " + p.antiguedad() + " años");
        }
    }
}
