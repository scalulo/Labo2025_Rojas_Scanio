package Entrega_lulo;

import java.time.LocalDate;

public class NoPerecedero extends Producto {
    private int peso;
    private boolean envoltorio;

    public NoPerecedero() {
        this.peso = 120;
        this.envoltorio = true;
    }

    public NoPerecedero(int codigo, String nombre, String marca, Empresa empresa, LocalDate embasado, int precio, int peso, boolean envoltorio) {
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
    public boolean estoy_vencido() {
        return false;

    }

    @Override
    public long dias_vencimientos() {

        return -1;
    }

    @Override
    public boolean tengo_envoltorio() {
        if(envoltorio==true){
            return true;
        }
        return false;
    }

    @Override
    public boolean todavia_consumible() {
        return false;
    }
}
