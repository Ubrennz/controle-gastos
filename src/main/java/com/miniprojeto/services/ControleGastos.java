package com.miniprojeto.services;

import com.miniprojeto.entities.Gasto;

import java.util.ArrayList;
import java.util.List;

public class ControleGastos {
    private List<Gasto> gastos = new ArrayList<>();

    public void adicionarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public void listarGastos() {
        gastos.forEach(System.out::println);
    }

    public double calcularTotal() {
        double somaTotal = 0;

        for (Gasto gasto : gastos) {
            somaTotal += gasto.getValor();
        }
        return somaTotal;
    }

    public double calcularTotalPorCategoria(String categoria) {
        double somaTotal = 0;

        for (Gasto gasto : gastos) {
            if (gasto.getCategoria().equalsIgnoreCase(categoria)) {
                somaTotal += gasto.getValor();
            }
        }
        return somaTotal;
    }
}
