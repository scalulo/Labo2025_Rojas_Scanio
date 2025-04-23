package arrays_principiante;

import Unidad1.Cancion;
import Unidad1.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    String nombre;
    String apellido;
    Fecha fecha;
    private ArrayList<Integer> notas;
    ;

    public Alumno() {
        this.nombre = "Luciano";
        this.apellido = "Rojas";
        this.fecha = new Fecha(9, 9, 2007);

        notas = new ArrayList<>();
        notas.add(10);

    }

    public Alumno(String nombre, String apellido, Fecha fecha, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.notas = notas;
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

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public void agregarnota(int nueva){
        notas.add(nueva);


    }

    public int menornota(){
        int menor=notas.getFirst();

        for(int i=0;i<notas.size();i++){
            if(notas.get(i)<menor)
             menor=notas.get(i);

        }
        return menor;

    }
    public int mayornota(){
        int mayor=notas.getFirst();
        for(int i=0;i<notas.size();i++){
            if(notas.get(i)>mayor)
                mayor=notas.get(i);

        }
        return mayor;
    }

    public void agregar(Materia materia, Alumno a3){
        materia.getLista_alumnnos().add(a3);
    }



    public static void main(String[] args) {
        Alumno a1 = new Alumno();

        ArrayList<Integer>notas;
        notas=new ArrayList<>();
        notas.add(10);
        notas.add(8);
        notas.add(7);
        Alumno a3= new Alumno("pepo", "de santis", new Fecha(4,5,2008),notas);

        a3.agregar(new Materia(), a3);
        a1.agregarnota(10);
        a1.agregarnota(8);
        System.out.println(a1.menornota());
        System.out.println(a1.mayornota());
    }
}