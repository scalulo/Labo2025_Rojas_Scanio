package Repaso_evaluacion_unidad6.Electricidad_viviendas;

public class Dueño {
        private String nombre;
        private String apellido;
        private int dni;

        public Dueño(){
            this.nombre="Luataro";
            this.apellido="Messi";
            this.dni=2343243;
        }

    public Dueño(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
