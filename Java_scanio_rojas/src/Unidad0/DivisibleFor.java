package Unidad0;

public class DivisibleFor {
    public static void main(String[] args) {
        System.out.println("Con for");
        for(int i=0;i<101;i++){
            if(i % 3 == 0 && i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Con while");
        int numero = 0;
        while(numero<101){
            if(numero % 3 == 0 && numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
        }

    }
}
