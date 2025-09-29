package Repaso_Unidad7_8;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Intermedio extends Participante implements Cocinar,Servir{

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
    public boolean debo(Plato p){
        if(p.getClass().equals(Principal.class)){
            return true;
        }
        return false;
    }
    public boolean puedo(Plato p) {
        int estado = 0;
        for (Map.Entry<String, Integer> entrada : p.getIngredientes().entrySet()) {
            if (stock.containsKey(entrada.getKey()) && stock.get(entrada.getKey()) > entrada.getValue()) {

            } else {
                estado++;
            }
        }

            if (estado > 0) {
                return false;
            }
            else {
                return true;
            }

    }

    @Override
    public void preparar_lugar() {
        System.out.println("Mi stock a utilizar es de :");
        mostrar_ingredientes();
    }


    @Override
    public void Cocinar(Plato p) throws ErrorCocina {

        if(debo(p)==false){
            throw new ErrorCocina("El plato no es principal");
        }
        else if(puedo(p)==false){
            throw new ErrorCocina("El plato tiene un ingrediente que el participante no tiene");
        }
        else{
            System.out.println("Plato cocinado");

            //deberia restarle 1 a cada ingrediente del stock
        }
    }


    @Override
    public void servir(Plato p) throws ErrorServir {
        if(debo(p)){
            System.out.println("Plato servido");
        }
        else{
            throw new ErrorServir("El plato no es principal");
        }
    }
}
