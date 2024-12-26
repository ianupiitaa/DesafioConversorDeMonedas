package com.miproyecto.conversor.modelo;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMonedas {
    public MonedaModelo conversion(String monedaBase, String monedaCambio){
        URI direccion =URI.create("https://v6.exchangerate-api.com/v6/67c619abc38146a270e595dc/pair/" + monedaBase + "/" + monedaCambio);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response;
//        response =null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            System.out.println("Se genera un error del tipo: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), MonedaModelo.class);
    }
}
