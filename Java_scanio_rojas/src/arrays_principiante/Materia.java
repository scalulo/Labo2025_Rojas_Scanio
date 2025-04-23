package arrays_principiante;

import Unidad1.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> contenidos;
    private ArrayList<Alumno> lista_alumnnos;

    public Materia(){
        this.nombre="lengua";
        lista_alumnnos=new ArrayList<>();
        contenidos=new ArrayList<>();
        contenidos.add("analisis sintactico");
        contenidos.add("literatura");
        lista_alumnnos.add(new Alumno());
        ArrayList<Integer>notas;
        notas=new ArrayList<>();
        notas.add(10);
        notas.add(8);
        notas.add(7);
        lista_alumnnos.add(new Alumno("lautaro","scanio",new Fecha(4,8,2007),notas));
    }

    public Materia(String nombre, ArrayList<String> contenidos, ArrayList<Alumno> lista_alumnnos) {
        this.nombre = nombre;
        this.contenidos = contenidos;
        this.lista_alumnnos = lista_alumnnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }

    public ArrayList<Alumno> getLista_alumnnos() {
        return lista_alumnnos;
    }

    public void setLista_alumnnos(ArrayList<Alumno> lista_alumnnos) {
        this.lista_alumnnos = lista_alumnnos;
    }


    public double promedioEdad( ){
        int anioActual = LocalDate.now().getYear();
        int suma=0;

        for (Alumno alumno: this.getLista_alumnnos()){
            int edad=alumno.getFecha().getAnio()-anioActual;
            suma+=edad;
        }
        return suma/(this.getLista_alumnnos().size());
    }

    public double promedioNotas() {
        int suma = 0;
        int cantidadNotas = 0;

        for (Alumno alumno : lista_alumnnos) {
            for (int nota : alumno.getNotas()) {
                suma += nota;
                cantidadNotas++;
            }
        }


        return suma / cantidadNotas;
    }




    public static void main(String[] args) {
        Materia lengua= new Materia();
        System.out.println("Promedio de edad: " + lengua.promedioEdad());
        System.out.println("Promedio de notas: " + lengua.promedioNotas());

    }


}
