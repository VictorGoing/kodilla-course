package com.kodilla.exception.test;

import java.sql.SQLOutput;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        String result = "";
        try {
            challenge.probablyIWillThrowException(3,2);
        } catch (Exception e) {
            System.out.println("Exception was caught.");
        } finally {
            System.out.println(result);
        }
    }
}
