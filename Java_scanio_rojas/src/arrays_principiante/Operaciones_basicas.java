package arrays_principiante;

import Unidad1.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones_basicas {

    public static int sumar(ArrayList<Integer> numeros){
        Integer suma =0;
        for(Integer numero : numeros){
        suma+=numero;
        }
        return suma;
    }

    public static String filtro(ArrayList<String> palabras){
        char l= 'L';
        for(String palabra : palabras){
            char primerCaracter = palabra.charAt(0);
            if(primerCaracter==l){
                return palabra;
            }
        }
        return "No empieza con L";
    }



    public static Persona treinta(ArrayList<Persona> personas){
    for(Persona persona : personas){
        if(persona.getEdad()>30){
            return persona;
        }
    }
    return null;
    }

    public static void main(String[] args) {


        ArrayList<Integer> numeros= new ArrayList<Integer>();
        ArrayList<String> palabras= new ArrayList<String>();
        ArrayList<Persona> personas= new ArrayList<Persona>();

        palabras.add("Pepo");
        palabras.add("Esca");
        palabras.add("Lulo");

        numeros.add(2);
        numeros.add(3);
        numeros.add(1);




        System.out.println(Operaciones_basicas.sumar(numeros));
        System.out.println(Operaciones_basicas.filtro(palabras));
        Operaciones_basicas.treinta(personas).mostrar();
        Persona p = Operaciones_basicas.treinta(personas);
        p.getNombre();
        p.mostrar();





    }
}
