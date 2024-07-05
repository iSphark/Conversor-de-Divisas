package com.aluracursos.Modelos;

import com.google.gson.annotations.SerializedName;

public class DivisasConvertidas implements Comparable<DivisasConvertidas> {
    @SerializedName("conversion_result")
    private double resultado;

    public DivisasConvertidas(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public int compareTo(DivisasConvertidas o) {
        return 0;
    }

    @Override
    public String toString() {
        return "----Resultado de la conversión: " + resultado + "----";
    }
}