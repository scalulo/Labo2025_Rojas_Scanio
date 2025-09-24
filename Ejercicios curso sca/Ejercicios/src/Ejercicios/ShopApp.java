package Ejercicios;

import io.helidon.webserver.Routing;
import java.net.InetAddress;
import java.net.UnknownHostException;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky", "S");
        System.out.println("Hello " + c1.getName());

        // ULTIMO EJERCICIO HECHO
        System.out.println("The minimum price value of the Clothing obj. is: " + Clothing.minPrice);
        // ULTIMO EJERCICIO HECHO

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        ArrayList<Clothing> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        // ULTIMO EJERCICIO HECHO
        for (Clothing c : items) {
            System.out.println(c);
        }
        // ULTIMO EJERCICIO HECHO

        c1.addItems(items);

        // Ordenar los items usando Comparable
        Collections.sort(items);
        System.out.println("Items ordenados:");
        for (Clothing c : items) {
            System.out.println(c);
        }

        // Configurar y arrancar el web server
        try {
            ItemsList list = new ItemsList(items);
            Routing routing = Routing.builder()
                    .get("/items", list)
                    .build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888)
                    .build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
            System.out.println("Web server started at http://localhost:8888/items");
        } catch (UnknownHostException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        // Mostrar items del customer
        for (Clothing i : c1.getItems()) {
            System.out.println("Item datos: " + i.getDescription() + " " + i.getPrice() + " " + i.getSize());
        }

        int measurement = 3;
        c1.setSize(measurement);
        System.out.println("Customer size: " + c1.getSize());

        System.out.println("Total: " + c1.getTotalClothingCost() + " y el promedio fue: " + c1.getAverageClothingCost());
    }
}