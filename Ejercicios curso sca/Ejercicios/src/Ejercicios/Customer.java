package Ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person {
    private String size;
    private ArrayList<Clothing> items;

    public Customer(int dni, int age, LocalDate birthDate, String name, String size, ArrayList<Clothing> items) {
        super(dni, age, name, birthDate);
        this.size = size;
        this.items = items;
    }

    public Customer() {
        super(100101010, 18, "juan", LocalDate.now());
        this.size = "M";
        this.items = new ArrayList<>();
    }

    public Customer(String name, String size) {
        super();
        setName(name);
        this.size = size;
        this.items = new ArrayList<>();
    }

    public Customer(String size, ArrayList<Clothing> items) {
        super();
        this.size = size;
        this.items = items;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                size = "S";
                break;
            case 4, 5, 6:
                size = "M";
                break;
            case 7, 8, 9:
                size = "L";
                break;
            default:
                size = "X";
        }
    }

    public void addItems(ArrayList<Clothing> cositas) {
        items = cositas;
    }

    public ArrayList<Clothing> returnArray() {
        return items;
    }

    public ArrayList<Clothing> getItems() {
        return items;
    }

    public void setItems(ArrayList<Clothing> items) {
        this.items = items;
    }

    public double getTotalClothingCost() {
        double total = 0.0;

        for (Clothing item : items) {
            if (getSize().equals(item.getSize())) {
                System.out.println("Items datos: " + item.getDescription() + " " + item.getPrice() + " " + item.getSize());
                total = total + item.getPrice();
            }
        }
        return total;
    }

    public double getAverageClothingCost() {
        double average = 0.0;
        int quantity = 0;
        double result = 0.0;

        for (Clothing item : items) {
            if (getSize().equals(item.getSize())) {
                System.out.println("Items datos: " + item.getDescription() + " " + item.getPrice() + " " + item.getSize());
                average = average + item.getPrice();
                quantity = quantity + 1;
            }
        }
        try {
            result = average / quantity;
        } catch (ArithmeticException e) {
            System.out.println("no dividas por cero");
        }
        return result;
    }

    public static void main(String[] args) {
        // Main method para testing si es necesario
    }
}