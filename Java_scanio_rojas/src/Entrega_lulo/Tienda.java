package Entrega_lulo;

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
            p.mostrar();

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
        Empresa aux = new Empresa();
        int cant = 0;
        int cantaux = 0;


            for (Producto p : productos) {
                if(p.getEmpresa().equals(empresas.get(0))){
                    cant++;
                    aux=empresas.get(0);

                }
            }
            for(Empresa e:empresas){
                for(Producto p:productos){
                    if(p.getEmpresa().equals(e)){
                        cantaux++;
                        if(cantaux>cant){
                            aux=e;
                        }
                    }
                }
        }
            return aux;
    }

    public void cinco(Empresa empresa){
        for(Empresa e:empresas){
            if(e.equals(empresa)){
                System.out.println("Cantidad de plata que gasta en salarios: "+e.salarios());
            }
        }
    }

    public void vencido(Producto producto){
        for(Producto p: productos){
            if(p.equals(producto)){

            }
        }
    }
}




