package Ejercicios;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String size;
    private ArrayList <Clothing> items = new ArrayList<>();

    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement){
        switch (measurement){
            case 1,2,3 :
                setSize("S");
                break;
            case 4,5,6 :
                setSize("M");
                break;
            case 7,8,9 :
                setSize("L");
                break;
            default:
                setSize("X");
                break;
        }
    }

    public void addItems(ArrayList <Clothing> cositas){
        this.items = cositas;
    }

    public ArrayList <Clothing> returnArray(){
        return items;
    }

    public double getTotalClothingCost(){
        double total = 0;
        for (Clothing ropa : items){
            if (size.equals(ropa.getSize())){
                total += ropa.getPrice();
                System.out.println(ropa.getDescription() + ", " + ropa.getSize() + ", " + ropa.getPrice());
            }
            if (total > 15.0){break;}
        }
        return total;
    }
}
