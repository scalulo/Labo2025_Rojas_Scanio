package Herencia.Computadoras;

import java.util.ArrayList;

public class Compra {
    private Pago pago;
    private CPU cpu;
    private ArrayList <Dispositivo_entrada>disp_entrada;
    private ArrayList <Dispositivo_salida>disp_salida;
    private Cliente cliente;
    private int total;

    public Compra(Pago pago, CPU cpu,  Cliente cliente, int total) {
        this.pago = pago;
        this.cpu = cpu;
        this.disp_entrada = new ArrayList<Dispositivo_entrada>();
        this.disp_salida = new ArrayList<Dispositivo_salida>();
        this.cliente = cliente;
        this.total=total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Dispositivo_entrada> getDisp_entrada() {
        return disp_entrada;
    }

    public void setDisp_entrada(ArrayList<Dispositivo_entrada> disp_entrada) {
        this.disp_entrada = disp_entrada;
    }

    public ArrayList<Dispositivo_salida> getDisp_salida() {
        return disp_salida;
    }

    public void setDisp_salida(ArrayList<Dispositivo_salida> disp_salida) {
        this.disp_salida = disp_salida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
