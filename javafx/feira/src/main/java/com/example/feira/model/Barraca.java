
package com.example.feira.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Barraca {
    private String nomeFeirante;
    private double balanco;
    private Map<String, Fruta> listaDeFrutas;

    public Barraca(String nomeFeirante, String localizacao) {
        this.nomeFeirante = nomeFeirante;
        this.balanco = 0.0;
        this.listaDeFrutas = new HashMap<>();
    }

    public String getNomeFeirante() {
        return nomeFeirante;
    }
    public void setNomeFeirante(String nomeFeirante) {
        this.nomeFeirante = nomeFeirante;
    }

    public double getBalanco() {
        return balanco;
    }
    private void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public void adicionarFruta(Fruta fruta){
        this.listaDeFrutas.put(fruta.getEspecie(), fruta);
    }

    public List<Fruta> mostrarFrutas() {
        return this.listaDeFrutas.values().stream().toList();
    }

    public double realizarVenda(Fruta fruta, double peso) {
        double balancoAtual = this.getBalanco();
        Fruta frutaVendida = listaDeFrutas.get(fruta.getEspecie());
        double valorVendido = peso * frutaVendida.getPrecoPorQuilo();
        this.setBalanco(balancoAtual+valorVendido);
        return valorVendido;
    }
}
