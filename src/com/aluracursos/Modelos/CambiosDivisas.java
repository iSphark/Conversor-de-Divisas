package com.aluracursos.Modelos;

import com.aluracursos.Historial.RegistroConversion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.aluracursos.API.ConeccionAPI.conversor;
import static com.aluracursos.Modelos.CantidadACambiar.valorACambiar;

public class CambiosDivisas {
    private static List<RegistroConversion> historial = new ArrayList<>();

    public static void casos(int opcion) throws IOException, InterruptedException {
        double cantidad = valorACambiar();
        double resultado = 0;
        String monedaBase = "";
        String monedaResultado = "";

        switch (opcion) {
            case 1:
                monedaBase = "USD";
                monedaResultado = "EUR";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 2:
                monedaBase = "EUR";
                monedaResultado = "USD";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 3:
                monedaBase = "MXN";
                monedaResultado = "USD";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 4:
                monedaBase = "USD";
                monedaResultado = "MXN";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 5:
                monedaBase = "MXN";
                monedaResultado = "EUR";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 6:
                monedaBase = "EUR";
                monedaResultado = "MXN";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 7:
                monedaBase = "ARS";
                monedaResultado = "USD";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 8:
                monedaBase = "USD";
                monedaResultado = "ARS";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 9:
                monedaBase = "ARS";
                monedaResultado = "MXN";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 10:
                monedaBase = "MXN";
                monedaResultado = "ARS";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 11:
                monedaBase = "ARS";
                monedaResultado = "EUR";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
            case 12:
                monedaBase = "EUR";
                monedaResultado = "ARS";
                resultado = conversor(monedaBase, monedaResultado, cantidad);
                break;
        }

        historial.add(new RegistroConversion(monedaBase, monedaResultado, cantidad, resultado));
    }

    public static void mostrarHistorial() {
        System.out.println("******************************************");
        System.out.println("*          Historial de conversiones     *");
        System.out.println("******************************************");

        if (historial.isEmpty()) {
            System.out.println("----No hay conversiones realizadas---");
        } else {
            for (RegistroConversion registro : historial) {
                System.out.println(registro.toString());
            }
        }
    }
}