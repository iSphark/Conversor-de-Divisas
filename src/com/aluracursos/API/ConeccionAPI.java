package com.aluracursos.API;

import com.aluracursos.Modelos.DivisasConvertidas;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class ConeccionAPI {
    public static double conversor(String monedaBase, String monedaResultado, double valorDivisa) throws IOException, InterruptedException {
        DecimalFormat resultado = new DecimalFormat("####.####");
        String direccion = "https://v6.exchangerate-api.com/v6/7252b2bd1c9013191bbe1f0d/pair/" + monedaBase + "/" + monedaResultado + "/" + resultado.format(valorDivisa);
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            DivisasConvertidas divisasConvertidas = gson.fromJson(json, DivisasConvertidas.class);
            divisasConvertidas.setMonedasResultado(monedaResultado);
            System.out.println(divisasConvertidas);

            return divisasConvertidas.getResultado();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
