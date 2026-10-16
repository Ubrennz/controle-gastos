package com.miniprojeto;

import com.miniprojeto.entities.Gasto;
import com.miniprojeto.services.ControleGastos;

public class Main {
    private static ControleGastos controleGastos = new ControleGastos();

    public static void main(String[] args) {
        Gasto g1 = new Gasto("CBR 600f", 36000.0, "Moto");
        Gasto g2 = new Gasto("Ryzen 5600", 900.00, "CPU");
        Gasto g3 = new Gasto("Mouse Attack Shark X6", 190.50, "Periferico");
        Gasto g4 = new Gasto("Ryzen 7 5700g", 1100.00, "CPU");

        controleGastos.adicionarGasto(g1);
        controleGastos.adicionarGasto(g2);
        controleGastos.adicionarGasto(g3);
        controleGastos.adicionarGasto(g4);

        System.out.println("Listagem de gastos:");
        controleGastos.listarGastos();

        System.out.printf("\nSoma total de gastos: %.2f%n", controleGastos.calcularTotal());
        System.out.printf("Soma total da categoria CPU: %.2f%n", controleGastos.calcularTotalPorCategoria("CPU"));
        System.out.printf("Soma total da categoria MOTO: %.2f%n", controleGastos.calcularTotalPorCategoria("MOTO"));
        System.out.printf("Soma total da categoria '': %.2f%n", controleGastos.calcularTotalPorCategoria(""));
        System.out.printf("Soma total da categoria Alimentação: %.2f%n", controleGastos.calcularTotalPorCategoria("Alimentação"));

    }
}