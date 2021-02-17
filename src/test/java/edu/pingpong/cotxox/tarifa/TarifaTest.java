package edu.pingpong.cotxox.tarifa;

import edu.pingpong.cotxox.carrera.Carrera;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TarifaTest {

    Carrera carrera = new Carrera("1234");

    @Test
    public void getCosteTotalEsperadoMenorTest() {
        carrera.setTiempoEsperado(2);
        carrera.setDistancia(2.0);

        assertEquals(5, Tarifa.getCosteTotalEsperado(carrera), 0.01);
    }

    @Test
    public void getCosteTotalEsperadoMayorTest() {
        carrera.setTiempoEsperado(10);
        carrera.setDistancia(5.0);

        assertEquals(10.25, Tarifa.getCosteTotalEsperado(carrera), 0.01);
    }

}
