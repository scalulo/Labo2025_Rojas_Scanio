package Hashs.Control;

import java.time.LocalDate;

public class Registro {
    private double peso;
    private double altura;

    public Registro() {
        this.peso = 34;
        this.altura = 185;
    }

    public Registro(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrar(){
        System.out.println("Peso de esa fecha: "+peso);
        System.out.println("Altura de esa fecha: "+altura);
    }
}
