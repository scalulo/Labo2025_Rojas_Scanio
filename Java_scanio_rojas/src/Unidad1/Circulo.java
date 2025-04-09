package Unidad1;

public class Circulo {
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

    public double area() {
        double a;
        a = 3.14 * (radio * radio);
        return  a;

    }
    public double perimetro(){
        double p;
        p=2*3.14*radio;
        return p;
    }


    public static void main(String[] args) {
        int radio=5;
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(radio);

        System.out.println("Radio de c1: " + c1.getRadio());
        System.out.println("Área de c1: " + c1.area());
        System.out.println("Perímetro de c1: " + c1.perimetro());

        System.out.println("Radio de c2: " + c2.getRadio());
        System.out.println("Área de c2: " + c2.area());
        System.out.println("Perímetro de c2: " + c2.perimetro());
    }

}