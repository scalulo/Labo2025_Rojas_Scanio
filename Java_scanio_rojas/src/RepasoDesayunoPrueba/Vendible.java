package RepasoDesayunoPrueba;

public interface Vendible {
    void actualizar_stock(int cantidad) throws StockInsuficiente ;
    void descripcion();
    int calcular_precio(int cant);
    int vender(int cantidad) throws StockInsuficiente;
    boolean valido(int cantidad);

}
