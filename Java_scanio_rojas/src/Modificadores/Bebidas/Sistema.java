package Modificadores.Bebidas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente>clientes;
    private ArrayList<Bebida>bebidas;

    public Sistema(ArrayList<Cliente> clientes, ArrayList<Bebida> bebidas) {
        this.clientes = clientes;
        this.bebidas = bebidas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public Cliente mas_hidratado() {
        Cliente c_hidratado = clientes.getFirst();
        int hidratacion_mayor = 0;
        int hidratacion_actual = 0;

        for (Cliente c : clientes) {
            hidratacion_actual = c.hidratacion();

            if (hidratacion_actual < hidratacion_mayor) {
                hidratacion_mayor = hidratacion_actual;
                c_hidratado = c;
            }
        }
        return c_hidratado;
    }

    public Cliente menos_hidratado(){
        Cliente c_deshidratado = clientes.getFirst();
        int hidratacion_menor = 0;
        int hidratacion_actual = 0;

        for (Cliente c : clientes) {
            hidratacion_actual = c.hidratacion();

            if (hidratacion_actual > hidratacion_menor) {
                hidratacion_menor = hidratacion_actual;
                c_deshidratado = c;
            }
        }
        return c_deshidratado;
    }

}
