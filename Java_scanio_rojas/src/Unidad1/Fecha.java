package Unidad1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;


    public Fecha (){
        this.dia = 10;
        this.mes = 4;
        this.anio = 2023;
    }
 public Fecha (int dia,int mes,int anio){
     this.dia = dia;
     this.mes = mes;
     this.anio = anio;
 }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }

    public void setDia (int dia){
        this.dia=dia;
    }
    public void setMes (int mes){
        this.mes=mes;
    }
    public void setAnio (int anio){
        this.anio=anio;
    }

    public void dias_mes(){
    if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
        System.out.println("el mes" +mes+ " tiene 31 dias");
    }
    else if (mes==2) {
        System.out.println("el mes" +mes+ " tiene 28 dias");
    }
    else {
        System.out.println("el mes" +mes+ " tiene 30 dias");

    }
    }

    public void valida(){
        Scanner entrada = new Scanner(System.in);
        while (dia<1 || dia>32) {
            if (dia < 1 || dia > 32) {
                System.out.println("Ingrese de nuevo el dia, con un dia valido(>1 y <31");
                setDia(entrada.nextInt());
            } else {
                System.out.println("el dia esta bien");
            }
        }
        while (mes<1 || mes>12) {
            if (mes < 1 || mes > 12) {
                System.out.println("Ingrese de nuevo el mes, con un dia valido(>0 y <13)");
                setMes(entrada.nextInt());
            } else {
                System.out.println("el mes esta bien");
            }
        }

        while(anio<1 || anio>2024) {
            if (anio < 1 || anio > 2024) {
                System.out.println("Ingrese de nuevo el año, con un dia valido(>1 y <31");
                setAnio(entrada.nextInt());
            } else {
                System.out.println("el año esta bien");
            }
        }
    }

    public void corta(){
        System.out.println(dia+"-"+mes+"-"+anio);
    }
    public void larga(){
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        String Mes = "";
        String Dia="";
        String diaSemana = fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        if(mes==1){
            Mes="enero";
        }
        else if (mes==2) {
            Mes="febrero";
        }
        else if (mes==3) {
            Mes="marzo";
        }
        else if (mes==4) {
            Mes="abril";
        }
        else if (mes==5) {
            Mes="mayo";
        }
        else if (mes==6) {
            Mes="junio";
        }
        else if (mes==7) {
            Mes="julio";
        }
        else if (mes==8) {
            Mes="agosto";
        }
        else if (mes==9) {
            Mes="septiembre";
        }
        else if (mes==10) {
            Mes="octubre";
        }
        else if (mes==11) {
            Mes="noviembre";
        }
        else if (mes==12) {
            Mes="diciembre";
        }

        System.out.println(diaSemana+" "+dia+" de "+Mes+" "+anio);
    }

    public void siguiente(){
    LocalDate fecha = LocalDate.of(anio, mes, dia);
    fecha = fecha.plusDays(1);
    }

    public void retrocede(){
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        fecha = fecha.minusDays(1);
    }
    public String igualQue(Fecha fecha) {
        String txt="";
        if( this.dia == fecha.getDia() &&
                this.mes == fecha.getMes() &&
                this.anio == fecha.getAnio()){
            txt="son iguales";
        }
        else {
            txt=" no son iguales";

        }
        return txt;
    }

    public boolean menorQue(Fecha fecha) {
        LocalDate f1 = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate f2 = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        return f1.isBefore(f2);
    }

    public boolean mayorQue(Fecha fecha) {
        LocalDate f1 = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate f2 = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        return f1.isAfter(f2);
    }


    public static void main(String[] args) {
        int dia=24;
        int mes=4;
        int anio=2023;
        Fecha f1= new Fecha();
        Fecha f2= new Fecha(dia, mes,anio);
        f2.valida();
        f2.corta();
        f1.larga();
        f2.siguiente();
        f1.retrocede();
        System.out.println("¿Son iguales? " + f1.igualQue(f2));
        System.out.println("¿f1 es menor que f2? " + f1.menorQue(f2));
        System.out.println("¿f1 es mayor que f2? " + f1.mayorQue(f2));
    }
}
