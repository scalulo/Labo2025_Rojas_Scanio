package Try_catch.Biblioteca_virtual;

public class Libro_no_encontrado_excep extends RuntimeException {
    public Libro_no_encontrado_excep(String message)
    {
        super(message);
    }
}
