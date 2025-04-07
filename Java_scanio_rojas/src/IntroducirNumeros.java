import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numerobase=0;
       int contador=0;

       while(numerobase!=-1){

           System.out.println("Ingrese numeros");
           numerobase=entrada.nextInt();
            contador++;
        }
        System.out.println("CANTIDAD DE NUMEROS INGRESADOS:" + (contador-1));
    }
}

