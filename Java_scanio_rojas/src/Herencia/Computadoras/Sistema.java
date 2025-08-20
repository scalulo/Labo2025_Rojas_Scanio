package Herencia.Computadoras;

import java.util.ArrayList;

public class Sistema {
   private ArrayList  <Componente> componentes_stock;
   private ArrayList  <Dispositivo_entrada> dispos_entrada_stock;
   private ArrayList  <Dispositivo_salida> disp_salida_stock;
   private ArrayList <Compra> compras;



    public Sistema() {
        this.componentes_stock = new ArrayList<Componente>();
        this.dispos_entrada_stock = new ArrayList<Dispositivo_entrada>();
        this.disp_salida_stock = new ArrayList<Dispositivo_salida>();
        this.compras = new ArrayList<Compra>();
    }

    public ArrayList<Componente> getComponentes_stock() {
        return componentes_stock;
    }

    public void setComponentes_stock(ArrayList<Componente> componentes_stock) {
        this.componentes_stock = componentes_stock;
    }

    public ArrayList<Dispositivo_entrada> getDispos_entrada_stock() {
        return dispos_entrada_stock;
    }

    public void setDispos_entrada_stock(ArrayList<Dispositivo_entrada> dispos_entrada_stock) {
        this.dispos_entrada_stock = dispos_entrada_stock;
    }

    public ArrayList<Dispositivo_salida> getDisp_salida_stock() {
        return disp_salida_stock;
    }

    public void setDisp_salida_stock(ArrayList<Dispositivo_salida> disp_salida_stock) {
        this.disp_salida_stock = disp_salida_stock;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public int calcularTotalCompra(Compra compra) {
        int total = 0;

        try {
            for (Componente c : compra.getCpu().getComponentes()){
                if (c.getStock()==0){
                    throw new IllegalArgumentException("no hay stock de" + c.getNombre());
                }
            }
            for (Componente comp : compra.getCpu().getComponentes()) {
                total += comp.getPrecio();
            }

            for (Dispositivo_entrada de : compra.getDisp_entrada()) {
                total += de.getPrecio();
            }

            for (Dispositivo_salida ds : compra.getDisp_salida()) {
                total += ds.getPrecio();
            }
            System.out.println("El total de tu compra es: "+total);
            compra.setTotal(total);
            return total;
        }catch (IllegalArgumentException e){
            System.err.println(e);
            return 0;
        }

    }


    public void Restar_stock_de_compra(Compra compra){
        for (Componente comp:compra.getCpu().getComponentes()){
            comp.setStock(comp.getStock()-1);
        }
        for(Dispositivo_salida d_s:compra.getDisp_salida()){
            d_s.setStock(d_s.getStock()-1);
        }
        for(Dispositivo_entrada d_e:compra.getDisp_entrada()){
            d_e.setStock(d_e.getStock()-1);
        }
    }

    public void mostrar_perifericos(Compra compra){
        for(Dispositivo_entrada d_e:compra.getDisp_entrada()){
            System.out.println("dispositivo de entrada incluido en la compra: "+d_e.getNombre());
        }
        for (Dispositivo_salida d_s:compra.getDisp_salida()){
            System.out.println("dispositivo de salida incluido en la compra: "+d_s.getNombre());

        }
        for(Componente c:compra.getCpu().getComponentes()){
            System.out.println("componente incluido en la compra: "+c.getNombre()+" "+ c.getFabricante() +" "+ c.getModelo());

        }
    }

    public static void main(String[] args) {
        Sistema s1= new Sistema();
        Cliente cliente1= new Cliente("pepo",2,"de santis","de santis",1223444) ;
        Componente procesador1=new Componente("Procesador","AMD","5ta generacion",300000,23);
        Componente ram1=new Componente("Memoria Ram","AMD","16gb",100000,15);
        Componente grafica1=new Componente("tarjeta grafica","Razen","pepo",1000000,10);
        Dispositivo_salida monitor=new Dispositivo_salida("Monitor",2,333422,43);
        Dispositivo_entrada teclado=new Dispositivo_entrada("Teclado","c",1,43343,23);
        Impresora impresora=new Impresora("laser jet",4,23423,10,true);
        CPU compu1=new CPU();

        s1.getComponentes_stock().add(ram1);
        s1.getComponentes_stock().add(procesador1);
        s1.getComponentes_stock().add(grafica1);

        compu1.getComponentes().add(ram1);
        compu1.getComponentes().add(procesador1);
        compu1.getComponentes().add(grafica1);

        Pago pago1= new Pago("Tarjeta",cliente1);
        Compra compra1= new Compra(pago1,compu1,pago1.getCliente(),0);
        compra1.getDisp_entrada().add(teclado);
        compra1.getDisp_salida().add(monitor);
        s1.calcularTotalCompra(compra1);
        s1.Restar_stock_de_compra(compra1);
        s1.mostrar_perifericos(compra1);


    }
}

