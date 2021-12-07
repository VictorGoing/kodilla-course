package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String string = "siema";
        poemBeautifier.beautify(string,(text) -> string.toUpperCase(Locale.ROOT));
        poemBeautifier.beautify(string,(text) -> string + "!");
        poemBeautifier.beautify(string,(text) -> "XXXxxx" + string + "xxxXXX");
        poemBeautifier.beautify(string,(text) ->  string + " ( ͡° ͜ʖ ͡°) ");


        /*System.out.println("Welcome to module 7 – Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();*/

        /*Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);*/

        /*
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));
         */

        /*Processor processor = new Processor();                                  // [6]
        Executor codeToExecute = () -> System.out.println("This is an example text.");  // [7]
        processor.execute(codeToExecute);*/

        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/
    }
}