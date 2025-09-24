package Ejercicios;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

import java.util.ArrayList;

public class ItemsList implements Handler {
    private ArrayList<Clothing> items;

    public ItemsList(ArrayList<Clothing> items) {
        this.items = items;
    }

    public ArrayList<Clothing> getItems() {
        return items;
    }

    public void setItems(ArrayList<Clothing> items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.status(Http.Status.OK_200);
        serverResponse.headers().put("Content-Type", "text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for (Clothing i : items) {
            result.append(i).append("\n");
        }
        serverResponse.send(result);
    }
}