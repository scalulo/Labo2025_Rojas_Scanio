package EjerciciosCurso.DukeChoice;

public class Clothing {
    private String description;
    private double price;
    private double minPrice = 10.0;
    private double tax = 1.2;
    private String size = "M";

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * tax;
    }

    public void setPrice(double price) {
        if (price > minPrice){
            this.price = price;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
