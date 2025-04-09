package Unidad0;

import java.util.Scanner;

public class IntroducirNumerosAmpliado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numerobase=1;
        int contador=0;
        int sumanegativos=0;
        int sumapositivos=0;
        int sumatotal=0;
        int mayor=0;
        int aux=0;

        while(numerobase!=0){

            System.out.println("Ingrese un numero(si ingresa 0 termina)");
            numerobase=entrada.nextInt();

            sumatotal+=numerobase;

            if(numerobase<0){
                sumanegativos+=numerobase;
            }
            else if(numerobase>0){
                sumapositivos+=numerobase;
            }

            if(numerobase>=aux){
                mayor=numerobase;
                aux=numerobase;
            }








            contador++;
        }
        System.out.println("CANTIDAD DE NUMEROS INGRESADOS:" + (contador-1));
        System.out.println("SUMA TOTAL" + sumatotal);
        System.out.println("SUMA TOTAL DE NUMEROS POSITIVOS:" + sumapositivos);
        System.out.println("SUMA TOTAL DE NUMEROS NEGATIVOS:" + sumanegativos);
        System.out.println("NUMERO MAYOR:" + mayor);
    }
}


