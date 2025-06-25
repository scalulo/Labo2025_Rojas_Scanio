package Modificadores.Aplicacion_Mascotas;

import Modificadores.Drones.Carga;

import java.util.ArrayList;
import java.util.Locale;

public class Aplicacion {
    ArrayList<Mascota> mascotas;

    public Aplicacion(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Aplicacion(){
        this.mascotas=new ArrayList<>();
    }
    public void eliminar(Mascota mascota){
        mascotas.remove(mascota);
    }

    public void agregar(Mascota mascota){
        for(Mascota m:mascotas) {
            if(m.getNombre()==mascota.getNombre()){
                System.out.println("Ese nombre ya existe");
                break;
        }
            }
        mascotas.add(mascota);
    }

    public void modificar(Mascota nueva, Mascota vieja){
        mascotas.remove(vieja);
        mascotas.add(nueva);
    }

    public void saludar(Dueño dueño, String mascota){

        for(Mascota m:mascotas){

            if(m.getNombre()==mascota){
                m.saludo(dueño);
            }

            if(m.getClass().equals(Pez.class) && ((Pez) m).getVidas_actuales()==0){
                mascotas.remove(m);

            }

        }





    }

    public void alimentarlo(){
        for(Mascota m:mascotas){
            m.alimentar();
        }
    }




    public static void main(String[] args) {
        Aplicacion aplicacion1=new Aplicacion();
        Perro perro1=new Perro();
        Pajaro pajaro1=new Pajaro();
        Gato gato1=new Gato();
        Cantor cantor1=new Cantor();
        Dueño dueño1=new Dueño();

        aplicacion1.modificar(perro1, pajaro1);
        aplicacion1.agregar(gato1);
        aplicacion1.eliminar(gato1);
        aplicacion1.agregar(cantor1);

        aplicacion1.saludar(dueño1, "Ernesto");
        aplicacion1.alimentarlo();
    }
}
