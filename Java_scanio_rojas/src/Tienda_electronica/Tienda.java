package Tienda_electronica;

import Tienda_electronica.Productos.Calidad;
import Tienda_electronica.Productos.Cargador_portatil;
import Tienda_electronica.Productos.Sonido;
import Tienda_electronica.Productos.Television;

import java.util.ArrayList;

public class Tienda {
    public ArrayList<Producto>productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void Eliminar (Producto nombre){
        Producto producto=productos.getFirst();
        for(Producto p : productos){
            if(p.getNombre().equals(nombre.getNombre())){
                producto=p;
            }
        }
        productos.remove(producto);
    }

    public void Agregar (Producto producto){
        productos.add(producto);
    }

    public Producto Mayor_stock (){
        int stockm=0;
        Producto producto=productos.getFirst();
        for (Producto p:productos){
            if(p.getStock()>stockm){
                stockm=p.getStock();
                producto=p;
            }
        }
        System.out.println("el producto con mayor stock es: " + producto.getNombre());

        return producto;
    }

    public Producto Menor_stock (){
        int stockm=productos.getFirst().getStock();
        Producto producto=productos.getFirst();
        for (Producto p:productos){
            if(p.getStock()<stockm){
                stockm=p.getStock();
                producto=p;
            }
        }
        System.out.println("el producto con menor stock es: " + producto.getNombre());
        return producto;
    }


    public static void main(String[] args) {

        Tienda t=new Tienda();
        Television tele= new Television("Samsung", 200030,5, Calidad._4K);
        Sonido parlante= new Sonido("JBL flip", 50000, 30, true);
        Cargador_portatil c1= new Cargador_portatil("soul",30000,20,"C",2.4,200);

        t.Agregar(tele);
        t.Agregar(parlante);
        t.Eliminar(parlante);
        t.Agregar(c1);

        t.Mayor_stock();
        t.Menor_stock();
    }
}
