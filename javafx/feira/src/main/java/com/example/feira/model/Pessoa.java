package com.example.feira.model;

public class Pessoa {
    private String nome;
    private double saldoDisponivel;
    private boolean possuiSacola;

    public Pessoa(String nome, double saldoDisponivel, boolean possuiSacola) {
        this.nome = nome;
        this.saldoDisponivel = saldoDisponivel;
        this.possuiSacola = possuiSacola;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
    private void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
    public void debitarSaldo(double valor) {
        this.setSaldoDisponivel(this.getSaldoDisponivel()-valor);
    }

    public boolean possuiSacola() {
        return possuiSacola;
    }
    public void pegarSacola() {
        this.possuiSacola = true;
    }

}
