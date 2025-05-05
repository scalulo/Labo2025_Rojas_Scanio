
package EjerciciosCurso.HCM;

public class Empleado {
    private String nombreEmpleado;
    private String areaTrabajo;

    public Empleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.areaTrabajo = areaTrabajo;
    }

    public Empleado() {
        this.nombreEmpleado = "Francisco";
        this.areaTrabajo = "RobCo";
    }

    public String obtenerNombre() {
        return nombreEmpleado;
    }

    public void asignarNombre(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String obtenerAreaTrabajo() {
        return areaTrabajo;
    }

    public void asignarAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
}
