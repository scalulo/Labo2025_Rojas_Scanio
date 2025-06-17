
package Modificadores.Recetas;

/*import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlataformaTest {
    Plataforma plataforma;
    Entrada entrada;
    Postre postre;
    Principal principal;

    @BeforeEach
    void setUp() {
        plataforma = new Plataforma();

        ArrayList<String> pasos1 = new ArrayList<>();
        pasos1.add("Paso 1");
        pasos1.add("Paso 2");

        ArrayList<String> pasos2 = new ArrayList<>();
        pasos2.add("Paso A");
        pasos2.add("Paso B");
        pasos2.add("Paso C");

        entrada = new Entrada("Ensalada", Dificultad.FACIL, pasos1, Temperatura.FRIA);
        postre = new Postre("Flan", Dificultad.MEDIO, pasos2, true, 180);
        principal = new Principal("Milanesa", Dificultad.DIFICIL, pasos1, 4, "horno");

        plataforma.agregar(entrada);
        plataforma.agregar(postre);
        plataforma.agregar(principal);
    }

    @Test
    void testAgregarYEliminar() {
        assertEquals(3, plataforma.getRecetas().size());

        plataforma.eliminar(postre);
        assertEquals(2, plataforma.getRecetas().size());
        assertFalse(plataforma.getRecetas().contains(postre));
    }

    @Test
    void testModificar() {
        Entrada nuevaEntrada = new Entrada("Bruschetta", Dificultad.MEDIO, new ArrayList<>(), Temperatura.CALIENTE);
        plataforma.modificar(entrada, nuevaEntrada);

        assertFalse(plataforma.getRecetas().contains(entrada));
        assertTrue(plataforma.getRecetas().contains(nuevaEntrada));
    }

    @Test
    void testEsDelTipo() {
        assertTrue(entrada.esDelTipo(new Entrada("Otra", Dificultad.FACIL, new ArrayList<>(), Temperatura.FRIA)));
        assertFalse(entrada.esDelTipo(postre));
        assertTrue(postre.esDelTipo(postre));
        assertFalse(principal.esDelTipo(entrada));
    }

    @Test
    void testBuscarDificultad() {
        Plataforma p = new Plataforma();
        p.setRecetas(new ArrayList<>());

        p.agregar(new Entrada("Entrada1", Dificultad.FACIL, new ArrayList<>(), Temperatura.FRIA));
        p.agregar(new Principal("Principal1", Dificultad.FACIL, new ArrayList<>(), 2, "frito"));
        p.agregar(new Postre("Postre1", Dificultad.DIFICIL, new ArrayList<>(), false, 200));

        // Filtrar manualmente
        int cantidad = 0;
        for (Receta r : p.getRecetas()) {
            if (r.getDificultad() == Dificultad.FACIL) {
                cantidad++;
            }
        }

        assertEquals(2, cantidad);
    }

    @Test
    void testMayor() {
        Receta mayor = plataforma.getRecetas().get(0);

        for (Receta r : plataforma.getRecetas())
    }
*/
