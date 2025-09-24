package Repaso_Unidad7_8;

import java.util.HashMap;
import java.util.HashSet;

public class Intermedio extends Participante{

    private HashMap<String,Integer> stock;



    public void setStock(HashMap<String, Integer> stock) {
        this.stock = stock;
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public Intermedio(String nombre, HashMap<String, Integer> stock) {
        super(nombre);
        this.stock = stock;
    }

    @Override
    public void preparar_lugar() {

    }
}
