package Tienda_electronica.Productos;

import Tienda_electronica.Producto;

public class Sonido extends Producto {
    private boolean bluetooth;

    public Sonido(String nombre, int precio, int stock)
    {
        super(nombre, precio, stock);
        this.bluetooth = true;
    }

    public Sonido(String nombre, int precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
