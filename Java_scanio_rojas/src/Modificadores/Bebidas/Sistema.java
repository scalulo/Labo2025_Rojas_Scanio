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

    public Cliente mas_hidratado() throws SistemaVacioException {
        if (clientes.isEmpty()) {
            throw new SistemaVacioException("No hay clientes registrados en el sistema.");
        }

        Cliente c_hidratado = clientes.get(0);
        int hidratacion_mayor = c_hidratado.hidratacion();

        for (Cliente c : clientes) {
            int hidratacion_actual = c.hidratacion();
            if (hidratacion_actual > hidratacion_mayor) {
                hidratacion_mayor = hidratacion_actual;
                c_hidratado = c;
            }
        }
        return c_hidratado;
    }

    public void agregarCliente(Cliente nuevo) throws DniDuplicadoException {
        for (Cliente c : clientes) {
            if (c.getDni() == nuevo.getDni()) {
                throw new DniDuplicadoException("El DNI " + nuevo.getDni() + " ya está registrado.");
            }
        }
        clientes.add(nuevo);
    }

    public void clienteConsumeBebida(Cliente cliente, String nombreBebida, int cantidad) throws BebidaNoDisponibleException {
        int contador = 0;
        for (Bebida b : bebidas) {
            if (b.getNombre().equalsIgnoreCase(nombreBebida)) {
                contador++;
                cliente.tomar_bebida(b);
                if (contador == cantidad) return;
            }
        }
        throw new BebidaNoDisponibleException("No hay suficiente de la bebida: " + nombreBebida);
    }

    public Cliente menos_hidratado(){
        if (clientes.isEmpty()) {
            throw new SistemaVacioException("No hay clientes registrados en el sistema.");
        }

        Cliente c_deshidratado = clientes.get(0);
        int hidratacion_menor = c_deshidratado.hidratacion();

        for (Cliente c : clientes) {
            int hidratacion_actual = c.hidratacion();
            if (hidratacion_actual < hidratacion_menor) {
                hidratacion_menor = hidratacion_actual;
                c_deshidratado = c;
            }
        }
        return c_deshidratado;

    }

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Bebida> bebidas = new ArrayList<>();

        Sistema sistema = new Sistema(clientes, bebidas);

        try {
            Cliente juan = new Cliente("Juan", 25, "Calle Falsa 123", "Pérez", 12345, 0);
            sistema.agregarCliente(juan);

            // Intentar duplicado
            Cliente juan2 = new Cliente("Juan", 30, "Otra Calle", "Pérez", 12345, 0);
            sistema.agregarCliente(juan2); // lanza excepción

        } catch (DniDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // bebidas
            Bebida agua = new Neutra("Agua", 10, 0);
            Bebida coca = new Azucarada("Coca Cola", 3);
            bebidas.add(agua);
            bebidas.add(coca);

            // consumo
            sistema.clienteConsumeBebida(clientes.get(0), "Agua", 1);
            sistema.clienteConsumeBebida(clientes.get(0), "Fernet", 1); // lanza excepción

        } catch (BebidaNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Más hidratado: " + sistema.mas_hidratado().getNombre());
            System.out.println("Menos hidratado: " + sistema.menos_hidratado().getNombre());
        } catch (SistemaVacioException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
