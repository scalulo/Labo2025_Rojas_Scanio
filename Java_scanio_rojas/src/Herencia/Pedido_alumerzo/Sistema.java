    package Herencia.Pedido_alumerzo;

    import Unidad1.Persona;

    import java.time.LocalDate;
    import java.time.LocalTime;
    import java.util.ArrayList;

    public class Sistema {
        private ArrayList<Plato> platos;
        private ArrayList<Pedido> pedidos;

        public Sistema() {
            this.platos = new ArrayList<>();
            this.pedidos = new ArrayList<>();
        }

        public ArrayList<Plato> getPlatos() {
            return platos;
        }

        public void setPlatos(ArrayList<Plato> platos) {
            this.platos = platos;
        }

        public ArrayList<Pedido> getPedidos() {
            return pedidos;
        }

        public void setPedidos(ArrayList<Pedido> pedidos) {
            this.pedidos = pedidos;
        }

        public void registrarPedidos(Pedido pedido,Plato plato) {
            pedidos.add(pedido);
            plato.aumentarCantidadPedidos();
        }

        public void agregarPlato(Plato p) {
            platos.add(p);
        }

        public void modificarPlato(String nombre, double nuevoPrecio) {
            for (Plato p : platos) {
                if (p.getNombre().equalsIgnoreCase(nombre)) {
                    p.setPrecio(nuevoPrecio);
                    return;
                }
            }
        }

        public void eliminarPlato(String nombre) {
            platos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
        }

        private ArrayList listado(){
        ArrayList<Plato> actuales=new ArrayList<>();

        for(Pedido p: pedidos){
            if(p.getEntrega() == LocalTime.now()){
            for(Plato pl:platos){

                    if(p.getSolicitante().getClass()==Profesor.class) {
                        Profesor profe = (Profesor) p.getSolicitante();
                        pl.setPrecio(pl.getPrecio() - (pl.getPrecio() * (profe.getDescuento() / 100)));
                    }
                actuales.add(pl);

            }
                }
            }
        return actuales;
        }

        private void top(){
            ArrayList<Plato> topcito = new ArrayList<>();
            for (Plato p : platos) {
                topcito.add(p);
            }


            for (int i = 0; i < topcito.size() - 1; i++) {
                for (int j = i + 1; j < topcito.size(); j++) {
                    if (topcito.get(j).getCantidadPedidos() > topcito.get(i).getCantidadPedidos()) {

                        Plato aux = topcito.get(i);
                        topcito.set(i, topcito.get(j));
                        topcito.set(j, aux);
                    }
                }
            }


            System.out.println("🥇 Top 3 platos más pedidos:");
            for (int i = 0;  i < 3; i++) {
                System.out.println("Nombre del top:" +topcito.get(i).getNombre());
                System.out.println("Cantidad de veces que fue pedido :" +topcito.get(i).getCantidadPedidos());

            }
        }


        public static void main(String[] args) {
            Plato plato1 = new Plato("Milanesa", 500, 0);
            Plato plato2 = new Plato("Ensalada", 300,  0);
            Plato plato3 = new Plato();


            Profesor profe1 = new Profesor();
            Alumno alumno1 = new Alumno("Lulo", "Rojas", "2a");

            Pedido pedido2=new Pedido(LocalDate.now(), LocalTime.now(), "Pendiente", ArrayList<Plato> platos, alumno1);
            Pedido pedido1=new Pedido();
            Pedido pedido3=new Pedido(LocalDate.now(), LocalTime.now(), "Cancelado", ArrayList<Plato> platos, profe1);

            Sistema sistema = new Sistema();
            sistema.registrarPedidos(pedido2, plato1);
            sistema.registrarPedidos(pedido1, plato2);
            sistema.registrarPedidos(pedido1,plato3);
            sistema.top();
            System.out.println(sistema.listado());














        }
                }











