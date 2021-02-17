package edu.pingpong.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private List<Byte> valoraciones = new ArrayList<Byte>();


    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    private double calcularValoracionMedia() {
        float sum = 0;
        for (byte valoracion : valoraciones) {
            sum += valoracion;
        }
        this.valoracionMedia = sum / getNumeroValoraciones();
        return valoracionMedia;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }


}
