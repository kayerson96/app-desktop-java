/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystore.app_store.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystore.app_store.Dashboard;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import java.net.http.HttpResponse;
import java.util.HashMap;




/**
 *
 * @author User
 */
public class ApiLogin {
    
  public static  Boolean ESTADO = false;
    
   public static String TOKEN;
    
    HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
     String Url ="http://localhost:8080/v1/api/login";
    
         ObjectMapper mapper = new ObjectMapper();
    
   
   public Boolean enviarLogin(String username, String password ){
       
   
       HashMap parametros = new HashMap();

       parametros.put("user", username);
       parametros.put("password", password);
       System.out.println(parametros);
       try{
           String datos_user = mapper.writeValueAsString(parametros);
           
          HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofByteArray(datos_user.getBytes()))
                    .uri(URI.create(Url))
                    .header("Content-Type", "application/json")
                    .build();
           
           
          //   HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(datos_user))
                //   .uri(URI.create(Url)).build();
           
           HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
           
            TOKEN = response.body();
          // TOKEN = TOKEN.substring(TOKEN.indexOf(":") + 2, TOKEN.length() - 2);
           System.out.println(TOKEN);
           System.out.println(response.body());
            System.out.println(response.statusCode());
            
            
                if(response.statusCode() == 200){
                    ESTADO = true;
                    
                }
            return ESTADO;
            

       }catch (Exception e) {
           e.printStackTrace();
           
       }
       return false;
       }
   

}

 
  
    
    

