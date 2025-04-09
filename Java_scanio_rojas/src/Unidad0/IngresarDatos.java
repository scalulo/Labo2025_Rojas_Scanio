package Unidad0;

public class IngresarDatos {
    public static void main(String[] args) {
        int N;
        double A;
        char C;
        N=5;
        A=4.325234;
        C='p';

        System.out.println("la suma de n+a es: "+N+A);
        System.out.println("la diferencia entre a y n es: " + (A-N));

        int ascii = (int) C;
        System.out.println("El valor ASCII de '" + C + "' es: " + ascii);
    }
}
