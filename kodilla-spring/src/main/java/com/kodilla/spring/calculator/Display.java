package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Display {

    void displayValue(double val){
        System.out.println("Value is: " + val);
    }
}
