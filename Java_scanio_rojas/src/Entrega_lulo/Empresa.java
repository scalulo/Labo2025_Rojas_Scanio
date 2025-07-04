package Entrega_lulo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> productos;
    private String domicilio;
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.productos = new ArrayList<>();
        this.domicilio = "Constituyentes 2334";
        this.nombre = "Nike";
        this.empleados = new ArrayList<>();
    }

    public Empresa(ArrayList<Producto> productos, String domicilio, String nombre, ArrayList<Empleado> empleados) {
        this.productos = productos;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int calcular() {
        int contador = 0;
        for (Empleado e : empleados) {
            long meses = ChronoUnit.MONTHS.between(e.getFecha_ingreso(), LocalDate.now());
            contador += meses / 6;
        }
        return contador;

    }

    public int salarios() {
        int contador = 0;
        for (Empleado e : empleados) {
            contador += e.getSalario();

        }
        return contador;
    }

    public ArrayList<Empleado> mayores_60(){
        ArrayList<Empleado> mayores=new ArrayList<>();
        for(Empleado emp:empleados){
            if(emp.edad()>60){
                mayores.add(emp);
            }
        }
        return mayores;
    }


}
