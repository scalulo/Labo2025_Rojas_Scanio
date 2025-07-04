package Entrega_lulo;

import java.time.LocalDate;

public class NoPerecederos extends Producto {
    private int peso;
    private boolean envoltorio;

    public NoPerecederos() {
        this.peso = 120;
        this.envoltorio = true;
    }

    public NoPerecederos(int codigo, String nombre, String marca, Empresa empresa, LocalDate embasado, int precio, int peso, boolean envoltorio) {
        super(codigo, nombre, marca, empresa, embasado, precio);
        this.peso = peso;
        this.envoltorio = envoltorio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEnvoltorio() {
        return envoltorio;
    }

    public void setEnvoltorio(boolean envoltorio) {
        this.envoltorio = envoltorio;
    }

    @Override
    public void mostrar() {

    }
}
