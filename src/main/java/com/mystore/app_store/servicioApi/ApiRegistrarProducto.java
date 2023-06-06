/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystore.app_store.servicioApi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystore.app_store.DTO.DatosProduct;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author User
 */
public class ApiRegistrarProducto {

    public static  Boolean status = false;
    String Url = "http://localhost:8080/API/products";
    String TOKEN = ApiLogin.TOKEN;
    String tokenExtraido = TOKEN.substring(TOKEN.indexOf(":") + 2, TOKEN.length() - 2);

    HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    ObjectMapper mapper = new ObjectMapper();
    public Boolean enviarProducto(DatosProduct datosProduct) throws IOException, InterruptedException {

        String json = mapper.writeValueAsString(datosProduct);

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create(Url))
                .header("Authorization", "Bearer " + tokenExtraido).header("Content-Type", "application/json").build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        if(response.statusCode() == 200){
            status = true;
            System.out.println(status);
        }else {
            status = false;
            System.out.println(response.statusCode() + "fallo" + tokenExtraido );
        }

        return true;
    }
}