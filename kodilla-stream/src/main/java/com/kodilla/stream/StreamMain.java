package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {



        /*List<ForumUser> forumUsers = new ArrayList<>();
        forumUsers.add(new ForumUser(1,"Marek",'M', LocalDate.of(2000,7,3),0));
        forumUsers.add(new ForumUser(2,"Rafał",'M', LocalDate.of(2002,2,2),2));
        forumUsers.add(new ForumUser(3,"Ania",'W', LocalDate.of(1990,3,5),3));
        forumUsers.add(new ForumUser(4,"Tomasz",'M', LocalDate.of(2000,4,23),1));
        forumUsers.add(new ForumUser(5,"Andrzej",'M', LocalDate.of(2000,6,13),4));
        forumUsers.add(new ForumUser(6,"Jakub",'M', LocalDate.of(2000,11,30),8));

        Forum forum = new Forum(forumUsers);

        Map<Integer, ForumUser> theFinalList = forum.getListOfUsers().stream()
                .filter(user -> user.getSexOfUser() == 'M')
                .filter(user -> LocalDate.now().getYear() - user.getDateOfBirth().getYear() >= 20)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("# entrys: " + theFinalList.size());
        theFinalList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/


        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);*/


        /*BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);*/                                            // [4]




        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()   // [1]
                .filter(book -> book.getYearOfPublication() > 2005)                  // [2]
                .collect(Collectors.toList());                                       // [3]

        System.out.println("# elements: " + theResultListOfBooks.size());       // [4]
        theResultListOfBooks.stream()                                           // [5]
                .forEach(System.out::println);*/


        /*BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/


        /*People.getList().stream()
                .map(String::toUpperCase)                             // [1]
                .filter(s -> s.length() > 11)                         // [2]
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
                .filter(s -> s.substring(0, 1).equals("M"))           // [4]
                .forEach(System.out::println);*/

        /*System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        /*PoemBeautifier poemBeautifier = new PoemBeautifier();
        String string = "siema";
        poemBeautifier.beautify(string,(text) -> string.toUpperCase(Locale.ROOT));
        poemBeautifier.beautify(string,(text) -> string + "!");
        poemBeautifier.beautify(string,(text) -> "XXXxxx" + string + "xxxXXX");
        poemBeautifier.beautify(string,(text) ->  string + " ( ͡° ͜ʖ ͡°) ");*/


        System.out.println("Welcome to module 7 – Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

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