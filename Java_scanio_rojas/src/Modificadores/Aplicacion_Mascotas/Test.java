package Modificadores.Aplicacion_Mascotas;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

Aplicacion ap1;
Cantor c1;
Dueño d1;
Dueño d2;
Dueño d3;
Dueño d4;
Gato g1;
Pajaro pajaro1;
Perro perro1;
Pez pez1;


    @BeforeEach
    public void setUp() {

        ap1=new Aplicacion();
        c1=new Cantor("Lauti",d2, "lololo", 1 );
        d1=new Dueño();
        g1=new Gato("Lautaro", d1, 0);
        pajaro1=new Pajaro("Nico", d3, 3);
        perro1=new Perro("Franco", d4, 3);
        pez1=new Pez("Lolo", d1);

    }

    @org.junit.jupiter.api.Test
    public void alimentarlo(){
        g1.alimentar();
        assertEquals(1,g1.getFelicidad());


    };

    @org.junit.jupiter.api.Test
    public void saludar(){
        perro1.saludo(d1);
        assertEquals("Guau", perro1.saludo(d1));
    }
}
