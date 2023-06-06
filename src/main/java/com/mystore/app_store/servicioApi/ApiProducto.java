/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystore.app_store.servicioApi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystore.app_store.PageProduct;
import com.mystore.app_store.DTO.Product;

import javax.swing.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class  ApiProducto {

    
    HttpClient cliente =  HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    
  
      String Url ="http://localhost:8080/API/products";
      
      ObjectMapper mapper = new ObjectMapper();

     
          public Object[] mostrar(){
               List<Object[]> rowDataList = new ArrayList<>();
              
              
              
              
              HttpRequest peticion = HttpRequest.newBuilder().GET()
                      .uri(URI.create(Url)).build();
              
       try{
            HttpResponse<String> response = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

           List<Product> productList = getData(response.body(), new TypeReference<List<Product>>() {
           });
           

              
            
           System.out.println(productList.size());
           
          for (Product product: productList){
              Object[] rowData = {product.getId(), product.getName(), product.getDescription(),product.getCategory(), product.getBrand(), product.getPrice(), product.getImage() };
         

           System.out.println(rowDataList);
           rowDataList.add(rowData);
           

           } 
          
           
       }catch(Exception e){
            System.out.println("hubo un error en la api");
     }

return rowDataList.toArray(new Object[0][]);
    }
          private <T> T getData(String json, TypeReference<T>referencia){
          try{
              return mapper.readValue(json, referencia);
          }catch(Exception e){
          }
        return null;
          }

      
}


 