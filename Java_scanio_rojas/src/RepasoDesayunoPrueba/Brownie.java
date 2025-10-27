package RepasoDesayunoPrueba;

import java.util.HashMap;

public class Brownie extends Preparacion implements Vendible {
    private int chocolate;

    public Brownie(HashMap<Ingrediente, Integer> ingredientes, int stock, int precio_unidad, int chocolate) {
        super(ingredientes, stock, precio_unidad);
        this.chocolate = chocolate;
    }

    public Brownie(){
        super();
        this.chocolate=6;
    }

    @Override
    String conocer_receta() {
        return "Derreti la manteca";
    }

    @Override
    public boolean valido(int cantidad) {
        return  cantidad<=getStock();
    }

    @Override
    public void actualizar_stock(int cantidad) throws StockInsuficiente{
        if(valido(cantidad)){
            setStock(getStock()-cantidad);
            System.out.println("Stock suficiente");
        }
       else{
           throw new StockInsuficiente("No hay stock suficiente");
        }
    }


    @Override
    public void descripcion() {
        System.out.println("Brownies bien humedos");
    }

    @Override
    public int calcular_precio(int cant) {
        return cant*getPrecio_unidad();
    }

    @Override
    public int vender(int cant) throws StockInsuficiente{
        int precio=0;
        if(valido(cant)){
            precio=calcular_precio(cant);
            return precio;
        }
        else{
            throw new StockInsuficiente("No hay stock suficiente");
        }
    }

    //Yo creo que la funcion vender simplemente se encarga de dar el precio verificando si hay stock ya que la funcion encargada de hacer una venta es Registrar_venta en el sistema

}
