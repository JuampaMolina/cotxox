package edu.pingpong.cotxox.tarifa;

import edu.pingpong.cotxox.carrera.Carrera;

public class Tarifa {
    private static final double costeMilla = 1.35d;
    private static final double costeMinuto = 0.35;
    private static final double costeMinimo = 5.0d;
    private static final byte porcentajeComision = 20;

    public static double getCosteDistancia(double distancia) {
        return distancia * costeMilla;
    }

    public static double getCosteDistancia(int tiempo) {
        return tiempo * costeMinuto;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double coste = (carrera.getDistancia() * costeMilla) + (carrera.getTiempoEsperado() * costeMinuto);
        return (coste > 5)? coste : costeMinimo;
    }
}
