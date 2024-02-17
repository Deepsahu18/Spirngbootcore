package com.itvedant.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cake{
    Flavour flavour;
    private Cream cream;

Cake(Flavour flavour){
    System.out.println("\nCake object created\n");
    flavour.getFlavour();
}
@Autowired
public void setCream(Cream cream){
    this.cream=cream;
     cream.getName();
}
}
