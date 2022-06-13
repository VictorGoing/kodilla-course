package com.kodilla.patterns.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentHomeworkTestSuite {


    @Test
    public void shouldSubscribeMentor(){
        //Given
        Mentor pawel = new Pawel();
        StudentHomework wiktorHomeworks = new WiktorHomeworks();
        //When
        wiktorHomeworks.chooseMentor(pawel);
        //Then
        Assertions.assertEquals("Paweł",wiktorHomeworks.getMentor().getName());

    }

    @Test
    public void shouldNotifyMentorAboutAddingHomework(){
        //Given
        Mentor pawel = new Pawel();
        Mentor adrian = new Adrian();
        StudentHomework wiktorHomeworks = new WiktorHomeworks();
        StudentHomework grzegorzHomeworks = new GrzegorzHomeworks();
        wiktorHomeworks.chooseMentor(pawel);
        grzegorzHomeworks.chooseMentor(adrian);
        //When
        wiktorHomeworks.addHomework(new Homework("24.3"));
        wiktorHomeworks.addHomework(new Homework("24.4"));
        grzegorzHomeworks.addHomework(new Homework("24.1"));
        //Then
        Assertions.assertEquals(2,pawel.getNotifyCount());
        Assertions.assertEquals(1,adrian.getNotifyCount());

    }
}
