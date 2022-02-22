package com.kodilla.spring.forum;

import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ForumUserTestSuite {

    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser user = context.getBean(ForumUser.class);

        //When
        String name = user.getUsername();

        //Then
        assertEquals("John Smith", name);
    }
}
