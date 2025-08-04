package Hashs.Vacunatorio;

import java.util.HashSet;

public class Ciudadano {

    private int dni;
    private String nombre;
    private String apellido;
    private Provincias provincia;
    private String domicilio;
    private String mail;
    private HashSet<Vacuna> historial;

    public Ciudadano(int dni, String nombre, String apellido, Provincias provincia, String domicilio, String mail, HashSet<Vacuna> historial) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.domicilio = domicilio;
        this.mail = mail;
        this.historial=historial;

    }
    public Ciudadano() {
        this.dni = 22312567;
        this.nombre = "Juan";
        this.apellido = "Baquero";
        this.provincia = Provincias.CABA;
        this.domicilio = "cuenca al dosmil";
        this.mail = "juanpibaquerololgmail";
        this.historial=new HashSet<>();
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public Provincias getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincias provincia) {
        this.provincia = provincia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getHistorial() {
        return historial;
    }

    public void setHistorial(HashSet<Vacuna> historial) {
        this.historial = historial;
    }

    public void mostrar_historial(){
        
        System.out.println("Vacunas del ciudadano: ");
        for(Vacuna v: historial){
            System.out.println(v);
        }
    }
    public void mostrar_datos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
    }

}
