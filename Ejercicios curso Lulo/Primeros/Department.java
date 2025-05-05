package EjerciciosCurso.primeros;

import java.util.ArrayList;

public class Department {
    private String nombre;
    private ArrayList <Employee> empleados;

    public Department(){
        this.nombre = "lulo";
        this.empleados = new ArrayList<>();
    }

    public Department(String nombre, ArrayList<Employee> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Employee> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Employee> empleados) {
        this.empleados = empleados;
    }

    public void mostrarEmpleados(){
        for (Employee empleado : empleados){
            System.out.println(empleado.getNombre());
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Department d1 = new Department();
        d1.empleados.add(e1);
        d1.mostrarEmpleados();
    }
}
