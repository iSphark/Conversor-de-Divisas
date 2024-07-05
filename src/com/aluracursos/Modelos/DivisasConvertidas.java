package com.aluracursos.Modelos;

import com.google.gson.annotations.SerializedName;

public class DivisasConvertidas implements Comparable<DivisasConvertidas> {

    @SerializedName("conversion_result")
    private double resultado;
    private  String monedaResultado;

    public DivisasConvertidas(double resultado,String monedaResultado) {
        this.resultado = resultado;
        this.monedaResultado = monedaResultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void setMonedasResultado(String monedaResultado) {
        this.monedaResultado = monedaResultado;
    }

    @Override
    public int compareTo(DivisasConvertidas o) {
        return 0;
    }

    @Override
    public String toString() {
        return "----Resultado de la conversión: " + resultado + " " + monedaResultado +"----";
    }
}