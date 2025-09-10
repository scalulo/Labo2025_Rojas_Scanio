package objetos;

public class Clothing implements Comparable<Clothing> {

    private String itemName;
    private double cost;
    private char measurement = 's';
    private final double baseTax = 1.2;
    private final int minCost = 10;

    public Clothing(String itemName, double cost, char measurement) {
        this.itemName = itemName;
        this.cost = cost;
        this.measurement = measurement;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCost() {
        cost = cost * baseTax;
        return cost;
    }

    public void setCost(double cost) {
        if (cost < minCost) {
            cost = minCost;
        }
        this.cost = cost;
    }

    public char getMeasurement() {
        return measurement;
    }

    public void setMeasurement(char measurement) {
        this.measurement = measurement;
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Clothing other) {
        return this.itemName.compareTo(other.itemName);
    }
}
