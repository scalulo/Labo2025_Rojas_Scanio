package Modificadores.Recetas;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    Dificultad dificultad;
    ArrayList<Receta> recetas;
    Principal principal1;
    Postre postre1;

    @BeforeEach
    public void setUp() {
        Principal principal1=new Principal();
        Postre postre1=new Postre("Flan",Dificultad.DIFICIL, new ArrayList<String>(),true, 180  );
        Entrada entrada1=new Entrada("Rabas", Dificultad.MEDIO, new ArrayList<String>(),Temperatura.CALIENTE);
        dificultad=Dificultad.DIFICIL;
        Plataforma plataforma1=new Plataforma();
        ArrayList<Receta> dificiles=new ArrayList<>();
        dificiles.add(postre1);
    }

    }

