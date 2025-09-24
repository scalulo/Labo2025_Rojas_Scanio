package objetos;

import objetos.Clothing;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Persona {

    private char measurement;
    private ArrayList<Clothing> purchases;

    public void addPurchases(ArrayList<Clothing> somePurchases) {
        purchases = somePurchases;
    }

    public Customer(int dni, int edad, LocalDate fechaNacimiento, String nombre, char measurement, ArrayList<Clothing> purchases) {
        super(dni, edad, nombre, fechaNacimiento);
        this.measurement = measurement;
        this.purchases = purchases;
    }

    public Customer() {
        super(100101010, 18, "juan", LocalDate.now());
        this.measurement = measurement;
        this.purchases = new ArrayList<>();
    }

    public Customer(char measurement, ArrayList<Clothing> purchases) {
        this.measurement = measurement;
        this.purchases = purchases;
    }

    public double calculateTotalCost() {
        double total = 0.0;

        for (Clothing product : purchases) {
            if (getMeasurement() == product.getMeasurement()) {
                System.out.println("Datos producto: " + product.getItemName() + " " + product.getCost() + " " + product.getMeasurement());
                total += product.getCost();
            }
        }
        return total;
    }

    public double calculateAverageCost() {
        double sum = 0.0;
        int count = 0;
        double average = 0.0;

        for (Clothing product : purchases) {
            if (getMeasurement() == product.getMeasurement()) {
                System.out.println("Datos producto: " + product.getItemName() + " " + product.getCost() + " " + product.getMeasurement());
                sum += product.getCost();
                count++;
            }
        }
        try {
            average = sum / count;
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero");
        }
        return average;
    }

    public ArrayList<Clothing> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<Clothing> purchases) {
        this.purchases = purchases;
    }

    public char getMeasurement() {
        return measurement;
    }

    public void setMeasurement(char measurement) {
        this.measurement = measurement;
    }

    public void setMeasurement(int value) {
        switch (value) {
            case 1, 2, 3 -> measurement = 's';
            case 4, 5, 6 -> measurement = 'm';
            case 7, 8, 9 -> measurement = 'l';
            default -> measurement = 'x';
        }
    }

    public static void main(String[] args) {

    }
}
