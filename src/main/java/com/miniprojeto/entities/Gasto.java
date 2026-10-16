package com.miniprojeto.entities;

public class Gasto {
    private String descricao;
    private double valor;
    private String categoria;

    public Gasto(String descricao, Double valor, String category) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = category;
    }

    public String getdescricao() {
        return descricao;
    }

    public Double getvalor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return descricao + " - " + String.format("%.2f", valor) + " (" + categoria + ")";
    }
}
