package com.kodilla.exception.test;

import java.sql.SQLOutput;

public class FirstChallenge {

    public double divide(double a, double b) {
        double result = 0;
        try{
            result = a / b;
        } catch (ArithmeticException e) {
            result = Double.NaN;
        } finally {
            return result;
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}