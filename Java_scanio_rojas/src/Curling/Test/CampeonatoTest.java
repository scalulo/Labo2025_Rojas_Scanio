package Curling.Test;

import Curling.Campeonato;
import Curling.Disponibilidad;
import Curling.Equipo;
import org.junit.jupiter.api.*; // Incluye Test, BeforeEach, etc.
import static org.junit.jupiter.api.Assertions.*; // Incluye assertEquals, assertTrue, etc.

public class CampeonatoTest {
    Equipo e1, e2;
    Campeonato c1;

    @BeforeEach
    public void setUp() {
        e1 = new Equipo();
        e2 = new Equipo("alem", "Leandro alem", Disponibilidad.MAÑANA);
        c1 = new Campeonato();
    }

    @Test
    public void testCantidad() {
        assertEquals(0, c1.cant_equipos(), "El campeonato debe comenzar con 0 equipos");
        c1.agregarEquipo(e2);
        assertEquals(1, c1.cant_equipos(), "El campeonato debería tener 1 equipo luego de agregar uno");
    }


}
