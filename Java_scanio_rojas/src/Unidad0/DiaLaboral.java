package Unidad0;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un dia");
        String dia = entrada.nextLine();

        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves")) {
            System.out.println("Día laboral.");
        }
        else if (dia.equals("viernes")) {
            System.out.println("Día laboral, pero podes ir a non.");
        }
        else if (dia.equals("sabado")) {
            System.out.println("Sabanon.");
        }
        else if (dia.equals("domingo")) {
            System.out.println("Hoy no trabajas, es momingo. Mañana laburas, nt.");
        }



    }
}
