package com.itvedant.springbootcore;

import org.springframework.stereotype.Component;

@Component
public class Cream{
Cream(){
    System.out.println("\nCream Object Created");

}
   public void getName(){
    System.out.println("Chocolate Cream");
   }
}
