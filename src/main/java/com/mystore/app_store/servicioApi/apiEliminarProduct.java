/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystore.app_store.servicioApi;

import com.mystore.app_store.PageProduct;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author User
 */
public class apiEliminarProduct {
    String TOKEN = ApiLogin.TOKEN;
    String Url = "http://localhost:8080/API/products/";
    HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    String tokenExtraido = TOKEN.substring(TOKEN.indexOf(":") + 2, TOKEN.length() - 2);
    
    public void eliminarProduct(int id){

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .header("Authorization", "Bearer " + tokenExtraido).header("Content-Type", "application/json")
                .DELETE()
               .uri(URI.create(Url + id)).build();
        try{
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            if (statusCode == 200){
                System.out.println("se elimino el producto con id: " + id);
            }else{
                System.out.println("Error al eliminar el producto. Código de estado: " + statusCode);
            }
        }catch (Exception e ){
            System.out.println(e);

        }

        
    }
    
}
