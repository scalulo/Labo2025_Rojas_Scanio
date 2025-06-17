package Herencia.Flota_vehiculos;

import Herencia.Flota_vehiculos.Vehiculos.Auto;
import Herencia.Flota_vehiculos.Vehiculos.Camioneta;
import Unidad1.Enums.Cant_ruedas;
import Unidad1.Enums.Color;
import Unidad1.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo> vehiculos;

public Empresa()
{
    this.vehiculos=new ArrayList<>();
}

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void mayor_cantidad (){
    int aux_a = 0;
    int aux_c=0;
    int aux_b=0;

    for (Vehiculo v: vehiculos){
        if(v.getClass()== Auto.class){
            aux_a++;
        } else if (v.getClass()== Camioneta.class) {
            aux_c++;
        }
        else {
            aux_b++;
        }
    }
        if (aux_a>aux_b && aux_a>aux_c){
            System.out.println("Esta empresa posee mas autos que otros vehiculos");
        } else if (aux_b>aux_a && aux_b>aux_c) {
            System.out.println("Esta empresa posee mas bicicletas que otros vehiculos");
        }
        else{
            System.out.println("Esta empresa posee mas camionetas que otros vehiculos");
        }
        return;
    }

    public void porcentaje() {
        double aux_a = 0;
        for (Vehiculo v : vehiculos) {
            if (v.getClass() == Auto.class) {
                aux_a++;
            }
        }
        double porcentaje=(aux_a / getVehiculos().size()) * 100;
        System.out.println("el porcentaje de autos es del " + porcentaje + "%");
    }

    public static void main(String[] args) {
        Empresa e1=new Empresa();
        Camioneta c1=new Camioneta("Volkswagen","Amarok", Color.ROJO,250,Cant_ruedas.CUATRO, LocalDate.now(),"fji 344",100,0);
        e1.getVehiculos().add(c1);
        Auto a1=new Auto("Chevrolet", "Astra", Color.AZUL, 200, Cant_ruedas.CUATRO,LocalDate.of(2007,3,5),"fji 344",false);
        e1.getVehiculos().add(a1);
        e1.mayor_cantidad();
        e1.porcentaje();
}
}
