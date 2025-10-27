package RepasoDesayunoPrueba;

import java.util.HashMap;

public class Bizcochuelo extends Preparacion {
    private int limon;
    private int polvo_hornear;

    public Bizcochuelo(HashMap<Ingrediente, Integer> ingredientes, int stock, int precio_unidad, int limon, int polvo_hornear) {
        super(ingredientes, stock, precio_unidad);
        this.limon = limon;
        this.polvo_hornear = polvo_hornear;
    }
    public Bizcochuelo() {
        super();
        this.limon = 4;
        this.polvo_hornear = 1;
    }

    @Override
    String conocer_receta() {
        return "El bizcochuelo arranca con...";
    }
}
