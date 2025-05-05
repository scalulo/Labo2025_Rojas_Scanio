package EjerciciosCurso.DukeChoice;

import java.util.ArrayList;

public class Customer {
    private String nombre;
    private String talle;
    private ArrayList <Clothing> items = new ArrayList<>();

    public Customer(String nombre, String talle) {
        this.nombre = nombre;
        this.talle = talle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getTalle() {
        return talle;
    }

    public void settALLE(String talle) {
        this.talle = talle;
    }

    public void setTalle(int measurement){
        switch (measurement){
            case 1,2,3 :
                setTalle("S");
                break;
            case 4,5,6 :
                setTalle("M");
                break;
            case 7,8,9 :
                setTalle("L");
                break;
            default:
                setTalle("X");
                break;
        }
    }

    public void addItems(ArrayList <Clothing> cosas){
        this.items = cosas;
    }

    public ArrayList <Clothing> returnArray(){
        return items;
    }

    public double getTotalClothingCost(){
        double total = 0;
        for (Clothing ropa : items){
            if (size.equals(ropa.getTalle())){
                total += ropa.getPrecio();
                System.out.println(ropa.getDescription() + ", " + ropa.getTalle() + ", " + ropa.getPrecio());
            }
            if (total > 15.0){break;}
        }
        return total;
    }
}
