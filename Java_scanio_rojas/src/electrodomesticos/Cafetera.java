package electrodomesticos;

public class Cafetera {
    private int max;
    private int actual;

    public Cafetera() {
        this.max=1000;
        this.actual=0;
    }
    public Cafetera(int max) {
        this.max=max;
        this.actual=max;
    }
    public Cafetera (int max, int actual){
        this.max=max;
        this.actual=actual;
        if(actual>max){
            this.actual=max;
        }
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int maxear(){
        setActual(this.max);
        return this.actual;
    }

    public int taza(int capacidad){
            setActual(this.actual-capacidad);
            return this.actual;

    }

    public int vaciar(){
        setActual(this.actual=0);
        return this.actual;

    }
    public int agregar(int cantidad){
        setActual(this.actual+cantidad);
        return this.actual;

    }

    public static void main(String[] args) {
        Cafetera c1= new Cafetera();
        Cafetera c2= new Cafetera(1000);
        Cafetera c3= new Cafetera(1000, 2000);
        System.out.println("cafetera maxeada: "+c1.maxear());
        System.out.println("cafetera despues de servir en taza: "+c1.taza(200));
        System.out.println("cafetera vacia: "+c2.vaciar());
        System.out.println("agregar cafe: "+c2.agregar(500));

    }
}

