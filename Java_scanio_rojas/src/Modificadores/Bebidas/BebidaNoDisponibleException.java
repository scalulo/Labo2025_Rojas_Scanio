package Modificadores.Bebidas;

public class BebidaNoDisponibleException extends RuntimeException {
    public BebidaNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}
