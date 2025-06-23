package Ejercicios;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        ArrayList<Clothing> items = new ArrayList<>();

        System.out.println("Welcome to Duke Choice Shopp!");

        Customer c1 = new Customer("Pinky","S");
        System.out.println("Hello " + c1.getName());

        // ULTIMO EJERCICIO HECHO
        System.out.println("The minimum price value of the Clothing obj. is: " + Clothing.minPrice);
        // ULTIMO EJERCICIO HECHO


        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt",10.5,"S");
        Clothing item3 = new Clothing("Green Scarf",5.0,"S");
        Clothing item4 = new Clothing("Blue T-Shirt",10.5,"S");

        //System.out.println(item1.getDescription() + ", " + item1.getSize() + ", " + item1.getPrice());
        //System.out.println(item2.getDescription() + ", " + item2.getSize() + ", " + item2.getPrice());

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        // ULTIMO EJERCICIO HECHO
        for (Clothing c : items){
            System.out.println(c);
        }
        // ULTIMO EJERCICIO HECHO

        c1.addItems(items);
        c1.getTotalClothingCost();

        c1.setSize(3);
        System.out.println(c1.getSize());
    }
}

