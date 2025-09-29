package Repaso_Unidad7_8.EJ1;

import Repaso_Unidad7_8.EJ1.Expeciones.ErrorCocina;
import Repaso_Unidad7_8.EJ1.Expeciones.ErrorServir;
import Repaso_Unidad7_8.EJ1.Interfaces.PlatoPrincipal;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante implements PlatoPrincipal {

    private HashMap<String,Integer> stock;



    public void setStock(HashMap<String, Integer> stock) {
        this.stock = stock;
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public Intermedio(String nombre, String apellido, LocalDate f, String l, Color c, HashMap<String, Integer> stock) {
        super(nombre,apellido,f,l,c);
        this.stock = stock;
    }
    public Intermedio(){
        super();
        this.stock=new HashMap<>();
    }
    public void mostrar_ingredientes(){

        for(Map.Entry<String,Integer> entrada : stock.entrySet()){
            if (entrada.getValue() > 1) {
                System.out.println(entrada.getKey());
            }
        }
    }

    public boolean puedo(Plato p) {
        for (Map.Entry<String, Integer> entrada : p.getIngredientes().entrySet()) {
            if (stock.containsKey(entrada.getKey()) && stock.get(entrada.getKey()) > entrada.getValue()) {

            }
            else {
                return false;
            }
        }
        return true;
    }

    public void restar_stock(Plato p){

    }

    @Override
    public void preparar_lugar() {
        System.out.println("Mi stock a utilizar es de....");
        mostrar_ingredientes();
    }


    @Override
    public void cocinar(Principal p) throws ErrorCocina {


        if(puedo(p)==false){
            throw new ErrorCocina("El plato tiene un ingrediente que el participante no tiene");
        }
        else{
            System.out.println("Plato cocinado");

            restar_stock(p);
        }
    }


    @Override
    public void servir(Principal p) throws ErrorServir {

            System.out.println("Plato servido");

    }
}
