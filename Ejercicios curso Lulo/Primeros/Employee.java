package EjerciciosCurso.primeros
    ;

public class Employee {
    private String nombre;
    private String department;

    public Employee(String nombre) {
        this.nombre = nombre;
        this.department = department;
    }
    public Employee(){
        this.nombre = "Lulo";
        this.department = "labo";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
