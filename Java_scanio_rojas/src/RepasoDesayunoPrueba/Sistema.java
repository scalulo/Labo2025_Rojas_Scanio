package RepasoDesayunoPrueba;

import PoliRoyaleAusentesPruebaRepaso.Jugables;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

    private HashSet<Preparacion> todos;
    private HashMap<Vendible,Integer> historial;

    public Sistema( HashSet<Preparacion> todos,HashMap<Vendible,Integer> historial) {

        this.todos = todos;
        this.historial=historial;
    }
    public Sistema(){

        this.todos=new HashSet<>();
        this.historial=new HashMap<>();
    }



    public HashSet<Preparacion> getTodos() {
        return todos;
    }

    public void setTodos(HashSet<Preparacion> todos) {
        this.todos = todos;
    }

    public HashMap<Vendible, Integer> getHistorial() {
        return historial;
    }

    public void setHistorial(HashMap<Vendible, Integer> historial) {
        this.historial = historial;
    }

    public void registrar_venta(Vendible vendible,int cant) {

            try{
                vendible.actualizar_stock(cant);
                System.out.println("Venta cargada con exito");
                historial.putIfAbsent(vendible,0);
                historial.put(vendible,historial.get(vendible)+cant);
        } catch (StockInsuficiente e) {
                System.out.println(e.getMessage());
            }
    }

    public void nueva_preparacion(Preparacion preparacion) throws CantidadesInvalidas{
        for(Integer n:preparacion.getIngredientes().values()) {
            if (n < 0) {
                throw new CantidadesInvalidas("Ingrediente con cantidades invalidas");
            }
        }

                todos.add(preparacion);
                System.out.println("Se ha agregado correctamente la preparacion");
                try{
                    Vendible v=(Vendible) preparacion;
                    historial.put(v,0);
                    System.out.println("Se agrego a historial tambien");
                }catch (Exception e){

                }
            }



    public void reponer_preparacion(Preparacion preparacion,int stock_nuevo) throws ArithmeticException{
        if(stock_nuevo>0){
            preparacion.setStock(stock_nuevo+preparacion.getStock());
            System.out.println("El stock nuevo es de..."+preparacion.getStock());
        }
        else{
            throw new ArithmeticException("ingrediente con cantidades invalidas");
        }
    }

    public void productos_vendibles(){
        System.out.println("La cantidad de productos a la venta son: "+historial.size());
    }

}
