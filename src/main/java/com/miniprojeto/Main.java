package com.miniprojeto;

import com.miniprojeto.entities.Gasto;

public class Main {
    public static void main(String[] args) {
        Gasto g1 = new Gasto("CBR 600f", 36000.0, "Moto");
        Gasto g2 = new Gasto("Ryzen 5600", 900.00, "CPU");
        Gasto g3 = new Gasto("Mouse Attack Shark X6", 190.50, "Periferico");

        double somaTotal = g1.getvalor() + g2.getvalor() + g3.getvalor();

        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());

        System.out.printf("Soma total de gastos: %.2f%n", somaTotal);

    }
}