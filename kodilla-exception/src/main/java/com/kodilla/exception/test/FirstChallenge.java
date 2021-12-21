package com.kodilla.exception.test;

import java.beans.PropertyEditorSupport;
import java.sql.SQLOutput;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e){
            System.out.println("Problem: " + e +" result will be incorrect");
            result = Double.NaN;
        } finally {
            System.out.println(result);
        }

    }
}