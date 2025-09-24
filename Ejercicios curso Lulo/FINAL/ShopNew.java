package objetos;

import io.helidon.webserver.Routing;
import java.net.InetAddress;
import java.net.UnknownHostException;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        System.out.println("Welcome to duke choice shop");

        Clothing garment1 = new Clothing("Blue Jacket", 20.9, 'm');
        Clothing garment2 = new Clothing("Orange T-shirt", 10.5, 's');
        Clothing garment3 = new Clothing("Green scarf", 15.5, 's');

        ArrayList<Clothing> stock = new ArrayList<>();
        Customer customer1 = new Customer();

        stock.add(garment1);
        stock.add(garment2);
        stock.add(garment3);

        customer1.setApodo("pinky");
        customer1.setMeasurement('s');

        System.out.println("Hello " + customer1.getApodo());

        Arrays.sort(new ArrayList[]{customer1.getPurchases()});

        try {
            Itemlist list = new Itemlist(stock);
            Routing routing = Routing.builder()
                    .get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        for (Clothing piece : customer1.getPurchases()) {
            System.out.println("Datos de prenda: " +
                    piece.getItemName() + " " +
                    piece.getCost() + " " +
                    piece.getMeasurement());
        }

        int value = 3;
        customer1.setMeasurement(value);

        customer1.addPurchases(stock);

        System.out.println("Total = " + customer1.calculateTotalCost() +
                " y el promedio fue: " + customer1.calculateAverageCost());
    }
}
