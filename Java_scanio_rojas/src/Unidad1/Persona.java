package Unidad1;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String apellido;

public Persona(){
    this.nombre="Luciano";
    this.edad=18;
    this.direccion="Griveo 3223";
}

    public Persona(String nombre, int edad, String direccion, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.apellido = apellido;
    }

    public String getNombre() {
    return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getDireccion(){
        return direccion;
    }



    public void setNombre (String nombre){
    this.nombre=nombre;
    }
    public void setEdad (int edad){
        this.edad=edad;
    }
    public void setDireccion (String direccion){
        this.nombre=direccion;
    }
    public void mostrar(){
        System.out.println("Su nombre es: " + getNombre());
        System.out.println("La edad es: " + getEdad());
        System.out.println("La direccion es: " + getDireccion());
    }

    public static void main(String[] args) {
        String nombre="luca";
        int edad=24;
        String direccion="Griveo 3223";

    }
}
