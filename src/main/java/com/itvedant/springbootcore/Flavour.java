package com.itvedant.springbootcore;

import org.springframework.stereotype.Component;

@Component
public class Flavour{
    Flavour(){
        System.out.println("\nCake object created\n");
    }
    public void getFlavour(){
        System.out.println("Vanilla flavour");
        
    }
}