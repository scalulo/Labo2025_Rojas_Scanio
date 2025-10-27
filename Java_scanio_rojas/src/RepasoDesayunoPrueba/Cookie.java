package RepasoDesayunoPrueba;

import java.util.HashMap;

public class Cookie extends Preparacion implements Vendible{
    private int bicarbonato;
    private Topping topping;

    public Cookie(HashMap<Ingrediente, Integer> ingredientes, int stock, int precio_unidad, int bicarbonato, Topping topping) {
        super(ingredientes, stock, precio_unidad);
        this.bicarbonato = bicarbonato;
        this.topping = topping;
    }

    public Cookie(){
        super();
        this.bicarbonato=3;
        this.topping=Topping.CONFITES;
    }

    public int getBicarbonato() {
        return bicarbonato;
    }

    public void setBicarbonato(int bicarbonato) {
        this.bicarbonato = bicarbonato;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    String conocer_receta() {
       return "Empeza partiendo el chocolate";
    }

    @Override
    public boolean valido(int cantidad) {
        return  cantidad>=getStock();
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
        System.out.println("Animate a probar las mejores cookies del mercado");
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
