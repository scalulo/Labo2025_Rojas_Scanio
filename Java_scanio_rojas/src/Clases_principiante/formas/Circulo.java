package Clases_principiante.formas;

public class Circulo extends FiguraGeometrica {
    private int radio;


    public Circulo() {
        this.radio = 2;
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi=Math.PI;          //en vez de poner pi pongo esto que es como acceder a una clase que tiene pi
        double area;
        area = pi * (radio * radio);
        return  area;

    }
    @Override
    public double calcularPerimetro(){
        double p;
        p=2*3.14*radio;
        return p;
    }


    public static void main(String[] args) {
        int radio=5;
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(radio);

        System.out.println("Radio de c1: " + c1.getRadio());
        System.out.println("Área de c1: " + c1.calcularArea());
        System.out.println("Perímetro de c1: " + c1.calcularPerimetro());

        System.out.println("Radio de c2: " + c2.getRadio());
        System.out.println("Área de c2: " + c2.calcularArea());
        System.out.println("Perímetro de c2: " + c2.calcularPerimetro());
    }

}