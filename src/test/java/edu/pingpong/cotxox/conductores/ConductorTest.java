package edu.pingpong.cotxox.conductores;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConductorTest {

    Conductor conductor;

    @Before
    public void constructorTest() {
        String nombre = "Juan Pastor";
        conductor = new Conductor(nombre);
        assertEquals(nombre, conductor.getNombre());
    }
    /*
    Testeado cambiando calcularValoracion() a public.

    @Test
    public void calcularValoracionTest() {
        conductor.setValoracion((byte) 6);
        conductor.setValoracion((byte) 4);
        assertEquals(5, conductor.calcularValoracionMedia(), 0.01);
    }

     */

    @Test public void setValoracionTest() {
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 4);

        assertEquals(4.5 ,conductor.getValoracion(), 0.01);
        assertEquals(2, conductor.getNumeroValoraciones(), 0.01);
    }
}
