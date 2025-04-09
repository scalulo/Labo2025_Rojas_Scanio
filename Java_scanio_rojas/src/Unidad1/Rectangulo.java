package Unidad1;

public class Rectangulo {
    private double base;
    private double altura;

   public Rectangulo(){
       this.base=5;
       this.altura=2;
   }
   public Rectangulo(double base, double altura){
       this.base=base;
       this.altura=altura;
   }

    public double getBase() {
        return base;
    }
    public double getAltura(){
       return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double Area (){
        double area= base*altura;
        return area;
    }
    public double Perimetro () {
        double perimetro= 2*(base+altura);
        return perimetro;
    }

    public static void main(String[] args) {
       double base=4.5;
       double altura=3;
       Rectangulo r1= new Rectangulo();
       Rectangulo r3= new Rectangulo();
       Rectangulo r4= new Rectangulo();
       Rectangulo r5= new Rectangulo();
       Rectangulo r6= new Rectangulo();
       Rectangulo r7= new Rectangulo();
       Rectangulo r8= new Rectangulo();
       Rectangulo r2= new Rectangulo(base, altura);


        System.out.println("Radio de c1: " + r1.getAltura());
        System.out.println("Área de c1: " + r1.Area());
        System.out.println("Perímetro de c1: " + r1.Perimetro());

        System.out.println("Radio de c2: " + r2.getAltura());
        System.out.println("Área de c2: " + r2.Area());
        System.out.println("Perímetro de c2: " + r2.Perimetro());    }
}
