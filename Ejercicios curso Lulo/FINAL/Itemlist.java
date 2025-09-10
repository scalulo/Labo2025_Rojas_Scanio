package objetos;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

import java.util.ArrayList;

public class Itemlist implements Handler {
    private ArrayList<Clothing> catalog;

    public Itemlist(ArrayList<Clothing> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<Clothing> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Clothing> catalog) {
        this.catalog = catalog;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content-Type", "text/plain; charset=UTF-8");

        StringBuilder output = new StringBuilder();
        for (Clothing piece : catalog) {
            output.append(piece).append("\n");
        }

        res.send(output.toString());
    }
}
