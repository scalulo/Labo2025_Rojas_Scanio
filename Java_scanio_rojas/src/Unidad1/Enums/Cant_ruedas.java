package Unidad1.Enums;

public enum Cant_ruedas {
    DOS(2), CUATRO(4), SEIS(6), OCHO(8);
    private int cantidad;

    Cant_ruedas(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
