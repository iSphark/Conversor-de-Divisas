package com.aluracursos.Historial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroConversion {
    private String monedaBase;
    private String monedaResultado;
    private double cantidadConvertida;
    private double resultadoConversion;
    private String fechaHora;

    public RegistroConversion(String monedaBase, String monedaResultado, double cantidadConvertida, double resultadoConversion) {
        this.monedaBase = monedaBase;
        this.monedaResultado = monedaResultado;
        this.cantidadConvertida = cantidadConvertida;
        this.resultadoConversion = resultadoConversion;
        this.fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"+" ---"));
    }

    @Override
    public String toString() {
        return "--- Conversión de " + cantidadConvertida + " " + monedaBase + " a " + resultadoConversion + " " + monedaResultado + " realizada el " + fechaHora;
    }
}