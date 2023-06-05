/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystore.app_store.DTO;

/**
 *
 * @author User
 */
public record DatosProduct(
     String name,
     String description,
     String price,
     String image,
     String quantity,
     String brand,  
     String category,
     String state
        ) {
    
}
