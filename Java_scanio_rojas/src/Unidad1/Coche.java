package Unidad1;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche() {
        this.marca = "Peugeot";
        this.modelo = "GTI";
        this.color = "Blanco";
        this.velocidad=80;
    }

    public Coche(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad=velocidad;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int acelererar(){
        velocidad
    }

    public static void main(String[] args) {
        String marca = "Toyota";
        String modelo = "Hilux";
        String color = "Negro";
        int velocidad=90;

        Coche c1 = new Coche();
        Coche c2 = new Coche(marca, modelo, color,velocidad);

        System.out.println("Marca de c1: " + c1.getMarca());
        System.out.println("Modelo de c1: " + c1.getModelo());
        System.out.println("Color de c1: " + c1.getColor());
        System.out.println("Velocidad de c1" + c1.getVelocidad());

        System.out.println("Marca de c2: " + c2.getMarca());
        System.out.println("Modelo de c2: " + c2.getModelo());
        System.out.println("Marca de c2: " + c2.getColor());
        System.out.println("Velocidad de c2" + c2.getVelocidad());

    }
}