package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.nullpointer.MessageNotSentException;
import com.kodilla.exception.nullpointer.MessageSender;
import com.kodilla.exception.nullpointer.User;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send," +
                    "but my program still running very well!");
        }

        System.out.println("Processing other logic!");

//        FileReader fileReader = new FileReader();
//
//        try {
//            fileReader.readFile("names.txt");
//        } catch (FileReaderException e) {
//            System.out.println("Problem while reading a file!");
//        }
    }
}