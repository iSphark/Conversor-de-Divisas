package com.aluracursos.Modelos;

import java.util.Scanner;

public class CantidadACambiar {
    public static double valorACambiar() {
        Scanner scannerValor = new Scanner(System.in);
        double cantidad = -1;
        System.out.println("---- Digite la cantidad deseada a convertir ----");
        if (scannerValor.hasNextDouble()) {
            cantidad = scannerValor.nextDouble();
        } else {
            System.out.println("---¡Por Favor digite solo números válidos!---");
            scannerValor.nextLine();
        }
        return cantidad;
    }
}