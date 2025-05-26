package Herencia.Computadoras;

public class Pago {
    private String metodo_pago;
    private Cliente cliente;

    public Pago(String metodo_pago, Cliente cliente) {
        this.metodo_pago = metodo_pago;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
}
