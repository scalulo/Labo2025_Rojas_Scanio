package Herencia.Computadoras;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_computadoras {
    CPU c1;
    Sistema s1;
    Dispositivo_salida ds1;
    Dispositivo_entrada de1;
    Cliente cl1;
    Componente comp1,comp2;
    Compra compra1;
    Pago p1;

    @BeforeEach
    public void setUp(){
        p1=new Pago("Tarjeta",cl1);
        c1=new CPU();
        s1=new Sistema();
        ds1=new Dispositivo_salida("monitor",4,23333,3);
        de1=new Dispositivo_entrada("Teclado","c",1,43343,23);
        comp1=new Componente("Memoria Ram","AMD","16gb",100000,15);
        comp2=new Componente("tarjeta grafica","Razen","pepo",1000000,10);
        compra1=new Compra(p1,c1,p1.getCliente(),0);
        p1=new Pago("Tarjeta",cl1);
        c1.getComponentes().add(comp1);
        compra1.getDisp_salida().add(ds1);
        compra1.getDisp_entrada().add(de1);
        s1.getCompras().add(compra1);
    }

    @Test
    public void testPago(){
        assertEquals(166676,s1.calcularTotalCompra(compra1),"el total debe ser de 166676");
    }

}
