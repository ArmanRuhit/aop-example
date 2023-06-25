package com.example.aopexample;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){

        // logging

        // authentication & authorization

        // sanitization the data
        System.out.println("Checkout method from ShoppingCart");
    }

    public int quantity(){
        return 2;
    }
}
