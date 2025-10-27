package RepasoDesayunoPrueba;

import java.util.HashMap;
import java.util.HashSet;

public class DesayunoApp {
    public static void main(String[] args) {
        // === INGREDIENTES ===
        HashMap<Ingrediente, Integer> ingBrownie1 = new HashMap<>();
        ingBrownie1.put(Ingrediente.HARINA, 2);
        ingBrownie1.put(Ingrediente.AZUCAR, 3);
        ingBrownie1.put(Ingrediente.MANTECA, 1);
        ingBrownie1.put(Ingrediente.HUEVO, 2);

        HashMap<Ingrediente, Integer> ingBrownie2 = new HashMap<>();
        ingBrownie2.put(Ingrediente.HARINA, 3);
        ingBrownie2.put(Ingrediente.AZUCAR, 4);
        ingBrownie2.put(Ingrediente.MANTECA, 2);
        ingBrownie2.put(Ingrediente.HUEVO, 3);

        HashMap<Ingrediente, Integer> ingCookie1 = new HashMap<>();
        ingCookie1.put(Ingrediente.HARINA, 3);
        ingCookie1.put(Ingrediente.AZUCAR, 2);
        ingCookie1.put(Ingrediente.MANTECA, 2);
        ingCookie1.put(Ingrediente.HUEVO, 1);

        HashMap<Ingrediente, Integer> ingCookie2 = new HashMap<>();
        ingCookie2.put(Ingrediente.HARINA, 2);
        ingCookie2.put(Ingrediente.AZUCAR, 3);
        ingCookie2.put(Ingrediente.MANTECA, 1);
        ingCookie2.put(Ingrediente.HUEVO, 2);

        HashMap<Ingrediente, Integer> ingBizcochuelo1 = new HashMap<>();
        ingBizcochuelo1.put(Ingrediente.HARINA, 4);
        ingBizcochuelo1.put(Ingrediente.AZUCAR, 2);
        ingBizcochuelo1.put(Ingrediente.HUEVO, 3);
        ingBizcochuelo1.put(Ingrediente.MANTECA, 3);


        HashMap<Ingrediente, Integer> ingBizcochuelo2 = new HashMap<>();
        ingBizcochuelo2.put(Ingrediente.HARINA, -2);
        ingBizcochuelo2.put(Ingrediente.AZUCAR, 3);
        ingBizcochuelo2.put(Ingrediente.HUEVO, 4);
        ingBizcochuelo2.put(Ingrediente.MANTECA, 3);

        HashMap<Ingrediente, Integer> ingBizcochuelo3 = new HashMap<>();
        ingBizcochuelo3.put(Ingrediente.HARINA, 2);
        ingBizcochuelo3.put(Ingrediente.AZUCAR, 6);
        ingBizcochuelo3.put(Ingrediente.HUEVO, 1);
        ingBizcochuelo3.put(Ingrediente.MANTECA, 3);

        // === INSTANCIAMOS LAS PREPARACIONES ===
        Brownie brownie1 = new Brownie(ingBrownie1, 10, 500, 6);
        Brownie brownie2 = new Brownie(ingBrownie2, 8, 550, 5);

        Cookie cookie1 = new Cookie(ingCookie1, 15, 400, 3, Topping.NUTELLA);
        Cookie cookie2 = new Cookie(ingCookie2, 12, 420, 2, Topping.OREO);

        Bizcochuelo bizcochuelo1 = new Bizcochuelo(ingBizcochuelo1, 8, 600, 2, 1);
        Bizcochuelo bizcochuelo2 = new Bizcochuelo(ingBizcochuelo2, 6, 650, 3, 1);
        Bizcochuelo bizcochuelo3 = new Bizcochuelo(ingBizcochuelo3, 6, 650, 3, 1);


        // === CREAMOS LAS COLECCIONES PARA EL SISTEMA ===
        HashSet<Preparacion> listaPreparaciones = new HashSet<>();
        listaPreparaciones.add(brownie1);
        listaPreparaciones.add(cookie1);
        listaPreparaciones.add(bizcochuelo1);


        HashMap<Vendible, Integer> historial = new HashMap<>();
        historial.put(brownie1, 0);
        historial.put(cookie1, 0);

        // === INSTANCIAMOS EL SISTEMA CON EL CONSTRUCTOR CON PARÁMETROS ===
        Sistema sistema = new Sistema(listaPreparaciones, historial);


        sistema.productos_vendibles();

        try{
            sistema.reponer_preparacion(brownie1,-2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try{
            sistema.reponer_preparacion(brownie1,2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

       try{
           sistema.nueva_preparacion(bizcochuelo2);
       } catch (CantidadesInvalidas e) {
           System.out.println(e.getMessage());
       }
        try{
            sistema.nueva_preparacion(cookie2);
        } catch (CantidadesInvalidas e) {
            System.out.println(e.getMessage());
        }
        try{
            sistema.nueva_preparacion(bizcochuelo3);
        } catch (CantidadesInvalidas e) {
            System.out.println(e.getMessage());
        }

        sistema.productos_vendibles();

        sistema.registrar_venta(brownie2,10);
        sistema.registrar_venta(brownie2,6);

        System.out.println(bizcochuelo1.conocer_receta());
        System.out.println(cookie1.conocer_receta());
        System.out.println(brownie2.conocer_receta());

        cookie1.descripcion();
        brownie2.descripcion();

        try{
            cookie1.vender(3);
        } catch (StockInsuficiente e) {
            System.out.println(e.getMessage());
        }
        System.out.println(cookie1.calcular_precio(3));
    }
}
