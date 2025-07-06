package Entrega_lulo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<Empresa> empresas;
    private ArrayList<Empleado> empleados;


    public Tienda() {
        this.productos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.empresas = new ArrayList<>();
    }

    public Tienda(ArrayList<Producto> productos, ArrayList<Empresa> empresas, ArrayList<Empleado> empleados) {
        this.productos = productos;
        this.empresas = empresas;
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void vencidos() {
        for (Producto p : productos) {
            if(p.estoy_vencido()==true){
                System.out.println("Nombre :" + p.getNombre());
                System.out.println("Marca: "+ p.getMarca());
            }

        }
    }


    public void regalar(Empresa empresa) {
        for (Empresa e : empresas) {
            if (e == empresa) {
                System.out.println("Cantidad de productos para esta empresa: " + e.calcular());
            }

        }


    }

    public Empresa mejor_proveedor() {

        Empresa mejor = new Empresa();
        int max = 0;

        for (Empresa e : empresas) {
            int cant = 0;

            for (Producto p : productos) {
                    if (p.getEmpresa().equals(e)) {
                        cant++;
                    }
            }

            if (cant > max) {
                max = cant;
                mejor = e;
            }
        }

        return mejor;
    }


    /*
    public Empresa mejor_proovedor_alternativa(){
        int cant=empresas.get(0).getProductos().size();
        Empresa aux=empresas.get(0);

        for(Empresa e:empresas) {

            if (e.getProductos().size() > cant) {
                cant = e.getProductos().size(;
                aux=e;
            }
        }
        return aux;

    }

     */

    public void calcular_salarios(Empresa empresa){


                System.out.println("Cantidad de plata que gasta en salarios: "+empresa.salarios());
            }



    public void tiempo_vencimiento(Producto producto){

        if(producto.getClass().equals(NoPerecedero.class)){
            System.out.println("Soy no perecedero, no tengo vencimiento");
            return;
        }


            if(  producto.estoy_vencido()==true) {
                System.out.println("Estoy vencido");
            }


            else if(  producto.estoy_vencido()==false){
                System.out.println("Faltan: "+producto.dias_vencimientos()+"para el vencimiento");
            }
        }


    public boolean aplica_descuento(){
        int contador =0;

        for(Producto p: productos){
            if(p.tengo_envoltorio()==true){
                contador++;
            }
        }
        if(contador>=productos.size()*0.45){
            System.out.println("Aplica");
            return true;
        }
        else {
            System.out.println("No aplica");
            return false;
        }
    }

    public long años(){
        for(Empleado emp: empleados){
            return emp.años_trabajando();
        }
        return 0;
    }

    public void consumible(){
        for(Producto p: productos) {
            if(p.getClass().equals(NoPerecedero.class)){
                System.out.println("Soy no perecedero");
            }
            else {
                p.todavia_consumible();
            }
        }
        }



        public void agregar_empresa(Empresa empresa){
        empresas.add(empresa);
        }
        public void eliminar_empresa(Empresa empresa){
        empresas.remove(empresa);
        }
        public void modificar_empresa(Empresa empresa1, Empresa empresa2){
        eliminar_empresa(empresa2);
        agregar_empresa(empresa1);
        }

        public void agregar_producto(Producto producto){
        productos.add(producto);
        }
        public void eliminar_prodcuto(Producto producto){
        productos.remove(producto);
        }
        public void modificar_producto(Producto producto1, Producto producto2){
        eliminar_prodcuto(producto1);
        agregar_producto(producto2);
        }

        public void agregar_empleado(Empleado empleado){
        empleados.add(empleado);
        }
        public void eliminar_empleado(Empleado empleado){
        empleados.remove(empleado);
        }
        public void modificar(Empleado empleado1,Empleado empleado2){
        eliminar_empleado(empleado1);
        eliminar_empleado(empleado2);
        }

    public static void main(String[] args) {

        Tienda tienda = new Tienda();



        // Empresas
        ArrayList<Producto>produs=new ArrayList<>();
        ArrayList<Producto>produs2=new ArrayList<>();

        ArrayList<Empleado>emps=new ArrayList<>();
        ArrayList<Empleado>emps2=new ArrayList<>();

        Empresa e1 = new Empresa( produs, "Calle 123", "Nike",emps );
        Empresa e2 = new Empresa(produs2,  "Avenida 456","Electrodomésticos SA", emps2);
        tienda.agregar_empresa(e1);
        tienda.agregar_empresa(e2);

        // Empleados
        ArrayList<Producto>rega=new ArrayList<>();
        ArrayList<Producto>rega2=new ArrayList<>();

        Empleado emp1 = new Empleado("Juan", "Pérez", LocalDate.of(1960, 5, 20),  LocalDate.of(2005, 3, 15), 150000,rega);
        Empleado emp2 = new Empleado("Ana", "López", LocalDate.of(1985, 3, 15), LocalDate.of(2000, 5, 20), 180000, rega2);
        tienda.agregar_empleado(emp1);
        tienda.agregar_empleado(emp2);

        // Productos
        Producto p1 = new Perecedero(001, "Manzana", "Dole", e1, LocalDate.of(2025, 5, 20), 50, LocalDate.of(2025, 10, 20), 5);
        Producto p2 = new NoPerecedero(002, "Milenase", "Molinos", e2,LocalDate.of(2025, 5, 20),100 , 10, true);
        Producto p3 = new Perecedero(003, "Manzana", "Dole", e2, LocalDate.of(2025, 5, 20), 50, LocalDate.of(2025, 2, 20), 5);
        Producto p4 = new NoPerecedero(004, "Banana", "Molinos", e1,LocalDate.of(2025, 5, 20),100 , 10, false);
        tienda.agregar_producto(p1);
        tienda.agregar_producto(p2);
        tienda.agregar_producto(p3);
        tienda.agregar_producto(p4);

        //Funciones

        tienda.vencidos();
        tienda.regalar(e1);
        tienda.mejor_proveedor();
        tienda.calcular_salarios(e1);
        tienda.tiempo_vencimiento(p1);
        tienda.aplica_descuento();
        tienda.años();
        tienda.consumible();

    }
    }






