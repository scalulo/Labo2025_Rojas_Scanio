package Modificadores.Aplicacion_Mascotas;

public abstract class Mascota {
    private String nombre;
    private Dueño dueño;

    public Mascota(){
        this.nombre="Chocolate";
        this.dueño=new Dueño();
    }
    public Mascota(String nombre, Dueño dueño){
        this.nombre=nombre;
        this.dueño=dueño;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    abstract void saludo(Dueño dueño);
    abstract void alimentar();

}
