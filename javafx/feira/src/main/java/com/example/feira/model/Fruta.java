package com.example.feira.model;

public class Fruta {
    private String especie;
    private double precoPorQuilo;
    private boolean madura;

    public Fruta(double precoPorQuilo, String especie) {
        this.precoPorQuilo = precoPorQuilo;
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPrecoPorQuilo() {
        return precoPorQuilo;
    }
    public void setPrecoPorQuilo(double precoPorQuilo) {
        this.precoPorQuilo = precoPorQuilo;
    }

    public boolean isMadura() {
        return madura;
    }
    public void amadurecer() {
        this.madura = true;
    }
}
