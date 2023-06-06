/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystore.app_store.servicioApi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystore.app_store.PageProduct;
import com.mystore.app_store.DTO.Product;
import com.mystore.app_store.DTO.Usuario;
import com.mystore.app_store.PageLogin;

import javax.swing.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class  ApiUsuario {

    ApiLogin apiLogin = new ApiLogin();
    
    PageLogin pageLogin = new  PageLogin();
    
    String username = pageLogin.getUsuario().getText();
   String  password = new String(pageLogin.getClave().getPassword());
       
   String Token = ApiLogin.TOKEN;



    HttpClient cliente =  HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
      String Url ="http://localhost:8080/API/user";
      
      
      
      ObjectMapper mapper = new ObjectMapper();

     
          public Object[] mostrarUsuario(){
               List<Object[]> rowDataList = new ArrayList<>();
              
              System.out.println(Token + "aqui se usan el token desde API usuario liena 48");
              Token = this.Token.substring(Token.indexOf(":") + 2, Token.length() - 2);
              
              HttpRequest peticion = HttpRequest.newBuilder().GET()
                      .uri(URI.create(Url)).header("Authorization", "Bearer " + Token).build();

              // .uri(URI.create(Url)).build();
              
       try{
            HttpResponse<String> response = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

           List<Usuario> productList = getData(response.body(), new TypeReference<List<Usuario>>() {
           });
           

              
            
           System.out.println(productList.size());
           
          for (Usuario usuario: productList){
              Object[] rowData = { usuario.getName(), usuario.getEmail(), usuario.getPhone(), usuario.getPhone2(), usuario.getState()};
           rowDataList.add(rowData);
           

           } 
          
           
       }catch(Exception e){
            System.out.println("hubo un error en la api" + e);
     }

return rowDataList.toArray(new Object[0][]);
    }
          private <T> T getData(String json, TypeReference<T>referencia){
          try{
              return mapper.readValue(json, referencia);
          }catch(Exception e){
              System.out.println(e);
          }
        return null;
          }

}


 