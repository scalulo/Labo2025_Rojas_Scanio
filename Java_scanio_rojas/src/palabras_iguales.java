import java.util.Scanner;

public class palabras_iguales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dos frases");
        String frase1=entrada.nextLine();
        String frase2=entrada.nextLine();
        char i='l';
        char p='l';
        int k=0;
        while(p==i && k<frase1.length()){
            for (k=0;k<frase1.length();k++){
                for (int l=0;l<frase2.length();l++) {
                    i=frase1.charAt(k);
                    p=frase2.charAt(l);
                }
                }
        }
        if (p==i){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");

        }
    }

}
