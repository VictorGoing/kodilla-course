package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Display {

    String displayValue(double val){
        return "Value is: " + val;
    }
}
